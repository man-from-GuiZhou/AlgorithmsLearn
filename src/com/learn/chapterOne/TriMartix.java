package com.learn.chapterOne;
/*
 * 1.1.13ת�þ���
 * 
 */
public class TriMartix {
	int[][] martix = {
			{1,2,3},
			{4,5,6},
			{7,8,9},
			{11,12,13}
			};
/*
* һ���򵥵�˼·����ά����ÿһ�ж���һά���飬��ô
* ÿ�δ�ӡÿһ������ĵ�iλ
* ����ӡ����ǣ�ת�������
*/
	public void triMartix(){
		for(int i=0;i<martix[0].length;i++){
			for(int[] tempList:martix){
				System.out.print(tempList[i]+" ");
			}
			System.out.println();
		}
	}
}

