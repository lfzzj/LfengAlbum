package com.lf.lfengalbum.base;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;

import com.lf.lfengalbum.R;
import com.lf.lfengalbum.interfaces.UiOperation;
import com.lf.lfengalbum.util.Utils;

public abstract class BaseActivity extends AppCompatActivity implements UiOperation {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(getLayoutResID());    // 多态
        View rootView = findViewById(android.R.id.content);    // android.R.id.content 这个id可以获取到Activity的根View
        Utils.setButtonOnClickListener(rootView, this);
        initView();
        initListener();
        initData();
    }

    /**
     * 查找View，这个方法可以省去我们的强转操作
     *
     * @param id
     * @return
     */
    public <T> T findView(int id) {
        @SuppressWarnings("unchecked")
        T view = (T) findViewById(id);
        return view;
    }

    /**
     * 在屏幕中间显示一个Toast
     *
     * @param text
     */
    public void showToast(String text) {
        Utils.showToast(this, text);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_back:    // 处理共同操作
                finish();
                break;
            default:
                // 如果单击的不是返回按钮，则还是由子类去作处理
                onClick(v, v.getId());
                break;
        }
    }

    //Activity跳转
    protected void openActivity(Class<?> pClass) {
        openActivity(pClass, null);
    }

    //Activity跳转
    protected void openActivity(Class<?> pClass, Bundle pBundle ) {
        Intent intent = new Intent(this, pClass);
        if (pBundle != null) {
            intent.putExtras(pBundle);
        }

        startActivity(intent);
    }


}
