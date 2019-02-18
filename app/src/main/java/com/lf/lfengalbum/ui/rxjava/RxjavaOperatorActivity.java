package com.lf.lfengalbum.ui.rxjava;

import android.content.DialogInterface;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;

import com.lf.lfengalbum.R;
import com.lf.lfengalbum.adapter.MsgAdapter;
import com.lf.lfengalbum.base.BaseActivity;
import com.lf.lfengalbum.data.DataUtil;
import com.lf.lfengalbum.model.MsgBean;
import com.timmy.tdialog.TDialog;
import com.timmy.tdialog.base.BindViewHolder;
import com.timmy.tdialog.listener.OnBindViewListener;

import java.util.List;

public class RxjavaOperatorActivity extends BaseActivity {

    private RecyclerView rv;
    private List<MsgBean> msgBeans;

    @Override
    public int getLayoutResID() {
        return R.layout.activity_rxjava_operator;
    }

    @Override
    public void initView() {
        rv = findView(R.id.rv);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        MsgAdapter msgAdapter = new MsgAdapter(this);
        msgBeans = DataUtil.Rxjava.getRxJavaData();
        msgAdapter.setLists(msgBeans);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(msgAdapter);
        rv.getItemAnimator().setChangeDuration(300);
        rv.getItemAnimator().setMoveDuration(300);

        msgAdapter.setOnClickListener(new MsgAdapter.OnClickListener() {
            @Override
            public void onClickListener(int position) {
                showMyDialog(position);
            }
        });
    }

    @Override
    public void onClick(View v, int id) {

    }


    private void showMyDialog(int position) {
        final MsgBean msgBean = msgBeans.get(position);

        new TDialog.Builder(getSupportFragmentManager())
                .setLayoutRes(R.layout.dialog_rxjava_operator) //设置弹窗展示的xml布局
                //.setDialogView(view)//设置弹窗布局,直接传入View
                .setWidth(600)  //设置弹窗宽度(px)
                .setHeight(800)  //设置弹窗高度(px)
                .setScreenWidthAspect(this, 1.0f)   //设置弹窗宽度(参数aspect为屏幕宽度比例 0 - 1f)
                .setScreenHeightAspect(this, 1.0f)  //设置弹窗高度(参数aspect为屏幕宽度比例 0 - 1f)
                .setGravity(Gravity.CENTER)     //设置弹窗展示位置
                .setTag("DialogTest")   //设置Tag
                .setDimAmount(0.6f)     //设置弹窗背景透明度(0-1f)
                .setCancelableOutside(true)     //弹窗在界面外是否可以点击取消
                .setDialogAnimationRes(R.style.animate_dialog)  //设置弹窗动画
                .setOnDismissListener(new DialogInterface.OnDismissListener() { //弹窗隐藏时回调方法
                    @Override
                    public void onDismiss(DialogInterface dialog) {

                    }
                })
                .setOnBindViewListener(new OnBindViewListener() {   //通过BindViewHolder拿到控件对象,进行修改
                    @Override
                    public void bindView(BindViewHolder bindViewHolder) {
                        bindViewHolder.setText(R.id.tv_operator_title, msgBean.title);
                        bindViewHolder.setText(R.id.tv_operator_content, DataUtil.Rxjava.getRxJavaCodeData(msgBean.title));
                    }
                })
//                .addOnClickListener(R.id.btn_left, R.id.btn_right)   //添加进行点击控件的id
//                .setOnViewClickListener(new OnViewClickListener() {     //View控件点击事件回调
//                    @Override
//                    public void onViewClick(BindViewHolder viewHolder, View view, TDialog tDialog) {
//                        switch (view.getId()) {
//
//                        }
//                    }
//                })
                .setOnKeyListener(new DialogInterface.OnKeyListener() {
                    @Override
                    public boolean onKey(DialogInterface dialog, int keyCode, KeyEvent event) {
                        return false;
                    }
                })
                .create()   //创建TDialog
                .show();    //展示
    }
}
