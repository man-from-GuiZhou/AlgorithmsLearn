package com.learn.chapterOne;

/*
p34 1.1.11题 原题内容是打印二维布尔数组，*表示真，空格表示假
*/

public class BooleanList {
	boolean[][] bList=new boolean[5][5];
	int randomNum=0;
	
	public BooleanList(){
		this.initList();
	}
	
	private void initList(){
	for(int i=0;i<bList.length;i++){
		for(int j=0;j<bList[0].length;j++){
				randomNum=(int)(Math.random()*10);
				//System.out.print(randomNum);
				if(randomNum>=5){
					bList[i][j]=true;
				}
			}
		}
	//return bList;
	}
	
	public void printList(){
		int row=0;
		for(boolean[] tempL:bList){
			if(row==0){
				for(int i=0;i<tempL.length+1;i++){
					if(i!=0){
						System.out.print(i+" ");
					}
					else{
						System.out.print("  ");
					}
				}
			}
			System.out.println();
			row++;
			System.out.print(row+" ");
			for(boolean tempE:tempL){
					//randomNum=(int)(Math.random()*10);
					if(tempE==true){
						System.out.print("* ");
					}
					else{
						System.out.print("  ");
					}
				}
			}
		}
}
