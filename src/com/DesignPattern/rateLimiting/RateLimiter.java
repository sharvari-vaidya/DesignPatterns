package com.DesignPattern.rateLimiting;

import java.util.HashMap;

public class RateLimiter {

	private int maxRequest;
	private long timeDifferenceInMilis;
	private HashMap<String, RequestInfo> map = new HashMap<String, RequestInfo>();

	public RateLimiter(int maxRequest, long timeDifferenceInMilis) {
		super();
		this.maxRequest = maxRequest;
		this.timeDifferenceInMilis = timeDifferenceInMilis;
	}

	public boolean allowRequests(String clientId) {
		long currentTime = System.currentTimeMillis();
		RequestInfo computeIfAbsent = map.computeIfAbsent(clientId, k -> new RequestInfo(maxRequest, currentTime));
		synchronized (computeIfAbsent) {

			if (currentTime - computeIfAbsent.getTimestamp() > timeDifferenceInMilis) {
				computeIfAbsent.setNumberOfRequests(0);
				computeIfAbsent.setTimestamp(currentTime);
			} 
			if (computeIfAbsent.getNumberOfRequests() < maxRequest) {
				computeIfAbsent.setNumberOfRequests(computeIfAbsent.getNumberOfRequests()+1);
				return true;
			} else {
				return false;
			}
		}
	}

}
