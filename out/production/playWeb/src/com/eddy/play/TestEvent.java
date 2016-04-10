package com.eddy.play;

/**
 * Created by Administrator on 2016/4/9.
 */
public class TestEvent {

    String mesg;


    public TestEvent(String mesg) {
        this.mesg = mesg;
        System.out.println("有一个事件，param="+mesg);
    }

    public String getMesg() {
        return mesg;
    }

    public void setMesg(String mesg) {
        this.mesg = mesg;
    }
}
