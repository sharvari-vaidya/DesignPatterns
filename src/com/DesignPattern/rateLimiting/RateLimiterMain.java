package com.DesignPattern.rateLimiting;

import java.util.concurrent.TimeUnit;

public class RateLimiterMain {

	public static void main(String[] args) {

		RateLimiter rl = new RateLimiter(5, TimeUnit.MINUTES.toMillis(1));
		for (int i = 0; i < 10; i++) {
			if (rl.allowRequests("SHAR")) {
				System.out.println("Granted for " + i);
			} else {
				System.out.println("Not Granted for " + i);
			}
		}

	}

}
