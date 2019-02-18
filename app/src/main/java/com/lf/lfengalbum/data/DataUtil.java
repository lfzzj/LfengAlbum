package com.lf.lfengalbum.data;

import com.lf.lfengalbum.model.MsgBean;

import java.util.ArrayList;
import java.util.List;

public class DataUtil {

    public static class Rxjava {
        public static List<MsgBean> getRxJavaData() {
            List<MsgBean> lists = new ArrayList<>();
            lists.add(new MsgBean(1, "<<<<<<<<<<<<<<<创建操作符>>>>>>>>>>>>>>", ""));
            lists.add(new MsgBean(101, "create", "需要主动调用onNext来发送事件"));
            lists.add(new MsgBean(102, "just", "创建一个被观察者，并发送事件，发送的事件不可以超过10。"));
            lists.add(new MsgBean(103, "fromArray", "和 just() 类似，只不过 fromArray 可以传入多于10个的变量，并且可以传入一个数组。"));
            lists.add(new MsgBean(104, "fromCallable", "Callable 和 Runnable 的用法基本一致，只是它会返回一个结果值"));
            lists.add(new MsgBean(105, "fromFuture", "参数中的 Future 是 java.util.concurrent 中的 Future，Future 的作用是增加了 cancel() 等方法操作 Callable，它可以通过 get() 方法来获取 Callable 返回的值。"));
            lists.add(new MsgBean(106, "fromIterable", "直接发送一个 List 集合数据给观察者"));
            lists.add(new MsgBean(107, "defer", "直到被观察者被订阅后才会创建被观察者。"));
            lists.add(new MsgBean(108, "timer", "当到指定时间后就会发送一个0L的值给观察者。"));
            lists.add(new MsgBean(109, "interval", "每隔一段时间就会发送一个事件，这个事件是从0开始，不断增1的数字。"));
            lists.add(new MsgBean(110, "intervalRange", "可以指定发送事件的开始值和数量，其他与 interval() 的功能一样。"));
            lists.add(new MsgBean(111, "range", "同时发送一定范围的事件序列。"));
            lists.add(new MsgBean(112, "rangeLong", "作用与 range() 一样，只是数据类型为 Long。"));
            lists.add(new MsgBean(113, "empty", "直接发送 onComplete() 事件"));
            lists.add(new MsgBean(114, "never", "不发送任何事件"));
            lists.add(new MsgBean(115, "error", "发送 onError() 事件"));
            lists.add(new MsgBean(2, "<<<<<<<<<<<<<<<转换操作符>>>>>>>>>>>>>>", ""));
            lists.add(new MsgBean(201, "map", "将被观察者发送的数据类型转变成其他的类型"));
            lists.add(new MsgBean(202, "flatMap", "可以将事件序列中的元素进行整合加工，返回一个新的被观察者。\n" +
                    "区别：\nmap只能处理一对一的转换，而flatMap可以处理一对多，多对多的转换\n" +
                    "map直接返回的是要转化的类型，flatMap返回的是Observable对象，这将相当于创建了一个新的管道，下游收到的将是这个管道的东西。"));
            lists.add(new MsgBean(203, "concatMap", "concatMap() 和 flatMap() 基本上是一样的，只不过 concatMap() 转发出来的事件是有序的，而 flatMap() 是无序的。"));
            lists.add(new MsgBean(204, "buffer", "buffer 有两个参数，一个是 count，另一个 skip。count 缓冲区元素的数量，skip 就代表缓冲区满了之后，发送下一次事件序列的时候要跳过多少元素。"));
            lists.add(new MsgBean(205, "groupBy", "将发送的数据进行分组，每个分组都会返回一个被观察"));
            lists.add(new MsgBean(206, "scan", "将数据以一定的逻辑聚合起来。"));
            lists.add(new MsgBean(207, "window", "发送指定数量的事件时，就将这些事件分为一组。window 中的 count 的参数就是代表指定的数量，例如将 count 指定为2，那么每发2个数据就会将这2个数据分成一组。"));
            lists.add(new MsgBean(3, "<<<<<<<<<<<<<<<组合操作符>>>>>>>>>>>>>>", ""));
            lists.add(new MsgBean(301, "concat", "可以将多个观察者组合在一起，然后按照之前发送顺序发送事件。需要注意的是，concat() 最多只可以发送4个事件。"));
            lists.add(new MsgBean(302, "concatArray", "与 concat() 作用一样，不过 concatArray() 可以发送多于 4 个被观察者。"));
            lists.add(new MsgBean(303, "merge", "这个方法月 concat() 作用基本一样，知识 concat() 是串行发送事件，而 merge() 并行发送事件"));
            lists.add(new MsgBean(304, "zip", "会将多个被观察者合并，根据各个被观察者发送事件的顺序一个个结合起来，最终发送的事件数量会与源 Observable 中最少事件的数量一样。"));
            lists.add(new MsgBean(305, "reduce", "与 scan() 操作符的作用也是将发送数据以一定逻辑聚合起来，这两个的区别在于 scan() 每处理一次数据就会将事件发送给观察者，而 reduce() 会将所有数据聚合在一起才会发送事件给观察者。"));
            lists.add(new MsgBean(306, "collect", "将数据收集到数据结构当中。"));
            lists.add(new MsgBean(307, "startWith() & startWithArray()", "在发送事件之前追加事件，startWith() 追加一个事件，startWithArray() 可以追加多个事件。追加的事件会先发出。"));
            lists.add(new MsgBean(308, "count", "返回被观察者发送事件的数量。"));
            lists.add(new MsgBean(4, "<<<<<<<<<<<<<<<功能操作符>>>>>>>>>>>>>>", ""));
            lists.add(new MsgBean(401, "delay", "延迟一段事件发送事件。"));
            lists.add(new MsgBean(402, "doOnEach", "Observable 每发送一件事件之前都会先回调这个方法。"));
            lists.add(new MsgBean(403, "doOnNext", "Observable 每发送 onNext() 之前都会先回调这个方法。"));
            lists.add(new MsgBean(404, "doAfterNext", "Observable 每发送 onNext() 之后都会回调这个方法。"));
            lists.add(new MsgBean(405, "doOnComplete", "Observable 每发送 onComplete() 之前都会回调这个方法。"));
            lists.add(new MsgBean(406, "doOnError", "Observable 每发送 onError() 之前都会回调这个方法。"));
            lists.add(new MsgBean(407, "doOnSubscribe", "Observable 每发送 onSubscribe() 之前都会回调这个方法。"));
            lists.add(new MsgBean(408, "doOnDispose", "当调用 Disposable 的 dispose() 之后回调该方法。"));
            lists.add(new MsgBean(409, "doOnLifecycle", "在回调 onSubscribe 之前回调该方法的第一个参数的回调方法，可以使用该回调方法决定是否取消订阅。"));
            lists.add(new MsgBean(410, "doOnTerminate() & doAfterTerminate()", "doOnTerminate 是在 onError 或者 onComplete 发送之前回调，而 doAfterTerminate 则是 onError 或者 onComplete 发送之后回调。"));
            lists.add(new MsgBean(412, "doFinally ", "在所有事件发送完毕之后回调该方法。"));
            lists.add(new MsgBean(413, "onErrorReturn ", "当接受到一个 onError() 事件之后回调，返回的值会回调 onNext() 方法，并正常结束该事件序列。"));
            lists.add(new MsgBean(414, "onErrorResumeNext ", "当接受到一个 onError() 事件之后回调，返回的值会回调 onNext() 方法，并正常结束该事件序列。"));
            lists.add(new MsgBean(415, "onExceptionResumeNext ", "与 onErrorResumeNext() 作用基本一致，但是这个方法只能捕捉 Exception。"));
            lists.add(new MsgBean(416, "retry ", "如果出现错误事件，则会重新发送所有事件序列。times 是代表重新发的次数。"));
            lists.add(new MsgBean(417, "retryUntil ", "出现错误事件之后，可以通过此方法判断是否继续发送事件。"));
            lists.add(new MsgBean(418, "retryWhen ", "当被观察者接收到异常或者错误事件时会回调该方法，这个方法会返回一个新的被观察者。如果返回的被观察者发送 Error 事件则之前的被观察者不会继续发送事件，如果发送正常事件则之前的被观察者会继续不断重试发送事件。"));
            lists.add(new MsgBean(419, "repeat ", "重复发送被观察者的事件，times 为发送次数。"));
            lists.add(new MsgBean(420, "repeatWhen ", "这个方法可以会返回一个新的被观察者设定一定逻辑来决定是否重复发送事件。"));
            lists.add(new MsgBean(421, "subscribeOn ", "指定被观察者的线程，要注意的时，如果多次调用此方法，只有第一次有效。"));
            lists.add(new MsgBean(422, "observeOn ", "指定观察者的线程，每指定一次就会生效一次。"));
            lists.add(new MsgBean(5, "<<<<<<<<<<<<<<<过滤操作符>>>>>>>>>>>>>>", ""));
            lists.add(new MsgBean(501, "filter", "通过一定逻辑来过滤被观察者发送的事件，如果返回 true 则会发送事件，否则不会发送。"));
            lists.add(new MsgBean(502, "ofType", "可以过滤不符合该类型事件"));
            lists.add(new MsgBean(503, "skip", "跳过正序某些事件，count 代表跳过事件的数量"));
            lists.add(new MsgBean(504, "distinct", "过滤事件序列中的重复事件。"));
            lists.add(new MsgBean(505, "distinctUntilChanged", "过滤掉连续重复的事件。"));
            lists.add(new MsgBean(506, "take", "控制观察者接收的事件的数量。"));
            lists.add(new MsgBean(507, "debounce", "如果两件事件发送的时间间隔小于设定的时间间隔则前一件事件就不会发送给观察者。"));
            lists.add(new MsgBean(508, "firstElement() && lastElement()", "firstElement() 取事件序列的第一个元素，lastElement() 取事件序列的最后一个元素。"));
            lists.add(new MsgBean(509, "elementAt() & elementAtOrError()", "elementAt() 可以指定取出事件序列中事件，但是输入的 index 超出事件序列的总数的话就不会出现任何结果。这种情况下，你想发出异常信息的话就用 elementAtOrError() 。"));
            lists.add(new MsgBean(6, "<<<<<<<<<<<<<<<条件操作符>>>>>>>>>>>>>>", ""));
            lists.add(new MsgBean(601, "all", "判断事件序列是否全部满足某个事件，如果都满足则返回 true，反之则返回 false。"));
            lists.add(new MsgBean(602, "takeWhile", "可以设置条件，当某个数据满足条件时就会发送该数据，反之则不发送。"));
            lists.add(new MsgBean(603, "skipWhile", "可以设置条件，当某个数据满足条件时不发送该数据，反之则发送。"));
            lists.add(new MsgBean(604, "takeUntil", "可以设置条件，当事件满足此条件时，下一次的事件就不会被发送了。"));
            lists.add(new MsgBean(605, "skipUntil", "当 skipUntil() 中的 Observable 发送事件了，原来的 Observable 才会发送事件给观察者。"));
            lists.add(new MsgBean(606, "sequenceEqual", "判断两个 Observable 发送的事件是否相同。"));
            lists.add(new MsgBean(607, "contains", "判断事件序列中是否含有某个元素，如果有则返回 true，如果没有则返回 false。"));
            lists.add(new MsgBean(608, "isEmpty", "判断事件序列是否为空。"));
            lists.add(new MsgBean(609, "amb", "amb() 要传入一个 Observable 集合，但是只会发送最先发送事件的 Observable 中的事件，其余 Observable 将会被丢弃。"));
            lists.add(new MsgBean(610, "defaultIfEmpty", "如果观察者只发送一个 onComplete() 事件，则可以利用这个方法发送一个值。"));
            return lists;
        }

