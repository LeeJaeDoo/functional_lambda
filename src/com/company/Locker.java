package com.company;

import java.util.concurrent.locks.Lock;

/**
 * @author Jaedoo Lee
 */
public class Locker {

    public static void runLocked(Lock lock, Runnable block) {
        lock.lock();

        try {
            block.run();
        } finally {
            lock.unlock();
        }
    }
}

