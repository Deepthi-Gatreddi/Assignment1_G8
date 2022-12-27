package com.assignment2;

public abstract class Phone {
	public abstract void call(String name);
	public abstract void msg(String name);
	public void ram() {
		System.out.println("6 GB");
	}
	public void rom() {
		System.out.println("64 GB");
	}
}
