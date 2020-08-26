package com.wno704.boot.test.selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author MrBird
 */
public class MyImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{
                "com.wno704.boot.test.domain.Apple",
                "com.wno704.boot.test.domain.Banana",
                "com.wno704.boot.test.domain.Watermelon"
        };
    }
}
