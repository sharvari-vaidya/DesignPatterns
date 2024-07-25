package com.DesignPattern.Observer;

public class Main2 {

	public static void main(String[] args) {
		StockObservable s = new IphoneObservevable();

		NotificationAlertObserver n1 = new EmailAlert("a", s);
		NotificationAlertObserver n2 = new EmailAlert("b", s);
		NotificationAlertObserver n3 = new PhoneAlert("555", s);

		s.add(n1);
		s.add(n2);
		s.add(n3);
		s.setStockCount(10);

		StockObservable redmi = new RedmiObservable();

		NotificationAlertObserver nn = new PhoneAlert("1111", redmi);
		NotificationAlertObserver vv = new PhoneAlert("2222", redmi);
		redmi.add(nn);
		redmi.add(vv);
		redmi.setStockCount(10);

	}

}
