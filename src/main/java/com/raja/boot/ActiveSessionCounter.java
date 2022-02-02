package com.raja.boot;

import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class ActiveSessionCounter implements HttpSessionListener {

	private final AtomicInteger counter = new AtomicInteger();

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		counter.incrementAndGet();
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		counter.decrementAndGet();
	}

	/**
	 * @return the counter
	 */
	public AtomicInteger getCounter() {
		return counter;
	}

}
