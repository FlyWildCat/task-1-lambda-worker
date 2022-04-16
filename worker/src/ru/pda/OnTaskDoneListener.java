package ru.pda;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
