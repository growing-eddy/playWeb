package com.eddy.play;

import com.google.common.eventbus.Subscribe;
import junit.framework.Test;

/**
 * Created by Administrator on 2016/4/9.
 */
public class TestEventListener {

    public int lastMessageCount;

    @Subscribe
    public void listenMesg(TestEvent testEvent){
        System.out.println("执行监听逻辑！"+"msg="+testEvent.getMesg());
    }

    public int getCount(){
        return this.lastMessageCount;
    }
}
