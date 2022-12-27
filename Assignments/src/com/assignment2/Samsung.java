package com.assignment2;

public class Samsung extends Phone{
	@Override
	public void call(String name) {
		// TODO Auto-generated method stub
		System.out.println("calling to "+name);
		
	}

	@Override
	public void msg(String name) {
		// TODO Auto-generated method stub
		System.out.println("message is succesfully sent to "+name);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samsung user1=new Samsung();
		user1.call("deepthi");
		user1.msg("deepthi");
		user1.ram();
		user1.rom();
	}


}
