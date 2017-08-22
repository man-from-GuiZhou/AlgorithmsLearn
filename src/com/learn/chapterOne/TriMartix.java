package com.learn.chapterOne;
/*
 * 1.1.13转置矩阵
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
* 一个简单的思路，二维数组每一行都是一维数组，那么
* 每次打印每一个数组的第i位
* 当打印完成是，转置则完成
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

