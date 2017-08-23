package com.learn.chapterOne;

public class Fibonacci {
	/*
	 * 1.1.19
	 */
	//原始方法
	public static long F(int N){
		if(N==0){
			return 0;
		}
		if(N==1){
			return 1;
		}
		return F(N-1)+F(N-2);
	}
	
	private static long[] list=new long[100];
	
	public static long F2(int N){
		//list=new int[N+1];
		if(N==0){
			list[0]=0;
			return list[0];
		}
		if(N==1){
			list[1]=1;
			return list[1];
		}
		list[N]=list[N-1]+list[N-2];
		return list[N];
	}
	
}
