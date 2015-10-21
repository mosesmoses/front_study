package com.moses.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/10/13.
 */
public class AbstractSubject {
    private List<AbstractObserver> observers = new ArrayList<AbstractObserver>();
    public void attach(AbstractObserver observer){
        observers.add(observer);
    }

    public void detach(AbstractObserver observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        for(AbstractObserver observer : observers){
            observer.update();
        }
    }
}
