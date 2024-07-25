package com.DesignPattern.Observer;

public class EmailAlert implements NotificationAlertObserver {

	private String emailId;
	private StockObservable observable;

	public EmailAlert(String emailId, StockObservable observable) {
		super();
		this.emailId = emailId;
		this.observable = observable;
	}

	@Override
	public void update() {
		sendEMail(emailId, " Product " + observable.getModelName() + " is in the stock");
	}

	public void sendEMail(String emailId, String msg) {
		System.out.println("Mail sent to email :: " + emailId + msg);
	}

}
