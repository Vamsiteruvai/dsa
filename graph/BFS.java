package com.graph;

import java.util.*;

class BFS {
	
	/**
	 * if in case the graph is disconnected 
	 * 
	 * --> use this kind of implementation in the main function
	 * 
	 * boolean[] visit=new boolean[size];   	
    	for(int i=0;i<size;i++) {
    		if(visit[i]==false) {
    			BFS(arr,size,visit, i);
    		}
    	}
	 * @param arr
	 * @param size
	 */
	private static void bfs(List<List<Integer>> arr,int size) {
		Queue<Integer> queue=new LinkedList<Integer>();
		
		boolean[] visit=new boolean[size];
		//boolean[] visit=new boolean[size];
		
		queue.add(0);
		
		while (!queue.isEmpty()) {
			int curr=queue.poll();
			if(visit[curr]==false) {
				System.out.print(curr+" ");
				visit[curr]=true;
				
				for(int i=0;i<arr.get(i).size();i++) {
					queue.addAll(arr.get(i));
				}
			}
			
		}
	}

	private static void addEdge(List<List<Integer>> arr, int i, int j) {
		arr.get(i).add(j);
		arr.get(j).add(i);
		
	}
	
    public static void main(String[] args) {
    	int size=7;
    	List<List<Integer>> arr=new ArrayList<List<Integer>>(size);
    	
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
    	
    	//System.out.println(arr);
//    	boolean[] visit=new boolean[size];
//    	
//    	for(int i=0;i<size;i++) {
//    		if(visit[i]==false) {
//    			bfs(arr,size,visit, i);
//    		}
//    	}
    	bfs(arr,size);
    }

	
	
	
}
