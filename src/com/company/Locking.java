package com.company;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static com.company.Locker.runLocked;

/**
 * @author Jaedoo Lee
 */
public class Locking {
    Lock lock = new ReentrantLock();

    public void setLock(final Lock mock) {
        this.lock = mock;
    }

    public void doOp1() {
        lock.lock();
        try {
            /* ...critical code ...*/
        } finally {
            lock.unlock();
        }
    }

    public void doOp2() {
        runLocked(lock, () -> {/*..critical code ...*/});
    }

    public void doOp3() {
        runLocked(lock, () -> {/*..critical code ...*/});
    }

    public void doOp4() {
        runLocked(lock, () -> {/*..critical code ...*/});
    }
}
