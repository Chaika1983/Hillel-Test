package thirdTask;

import java.util.concurrent.locks.Lock;

public class IncrementSynchronize {
	private int value = 0;
	private Lock lock;

	public synchronized int getNextValue() {
		value++;
		return value;

	}

	public int getNextValue1() {
		synchronized (this) {
			value++;
		}
		return value;
	}

	public int getNextValue2() {
		lock.lock();
		try {
			value++;
		} finally {
			lock.unlock();
		}

		return value;
	}

}
