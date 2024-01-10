package demo;

import java.util.Scanner;

public class Demo1 {
	public static void meth2(int x) {
		System.out.println(x==10);
	}
	public static void main(String[] args) {
		Scanner av=new Scanner(System.in);
		int num=av.nextInt();
		Demo2 d1=new Demo2();
		System.out.println(d1.meth1(num));
		d1.meth2(num);
		meth2(num);
		
	}
}
class Demo2{
	public int meth1(int a) {
		return a+=25;
	}
	public void meth2(int x) {
		System.out.println("Habibi"+(x^=5));
	}
}
