package com.designpatterns.behavioral.observed;

public interface Channel {
	public void subscribe(Subscribers obj);

	public void unsubscribe(Subscribers obj);

	public void notifie();

	public Object getChannelupdate(Subscribers obj);

}
