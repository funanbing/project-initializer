/*
 * Copyright 2022-2023 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.alibaba.initializer.generation.extension.codes.language;

import com.alibaba.initializer.generation.InitializerProjectGenerationConfiguration;
import com.alibaba.initializer.generation.condition.ConditionalOnModule;
import com.alibaba.initializer.generation.extension.codes.other.JavaProjectGenerationOthersConfiguration;
import io.spring.initializr.generator.condition.ConditionalOnLanguage;
import io.spring.initializr.generator.language.java.JavaLanguage;
import org.springframework.context.annotation.Import;

/**
 * @author <a href="mailto:chenxilzx1@gmail.com">theonefx</a>
 */
@InitializerProjectGenerationConfiguration
@ConditionalOnModule(others = true)
@ConditionalOnLanguage(JavaLanguage.ID)
@Import({JavaProjectGenerationOthersConfiguration.class})
public class ArchedJavaProjectGenerationOthersConfiguration {

}
