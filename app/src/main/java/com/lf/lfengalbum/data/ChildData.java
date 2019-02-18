package com.lf.lfengalbum.data;

import com.lf.lfengalbum.interfaces.Constant;
import com.lf.lfengalbum.model.ItemBean;

import java.util.ArrayList;

public class ChildData {

    //项目简介
    public static ArrayList getSynopsisList() {
        ArrayList synopsisList = new ArrayList();
        synopsisList.add(new ItemBean("", "项目概述"));
        return synopsisList;
    }

    //Android基础
    public static ArrayList getBasisList() {
        ArrayList synopsisList = new ArrayList();
        synopsisList.add(new ItemBean(Constant.FLAG_BASIS_ADB, "adb常用命令"));
        return synopsisList;
    }

    //RecyclerView
    public static ArrayList getRecyclerViewList() {
        ArrayList recyclerViewList = new ArrayList();
        recyclerViewList.add(new ItemBean("", "初识"));
        recyclerViewList.add(new ItemBean("", "用法"));
        return recyclerViewList;
    }

    //RxJava2
    public static ArrayList getRxJava2List() {
        ArrayList rxJava2List = new ArrayList();
        rxJava2List.add(new ItemBean(Constant.FLAG_RXJAVA_INTRODUCE, "简介"));
        rxJava2List.add(new ItemBean(Constant.FLAG_RXJAVA_USE_CASES, "基本用例"));
        rxJava2List.add(new ItemBean(Constant.FLAG_RXJAVA_OPERATOR, "操作符"));
        return rxJava2List;
    }

}
