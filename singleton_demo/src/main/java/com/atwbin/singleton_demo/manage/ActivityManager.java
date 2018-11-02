package com.atwbin.singleton_demo.manage;

import android.app.Activity;
import android.content.Intent;

import java.util.Stack;

/**
 * Author：Created by Wbin on 2018/11/2
 *
 * Description：
 */
public class ActivityManager {

    //创建一个集合 进行管理activity
    //Stack好处   不但查询快 还保证了线程安全
    private Stack<Activity> mActivities;
    private static volatile ActivityManager mInstance;

    private ActivityManager() {
        mActivities = new Stack<>();
    }

    public static ActivityManager getmInstance() {
        if (mInstance == null) {
            synchronized (ActivityManager.class) {
                if (mInstance == null) {
                    mInstance = new ActivityManager();
                }
            }
        }
        return mInstance;
    }

    /**
     * 添加
     *
     * @param activity activity
     */
    public void attach(Activity activity) {
        mActivities.add(activity);

    }

    /**
     * 移除  方式内存泄漏
     *
     * @param detachActivity detachActivity
     */
    public void detach(Activity detachActivity) {

        //for 循环移除 ：  一边移除一边循环是有问题的
        // 如何解决？
        /*for (Activity activity : mActivities) {
            if (activity == detachActivity) {
                mActivities.remove(activity);
            }
        }*/

        int size = mActivities.size();
        for (int i = 0; i < size; i++) {
            Activity activity = mActivities.get(i);
            if (activity == detachActivity) {
                mActivities.remove(i);
                i--;
                size--;
            }
        }

    }


    /**
     * 关闭当前的activity
     *
     * @param finishActivity finishActivity
     */
    public void finish(Activity finishActivity) {
       /* for (Activity activity : mActivities) {
            if (activity == finishActivity) {
                mActivities.remove(activity);
            }
        }*/

        int size = mActivities.size();
        for (int i = 0; i < size; i++) {
            Activity activity = mActivities.get(i);
            if (activity == finishActivity) {
                mActivities.remove(i);
                activity.finish();
                i--;
                size--;
            }
        }
    }

    /**
     * 根据activity的类名来关闭Activty
     *
     * @param activityClass activityClass
     */
    public void finish(Class<? extends Activity> activityClass) {
        /*for (Activity activity : mActivities) {
            if (activity.getClass().getCanonicalName().equals(activityClass.getName())) {
                mActivities.remove(activity);
                activity.finish();
            }
        }*/

        int size = mActivities.size();
        for (int i = 0; i < size; i++) {
            Activity activity = mActivities.get(i);
            if (activity.getClass().getCanonicalName().equals(activityClass.getName())) {
                mActivities.remove(i);
                activity.finish();
                i--;
                size--;
            }
        }
    }

    /**
     * 关闭整个应用
     */
    public void exitApplication() {

    }

    /**
     * 拿取当前的activity（最前面）
     *
     * @return activity
     */
    public Activity currentActivity() {
        return mActivities.lastElement();
    }


}
