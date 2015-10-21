package com.moses.springtest;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2015/10/15.
 */
@Component("loader1")
public class LoaderImpl implements Loader {
    @Override
    public void foo() {
        System.out.println(getClass().getName());
    }
}
