package com.airwalker.javacore.thread.MultiThreadCompetition;

import java.util.concurrent.BlockingQueue;

/**
 * @author: Zhang.Min
 * @since: 2015/12/1
 * @version: 1.7
 */
public class ConsumerThread implements Runnable {
    private BlockingQueue<String> blockingQueue = null;
    private String threadName;

    public ConsumerThread(String threadName, BlockingQueue<String> blockingQueue) {
        this.threadName = threadName;
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        Thread.currentThread().setName(threadName);
        synchronized (blockingQueue){
            while (true) {
                if (!blockingQueue.isEmpty()) {
                    try {
                        String data = blockingQueue.take();
                        System.out.println("[" + Thread.currentThread().getName() + "] : \tdata:" + data + "\tcapacity:" + blockingQueue.size());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }
}
