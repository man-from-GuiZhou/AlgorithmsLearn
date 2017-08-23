package com.learn.main;

import com.learn.chapterOne.BooleanList;
import com.learn.chapterOne.LgN;
import com.learn.chapterOne.TriMartix;
/*
 * 算法1.1.15 
 * 题目实际要求是要做一个计算整数数组内成员数字出现次数的计时器
 */
public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new BooleanList().printList();
		//new TriMartix().triMartix();
		//new LgN().reNumber(33);
		for(int temp:numCount(fillList(9),3)){
			System.out.print(temp+" ");
		} 
	}
	/*
	 * 下列方法是用来填充整形数组
	 */
	public static int[] fillList(int n){
		int[] list= new int[n];
		for(int i=0;i<n;i++){
			list[i]=(int)(Math.random()*10);
			System.out.print(list[i]+" ");
		}
		return list;
	}
	
	/*
	 * 计数器方法
	 */
	public static int[] numCount(int[] a,int M){
		int[] mList=new int[M];
		//数组值初始化
		for(int i=0;i<M;i++){
			mList[i]=0;
		}
		for(int temp:a){
			//如果出现的值超过了目标数组的最大容量，那么应该越过
			if(temp>=M){
				continue;
			}
			mList[temp]++;
		}
		System.out.println();
		return mList;
	}

}
