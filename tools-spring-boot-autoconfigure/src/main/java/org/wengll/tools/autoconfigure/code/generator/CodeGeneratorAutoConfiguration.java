
package org.wengll.tools.autoconfigure.code.generator;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
@ConditionalOnProperty(prefix = "code.generator", value = "enable")
@EnableConfigurationProperties(CodeGeneratorProperties.class)
public class CodeGeneratorAutoConfiguration {

}
