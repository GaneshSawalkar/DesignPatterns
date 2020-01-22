package com.designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Articals implements Cloneable {

	private List<String> articallist;

	public Articals(List<String> list) {
		this.articallist = list;
	}

	public Articals() {
		super();
		articallist = new ArrayList<String>();
	}

	public List<String> getarticallist() {
		return articallist;
	}

	public void addlist(String newrticals) {
		articallist.add(newrticals);
	}

	public void removelist(String newrticals) {
		articallist.add(newrticals);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<String>();
		for (String s : this.getarticallist()) {
			temp.add(s);
		}
		return new Articals(temp);
	}
}
