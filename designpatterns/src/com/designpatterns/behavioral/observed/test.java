package com.designpatterns.behavioral.observed;

public class test {
	public static void main(String[] args) {

		YoutubeChannel channel = new YoutubeChannel();

		subscribers ganesh = new mysubscriber("ganesh");
		subscribers sahil = new mysubscriber("sahil");
		subscribers amit = new mysubscriber("amit");
		subscribers s1 = new mysubscriber("s1");
		subscribers s2 = new mysubscriber("s2");

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
