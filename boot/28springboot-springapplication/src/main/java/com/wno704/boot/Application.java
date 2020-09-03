package com.wno704.boot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

public class Application {

    public static void main(String[] args) {
        // 01
        //SpringApplication.run(Application.class, args);

        //02
       SpringApplication app = new SpringApplication(ApplicationResource.class);

//        app.setBannerMode(Banner.Mode.OFF);
//        app.setAddCommandLineProperties(false);
        app.setWebApplicationType(WebApplicationType.NONE);
        app.setAdditionalProfiles("dev");
        app.run(args);


        //03
//        new SpringApplicationBuilder(Application.class)
//                .bannerMode(Banner.Mode.OFF)
//                .web(WebApplicationType.SERVLET)
//                .profiles("dev")
//                .addCommandLineProperties(false)
//                .run(args);


    }

    @SpringBootApplication
    public static class ApplicationResource {

    }

}
