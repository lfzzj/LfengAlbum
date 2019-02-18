package com.lf.lfengalbum.model;

/**
 * 父级菜单数据
 */
public class GroupBean {
    private String title ;

    public GroupBean(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
