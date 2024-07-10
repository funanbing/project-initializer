package com.alibaba.initializer.generation.extension.codes.other;

import io.spring.initializr.generator.language.CompilationUnit;
import io.spring.initializr.generator.language.SourceCode;
import io.spring.initializr.generator.language.TypeDeclaration;
import io.spring.initializr.generator.project.ProjectDescription;
import io.spring.initializr.generator.project.contributor.ProjectContributor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @author funanbing
 * @date 2024-07-09 20:16:16
 * @description
 */
public class MainSourceCodeProjectOtherContributor<T extends TypeDeclaration, C extends CompilationUnit<T>, S extends SourceCode<T, C>> implements ProjectContributor {

    private final ProjectDescription description;


    public MainSourceCodeProjectOtherContributor(ProjectDescription description) {
        this.description = description;
    }

    @Override
    public void contribute(Path projectRoot) throws IOException {
        createFile(resolvePackage(projectRoot, description.getPackageName()));
    }
    private void createFile(Path file) throws IOException {
        Files.createDirectories(file);
    }

    private static Path resolvePackage(Path directory, String packageName) {
        return directory.resolve("src/main/java/"+packageName.replace('.', '/'));
    }
}
