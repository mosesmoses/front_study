package com.moses.designpattern.observer;

/**
 * Created by Administrator on 2015/10/13.
 */
public class ConcreteSubject extends AbstractSubject {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
