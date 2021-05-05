package com.kostakov.core.worker;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
