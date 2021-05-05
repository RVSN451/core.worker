package com.kostakov.core.worker;

@FunctionalInterface
public interface OnTaskErrorListener {
    void offDone(String result);
}
