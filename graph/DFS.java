package com.graph;

import java.util.ArrayList;
import java.util.List;

public class DFS {
	
	private static void addEdge(List<List<Integer>> arr, int i, int j) {
		arr.get(i).add(j);
		arr.get(j).add(i);
		
	}
	
	private static void dfs(List<List<Integer>> arr, int curr, boolean[] visit) {
		
		System.out.print(curr+" ");
		visit[curr]=true;
		for (int b : arr.get(curr)) {
			if(!visit[b]) {
				dfs(arr, b, visit);
			}
		}
		
	}

	public static void main(String[] args) {
		int size=7;
		List<List<Integer>> arr=new ArrayList<List<Integer>>();
		for(int i=0;i<size;i++) {
			arr.add(new ArrayList<Integer>());
		}
		
		addEdge(arr,0,1);
    	addEdge(arr,0,2);
    	addEdge(arr,1,3);
    	addEdge(arr,1,0);
    	addEdge(arr,2,4);
    	addEdge(arr,2,0);
    	addEdge(arr,3,1);
    	addEdge(arr,3,4);
    	addEdge(arr,3,5);
    	addEdge(arr,4,2);
    	addEdge(arr,4,3);
    	addEdge(arr,4,5);
    	addEdge(arr,5,3);
    	addEdge(arr,5,4);
    	addEdge(arr,5,6);
    	addEdge(arr,6,5);
    	
    	boolean[] visit=new boolean[size];
    	for(int i=0;i<7;i++) {
    		if(visit[i]==false) {
    			dfs(arr, i, visit);
    		}
    	}
    	//dfs(arr,0,visit);
	}

	

}
