package com.wno704.boot.test.config;

import com.wno704.boot.test.condition.MyCondition;
import com.wno704.boot.test.domain.Hello;
import com.wno704.boot.test.domain.User;
import com.wno704.boot.test.factory.CherryFactoryBean;
import com.wno704.boot.test.filter.MyTypeFilter;
import com.wno704.boot.test.register.MyImportBeanDefinitionRegistrar;
import com.wno704.boot.test.selector.MyImportSelector;
import lombok.Builder;
import org.springframework.context.annotation.*;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author MrBird
 */
@Configuration
//@ComponentScan(value = "com.wno704.boot.test",
//               excludeFilters = {
//                    @Filter(type = FilterType.ANNOTATION,classes = {Controller.class, Repository.class}),
//                    @Filter(type = FilterType.ASSIGNABLE_TYPE, classes = User.class)
//                    @Filter(type = FilterType.CUSTOM, classes = MyTypeFilter.class)
//                }
//                includeFilters = {
//                    @Filter(type = FilterType.ANNOTATION, classes = Service.class)
//                },useDefaultFilters = false
//                )
//@Import({Hello.class})
//@Import(MyImportSelector.class)
@Import({MyImportBeanDefinitionRegistrar.class})
public class WebConfig {

    @Bean
    //@Bean("myuser")
    //@Conditional(MyCondition.class)
    //@Lazy
    //@Scope("prototype")
    public User user() {
        System.out.println("往IOC容器中注册user bean");
        return new User("wno704", 28);
    }

    @Bean
    public CherryFactoryBean cherryFactoryBean() {
        return new CherryFactoryBean();
    }
}
