package chapter01;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String args[]) {
		double a=7800;
		double x=0.03062/12;

		double n=12;
		double M=0;
		double t=0;
		t=1+x;

		t=Math.pow(t, n);

		t=t-1;

		t=t/x;
	
		M=a*(1+x)*t;
		System.out.println("共计 "+M);
		System.out.println("利息收入"+(M-a*n));
		
		 double F=0;
		 double P=95460;
		 int n1=1;
		 double i=0.03062;
	     double t1=0;
	     t1=1+i;
	     t1=Math.pow(t1, n1);
	     F=P*t1;
	     System.out.println("复利收入"+F);
	     
	}

}
