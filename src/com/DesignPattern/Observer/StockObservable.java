package com.DesignPattern.Observer;

public interface StockObservable {

	public void add(NotificationAlertObserver observer);

	public void remove(NotificationAlertObserver observer);

	public void notifySubscriber();

	public void setStockCount(int stockCount);

	public int getStockCount();

	public String getModelName();

}
