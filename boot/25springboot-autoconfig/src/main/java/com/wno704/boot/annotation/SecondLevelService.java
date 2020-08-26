package com.wno704.boot.annotation;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@FirstLevelService
public @interface SecondLevelService {
    String value() default "";
}
