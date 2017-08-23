package com.learn.chapterOne;

public class LastOne {
	public static int gcd (int p,int q){
		if(q==0){
			return p;
		}
		int r=p%q;
		return gcd(q,r);
	}
	
	public static int Euclid(int p,int q){
		System.out.print(p+" "+q);
		System.out.println();
		if(q==0){
			return p;
		}
		int r=p%q;
		return Euclid(q,r);
	}
	
}
