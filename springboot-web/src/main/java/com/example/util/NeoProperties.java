package com.example.util;

import org.springframework.beans.factory.annotation.Value;

/**
 * @ClassName NeoProperties
 * @Description TODO
 * @Author yangjunqi
 * @Date 2021/1/21 17:37
 * @Version 1.0
 **/
public class NeoProperties {

    @Value("${com.neo.title}")
    private String title;
    @Value("${com.neo.description}")
    private String description;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
