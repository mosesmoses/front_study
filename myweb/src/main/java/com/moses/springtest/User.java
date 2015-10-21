package com.moses.springtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2015/10/15.
 */
@Component
public class User {

    @Autowired()
//    @Qualifier("loader1")
    @Qualifier("loaderImpl2")
    private Loader loader;

    public Loader getLoader() {
        return loader;
    }

    public void setLoader(Loader loader) {
        this.loader = loader;
    }

    public void view() {
        loader.foo();
    }
}
