package com.moses.designpattern.observer;

/**
 * Created by Administrator on 2015/10/13.
 */
public class ConcreteObserver extends AbstractObserver{

    public ConcreteObserver(AbstractSubject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {

    }
}
