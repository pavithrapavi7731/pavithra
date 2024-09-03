package org.greens;

public class SubParent extends ParentC {
	public void method4() {
		System.out.println("empApp");
	}
	public static void main(String[] args) {
		SubParent n=new SubParent();
		n.method1();
		n.method2();
		n.method3();
		n.method4();
		
	}	

}
