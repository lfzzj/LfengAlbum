package com.lf.lfengalbum.model;

/**
 * 子级菜单数据
 */
public class ItemBean {
    private String flag;//标识
    private String content;

    public ItemBean(String flag, String content) {
        this.flag = flag;
        this.content = content;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
