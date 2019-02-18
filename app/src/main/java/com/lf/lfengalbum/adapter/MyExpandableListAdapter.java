package com.lf.lfengalbum.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.lf.lfengalbum.R;
import com.lf.lfengalbum.model.GroupBean;
import com.lf.lfengalbum.model.ItemBean;

import java.util.List;

public class MyExpandableListAdapter extends BaseExpandableListAdapter {
    List<GroupBean> groupBeans;
    List<List> itemBeans;
    Context context;

    int groupLayout;
    int itemLayout;

    public MyExpandableListAdapter(Context context, List<GroupBean> groupBeans, List<List> itemBeans, int groupLayout, int itemLayout) {
        this.context = context.getApplicationContext();
        this.groupBeans = groupBeans;
        this.itemBeans = itemBeans;
        this.groupLayout = groupLayout;
        this.itemLayout = itemLayout;
    }

    /**
     * 读取父级数据的条数
     *
     * @return
     */
    @Override
    public int getGroupCount() {
        return groupBeans.size();
    }

    /**
     * 读取自己数据的条数
     *
     * @param groupPosition
     * @return
     */
    @Override
    public int getChildrenCount(int groupPosition) {
        if (itemBeans == null || itemBeans.size() == 0) {
            return 0;
        }
        return itemBeans.get(groupPosition).size();
    }

    /**
     * 读取父级数据
     *
     * @param groupPosition
     * @return
     */
    @Override
    public Object getGroup(int groupPosition) {
        return groupBeans.get(groupPosition);
    }

    /**
     * 读取子级数据
     *
     * @param groupPosition
     * @param childPosition
     * @return 拿出第几组里面的第几个
     */
    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return itemBeans.get(groupPosition).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return 0;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    /**
     * 加载父级布局
     *
     * @param groupPosition
     * @param isExpanded
     * @param convertView
     * @param parent
     * @return
     */
    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        View view;
        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(groupLayout, parent, false);
        } else {
            view = convertView;
        }
        //读取父级对象
        GroupBean groupBean = (GroupBean) getGroup(groupPosition);

        TextView tv = view.findViewById(R.id.view_title);
        tv.setText(groupBean.getTitle());
        return view;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        View view;
        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(itemLayout, parent, false);
        } else {
            view = convertView;
        }
        ItemBean itemBean = (ItemBean) getChild(groupPosition, childPosition);
        TextView tv = view.findViewById(R.id.view_title);
        tv.setText(itemBean.getContent());
        return view;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
