package com.designpatterns.behavioral.observed;

public interface Subscribers {
	public void update();

	public void setChannel(Channel channel);
}