        public static String getRxJavaCodeData(String title) {
            String content = "暂无代码";
            if ("create".equals(title)) {
                content = "Observer<String> observer = new Observer<String>() {\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(String s) {\n" +
                        "        Log.d(TAG,\"=============onNext \" + s);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "        Log.d(TAG,\"=============onComplete \");\n" +
                        "    }\n" +
                        "};\n" +
                        "        \n" +
                        "observable.subscribe(observer);\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "=============onNext Hello Observer\n" +
                        "=============onComplete\n";
            } else if ("just".equals(title)) {
                content = "Observable.just(1, 2, 3)\n" +
                        ".subscribe(new Observer < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "        Log.d(TAG, \"=================onSubscribe\");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(Integer integer) {\n" +
                        "        Log.d(TAG, \"=================onNext \" + integer);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "        Log.d(TAG, \"=================onError \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "        Log.d(TAG, \"=================onComplete \");\n" +
                        "    }\n" +
                        "});\n" +
                        "\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "=================onSubscribe\n" +
                        "=================onNext 1\n" +
                        "=================onNext 2\n" +
                        "=================onNext 3\n" +
                        "=================onComplete \n";
            } else if ("fromArray".equals(title)) {
                content = "Integer array[] = {1, 2, 3, 4};\n" +
                        "Observable.fromArray(array)\n" +
                        ".subscribe(new Observer < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "        Log.d(TAG, \"=================onSubscribe\");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(Integer integer) {\n" +
                        "        Log.d(TAG, \"=================onNext \" + integer);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "        Log.d(TAG, \"=================onError \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "        Log.d(TAG, \"=================onComplete \");\n" +
                        "    }\n" +
                        "});\n" +
                        "\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "=================onSubscribe\n" +
                        "=================onNext 1\n" +
                        "=================onNext 2\n" +
                        "=================onNext 3\n" +
                        "=================onNext 4\n" +
                        "=================onComplete \n";
            } else if ("fromCallable".equals(title)) {
                content = "Observable.fromCallable(new Callable < Integer > () {\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public Integer call() throws Exception {\n" +
                        "        return 1;\n" +
                        "    }\n" +
                        "})\n" +
                        ".subscribe(new Consumer < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void accept(Integer integer) throws Exception {\n" +
                        "        Log.d(TAG, \"================accept \" + integer);\n" +
                        "    }\n" +
                        "});\n" +
                        "\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "================accept 1\n";
            } else if ("fromFuture".equals(title)) {
                content = "FutureTask <String> futureTask = new FutureTask <> (new Callable <String> () {\n" +
                        "    @Override\n" +
                        "    public String call() throws Exception {\n" +
                        "        Log.d(TAG, \"CallableDemo is Running\");\n" +
                        "        return \"返回结果\";\n" +
                        "    }\n" +
                        "});\n" +
                        "\n" +
                        "Observable.fromFuture(futureTask)\n" +
                        "    .doOnSubscribe(new Consumer < Disposable > () {\n" +
                        "    @Override\n" +
                        "    public void accept(Disposable disposable) throws Exception {\n" +
                        "        futureTask.run();\n" +
                        "    }\n" +
                        "})\n" +
                        ".subscribe(new Consumer < String > () {\n" +
                        "    @Override\n" +
                        "    public void accept(String s) throws Exception {\n" +
                        "        Log.d(TAG, \"================accept \" + s);\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "================accept 返回结果\n";
            } else if ("fromIterable".equals(title)) {
                content = "List<Integer> list = new ArrayList<>();\n" +
                        "list.add(0);\n" +
                        "list.add(1);\n" +
                        "list.add(2);\n" +
                        "list.add(3);\n" +
                        "Observable.fromIterable(list)\n" +
                        ".subscribe(new Observer < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "        Log.d(TAG, \"=================onSubscribe\");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(Integer integer) {\n" +
                        "        Log.d(TAG, \"=================onNext \" + integer);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "        Log.d(TAG, \"=================onError \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "        Log.d(TAG, \"=================onComplete \");\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "=================onSubscribe\n" +
                        "=================onNext 0\n" +
                        "=================onNext 1\n" +
                        "=================onNext 2\n" +
                        "=================onNext 3\n" +
                        "=================onComplete \n" +
                        "\n";
            } else if ("defer".equals(title)) {
                content = "// i 要定义为成员变量\n" +
                        "Integer i = 100;\n" +
                        "        \n" +
                        "Observable<Integer> observable = Observable.defer(new Callable<ObservableSource<? extends Integer>>() {\n" +
                        "    @Override\n" +
                        "    public ObservableSource<? extends Integer> call() throws Exception {\n" +
                        "        return Observable.just(i);\n" +
                        "    }\n" +
                        "});\n" +
                        "\n" +
                        "i = 200;\n" +
                        "\n" +
                        "Observer observer = new Observer<Integer>() {\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(Integer integer) {\n" +
                        "        Log.d(TAG, \"================onNext \" + integer);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "\n" +
                        "    }\n" +
                        "};\n" +
                        "\n" +
                        "observable.subscribe(observer);\n" +
                        "\n" +
                        "i = 300;\n" +
                        "\n" +
                        "observable.subscribe(observer);\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "================onNext 200\n" +
                        "================onNext 300\n";
            } else if ("timer".equals(title)) {
                content = "Observable.timer(2, TimeUnit.SECONDS)\n" +
                        ".subscribe(new Observer < Long > () {\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(Long aLong) {\n" +
                        "        Log.d(TAG, \"===============onNext \" + aLong);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "===============onNext 0\n";
            } else if ("interval".equals(title)) {
                content = "Observable.interval(4, TimeUnit.SECONDS)\n" +
                        ".subscribe(new Observer < Long > () {\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "        Log.d(TAG, \"==============onSubscribe \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(Long aLong) {\n" +
                        "        Log.d(TAG, \"==============onNext \" + aLong);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "==============onSubscribe \n" +
                        "==============onNext 0\n" +
                        "==============onNext 1\n" +
                        "==============onNext 2\n" +
                        "==============onNext 3\n" +
                        "==============onNext 4\n" +
                        "==============onNext 5\n";
            } else if ("intervalRange".equals(title)) {
                content = "Observable.intervalRange(2, 5, 2, 1, TimeUnit.SECONDS)\n" +
                        ".subscribe(new Observer < Long > () {\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "        Log.d(TAG, \"==============onSubscribe \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(Long aLong) {\n" +
                        "        Log.d(TAG, \"==============onNext \" + aLong);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "==============onSubscribe \n" +
                        "==============onNext 2\n" +
                        "==============onNext 3\n" +
                        "==============onNext 4\n" +
                        "==============onNext 5\n" +
                        "==============onNext 6\n";
            } else if ("range".equals(title)) {
                content = "Observable.range(2, 5)\n" +
                        ".subscribe(new Observer < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "        Log.d(TAG, \"==============onSubscribe \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(Integer aLong) {\n" +
                        "        Log.d(TAG, \"==============onNext \" + aLong);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "==============onSubscribe \n" +
                        "==============onNext 2\n" +
                        "==============onNext 3\n" +
                        "==============onNext 4\n" +
                        "==============onNext 5\n" +
                        "==============onNext 6\n";
            } else if ("rangeLong".equals(title)) {
                content = "Observable.rangeLong(2, 5)\n" +
                        ".subscribe(new Observer < Long > () {\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "        Log.d(TAG, \"==============onSubscribe \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(Long aLong) {\n" +
                        "        Log.d(TAG, \"==============onNext \" + aLong);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "";
            } else if ("empty".equals(title)) {
                content = "Observable.empty()\n" +
                        ".subscribe(new Observer < Object > () {\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "        Log.d(TAG, \"==================onSubscribe\");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(Object o) {\n" +
                        "        Log.d(TAG, \"==================onNext\");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "        Log.d(TAG, \"==================onError \" + e);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "        Log.d(TAG, \"==================onComplete\");\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "==================onSubscribe\n" +
                        "==================onComplete";
            } else if ("never".equals(title)) {
                content = "Observable.never()\n" +
                        ".subscribe(new Observer < Object > () {\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "        Log.d(TAG, \"==================onSubscribe\");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(Object o) {\n" +
                        "        Log.d(TAG, \"==================onNext\");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "        Log.d(TAG, \"==================onError \" + e);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "        Log.d(TAG, \"==================onComplete\");\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "==================onSubscribe";
            } else if ("error".equals(title)) {
                content = "Observable.error()\n" +
                        ".subscribe(new Observer < Object > () {\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "        Log.d(TAG, \"==================onSubscribe\");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(Object o) {\n" +
                        "        Log.d(TAG, \"==================onNext\");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "        Log.d(TAG, \"==================onError \" + e);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "        Log.d(TAG, \"==================onComplete\");\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "==================onSubscribe\n" +
                        "==================onError java.lang.NullPointerException";
            } else if ("map".equals(title)) {
                content = "Observable.just(1, 2, 3)\n" +
                        ".map(new Function < Integer, String > () {\n" +
                        "    @Override\n" +
                        "    public String apply(Integer integer) throws Exception {\n" +
                        "        return \"I'm \" + integer;\n" +
                        "    }\n" +
                        "})\n" +
                        ".subscribe(new Observer < String > () {\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "        Log.e(TAG, \"===================onSubscribe\");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(String s) {\n" +
                        "        Log.e(TAG, \"===================onNext \" + s);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "===================onSubscribe\n" +
                        "===================onNext I'm 1\n" +
                        "===================onNext I'm 2\n" +
                        "===================onNext I'm 3";
            } else if ("flatMap".equals(title)) {
                content = "public class Person {\n" +
                        "\n" +
                        "    private String name;\n" +
                        "    private List<Plan> planList = new ArrayList<>();\n" +
                        "\n" +
                        "    public Person(String name, List<Plan> planList) {\n" +
                        "        this.name = name;\n" +
                        "        this.planList = planList;\n" +
                        "    }\n" +
                        "\n" +
                        "    public String getName() {\n" +
                        "        return name;\n" +
                        "    }\n" +
                        "\n" +
                        "    public void setName(String name) {\n" +
                        "        this.name = name;\n" +
                        "    }\n" +
                        "\n" +
                        "    public List<Plan> getPlanList() {\n" +
                        "        return planList;\n" +
                        "    }\n" +
                        "\n" +
                        "    public void setPlanList(List<Plan> planList) {\n" +
                        "        this.planList = planList;\n" +
                        "    }\n" +
                        "\n" +
                        "}\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "";
            } else if ("concatMap".equals(title)) {
                content = "Observable.fromIterable(personList)\n" +
                        ".flatMap(new Function < Person, ObservableSource < Plan >> () {\n" +
                        "    @Override\n" +
                        "    public ObservableSource < Plan > apply(Person person) {\n" +
                        "        if (\"chan\".equals(person.getName())) {\n" +
                        "            return Observable.fromIterable(person.getPlanList()).delay(10, TimeUnit.MILLISECONDS);\n" +
                        "        }\n" +
                        "        return Observable.fromIterable(person.getPlanList());\n" +
                        "    }\n" +
                        "})\n" +
                        ".subscribe(new Observer < Plan > () {\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(Plan plan) {\n" +
                        "        Log.d(TAG, \"==================plan \" + plan.getContent());\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        " ==================plan chan 上课\n" +
                        "==================plan chan 写作业\n" +
                        "==================plan chan 打篮球\n" +
                        "==================plan Zede 开会\n" +
                        "==================plan Zede 写代码\n" +
                        "==================plan Zede 写文章\n";
            } else if ("buffer".equals(title)) {
                content = "Observable.just(1, 2, 3, 4, 5)\n" +
                        ".buffer(2, 1)\n" +
                        ".subscribe(new Observer < List < Integer >> () {\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(List < Integer > integers) {\n" +
                        "        Log.d(TAG, \"================缓冲区大小： \" + integers.size());\n" +
                        "        for (Integer i: integers) {\n" +
                        "            Log.d(TAG, \"================元素： \" + i);\n" +
                        "        }\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "================缓冲区大小： 2\n" +
                        "================元素： 1\n" +
                        "================元素： 2\n" +
                        "================缓冲区大小： 2\n" +
                        "================元素： 2\n" +
                        "================元素： 3\n" +
                        "================缓冲区大小： 2\n" +
                        "================元素： 3\n" +
                        "================元素： 4\n" +
                        "================缓冲区大小： 2\n" +
                        "================元素： 4\n" +
                        "================元素： 5\n" +
                        "================缓冲区大小： 1\n" +
                        "================元素： 5\n";
            } else if ("groupBy".equals(title)) {
                content = "Observable.just(5, 2, 3, 4, 1, 6, 8, 9, 7, 10)\n" +
                        ".groupBy(new Function < Integer, Integer > () {\n" +
                        "    @Override\n" +
                        "    public Integer apply(Integer integer) throws Exception {\n" +
                        "        return integer % 3;\n" +
                        "    }\n" +
                        "})\n" +
                        ".subscribe(new Observer < GroupedObservable < Integer, Integer >> () {\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "        Log.d(TAG, \"====================onSubscribe \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(GroupedObservable < Integer, Integer > integerIntegerGroupedObservable) {\n" +
                        "        Log.d(TAG, \"====================onNext \");\n" +
                        "        integerIntegerGroupedObservable.subscribe(new Observer < Integer > () {\n" +
                        "            @Override\n" +
                        "            public void onSubscribe(Disposable d) {\n" +
                        "                Log.d(TAG, \"====================GroupedObservable onSubscribe \");\n" +
                        "            }\n" +
                        "\n" +
                        "            @Override\n" +
                        "            public void onNext(Integer integer) {\n" +
                        "                Log.d(TAG, \"====================GroupedObservable onNext  groupName: \" + integerIntegerGroupedObservable.getKey() + \" value: \" + integer);\n" +
                        "            }\n" +
                        "\n" +
                        "            @Override\n" +
                        "            public void onError(Throwable e) {\n" +
                        "                Log.d(TAG, \"====================GroupedObservable onError \");\n" +
                        "            }\n" +
                        "\n" +
                        "            @Override\n" +
                        "            public void onComplete() {\n" +
                        "                Log.d(TAG, \"====================GroupedObservable onComplete \");\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "        Log.d(TAG, \"====================onError \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "        Log.d(TAG, \"====================onComplete \");\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "====================onSubscribe \n" +
                        "====================onNext \n" +
                        "====================GroupedObservable onSubscribe     ====================GroupedObservable onNext  groupName: 2 value: 5\n" +
                        "====================GroupedObservable onNext  groupName: 2 value: 2\n" +
                        "====================onNext \n" +
                        "====================GroupedObservable onSubscribe \n" +
                        "====================GroupedObservable onNext  groupName: 0 value: 3\n" +
                        "====================onNext \n" +
                        "====================GroupedObservable onSubscribe \n" +
                        "====================GroupedObservable onNext  groupName: 1 value: 4\n" +
                        "====================GroupedObservable onNext  groupName: 1 value: 1\n" +
                        "====================GroupedObservable onNext  groupName: 0 value: 6\n" +
                        "====================GroupedObservable onNext  groupName: 2 value: 8\n" +
                        "====================GroupedObservable onNext  groupName: 0 value: 9\n" +
                        "====================GroupedObservable onNext  groupName: 1 value: 7\n" +
                        "====================GroupedObservable onNext  groupName: 1 value: 10\n" +
                        "====================GroupedObservable onComplete \n" +
                        "====================GroupedObservable onComplete \n" +
                        "====================GroupedObservable onComplete \n" +
                        "====================onComplete \n";
            } else if ("scan".equals(title)) {
                content = "Observable.just(1, 2, 3, 4, 5)\n" +
                        ".scan(new BiFunction < Integer, Integer, Integer > () {\n" +
                        "    @Override\n" +
                        "    public Integer apply(Integer integer, Integer integer2) throws Exception {\n" +
                        "        Log.d(TAG, \"====================apply \");\n" +
                        "        Log.d(TAG, \"====================integer \" + integer);\n" +
                        "        Log.d(TAG, \"====================integer2 \" + integer2);\n" +
                        "        return integer + integer2;\n" +
                        "    }\n" +
                        "})\n" +
                        ".subscribe(new Consumer < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void accept(Integer integer) throws Exception {\n" +
                        "        Log.d(TAG, \"====================accept \" + integer);\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "====================accept 1\n" +
                        "====================apply \n" +
                        "====================integer 1\n" +
                        "====================integer2 2\n" +
                        "====================accept 3\n" +
                        "====================apply \n" +
                        "====================integer 3\n" +
                        "====================integer2 3\n" +
                        "====================accept 6\n" +
                        "====================apply \n" +
                        "====================integer 6\n" +
                        "====================integer2 4\n" +
                        "====================accept 10\n" +
                        "====================apply \n" +
                        "====================integer 10\n" +
                        "====================integer2 5\n" +
                        "====================accept 15\n";
            } else if ("window".equals(title)) {
                content = "Observable.just(1, 2, 3, 4, 5)\n" +
                        ".window(2)\n" +
                        ".subscribe(new Observer < Observable < Integer >> () {\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "        Log.d(TAG, \"=====================onSubscribe \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(Observable < Integer > integerObservable) {\n" +
                        "        integerObservable.subscribe(new Observer < Integer > () {\n" +
                        "            @Override\n" +
                        "            public void onSubscribe(Disposable d) {\n" +
                        "                Log.d(TAG, \"=====================integerObservable onSubscribe \");\n" +
                        "            }\n" +
                        "\n" +
                        "            @Override\n" +
                        "            public void onNext(Integer integer) {\n" +
                        "                Log.d(TAG, \"=====================integerObservable onNext \" + integer);\n" +
                        "            }\n" +
                        "\n" +
                        "            @Override\n" +
                        "            public void onError(Throwable e) {\n" +
                        "                Log.d(TAG, \"=====================integerObservable onError \");\n" +
                        "            }\n" +
                        "\n" +
                        "            @Override\n" +
                        "            public void onComplete() {\n" +
                        "                Log.d(TAG, \"=====================integerObservable onComplete \");\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "        Log.d(TAG, \"=====================onError \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "        Log.d(TAG, \"=====================onComplete \");\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "=====================onSubscribe \n" +
                        "=====================integerObservable onSubscribe \n" +
                        "=====================integerObservable onNext 1\n" +
                        "=====================integerObservable onNext 2\n" +
                        "=====================integerObservable onComplete \n" +
                        "=====================integerObservable onSubscribe \n" +
                        "=====================integerObservable onNext 3\n" +
                        "=====================integerObservable onNext 4\n" +
                        "=====================integerObservable onComplete \n" +
                        "=====================integerObservable onSubscribe \n" +
                        "=====================integerObservable onNext 5\n" +
                        "=====================integerObservable onComplete \n" +
                        "=====================onComplete \n";
            } else if ("concat".equals(title)) {
                content = "Observable.concat(Observable.just(1, 2),\n" +
                        "Observable.just(3, 4),\n" +
                        "Observable.just(5, 6),\n" +
                        "Observable.just(7, 8))\n" +
                        ".subscribe(new Observer < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(Integer integer) {\n" +
                        "        Log.d(TAG, \"================onNext \" + integer);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "================onNext 1\n" +
                        "================onNext 2\n" +
                        "================onNext 3\n" +
                        "================onNext 4\n" +
                        "================onNext 5\n" +
                        "================onNext 6\n" +
                        "================onNext 7\n" +
                        "================onNext 8\n";
            } else if ("concatArray".equals(title)) {
                content = "Observable.concatArray(Observable.just(1, 2),\n" +
                        "Observable.just(3, 4),\n" +
                        "Observable.just(5, 6),\n" +
                        "Observable.just(7, 8),\n" +
                        "Observable.just(9, 10))\n" +
                        ".subscribe(new Observer < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(Integer integer) {\n" +
                        "        Log.d(TAG, \"================onNext \" + integer);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "================onNext 1\n" +
                        "================onNext 2\n" +
                        "================onNext 3\n" +
                        "================onNext 4\n" +
                        "================onNext 5\n" +
                        "================onNext 6\n" +
                        "================onNext 7\n" +
                        "================onNext 8\n" +
                        "================onNext 9\n" +
                        "================onNext 10\n";
            } else if ("merge".equals(title)) {
                content = "Observable.merge(\n" +
                        "Observable.interval(1, TimeUnit.SECONDS).map(new Function < Long, String > () {\n" +
                        "    @Override\n" +
                        "    public String apply(Long aLong) throws Exception {\n" +
                        "        return \"A\" + aLong;\n" +
                        "    }\n" +
                        "}),\n" +
                        "Observable.interval(1, TimeUnit.SECONDS).map(new Function < Long, String > () {\n" +
                        "    @Override\n" +
                        "    public String apply(Long aLong) throws Exception {\n" +
                        "        return \"B\" + aLong;\n" +
                        "    }\n" +
                        "}))\n" +
                        "    .subscribe(new Observer < String > () {\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(String s) {\n" +
                        "        Log.d(TAG, \"=====================onNext \" + s);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "";
            } else if ("zip".equals(title)) {
                content = "Observable.zip(Observable.intervalRange(1, 5, 1, 1, TimeUnit.SECONDS)\n" +
                        "    .map(new Function<Long, String>() {\n" +
                        "        @Override\n" +
                        "        public String apply(Long aLong) throws Exception {\n" +
                        "            String s1 = \"A\" + aLong;\n" +
                        "            Log.d(TAG, \"===================A 发送的事件 \" + s1);\n" +
                        "            return s1;\n" +
                        "        }}),\n" +
                        "        Observable.intervalRange(1, 6, 1, 1, TimeUnit.SECONDS)\n" +
                        "            .map(new Function<Long, String>() {\n" +
                        "            @Override\n" +
                        "            public String apply(Long aLong) throws Exception {\n" +
                        "                String s2 = \"B\" + aLong;\n" +
                        "                Log.d(TAG, \"===================B 发送的事件 \" + s2);\n" +
                        "                return s2;\n" +
                        "            }\n" +
                        "        }),\n" +
                        "        new BiFunction<String, String, String>() {\n" +
                        "            @Override\n" +
                        "            public String apply(String s, String s2) throws Exception {\n" +
                        "                String res = s + s2;\n" +
                        "                return res;\n" +
                        "            }\n" +
                        "        })\n" +
                        ".subscribe(new Observer<String>() {\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "        Log.d(TAG, \"===================onSubscribe \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(String s) {\n" +
                        "        Log.d(TAG, \"===================onNext \" + s);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "        Log.d(TAG, \"===================onError \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "        Log.d(TAG, \"===================onComplete \");\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "===================onSubscribe \n" +
                        "===================A 发送的事件 A1\n" +
                        "===================B 发送的事件 B1\n" +
                        "===================onNext A1B1\n" +
                        "===================A 发送的事件 A2\n" +
                        "===================B 发送的事件 B2\n" +
                        "===================onNext A2B2\n" +
                        "===================A 发送的事件 A3\n" +
                        "===================B 发送的事件 B3\n" +
                        "===================onNext A3B3\n" +
                        "===================A 发送的事件 A4\n" +
                        "===================B 发送的事件 B4\n" +
                        "===================onNext A4B4\n" +
                        "===================A 发送的事件 A5\n" +
                        "===================B 发送的事件 B5\n" +
                        "===================onNext A5B5\n" +
                        "===================onComplete \n";
            } else if ("reduce".equals(title)) {
                content = "Observable.just(0, 1, 2, 3)\n" +
                        ".reduce(new BiFunction < Integer, Integer, Integer > () {\n" +
                        "    @Override\n" +
                        "    public Integer apply(Integer integer, Integer integer2) throws Exception {\n" +
                        "        int res = integer + integer2;\n" +
                        "        Log.d(TAG, \"====================integer \" + integer);\n" +
                        "        Log.d(TAG, \"====================integer2 \" + integer2);\n" +
                        "        Log.d(TAG, \"====================res \" + res);\n" +
                        "        return res;\n" +
                        "    }\n" +
                        "})\n" +
                        ".subscribe(new Consumer < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void accept(Integer integer) throws Exception {\n" +
                        "        Log.d(TAG, \"==================accept \" + integer);\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "====================integer 0\n" +
                        "====================integer2 1\n" +
                        "====================res 1\n" +
                        "====================integer 1\n" +
                        "====================integer2 2\n" +
                        "====================res 3\n" +
                        "====================integer 3\n" +
                        "====================integer2 3\n" +
                        "====================res 6\n" +
                        "==================accept 6\n";
            } else if ("collect".equals(title)) {
                content = "Observable.just(1, 2, 3, 4)\n" +
                        ".collect(new Callable < ArrayList < Integer >> () {\n" +
                        "    @Override\n" +
                        "    public ArrayList < Integer > call() throws Exception {\n" +
                        "        return new ArrayList < > ();\n" +
                        "    }\n" +
                        "},\n" +
                        "new BiConsumer < ArrayList < Integer > , Integer > () {\n" +
                        "    @Override\n" +
                        "    public void accept(ArrayList < Integer > integers, Integer integer) throws Exception {\n" +
                        "        integers.add(integer);\n" +
                        "    }\n" +
                        "})\n" +
                        ".subscribe(new Consumer < ArrayList < Integer >> () {\n" +
                        "    @Override\n" +
                        "    public void accept(ArrayList < Integer > integers) throws Exception {\n" +
                        "        Log.d(TAG, \"===============accept \" + integers);\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "===============accept [1, 2, 3, 4]\n";
            } else if ("startWith() & startWithArray()".equals(title)) {
                content = "Observable.just(5, 6, 7)\n" +
                        ".startWithArray(2, 3, 4)\n" +
                        ".startWith(1)\n" +
                        ".subscribe(new Consumer < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void accept(Integer integer) throws Exception {\n" +
                        "        Log.d(TAG, \"================accept \" + integer);\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "================accept 1\n" +
                        "================accept 2\n" +
                        "================accept 3\n" +
                        "================accept 4\n" +
                        "================accept 5\n" +
                        "================accept 6\n" +
                        "================accept 7\n";
            } else if ("count".equals(title)) {
                content = "Observable.just(1, 2, 3)\n" +
                        ".count()\n" +
                        ".subscribe(new Consumer < Long > () {\n" +
                        "    @Override\n" +
                        "    public void accept(Long aLong) throws Exception {\n" +
                        "        Log.d(TAG, \"=======================aLong \" + aLong);\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "=======================aLong 3\n";
            } else if ("delay".equals(title)) {
                content = "Observable.just(1, 2, 3)\n" +
                        ".delay(2, TimeUnit.SECONDS)\n" +
                        ".subscribe(new Observer < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "        Log.d(TAG, \"=======================onSubscribe\");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(Integer integer) {\n" +
                        "        Log.d(TAG, \"=======================onNext \" + integer);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "        Log.d(TAG, \"=======================onSubscribe\");\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "=======================onSubscribe\n" +
                        "=======================onNext 1\n" +
                        "=======================onNext 2\n" +
                        "=======================onNext 3\n" +
                        "=======================onSubscribe\n";
            } else if ("doOnEach".equals(title)) {
                content = "Observable.create(new ObservableOnSubscribe < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void subscribe(ObservableEmitter < Integer > e) throws Exception {\n" +
                        "        e.onNext(1);\n" +
                        "        e.onNext(2);\n" +
                        "        e.onNext(3);\n" +
                        "        //      e.onError(new NumberFormatException());\n" +
                        "        e.onComplete();\n" +
                        "    }\n" +
                        "})\n" +
                        ".doOnEach(new Consumer < Notification < Integer >> () {\n" +
                        "    @Override\n" +
                        "    public void accept(Notification < Integer > integerNotification) throws Exception {\n" +
                        "        Log.d(TAG, \"==================doOnEach \" + integerNotification.getValue());\n" +
                        "    }\n" +
                        "})\n" +
                        ".subscribe(new Observer < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "        Log.d(TAG, \"==================onSubscribe \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(Integer integer) {\n" +
                        "        Log.d(TAG, \"==================onNext \" + integer);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "        Log.d(TAG, \"==================onError \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "        Log.d(TAG, \"==================onComplete \");\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "==================onSubscribe \n" +
                        "==================doOnEach 1\n" +
                        "==================onNext 1\n" +
                        "==================doOnEach 2\n" +
                        "==================onNext 2\n" +
                        "==================doOnEach 3\n" +
                        "==================onNext 3\n" +
                        "==================doOnEach null\n" +
                        "==================onComplete \n";
            } else if ("doOnNext".equals(title)) {
                content = "Observable.create(new ObservableOnSubscribe < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void subscribe(ObservableEmitter < Integer > e) throws Exception {\n" +
                        "        e.onNext(1);\n" +
                        "        e.onNext(2);\n" +
                        "        e.onNext(3);\n" +
                        "        e.onComplete();\n" +
                        "    }\n" +
                        "})\n" +
                        ".doOnNext(new Consumer < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void accept(Integer integer) throws Exception {\n" +
                        "        Log.d(TAG, \"==================doOnNext \" + integer);\n" +
                        "    }\n" +
                        "})\n" +
                        ".subscribe(new Observer < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "        Log.d(TAG, \"==================onSubscribe \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(Integer integer) {\n" +
                        "        Log.d(TAG, \"==================onNext \" + integer);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "        Log.d(TAG, \"==================onError \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "        Log.d(TAG, \"==================onComplete \");\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "==================onSubscribe \n" +
                        "==================doOnNext 1\n" +
                        "==================onNext 1\n" +
                        "==================doOnNext 2\n" +
                        "==================onNext 2\n" +
                        "==================doOnNext 3\n" +
                        "==================onNext 3\n" +
                        "==================onComplete \n";
            } else if ("doAfterNext".equals(title)) {
                content = "Observable.create(new ObservableOnSubscribe < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void subscribe(ObservableEmitter < Integer > e) throws Exception {\n" +
                        "        e.onNext(1);\n" +
                        "        e.onNext(2);\n" +
                        "        e.onNext(3);\n" +
                        "        e.onComplete();\n" +
                        "    }\n" +
                        "})\n" +
                        ".doAfterNext(new Consumer < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void accept(Integer integer) throws Exception {\n" +
                        "        Log.d(TAG, \"==================doAfterNext \" + integer);\n" +
                        "    }\n" +
                        "})\n" +
                        ".subscribe(new Observer < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "        Log.d(TAG, \"==================onSubscribe \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(Integer integer) {\n" +
                        "        Log.d(TAG, \"==================onNext \" + integer);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "        Log.d(TAG, \"==================onError \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "        Log.d(TAG, \"==================onComplete \");\n" +
                        "    }\n" +
                        "});\n" +
                        "\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "==================onSubscribe \n" +
                        "==================onNext 1\n" +
                        "==================doAfterNext 1\n" +
                        "==================onNext 2\n" +
                        "==================doAfterNext 2\n" +
                        "==================onNext 3\n" +
                        "==================doAfterNext 3\n" +
                        "==================onComplete \n";
            } else if ("doOnComplete".equals(title)) {
                content = "Observable.create(new ObservableOnSubscribe < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void subscribe(ObservableEmitter < Integer > e) throws Exception {\n" +
                        "        e.onNext(1);\n" +
                        "        e.onNext(2);\n" +
                        "        e.onNext(3);\n" +
                        "        e.onComplete();\n" +
                        "    }\n" +
                        "})\n" +
                        ".doOnComplete(new Action() {\n" +
                        "    @Override\n" +
                        "    public void run() throws Exception {\n" +
                        "        Log.d(TAG, \"==================doOnComplete \");\n" +
                        "    }\n" +
                        "})\n" +
                        ".subscribe(new Observer < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "        Log.d(TAG, \"==================onSubscribe \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(Integer integer) {\n" +
                        "        Log.d(TAG, \"==================onNext \" + integer);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "        Log.d(TAG, \"==================onError \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "        Log.d(TAG, \"==================onComplete \");\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "==================onSubscribe \n" +
                        "==================onNext 1\n" +
                        "==================onNext 2\n" +
                        "==================onNext 3\n" +
                        "==================doOnComplete \n" +
                        "==================onComplete \n";
            } else if ("doOnError".equals(title)) {
                content = "Observable.create(new ObservableOnSubscribe < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void subscribe(ObservableEmitter < Integer > e) throws Exception {\n" +
                        "        e.onNext(1);\n" +
                        "        e.onNext(2);\n" +
                        "        e.onNext(3);\n" +
                        "        e.onError(new NullPointerException());\n" +
                        "    }\n" +
                        "})\n" +
                        ".doOnError(new Consumer < Throwable > () {\n" +
                        "    @Override\n" +
                        "    public void accept(Throwable throwable) throws Exception {\n" +
                        "        Log.d(TAG, \"==================doOnError \" + throwable);\n" +
                        "    }\n" +
                        "})\n" +
                        ".subscribe(new Observer < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "        Log.d(TAG, \"==================onSubscribe \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(Integer integer) {\n" +
                        "        Log.d(TAG, \"==================onNext \" + integer);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "        Log.d(TAG, \"==================onError \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "        Log.d(TAG, \"==================onComplete \");\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "==================onSubscribe \n" +
                        "==================onNext 1\n" +
                        "==================onNext 2\n" +
                        "==================onNext 3\n" +
                        "==================doOnError java.lang.NullPointerException\n" +
                        "==================onError \n" +
                        "\n";
            } else if ("doOnSubscribe".equals(title)) {
                content = "Observable.create(new ObservableOnSubscribe < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void subscribe(ObservableEmitter < Integer > e) throws Exception {\n" +
                        "        e.onNext(1);\n" +
                        "        e.onNext(2);\n" +
                        "        e.onNext(3);\n" +
                        "        e.onComplete();\n" +
                        "    }\n" +
                        "})\n" +
                        ".doOnSubscribe(new Consumer < Disposable > () {\n" +
                        "    @Override\n" +
                        "    public void accept(Disposable disposable) throws Exception {\n" +
                        "        Log.d(TAG, \"==================doOnSubscribe \");\n" +
                        "    }\n" +
                        "})\n" +
                        ".subscribe(new Observer < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "        Log.d(TAG, \"==================onSubscribe \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(Integer integer) {\n" +
                        "        Log.d(TAG, \"==================onNext \" + integer);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "        Log.d(TAG, \"==================onError \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "        Log.d(TAG, \"==================onComplete \");\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "==================doOnSubscribe \n" +
                        "==================onSubscribe \n" +
                        "==================onNext 1\n" +
                        "==================onNext 2\n" +
                        "==================onNext 3\n" +
                        "==================onComplete \n";
            } else if ("doOnDispose".equals(title)) {
                content = "Observable.create(new ObservableOnSubscribe < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void subscribe(ObservableEmitter < Integer > e) throws Exception {\n" +
                        "        e.onNext(1);\n" +
                        "        e.onNext(2);\n" +
                        "        e.onNext(3);\n" +
                        "        e.onComplete();\n" +
                        "    }\n" +
                        "})\n" +
                        ".doOnDispose(new Action() {\n" +
                        "    @Override\n" +
                        "    public void run() throws Exception {\n" +
                        "        Log.d(TAG, \"==================doOnDispose \");\n" +
                        "    }\n" +
                        "})\n" +
                        ".subscribe(new Observer < Integer > () {\n" +
                        "    private Disposable d;\n" +
                        "    \n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "        Log.d(TAG, \"==================onSubscribe \");\n" +
                        "        this.d = d;\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(Integer integer) {\n" +
                        "        Log.d(TAG, \"==================onNext \" + integer);\n" +
                        "        d.dispose();\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "        Log.d(TAG, \"==================onError \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "        Log.d(TAG, \"==================onComplete \");\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "==================onSubscribe \n" +
                        "==================onNext 1\n" +
                        "==================doOnDispose \n";
            } else if ("doOnLifecycle".equals(title)) {
                content = "Observable.create(new ObservableOnSubscribe<Integer>() {\n" +
                        "    @Override\n" +
                        "    public void subscribe(ObservableEmitter<Integer> e) throws Exception {\n" +
                        "        e.onNext(1);\n" +
                        "        e.onNext(2);\n" +
                        "        e.onNext(3);\n" +
                        "        e.onComplete();\n" +
                        "    }\n" +
                        "})\n" +
                        ".doOnLifecycle(new Consumer<Disposable>() {\n" +
                        "    @Override\n" +
                        "    public void accept(Disposable disposable) throws Exception {\n" +
                        "        Log.d(TAG, \"==================doOnLifecycle accept\");\n" +
                        "    }\n" +
                        "}, new Action() {\n" +
                        "    @Override\n" +
                        "    public void run() throws Exception {\n" +
                        "        Log.d(TAG, \"==================doOnLifecycle Action\");\n" +
                        "    }\n" +
                        "})\n" +
                        ".doOnDispose(\n" +
                        "    new Action() {\n" +
                        "        @Override\n" +
                        "        public void run() throws Exception {\n" +
                        "            Log.d(TAG, \"==================doOnDispose Action\");\n" +
                        "        }\n" +
                        "})\n" +
                        ".subscribe(new Observer<Integer>() {\n" +
                        "    private Disposable d;\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "        Log.d(TAG, \"==================onSubscribe \");\n" +
                        "        this.d = d;\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(Integer integer) {\n" +
                        "        Log.d(TAG, \"==================onNext \" + integer);\n" +
                        "        d.dispose();\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "        Log.d(TAG, \"==================onError \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "        Log.d(TAG, \"==================onComplete \");\n" +
                        "    }\n" +
                        "    \n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "==================doOnLifecycle accept\n" +
                        "==================onSubscribe \n" +
                        "==================onNext 1\n" +
                        "==================doOnDispose Action\n" +
                        "==================doOnLifecycle Action\n";
            } else if ("doOnTerminate() & doAfterTerminate()".equals(title)) {
                content = "Observable.create(new ObservableOnSubscribe<Integer>() {\n" +
                        "    @Override\n" +
                        "    public void subscribe(ObservableEmitter<Integer> e) throws Exception {\n" +
                        "        e.onNext(1);\n" +
                        "        e.onNext(2);\n" +
                        "        e.onNext(3);\n" +
                        "//      e.onError(new NullPointerException());\n" +
                        "        e.onComplete();\n" +
                        "    }\n" +
                        "})\n" +
                        ".doOnTerminate(new Action() {\n" +
                        "    @Override\n" +
                        "    public void run() throws Exception {\n" +
                        "        Log.d(TAG, \"==================doOnTerminate \");\n" +
                        "    }\n" +
                        "})\n" +
                        ".subscribe(new Observer<Integer>() {\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "        Log.d(TAG, \"==================onSubscribe \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(Integer integer) {\n" +
                        "        Log.d(TAG, \"==================onNext \" + integer);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "        Log.d(TAG, \"==================onError \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "        Log.d(TAG, \"==================onComplete \");\n" +
                        "    }\n" +
                        "    \n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "==================onSubscribe \n" +
                        "==================onNext 1\n" +
                        "==================onNext 2\n" +
                        "==================onNext 3\n" +
                        "==================doOnTerminate \n" +
                        "==================onComplete \n";
            } else if ("doFinally".equals(title)) {
                content = "Observable.create(new ObservableOnSubscribe<Integer>() {\n" +
                        "    @Override\n" +
                        "    public void subscribe(ObservableEmitter<Integer> e) throws Exception {\n" +
                        "        e.onNext(1);\n" +
                        "        e.onNext(2);\n" +
                        "        e.onNext(3);\n" +
                        "        e.onComplete();\n" +
                        "    }\n" +
                        "})\n" +
                        ".doFinally(new Action() {\n" +
                        "    @Override\n" +
                        "    public void run() throws Exception {\n" +
                        "        Log.d(TAG, \"==================doFinally \");\n" +
                        "    }\n" +
                        "})\n" +
                        ".doOnDispose(new Action() {\n" +
                        "    @Override\n" +
                        "    public void run() throws Exception {\n" +
                        "        Log.d(TAG, \"==================doOnDispose \");\n" +
                        "    }\n" +
                        "})\n" +
                        ".doAfterTerminate(new Action() {\n" +
                        "    @Override\n" +
                        "    public void run() throws Exception {\n" +
                        "        Log.d(TAG, \"==================doAfterTerminate \");\n" +
                        "    }\n" +
                        "})\n" +
                        ".subscribe(new Observer<Integer>() {\n" +
                        "    private Disposable d;\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "        Log.d(TAG, \"==================onSubscribe \");\n" +
                        "        this.d = d;\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(Integer integer) {\n" +
                        "        Log.d(TAG, \"==================onNext \" + integer);\n" +
                        "        d.dispose();\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "        Log.d(TAG, \"==================onError \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "        Log.d(TAG, \"==================onComplete \");\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "==================onSubscribe \n" +
                        "==================onNext 1\n" +
                        "==================doOnDispose \n" +
                        "==================doFinally \n";
            } else if ("onErrorReturn".equals(title)) {
                content = "Observable.create(new ObservableOnSubscribe<Integer>() {\n" +
                        "    @Override\n" +
                        "    public void subscribe(ObservableEmitter<Integer> e) throws Exception {\n" +
                        "        e.onNext(1);\n" +
                        "        e.onNext(2);\n" +
                        "        e.onNext(3);\n" +
                        "        e.onError(new NullPointerException());\n" +
                        "    }\n" +
                        "})\n" +
                        ".onErrorReturn(new Function<Throwable, Integer>() {\n" +
                        "    @Override\n" +
                        "    public Integer apply(Throwable throwable) throws Exception {\n" +
                        "        Log.d(TAG, \"==================onErrorReturn \" + throwable);\n" +
                        "        return 404;\n" +
                        "    }\n" +
                        "})\n" +
                        ".subscribe(new Observer<Integer>() {\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "        Log.d(TAG, \"==================onSubscribe \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(Integer integer) {\n" +
                        "        Log.d(TAG, \"==================onNext \" + integer);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "        Log.d(TAG, \"==================onError \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "        Log.d(TAG, \"==================onComplete \");\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "==================onSubscribe \n" +
                        "==================onNext 1\n" +
                        "==================onNext 2\n" +
                        "==================onNext 3\n" +
                        "==================onErrorReturn java.lang.NullPointerException\n" +
                        "==================onNext 404\n" +
                        "==================onComplete \n";
            } else if ("onErrorResumeNext".equals(title)) {
                content = "Observable.create(new ObservableOnSubscribe<Integer>() {\n" +
                        "    @Override\n" +
                        "    public void subscribe(ObservableEmitter<Integer> e) throws Exception {\n" +
                        "        e.onNext(1);\n" +
                        "        e.onNext(2);\n" +
                        "        e.onNext(3);\n" +
                        "        e.onError(new NullPointerException());\n" +
                        "    }\n" +
                        "})\n" +
                        ".onErrorResumeNext(new Function<Throwable, ObservableSource<? extends Integer>>() {\n" +
                        "    @Override\n" +
                        "    public ObservableSource<? extends Integer> apply(Throwable throwable) throws Exception {\n" +
                        "        Log.d(TAG, \"==================onErrorResumeNext \" + throwable);\n" +
                        "        return Observable.just(4, 5, 6);\n" +
                        "    }\n" +
                        "})\n" +
                        ".subscribe(new Observer<Integer>() {\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "        Log.d(TAG, \"==================onSubscribe \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(Integer integer) {\n" +
                        "        Log.d(TAG, \"==================onNext \" + integer);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "        Log.d(TAG, \"==================onError \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "        Log.d(TAG, \"==================onComplete \");\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "==================onSubscribe \n" +
                        "==================onNext 1\n" +
                        "==================onNext 2\n" +
                        "==================onNext 3\n" +
                        "==================onErrorResumeNext java.lang.NullPointerException\n" +
                        "==================onNext 4\n" +
                        "==================onNext 5\n" +
                        "==================onNext 6\n" +
                        "==================onComplete \n";
            } else if ("onExceptionResumeNext".equals(title)) {
                content = "Observable.create(new ObservableOnSubscribe<Integer>() {\n" +
                        "    @Override\n" +
                        "    public void subscribe(ObservableEmitter<Integer> e) throws Exception {\n" +
                        "        e.onNext(1);\n" +
                        "        e.onNext(2);\n" +
                        "        e.onNext(3);\n" +
                        "        e.onError(new Error(\"404\"));\n" +
                        "    }\n" +
                        "})\n" +
                        ".onExceptionResumeNext(new Observable<Integer>() {\n" +
                        "    @Override\n" +
                        "    protected void subscribeActual(Observer<? super Integer> observer) {\n" +
                        "        observer.onNext(333);\n" +
                        "        observer.onComplete();\n" +
                        "    }\n" +
                        "})\n" +
                        ".subscribe(new Observer<Integer>() {\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "        Log.d(TAG, \"==================onSubscribe \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(Integer integer) {\n" +
                        "        Log.d(TAG, \"==================onNext \" + integer);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "        Log.d(TAG, \"==================onError \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "        Log.d(TAG, \"==================onComplete \");\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "==================onSubscribe \n" +
                        "==================onNext 1\n" +
                        "==================onNext 2\n" +
                        "==================onNext 3\n" +
                        "==================onError \n";
            } else if ("retry".equals(title)) {
                content = "Observable.create(new ObservableOnSubscribe<Integer>() {\n" +
                        "    @Override\n" +
                        "    public void subscribe(ObservableEmitter<Integer> e) throws Exception {\n" +
                        "        e.onNext(1);\n" +
                        "        e.onNext(2);\n" +
                        "        e.onNext(3);\n" +
                        "        e.onError(new Exception(\"404\"));\n" +
                        "    }\n" +
                        "})\n" +
                        ".retry(2)\n" +
                        ".subscribe(new Observer<Integer>() {\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "        Log.d(TAG, \"==================onSubscribe \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(Integer integer) {\n" +
                        "        Log.d(TAG, \"==================onNext \" + integer);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "        Log.d(TAG, \"==================onError \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "        Log.d(TAG, \"==================onComplete \");\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "==================onSubscribe \n" +
                        "==================onNext 1\n" +
                        "==================onNext 2\n" +
                        "==================onNext 3\n" +
                        "==================onNext 1\n" +
                        "==================onNext 2\n" +
                        "==================onNext 3\n" +
                        "==================onNext 1\n" +
                        "==================onNext 2\n" +
                        "==================onNext 3\n" +
                        "==================onError \n";
            } else if ("retryUntil".equals(title)) {
                content = "Observable.create(new ObservableOnSubscribe < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void subscribe(ObservableEmitter < Integer > e) throws Exception {\n" +
                        "        e.onNext(1);\n" +
                        "        e.onNext(2);\n" +
                        "        e.onNext(3);\n" +
                        "        e.onError(new Exception(\"404\"));\n" +
                        "    }\n" +
                        "})\n" +
                        ".retryUntil(new BooleanSupplier() {\n" +
                        "    @Override\n" +
                        "    public boolean getAsBoolean() throws Exception {\n" +
                        "        if (i == 6) {\n" +
                        "            return true;\n" +
                        "        }\n" +
                        "        return false;\n" +
                        "    }\n" +
                        "})\n" +
                        ".subscribe(new Observer < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "        Log.d(TAG, \"==================onSubscribe \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(Integer integer) {\n" +
                        "        i += integer;\n" +
                        "        Log.d(TAG, \"==================onNext \" + integer);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "        Log.d(TAG, \"==================onError \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "        Log.d(TAG, \"==================onComplete \");\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "==================onSubscribe \n" +
                        "==================onNext 1\n" +
                        "==================onNext 2\n" +
                        "==================onNext 3\n" +
                        "==================onError \n" +
                        "\n";
            } else if ("retryWhen".equals(title)) {
                content = "Observable.create(new ObservableOnSubscribe < String > () {\n" +
                        "    @Override\n" +
                        "    public void subscribe(ObservableEmitter < String > e) throws Exception {\n" +
                        "        e.onNext(\"chan\");\n" +
                        "        e.onNext(\"ze\");\n" +
                        "        e.onNext(\"de\");\n" +
                        "        e.onError(new Exception(\"404\"));\n" +
                        "        e.onNext(\"haha\");\n" +
                        "    }\n" +
                        "})\n" +
                        ".retryWhen(new Function < Observable < Throwable > , ObservableSource <? >> () {\n" +
                        "    @Override\n" +
                        "    public ObservableSource <? > apply(Observable < Throwable > throwableObservable) throws Exception {\n" +
                        "        return throwableObservable.flatMap(new Function < Throwable, ObservableSource <? >> () {\n" +
                        "            @Override\n" +
                        "            public ObservableSource <? > apply(Throwable throwable) throws Exception {\n" +
                        "                if(!throwable.toString().equals(\"java.lang.Exception: 404\")) {\n" +
                        "                    return Observable.just(\"可以忽略的异常\");\n" +
                        "                } else {\n" +
                        "                    return Observable.error(new Throwable(\"终止啦\"));\n" +
                        "                }\n" +
                        "            }\n" +
                        "        });\n" +
                        "    }\n" +
                        "})\n" +
                        ".subscribe(new Observer < String > () {\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "        Log.d(TAG, \"==================onSubscribe \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(String s) {\n" +
                        "        Log.d(TAG, \"==================onNext \" + s);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "        Log.d(TAG, \"==================onError \" + e.toString());\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "        Log.d(TAG, \"==================onComplete \");\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "==================onSubscribe \n" +
                        "==================onNext chan\n" +
                        "==================onNext ze\n" +
                        "==================onNext de\n" +
                        "==================onError java.lang.Throwable: 终止啦\n";
            } else if ("repeat".equals(title)) {
                content = "Observable.create(new ObservableOnSubscribe < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void subscribe(ObservableEmitter < Integer > e) throws Exception {\n" +
                        "        e.onNext(1);\n" +
                        "        e.onNext(2);\n" +
                        "        e.onNext(3);\n" +
                        "        e.onComplete();\n" +
                        "    }\n" +
                        "})\n" +
                        ".repeat(2)\n" +
                        ".subscribe(new Observer < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "        Log.d(TAG, \"===================onSubscribe \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(Integer integer) {\n" +
                        "        Log.d(TAG, \"===================onNext \" + integer);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "        Log.d(TAG, \"===================onComplete \");\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "===================onSubscribe \n" +
                        "===================onNext 1\n" +
                        "===================onNext 2\n" +
                        "===================onNext 3\n" +
                        "===================onNext 1\n" +
                        "===================onNext 2\n" +
                        "===================onNext 3\n" +
                        "===================onComplete \n";
            } else if ("repeatWhen".equals(title)) {
                content = "Observable.create(new ObservableOnSubscribe < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void subscribe(ObservableEmitter < Integer > e) throws Exception {\n" +
                        "        e.onNext(1);\n" +
                        "        e.onNext(2);\n" +
                        "        e.onNext(3);\n" +
                        "        e.onComplete();\n" +
                        "    }\n" +
                        "})\n" +
                        ".repeatWhen(new Function < Observable < Object > , ObservableSource <? >> () {\n" +
                        "    @Override\n" +
                        "    public ObservableSource <? > apply(Observable < Object > objectObservable) throws Exception {\n" +
                        "        return Observable.empty();\n" +
                        "    //  return Observable.error(new Exception(\"404\"));\n" +
                        "    //  return Observable.just(4); null;\n" +
                        "    }\n" +
                        "})\n" +
                        ".subscribe(new Observer < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "        Log.d(TAG, \"===================onSubscribe \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(Integer integer) {\n" +
                        "        Log.d(TAG, \"===================onNext \" + integer);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "        Log.d(TAG, \"===================onError \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "        Log.d(TAG, \"===================onComplete \");\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "";
            } else if ("subscribeOn".equals(title)) {
                content = "Observable.create(new ObservableOnSubscribe < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void subscribe(ObservableEmitter < Integer > e) throws Exception {\n" +
                        "        Log.d(TAG, \"=========================currentThread name: \" + Thread.currentThread().getName());\n" +
                        "        e.onNext(1);\n" +
                        "        e.onNext(2);\n" +
                        "        e.onNext(3);\n" +
                        "        e.onComplete();\n" +
                        "    }\n" +
                        "})\n" +
                        "//.subscribeOn(Schedulers.newThread())\n" +
                        ".subscribe(new Observer < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "        Log.d(TAG, \"======================onSubscribe\");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(Integer integer) {\n" +
                        "        Log.d(TAG, \"======================onNext \" + integer);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "        Log.d(TAG, \"======================onError\");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "        Log.d(TAG, \"======================onComplete\");\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "======================onSubscribe\n" +
                        "=========================currentThread name: main\n" +
                        "======================onNext 1\n" +
                        "======================onNext 2\n" +
                        "======================onNext 3\n" +
                        "======================onComplete\n";
            } else if ("observeOn".equals(title)) {
                content = "Observable.just(1, 2, 3)\n" +
                        ".observeOn(Schedulers.newThread())\n" +
                        ".flatMap(new Function < Integer, ObservableSource < String >> () {\n" +
                        "    @Override\n" +
                        "    public ObservableSource < String > apply(Integer integer) throws Exception {\n" +
                        "        Log.d(TAG, \"======================flatMap Thread name \" + Thread.currentThread().getName());\n" +
                        "        return Observable.just(\"chan\" + integer);\n" +
                        "    }\n" +
                        "})\n" +
                        ".observeOn(AndroidSchedulers.mainThread())\n" +
                        ".subscribe(new Observer < String > () {\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "        Log.d(TAG, \"======================onSubscribe\");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(String s) {\n" +
                        "        Log.d(TAG, \"======================onNext Thread name \" + Thread.currentThread().getName());\n" +
                        "        Log.d(TAG, \"======================onNext \" + s);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "        Log.d(TAG, \"======================onError\");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "        Log.d(TAG, \"======================onComplete\");\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "======================onSubscribe\n" +
                        "======================flatMap Thread name RxNewThreadScheduler-1\n" +
                        "======================flatMap Thread name RxNewThreadScheduler-1\n" +
                        "======================flatMap Thread name RxNewThreadScheduler-1\n" +
                        "======================onNext Thread name main\n" +
                        "======================onNext chan1\n" +
                        "======================onNext Thread name main\n" +
                        "======================onNext chan2\n" +
                        "======================onNext Thread name main\n" +
                        "======================onNext chan3\n" +
                        "======================onComplete\n";
            } else if ("filter".equals(title)) {
                content = " Observable.just(1, 2, 3)\n" +
                        "    .filter(new Predicate < Integer > () {\n" +
                        "        @Override\n" +
                        "        public boolean test(Integer integer) throws Exception {\n" +
                        "            return integer < 2;\n" +
                        "        }\n" +
                        "})\n" +
                        ".subscribe(new Observer < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "        Log.d(TAG, \"==================onSubscribe \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(Integer integer) {\n" +
                        "        i += integer;\n" +
                        "        Log.d(TAG, \"==================onNext \" + integer);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "        Log.d(TAG, \"==================onError \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "        Log.d(TAG, \"==================onComplete \");\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "==================onSubscribe \n" +
                        "==================onNext 1\n" +
                        "==================onComplete \n";
            } else if ("retryWhen".equals(title)) {
                content = "";
            } else if ("ofType".equals(title)) {
                content = "Observable.just(1, 2, 3, \"chan\", \"zhide\")\n" +
                        ".ofType(Integer.class)\n" +
                        ".subscribe(new Observer < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "        Log.d(TAG, \"==================onSubscribe \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(Integer integer) {\n" +
                        "        i += integer;\n" +
                        "        Log.d(TAG, \"==================onNext \" + integer);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "        Log.d(TAG, \"==================onError \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "        Log.d(TAG, \"==================onComplete \");\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "==================onSubscribe \n" +
                        "==================onNext 1\n" +
                        "==================onNext 2\n" +
                        "==================onNext 3\n" +
                        "==================onComplete \n";
            } else if ("skip".equals(title)) {
                content = "Observable.just(1, 2, 3)\n" +
                        ".skip(2)\n" +
                        ".subscribe(new Observer < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "        Log.d(TAG, \"==================onSubscribe \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(Integer integer) {\n" +
                        "        i += integer;\n" +
                        "        Log.d(TAG, \"==================onNext \" + integer);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "        Log.d(TAG, \"==================onError \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "        Log.d(TAG, \"==================onComplete \");\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "==================onSubscribe \n" +
                        "==================onNext 3\n" +
                        "==================onComplete \n";
            } else if ("distinct".equals(title)) {
                content = "Observable.just(1, 2, 3, 3, 2, 1)\n" +
                        ".distinct()\n" +
                        ".subscribe(new Observer < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "        Log.d(TAG, \"==================onSubscribe \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(Integer integer) {\n" +
                        "        i += integer;\n" +
                        "        Log.d(TAG, \"==================onNext \" + integer);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "        Log.d(TAG, \"==================onError \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "        Log.d(TAG, \"==================onComplete \");\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "==================onSubscribe \n" +
                        "==================onNext 1\n" +
                        "==================onNext 2\n" +
                        "==================onNext 3\n" +
                        "==================onComplete \n";
            } else if ("distinctUntilChanged".equals(title)) {
                content = "Observable.just(1, 2, 3, 3, 2, 1)\n" +
                        ".distinctUntilChanged()\n" +
                        ".subscribe(new Observer < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "        Log.d(TAG, \"==================onSubscribe \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(Integer integer) {\n" +
                        "        i += integer;\n" +
                        "        Log.d(TAG, \"==================onNext \" + integer);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "        Log.d(TAG, \"==================onError \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "        Log.d(TAG, \"==================onComplete \");\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "==================onSubscribe \n" +
                        "==================onNext 1\n" +
                        "==================onNext 2\n" +
                        "==================onNext 3\n" +
                        "==================onNext 2\n" +
                        "==================onNext 1\n" +
                        "==================onComplete \n";
            } else if ("take".equals(title)) {
                content = "Observable.just(1, 2, 3, 4, 5)\n" +
                        ".take(3)\n" +
                        ".subscribe(new Observer < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "        Log.d(TAG, \"==================onSubscribe \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(Integer integer) {\n" +
                        "        i += integer;\n" +
                        "        Log.d(TAG, \"==================onNext \" + integer);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "        Log.d(TAG, \"==================onError \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "        Log.d(TAG, \"==================onComplete \");\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "==================onSubscribe \n" +
                        "==================onNext 1\n" +
                        "==================onNext 2\n" +
                        "==================onNext 3\n" +
                        "==================onComplete \n";
            } else if ("debounce".equals(title)) {
                content = "Observable.create(new ObservableOnSubscribe < Integer > () {\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void subscribe(ObservableEmitter < Integer > e) throws Exception {\n" +
                        "        e.onNext(1);\n" +
                        "        Thread.sleep(900);\n" +
                        "        e.onNext(2);\n" +
                        "    }\n" +
                        "})\n" +
                        ".debounce(1, TimeUnit.SECONDS)\n" +
                        ".subscribe(new Observer < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "        Log.d(TAG, \"===================onSubscribe \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(Integer integer) {\n" +
                        "        Log.d(TAG, \"===================onNext \" + integer);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "        Log.d(TAG, \"===================onError \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "        Log.d(TAG, \"===================onComplete \");\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "===================onSubscribe \n" +
                        "===================onNext 2\n";
            } else if ("firstElement() && lastElement()".equals(title)) {
                content = "Observable.just(1, 2, 3, 4)\n" +
                        ".firstElement()\n" +
                        ".subscribe(new Consumer < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void accept(Integer integer) throws Exception {\n" +
                        "        Log.d(TAG, \"====================firstElement \" + integer);\n" +
                        "    }\n" +
                        "});\n" +
                        "\n" +
                        "Observable.just(1, 2, 3, 4)\n" +
                        ".lastElement()\n" +
                        ".subscribe(new Consumer < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void accept(Integer integer) throws Exception {\n" +
                        "        Log.d(TAG, \"====================lastElement \" + integer);\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "====================firstElement 1\n" +
                        "====================lastElement 4\n";
            } else if ("elementAt() & elementAtOrError()".equals(title)) {
                content = "Observable.just(1, 2, 3, 4)\n" +
                        ".elementAt(0)\n" +
                        ".subscribe(new Consumer < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void accept(Integer integer) throws Exception {\n" +
                        "        Log.d(TAG, \"====================accept \" + integer);\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "====================accept 1\n";
            } else if ("all".equals(title)) {
                content = "Observable.just(1, 2, 3, 4)\n" +
                        ".all(new Predicate < Integer > () {\n" +
                        "    @Override\n" +
                        "    public boolean test(Integer integer) throws Exception {\n" +
                        "        return integer < 5;\n" +
                        "    }\n" +
                        "})\n" +
                        ".subscribe(new Consumer < Boolean > () {\n" +
                        "    @Override\n" +
                        "    public void accept(Boolean aBoolean) throws Exception {\n" +
                        "        Log.d(TAG, \"==================aBoolean \" + aBoolean);\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "==================aBoolean true\n";
            } else if ("takeWhile".equals(title)) {
                content = "Observable.just(1, 2, 3, 4)\n" +
                        ".takeWhile(new Predicate < Integer > () {\n" +
                        "    @Override\n" +
                        "    public boolean test(Integer integer) throws Exception {\n" +
                        "        return integer < 3;\n" +
                        "    }\n" +
                        "})\n" +
                        ".subscribe(new Consumer < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void accept(Integer integer) throws Exception {\n" +
                        "        Log.d(TAG, \"========================integer \" + integer);\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "========================integer 1\n" +
                        "========================integer 2\n";
            } else if ("skipWhile".equals(title)) {
                content = "Observable.just(1, 2, 3, 4)\n" +
                        ".skipWhile(new Predicate < Integer > () {\n" +
                        "    @Override\n" +
                        "    public boolean test(Integer integer) throws Exception {\n" +
                        "        return integer < 3;\n" +
                        "    }\n" +
                        "})\n" +
                        ".subscribe(new Consumer < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void accept(Integer integer) throws Exception {\n" +
                        "        Log.d(TAG, \"========================integer \" + integer);\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "========================integer 3\n" +
                        "========================integer 4\n";
            } else if ("takeUntil".equals(title)) {
                content = "Observable.just(1, 2, 3, 4, 5, 6)\n" +
                        ".takeUntil(new Predicate < Integer > () {\n" +
                        "    @Override\n" +
                        "    public boolean test(Integer integer) throws Exception {\n" +
                        "        return integer > 3;\n" +
                        "    }\n" +
                        "})\n" +
                        ".subscribe(new Consumer < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void accept(Integer integer) throws Exception {\n" +
                        "        Log.d(TAG, \"========================integer \" + integer);\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "========================integer 1\n" +
                        "========================integer 2\n" +
                        "========================integer 3\n" +
                        "========================integer 4\n";
            } else if ("skipUntil".equals(title)) {
                content = "Observable.intervalRange(1, 5, 0, 1, TimeUnit.SECONDS)\n" +
                        ".skipUntil(Observable.intervalRange(6, 5, 3, 1, TimeUnit.SECONDS))\n" +
                        ".subscribe(new Observer < Long > () {\n" +
                        "    @Override\n" +
                        "    public void onSubscribe(Disposable d) {\n" +
                        "        Log.d(TAG, \"========================onSubscribe \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onNext(Long along) {\n" +
                        "        Log.d(TAG, \"========================onNext \" + along);\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onError(Throwable e) {\n" +
                        "        Log.d(TAG, \"========================onError \");\n" +
                        "    }\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void onComplete() {\n" +
                        "        Log.d(TAG, \"========================onComplete \");\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "========================onSubscribe \n" +
                        "========================onNext 4\n" +
                        "========================onNext 5\n" +
                        "========================onComplete \n";
            } else if ("sequenceEqual".equals(title)) {
                content = "Observable.sequenceEqual(Observable.just(1, 2, 3),\n" +
                        "Observable.just(1, 2, 3))\n" +
                        ".subscribe(new Consumer < Boolean > () {\n" +
                        "    @Override\n" +
                        "    public void accept(Boolean aBoolean) throws Exception {\n" +
                        "        Log.d(TAG, \"========================onNext \" + aBoolean);\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "========================onNext true\n";
            } else if ("contains".equals(title)) {
                content = "Observable.just(1, 2, 3)\n" +
                        ".contains(3)\n" +
                        ".subscribe(new Consumer < Boolean > () {\n" +
                        "    @Override\n" +
                        "    public void accept(Boolean aBoolean) throws Exception {\n" +
                        "        Log.d(TAG, \"========================onNext \" + aBoolean);\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "========================onNext true\n";
            } else if ("isEmpty".equals(title)) {
                content = "Observable.create(new ObservableOnSubscribe < Integer > () {\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void subscribe(ObservableEmitter < Integer > e) throws Exception {\n" +
                        "        e.onComplete();\n" +
                        "    }\n" +
                        "})\n" +
                        ".isEmpty()\n" +
                        ".subscribe(new Consumer < Boolean > () {\n" +
                        "    @Override\n" +
                        "    public void accept(Boolean aBoolean) throws Exception {\n" +
                        "        Log.d(TAG, \"========================onNext \" + aBoolean);\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "========================onNext true\n";
            } else if ("amb".equals(title)) {
                content = "ArrayList < Observable < Long >> list = new ArrayList < > ();\n" +
                        "\n" +
                        "list.add(Observable.intervalRange(1, 5, 2, 1, TimeUnit.SECONDS));\n" +
                        "list.add(Observable.intervalRange(6, 5, 0, 1, TimeUnit.SECONDS));\n" +
                        "\n" +
                        "Observable.amb(list)\n" +
                        ".subscribe(new Consumer < Long > () {\n" +
                        "    @Override\n" +
                        "    public void accept(Long aLong) throws Exception {\n" +
                        "        Log.d(TAG, \"========================aLong \" + aLong);\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "========================aLong 6\n" +
                        "========================aLong 7\n" +
                        "========================aLong 8\n" +
                        "========================aLong 9\n" +
                        "========================aLong 10\n";
            } else if ("defaultIfEmpty".equals(title)) {
                content = "Observable.create(new ObservableOnSubscribe < Integer > () {\n" +
                        "\n" +
                        "    @Override\n" +
                        "    public void subscribe(ObservableEmitter < Integer > e) throws Exception {\n" +
                        "        e.onComplete();\n" +
                        "    }\n" +
                        "})\n" +
                        ".defaultIfEmpty(666)\n" +
                        ".subscribe(new Consumer < Integer > () {\n" +
                        "    @Override\n" +
                        "    public void accept(Integer integer) throws Exception {\n" +
                        "        Log.d(TAG, \"========================onNext \" + integer);\n" +
                        "    }\n" +
                        "});\n" +
                        "\n\n" +
                        "打印结果：\n\n" +
                        "========================onNext 666\n";
            }
            return content;
        }
    }
}
