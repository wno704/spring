package com.wno704.boot;

import com.wno704.boot.model.ConfigBean;
import com.wno704.boot.model.TestConfigBean;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({ConfigBean.class,TestConfigBean.class})
public class ConfigApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ConfigApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.setAddCommandLineProperties(false);
        app.run(args);
    }

}
