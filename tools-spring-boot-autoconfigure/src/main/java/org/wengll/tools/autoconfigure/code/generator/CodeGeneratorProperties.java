package org.wengll.tools.autoconfigure.code.generator;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = CodeGeneratorProperties.PREFIX)
public class CodeGeneratorProperties {
    public static final String PREFIX = "code.generator";

    private boolean enabled = false;

    private String controllerPath;

    private String listMethodPath;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getControllerPath() {
        return controllerPath;
    }

    public void setControllerPath(String controllerPath) {
        this.controllerPath = controllerPath;
    }

    public String getListMethodPath() {
        return listMethodPath;
    }

    public void setListMethodPath(String listMethodPath) {
        this.listMethodPath = listMethodPath;
    }
}
