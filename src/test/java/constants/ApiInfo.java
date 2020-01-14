package constants;

import framework.utils.PropertiesRead;

public class ApiInfo {
    public static final String API_VERSION = PropertiesRead.readFromFrameworkConfig("apiVersion");
    public static final String ACCESS_TOKEN = PropertiesRead.readFromFrameworkConfig("accessToken");
}
