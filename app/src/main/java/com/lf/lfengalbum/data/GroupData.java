package com.lf.lfengalbum.data;

import com.lf.lfengalbum.model.GroupBean;

import java.util.ArrayList;
import java.util.List;

public class GroupData {
    public static List<GroupBean> getGroupData() {
        List<GroupBean> groupBeans = new ArrayList<>();

        groupBeans.add(new GroupBean("简介"));
        groupBeans.add(new GroupBean("Android基础"));
        groupBeans.add(new GroupBean("RecyclerView的用法"));
        groupBeans.add(new GroupBean("RxJava2的用法"));

        return groupBeans;
    }

    public static List<List> getChildData() {
        List<List> childList = new ArrayList<>();

        childList.add(ChildData.getSynopsisList());

        childList.add(ChildData.getBasisList());

        childList.add(ChildData.getRecyclerViewList());

        childList.add(ChildData.getRxJava2List());

        return childList;

    }

}
