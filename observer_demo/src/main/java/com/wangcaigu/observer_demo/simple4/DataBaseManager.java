package com.wangcaigu.observer_demo.simple4;

/**
 * Author：Created by Wbin on 2018/12/14
 *
 * Description：
 */
public class DataBaseManager {

    private static volatile DataBaseManager mInstance;
    private Observable<Member, Observer<Member>> mObservable;

    public DataBaseManager() {
        mObservable = new Observable<>();
    }

    public static DataBaseManager getInstance() {
        if (mInstance == null) {
            synchronized (DataBaseManager.class) {
                if (mInstance == null) {
                    mInstance = new DataBaseManager();
                }
            }
        }
        return mInstance;
    }

    public void insert(Member member) {
        //更新数据库
        mObservable.addUpdate(member);
    }

    public void register(Observer<Member> observer) {
        mObservable.register(observer);
    }

    public void unregister(Observer<Member> observer) {
        mObservable.unregister(observer);
    }
}

