package ru.pda;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}
