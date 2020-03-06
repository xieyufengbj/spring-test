package com.example.test6.config;

import com.example.test6.bean.Pig;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * FileName: CustomImportBeanDefinitionRegistrar
 *
 * @author: yufeng
 * @date: 2020/3/3 18:01
 * @description:
 */
public class CustomImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

        boolean bean1 = registry.containsBeanDefinition("com.example.test6.bean.Dog");
        boolean bean2 = registry.containsBeanDefinition("com.example.test6.bean.Cat");

        if (bean1 && bean2) {
            RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(Pig.class);
            registry.registerBeanDefinition("pig", rootBeanDefinition);
        }
    }
}
