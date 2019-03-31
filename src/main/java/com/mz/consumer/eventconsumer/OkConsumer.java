package com.mz.consumer.eventconsumer;

import com.mz.executor.consumer.Event;
import com.mz.executor.consumer.BaseConsumer;
import org.springframework.stereotype.Component;

@Component
public class OkConsumer extends BaseConsumer{

    @Override
    protected void consume(Event event) {
        System.out.println(event);
    }
}
