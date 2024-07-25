package com.DesignPattern.rateLimiting;

public class RequestInfo {
	private long numberOfRequests;
	private long timestamp;

	public long getNumberOfRequests() {
		return numberOfRequests;
	}

	public void setNumberOfRequests(long numberOfRequests) {
		this.numberOfRequests = numberOfRequests;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "RequestInfo [numberOfRequests=" + numberOfRequests + ", timestamp=" + timestamp + "]";
	}

	public RequestInfo(long numberOfRequests, long timestamp) {
		super();
		this.numberOfRequests = numberOfRequests;
		this.timestamp = timestamp;
	}
	
}
