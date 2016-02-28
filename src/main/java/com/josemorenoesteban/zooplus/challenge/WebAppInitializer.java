package com.josemorenoesteban.zooplus.challenge;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * La clase para configurar una aplicación Servlet 3.0 configurada con esto y no con web.xml.
 * 
 * Por esta clase es por lo que no hace falta <code>web.xml</code>. Es qeuivalente al web.xml
 * 
 * @author jbeneito
 * @author jmoreno
 */
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?> [] { ApplicationConfiguration.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?> [] { WebConfiguration.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
