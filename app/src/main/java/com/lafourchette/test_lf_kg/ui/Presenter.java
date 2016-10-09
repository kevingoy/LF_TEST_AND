package com.lafourchette.test_lf_kg.ui;

public interface Presenter<V> {

    void attachView(V view);
    void detachView();
}