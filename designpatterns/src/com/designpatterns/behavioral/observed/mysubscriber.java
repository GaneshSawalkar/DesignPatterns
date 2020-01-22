package com.designpatterns.behavioral.observed;

public class mysubscriber implements subscribers {
	private String name;
	private Channel channel;

	public mysubscriber(String nm) {
		this.name = nm;
	}

	@Override
	public void update() {
		String msg = (String) channel.getChannelupdate(this);
		if (msg == null) {
			System.out.println(name + ":: No new message");
		} else
			System.out.println(name + ":: Consuming message::" + msg);
	}

	@Override
	public void setChannel(Channel sub) {
		this.channel = sub;
	}

}
