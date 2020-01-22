package com.designpatterns.behavioral.observed;

public interface Channel {
	public void subscribe(subscribers obj);

	public void unsubscribe(subscribers obj);

	public void notifie();

	public Object getChannelupdate(subscribers obj);

}
