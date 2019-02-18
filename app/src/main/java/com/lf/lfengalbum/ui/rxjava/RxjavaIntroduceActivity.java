package com.lf.lfengalbum.ui.rxjava;

import android.view.View;
import android.widget.TextView;

import com.lf.lfengalbum.R;
import com.lf.lfengalbum.base.BaseActivity;

public class RxjavaIntroduceActivity extends BaseActivity {

    private TextView tv;

    @Override
    public int getLayoutResID() {
        return R.layout.activity_rxjava_introduce;
    }

    @Override
    public void initView() {
        tv = findView(R.id.tv);
    }

    @Override
    public void initListener() {

    }

    @Override
    public void initData() {
        tv.setText("\u3000简介：" +
                "\n\u3000\u3000是一个在Java VM上使用可观测的序列来组成异步的、基于事件的程序的库。" +
                "\n\u3000用途:" +
                "\n\u3000\u3000" +"1、简化异步程序的流程；" +
                "\n\u3000\u3000" +"2、使用近似于Java8的流的操作进行编程：因为想要在Android中使用Java8的流编程有诸多的限制，所以我们可以使用RxJava来实现这个目的。\n"+
                        "\n\u3000\u3000 implementation 'io.reactivex.rxjava2:rxjava:2.2.0'\n" +
                        "\u3000\u3000 implementation 'io.reactivex.rxjava2:rxandroid:2.0.2'"
        );
    }

    @Override
    public void onClick(View v, int id) {

    }
}
