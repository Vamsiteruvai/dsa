package com.graph;

public class AdjacancyMatrics {
	public static void addEdge(int[][] arr,int i, int j) {
		arr[i][j]=1;
		//arr[j][i]=1;
	}
	
	public static void display(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] arr=new int[3][3];
		
		addEdge(arr,1,2);
		addEdge(arr,1,0);
		addEdge(arr,2,0);
		
		display(arr);
	}

}
