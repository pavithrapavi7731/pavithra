package org.greens;

public class PolyP extends PolySub {
	private void method1() {
		System.out.println("pavithra");

	}
	
	public static void main(String[] args) {
		PolyP n=new PolyP();
		n.method1();
		
		n.method2(1234,4567);
		n.method3('y','z');
		n.method4("pavithra","mani");
		
	}

}
