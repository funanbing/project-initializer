package com.alibaba.initializer.generation.extension.codes.other;

import io.spring.initializr.generator.condition.ConditionalOnLanguage;
import io.spring.initializr.generator.io.IndentingWriterFactory;
import io.spring.initializr.generator.language.java.JavaCompilationUnit;
import io.spring.initializr.generator.language.java.JavaLanguage;
import io.spring.initializr.generator.language.java.JavaSourceCode;
import io.spring.initializr.generator.language.java.JavaTypeDeclaration;
import io.spring.initializr.generator.project.ProjectDescription;
import io.spring.initializr.generator.project.ProjectGenerationConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * @author funanbing
 * @date 2024-07-09 20:10:55
 * @description
 */
@ProjectGenerationConfiguration
@ConditionalOnLanguage(JavaLanguage.ID)
public class JavaProjectGenerationOthersConfiguration {

    private final ProjectDescription description;

    private final IndentingWriterFactory indentingWriterFactory;

    public JavaProjectGenerationOthersConfiguration(ProjectDescription description,
                                              IndentingWriterFactory indentingWriterFactory) {
        this.description = description;
        this.indentingWriterFactory = indentingWriterFactory;
    }

    @Bean
    public MainSourceCodeProjectOtherContributor<JavaTypeDeclaration, JavaCompilationUnit, JavaSourceCode> mainJavaSourceCodeProjectOtherContributor() {
        return new MainSourceCodeProjectOtherContributor<>(this.description);
    }

    @Bean
    public TestSourceCodeProjectOtherContributor<JavaTypeDeclaration, JavaCompilationUnit, JavaSourceCode> testJavaSourceCodeProjectOtherContributor() {
        return new TestSourceCodeProjectOtherContributor<>(this.description);
    }
}
