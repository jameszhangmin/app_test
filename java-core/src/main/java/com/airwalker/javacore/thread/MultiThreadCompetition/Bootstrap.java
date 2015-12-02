package com.airwalker.javacore.thread.MultiThreadCompetition;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author: Zhang.Min
 * @since: 2015/11/30
 * @version: 1.7
 */
public class Bootstrap {
    public static void main(String[] args) {
        BlockingQueue<String> blockingQueue = new ArrayBlockingQueue<String>(100);
        ProducerThread producerThread = new ProducerThread("producer",blockingQueue);
        ConsumerThread consumerThread = new ConsumerThread("consumer", blockingQueue);
        new Thread(producerThread).start();
        new Thread(consumerThread).start();

    }
}
