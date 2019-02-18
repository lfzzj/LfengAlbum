package com.lf.lfengalbum.ui.rxjava;

import android.view.View;
import android.widget.TextView;

import com.lf.lfengalbum.R;
import com.lf.lfengalbum.base.BaseActivity;
import com.lf.lfengalbum.util.Logger;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

/**
 * 基本使用
 *
 */
public class RxjavaUseCasesActivity extends BaseActivity {
    private TextView tv;

    @Override
    public int getLayoutResID() {
        return R.layout.activity_rxjava_use_cases;
    }

    @Override
    public void initView() {
        tv = findView(R.id.tv);
    }

    @Override
    public void initListener() {

    }

    /**
     * onNext() 发送该事件时，观察者会回调 onNext() 方法
     * onError() 发送该事件时，观察者会回调 onError() 方法，当发送该事件之后，其他事件将不会继续发送
     * onComplete() 发送该事件时，观察者会回调 onComplete() 方法，当发送该事件之后，其他事件将不会继续发送
     */
    @Override
    public void initData() {
        tv.setText("\u3000基本元素：" +
                "\n\u3000\u3000被观察者（Observable）" +
                "\n\u3000\u3000" +"观察者（Observer）" +
                "\n\u3000\u3000" + "订阅（subscribe）" +
                "\n\n\u3000onNext()\t发送该事件时，观察者会回调 onNext() 方法" +
                "\n\u3000onError()\t发送该事件时，观察者会回调 onError() 方法，当发送该事件之后，其他事件将不会继续发送" +
                "\n\u3000onComplete()\t发送该事件时，观察者会回调 onComplete() 方法，当发送该事件之后，其他事件将不会继续发送");

        //1.创建被观察者
        Observable observable = Observable.create(new ObservableOnSubscribe<Integer>() {
            @Override
            public void subscribe(ObservableEmitter<Integer> e) throws Exception {
                e.onNext(1);
                e.onNext(2);
                e.onNext(3);
                e.onComplete();
            }
        });

        //2.创建观察者：
        Observer observer = new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {
                Logger.i(this, "======================onSubscribe");
            }

            @Override
            public void onNext(Integer integer) {
                Logger.i(this, "======================onNext " + integer);
            }

            @Override
            public void onError(Throwable e) {
                Logger.i(this, "======================onError");
            }

            @Override
            public void onComplete() {
                Logger.i(this,  "======================onComplete");
            }
        };

        //3.订阅
        observable.subscribe(observer);


    }

    @Override
    public void onClick(View v, int id) {

    }
}
