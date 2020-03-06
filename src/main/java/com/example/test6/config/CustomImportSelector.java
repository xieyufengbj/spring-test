package com.example.test6.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * FileName: CustomImportSelector
 *
 * @author: yufeng
 * @date: 2020/3/3 17:37
 * @description:
 */
public class CustomImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.example.test6.bean.Tiger", "com.example.test6.bean.Fish"};
    }
}
