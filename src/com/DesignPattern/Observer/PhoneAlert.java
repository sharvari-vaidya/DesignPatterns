package com.DesignPattern.Observer;

public class PhoneAlert implements NotificationAlertObserver {

	private String phoneNo;
	StockObservable observable;

	public PhoneAlert(String phoneNo, StockObservable observable) {
		super();
		this.phoneNo = phoneNo;
		this.observable = observable;
	}

	@Override
	public void update() {
		sendSms(phoneNo, "Product " + observable.getModelName() + " is back in the stock");
	}

	private void sendSms(String phoneNo2, String string) {
		System.out.println("SMS sent to phone no :: " + phoneNo2 + " " + string);

	}

}
