package com.lyw.source.Properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 类描述：
 *
 * @author liangyuwu
 * @Time 2018/5/17 11:35
 */
@ConfigurationProperties(prefix = "spring.datasource")
public class SpringDataSource {

    private String driverClassName;
    private String url;
    private String username;
    private String password;

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
