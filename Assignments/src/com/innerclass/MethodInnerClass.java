package com.innerclass;

public class MethodInnerClass {
	public String hobby="sleeping";
	public void method() {
		 class MethodLocalInner {
	void interest() {
			   System.out.println(hobby);
		   }
		}
		 MethodLocalInner obj=new MethodLocalInner();
		   obj.interest();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodInnerClass obj1=new MethodInnerClass();
		obj1.method();

	}

}
