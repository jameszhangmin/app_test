package com.airwalker.javacore.thread.MultiThreadCompetition;

import java.util.concurrent.BlockingQueue;

/**
 * @author: Zhang.Min
 * @since: 2015/11/30
 * @version: 1.7
 */
public class ProducerThread implements Runnable {
    private BlockingQueue<String> blockingQueue = null;
    private String threadName;

    public ProducerThread(String threadName, BlockingQueue<String> blockingQueue) {
        this.threadName = threadName;
        this.blockingQueue = blockingQueue;
    }


    @Override
    public void run() {
        Thread.currentThread().setName(threadName);
        int c = 0;
        while (true){
            try {
                blockingQueue.put(String.valueOf(c));
                System.out.println("[" + Thread.currentThread().getName() + "] : \tdata:" + String.valueOf(c) + "\tcapacity:" + blockingQueue.size());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            c ++;
        }

    }
}
