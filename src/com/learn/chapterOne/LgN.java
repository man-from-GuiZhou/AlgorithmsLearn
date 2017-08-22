package com.learn.chapterOne;
/*
 * 错误的二分写法导致计算结果绵长
 */
public class LgN {
	public void reNumber(int n){
		int left=0;
		int mid=n/2;
		int right=n;
		while(left<right){
			int num=this.pointNum(2, mid);
			if(left==right){
				System.out.println(left);
				break;
			}
			else{
				if(num>n){
					right=mid;
					mid=right/2+1;
				}
				else {
					if(num==n){
						System.out.println(mid);
						break;
					}
					left=mid;
					mid=mid+(right-mid)/2;
				}
			}
		}
	}
	
	private int pointNum(int m,int n){
		int end=1;
		if(n==0){
			return 1;
		}
		if(n==1){
			return m;
		}
		for(int i=2;i<=n;i++){
			end*=m;
		}
		return end;
	}
}
