package com.eddy.play.test;

import com.eddy.play.TestEvent;
import com.eddy.play.TestEventListener;
import com.google.common.eventbus.EventBus;
import org.junit.Test;

/**
 * 测试 eventBus
 * Created by Administrator on 2016/4/9.
 */
public class eventBusTest {

    @Test
    public void testBus(){
        EventBus evenBus = new EventBus("test");
        TestEventListener testEventListener = new TestEventListener();
        evenBus.register(testEventListener );

        //推送消息
        TestEvent testEvent = new TestEvent("test");
        evenBus.post(testEvent);

    }
}
