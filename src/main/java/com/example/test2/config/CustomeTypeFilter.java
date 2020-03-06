package com.example.test2.config;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * FileName: CustomeTypeFilter
 *
 * @author: yufeng
 * @date: 2020/3/2 11:28
 * @description:
 */
public class CustomeTypeFilter implements TypeFilter {

    private ClassMetadata classMetadata;

    /**
     *
     * @param metadataReader 读取到当前正在扫描类的信息
     * @param metadataReaderFactory 可以获取到其它任何类信息
     * @return
     * @throws IOException
     */
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory)
            throws IOException {
        // 获取当前类注解的信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        // 获取当前正在扫描的类信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        // 获取当前类资源（类的路径）
        Resource resource = metadataReader.getResource();

        String className = classMetadata.getClassName();
        System.out.println("className =" + className);
        if (className.contains("order")) {

            return true;
        }
        return false;
    }
}
