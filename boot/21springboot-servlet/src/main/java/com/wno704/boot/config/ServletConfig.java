package com.wno704.boot.config;

import com.wno704.boot.servlet.HeServlet;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

@Component
public class ServletConfig implements ServletContextInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        ServletRegistration iniServlet = servletContext.addServlet("iniServlet", HeServlet.class);
        iniServlet.addMapping("/iniServlet");
        //iniServlet.setInitParameter("name","wno704");

    }
}
