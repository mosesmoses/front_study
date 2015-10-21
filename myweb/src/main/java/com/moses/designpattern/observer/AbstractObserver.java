package com.moses.designpattern.observer;

/**
 * Created by Administrator on 2015/10/13.
 */
public abstract class AbstractObserver {
    protected AbstractSubject subject;
    public abstract void update();
}
