package com.designpatterns.behavioral.observed;

public class Test {
	public static void main(String[] args) {

		Youtubechannel channel = new Youtubechannel();

		Subscribers ganesh = new Mysubscriber("ganesh");
		Subscribers sahil = new Mysubscriber("sahil");
		Subscribers amit = new Mysubscriber("amit");
		Subscribers s1 = new Mysubscriber("s1");
		Subscribers s2 = new Mysubscriber("s2");

		channel.subscribe(ganesh);
		channel.subscribe(sahil);
		channel.subscribe(amit);
		channel.subscribe(s1);
		channel.subscribe(s2);

		ganesh.setChannel(channel);
		sahil.setChannel(channel);
		amit.setChannel(channel);
		s1.setChannel(channel);
		s2.setChannel(channel);
		ganesh.update();
		channel.unsubscribe(s1);
		channel.postmsg("hi");
	}
}
