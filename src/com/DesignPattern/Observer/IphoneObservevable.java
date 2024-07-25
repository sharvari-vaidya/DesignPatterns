package com.DesignPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservevable implements StockObservable {

	public List<NotificationAlertObserver> observerList = new ArrayList<>();
	public int stockCount = 0;
	private String modelName = "IPHONE 15";

	@Override
	public String getModelName() {
		return modelName;
	}

	@Override
	public void add(NotificationAlertObserver observer) {
		observerList.add(observer);
	}

	@Override
	public void remove(NotificationAlertObserver observer) {
		observerList.remove(observer);

	}

	@Override
	public void notifySubscriber() {
		for (NotificationAlertObserver na : observerList) {
			na.update();
		}

	}

	@Override
	public void setStockCount(int stockCount) {
		if (this.stockCount == 0) {
			this.stockCount = stockCount;
			notifySubscriber();
		}

	}

	@Override
	public int getStockCount() {
		return stockCount;
	}

}
