package com.eddy.play.test;

import com.eddy.play.TestEvent;
import com.eddy.play.TestEventListener;
import com.google.common.eventbus.EventBus;
import org.junit.Test;

/**
 * Created by Administrator on 2016/4/9.
 */
public class eventBusTest {

    @Test
    public void testBus(){
        System.out.print("hello");
        EventBus evenBus = new EventBus("test");
        TestEventListener testEventListener = new TestEventListener();
        evenBus.register(testEventListener );
        TestEvent testEvent = new TestEvent("test");

        evenBus.post(testEvent);

    }
}
