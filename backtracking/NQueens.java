package com.backtracking;

import java.util.Arrays;
import java.util.Scanner;

public class NQueens {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter size of the array");
		int size=scanner.nextInt();
		char[][] board=new char[size][size];
		
		for(int i=0;i<board.length;i++) {
			Arrays.fill(board[i], '.');
		}
		
		nqueens(board, 0);
		scanner.close();
	}

	private static boolean nqueens(char[][] board, int row) {
		
		//base case
		if(row==board.length) {
			printBoard(board);
		}
		else{
			for(int col=0;col<board.length;col++) {
				if(isSafe(board,row,col)) {
					board[row][col]='Q';
					if(nqueens(board,row+1)) {
						return true;
					}
					board[row][col]='.';
				}
			}			
		}
		return false;
	}

	private static boolean isSafe(char[][] board, int row, int col) {
		//rows and columns
		for(int i=0;i<board.length;i++) {
			if(board[i][col]=='Q' || board[row][i]=='Q') {
				return false;
			}
		}
		
		//upper left - diagonal
		for(int i=1,j=1;row-i>=0 && col-j>=0;i++,j++) {
			if(board[row-i][col-j]=='Q') {
				return false;
			}
		}
		
		//upper right-diagonal
		for(int i=1,j=1;row-i>=0 && col+j<board.length;i++,j++) {
			if(board[row-i][col+j]=='Q') {
				return false;
			}
		}
		return true;
	}
	
	public static void printBoard(char[][] board) {
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board.length;j++) {
				System.out.print(board[i][j]+" ");
			}System.out.println();
		}System.out.println();
	}
}
