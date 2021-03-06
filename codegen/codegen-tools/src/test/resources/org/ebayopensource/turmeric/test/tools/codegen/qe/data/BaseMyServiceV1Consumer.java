
package org.ebayopensource.turmeric.common.v1.services.gen;

import java.net.MalformedURLException;
import java.net.URL;
import org.ebayopensource.turmeric.common.v1.services.MyServiceV1;
import org.ebayopensource.turmeric.runtime.common.exceptions.ServiceException;
import org.ebayopensource.turmeric.runtime.common.exceptions.ServiceRuntimeException;
import org.ebayopensource.turmeric.runtime.common.registration.ClassLoaderRegistry;
import org.ebayopensource.turmeric.runtime.common.types.Cookie;
import org.ebayopensource.turmeric.runtime.common.types.SOAHeaders;
import org.ebayopensource.turmeric.runtime.sif.service.Service;
import org.ebayopensource.turmeric.runtime.sif.service.ServiceFactory;
import org.ebayopensource.turmeric.runtime.sif.service.ServiceInvokerOptions;
import org.ebayopensource.turmeric.services.Response;
import org.ebayopensource.turmeric.services.TestType;


/**
 * Note : Generated file, any changes will be lost upon regeneration.
 * This class is not thread safe
 * 
 */
public class BaseMyServiceV1Consumer {

    private URL m_serviceLocation = null;
    private boolean m_useDefaultClientConfig;
    private final static String SVC_ADMIN_NAME = "MyServiceV1";
    private String m_clientName = "MyServiceV1";
    private String m_environment;
    private MyServiceV1 m_proxy = null;
    private String m_authToken = null;
    private Cookie[] m_cookies;
    private Service m_service = null;

    public BaseMyServiceV1Consumer() {
    }

    /**
     * This constructor should be used, when a ClientConfig.xml is located in the 
     * "client" bundle, so that a ClassLoader of this Shared Consumer can be used.
     * 
     * @param clientName
     * @throws ServiceException
     * 
     */
    public BaseMyServiceV1Consumer(String clientName)
        throws ServiceException
    {
        this(clientName, null);
    }

    /**
     * This constructor should be used, when a ClientConfig.xml is located in the 
     * "client" bundle, so that a ClassLoader of this Shared Consumer can be used.
     * 
     * @param clientName
     * @param environment
     * @throws ServiceException
     * 
     */
    public BaseMyServiceV1Consumer(String clientName, String environment)
        throws ServiceException
    {
        this(clientName, environment, null, false);
    }

    /**
     * This constructor should be used, when a ClientConfig.xml is located 
     * in some application bundle. Shared Consumer then will call ClassLoaderRegistry 
     * to register a ClassLoader of an application bundle.
     * 
     * @param clientName
     * @param caller
     * @param useDefaultClientConfig
     * @throws ServiceException
     * 
     */
    public BaseMyServiceV1Consumer(String clientName, Class caller, boolean useDefaultClientConfig)
        throws ServiceException
    {
        this(clientName, null, caller, useDefaultClientConfig);
    }

    /**
     * This constructor should be used, when a ClientConfig.xml is located 
     * in some application bundle. Shared Consumer then will call ClassLoaderRegistry 
     * to register a ClassLoader of an application bundle.
     * 
     * @param clientName
     * @param environment
     * @param caller
     * @param useDefaultClientConfig
     * @throws ServiceException
     * 
     */
    public BaseMyServiceV1Consumer(String clientName, String environment, Class caller, boolean useDefaultClientConfig)
        throws ServiceException
    {
        if (clientName == null) {
            throw new ServiceException("clientName can not be null");
        }
        m_clientName = clientName;
        if (environment!= null) {
            m_environment = environment;
        }
        m_useDefaultClientConfig = useDefaultClientConfig;
        ClassLoaderRegistry.instanceOf().registerServiceClient(m_clientName, m_environment, SVC_ADMIN_NAME, (BaseMyServiceV1Consumer.class), caller, m_useDefaultClientConfig);
    }

    /**
     * Use this method to initialize ConsumerApp after creating a Consumer instance
     * 
     */
    public void init()
        throws ServiceException
    {
        getService();
    }

    protected void setServiceLocation(String serviceLocation)
        throws MalformedURLException
    {
        m_serviceLocation = new URL(serviceLocation);
        if (m_service!= null) {
            m_service.setServiceLocation(m_serviceLocation);
        }
    }

    private void setUserProvidedSecurityCredentials(Service service) {
        if (m_authToken!= null) {
            service.setSessionTransportHeader(SOAHeaders.AUTH_TOKEN, m_authToken);
        }
        if (m_cookies!= null) {
            for (int i = 0; (i<m_cookies.length); i ++) {
                service.setCookie(m_cookies[i]);
            }
        }
    }

    /**
     * Use this method to set User Credentials (Token) 
     * 
     */
    protected void setAuthToken(String authToken) {
        m_authToken = authToken;
    }

    /**
     * Use this method to set User Credentials (Cookie)
     * 
     */
    protected void setCookies(Cookie[] cookies) {
        m_cookies = cookies;
    }

    /**
     * Use this method to get the Invoker Options on the Service and set them to user-preferences
     * 
     */
    public ServiceInvokerOptions getServiceInvokerOptions()
        throws ServiceException
    {
        m_service = getService();
        return m_service.getInvokerOptions();
    }

    protected MyServiceV1 getProxy()
        throws ServiceException
    {
        m_service = getService();
        m_proxy = m_service.getProxy();
        return m_proxy;
    }

    /**
     * Method returns an instance of Service which has been initilized for this Consumer
     * 
     */
    public Service getService()
        throws ServiceException
    {
        if (m_service == null) {
            m_service = ServiceFactory.create(SVC_ADMIN_NAME, m_environment, m_clientName, m_serviceLocation, false, m_useDefaultClientConfig);
        }
        setUserProvidedSecurityCredentials(m_service);
        return m_service;
    }

    public Response add(TestType param0) {
        Response result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.add(param0);
        return result;
    }

}
