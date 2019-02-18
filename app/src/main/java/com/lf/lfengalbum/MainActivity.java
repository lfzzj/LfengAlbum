package com.lf.lfengalbum;

import android.view.View;
import android.widget.ExpandableListView;

import com.lf.lfengalbum.adapter.MyExpandableListAdapter;
import com.lf.lfengalbum.base.BaseActivity;
import com.lf.lfengalbum.data.GroupData;
import com.lf.lfengalbum.interfaces.Constant;
import com.lf.lfengalbum.model.GroupBean;
import com.lf.lfengalbum.model.ItemBean;
import com.lf.lfengalbum.ui.basis.BasisAdbActivity;
import com.lf.lfengalbum.ui.rxjava.RxjavaIntroduceActivity;
import com.lf.lfengalbum.ui.rxjava.RxjavaOperatorActivity;
import com.lf.lfengalbum.ui.rxjava.RxjavaUseCasesActivity;
import com.lf.lfengalbum.util.Logger;

import java.util.List;


public class MainActivity extends BaseActivity {
    static String TAG = "MainActivity";
    private ExpandableListView mLv;

    List<GroupBean> groupBeans;
    List<List> childList;

    @Override
    public int getLayoutResID() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        mLv = findView(R.id.lv);
    }

    @Override
    public void initListener() {
        mLv.setOnChildClickListener(mOnChildClickListener);
    }

    @Override
    public void initData() {
        groupBeans = GroupData.getGroupData();
        childList = GroupData.getChildData();

        MyExpandableListAdapter adapter = new MyExpandableListAdapter(
                this,
                groupBeans,
                childList,
                R.layout.item_expand_lv_first,
                R.layout.item_expand_lv_second);
        mLv.setAdapter(adapter);

    }

    @Override
    public void onClick(View v, int id) {

    }

    ExpandableListView.OnChildClickListener mOnChildClickListener = new ExpandableListView.OnChildClickListener() {
        @Override
        public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
            click(groupPosition, childPosition);
            return false;
        }
    };

    /**
     * 处理点击事件
     *
     * @param groupPosition
     * @param childPosition
     */
    private void click(int groupPosition, int childPosition) {
        ItemBean itemBean = (ItemBean) childList.get(groupPosition).get(childPosition);
        Logger.i(this, "---->" + itemBean.getContent());
        String flag = itemBean.getFlag();
        if (Constant.FLAG_RXJAVA_INTRODUCE.equals(flag)){
            openActivity(RxjavaIntroduceActivity.class);
        }else if (Constant.FLAG_RXJAVA_USE_CASES.equals(flag)){
            openActivity(RxjavaUseCasesActivity.class);
        }
        else if (Constant.FLAG_RXJAVA_OPERATOR.equals(flag)){
            openActivity(RxjavaOperatorActivity.class);
        }
        else if (Constant.FLAG_BASIS_ADB.equals(flag)){
            openActivity(BasisAdbActivity.class);
        }

    }
}
