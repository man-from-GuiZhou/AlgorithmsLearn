package com.learn.main;

import com.learn.chapterOne.BooleanList;
import com.learn.chapterOne.LgN;
import com.learn.chapterOne.TriMartix;
/*
 * �㷨1.1.15 
 * ��Ŀʵ��Ҫ����Ҫ��һ���������������ڳ�Ա���ֳ��ִ����ļ�ʱ��
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
	 * ���з��������������������
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
	 * ����������
	 */
	public static int[] numCount(int[] a,int M){
		int[] mList=new int[M];
		//����ֵ��ʼ��
		for(int i=0;i<M;i++){
			mList[i]=0;
		}
		for(int temp:a){
			//������ֵ�ֵ������Ŀ������������������ôӦ��Խ��
			if(temp>=M){
				continue;
			}
			mList[temp]++;
		}
		System.out.println();
		return mList;
	}

}
