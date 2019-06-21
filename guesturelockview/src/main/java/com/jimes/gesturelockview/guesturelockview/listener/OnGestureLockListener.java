package com.jimes.gesturelockview.guesturelockview.listener;

/**
 * @ClassName: OnGestureLockListener
 * @Description: 手势解锁监听器
 * @Author: Jimes
 * @Date: 2019/6/21
 */

public interface OnGestureLockListener {

    /**
     * 监听视图解锁开始（手指按下）
     */
    void onStarted();

    /**
     * 图案解锁内容改变
     *
     * @param progress 解锁进度（数字字符串）
     */
    void onProgress(String progress);

    /**
     * 图案解锁完成
     *
     * @param result 解锁结果（数字字符串）
     */
    void onComplete(String result);
}
