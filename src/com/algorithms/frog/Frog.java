package com.algorithms.frog;

import java.util.List;

public class Frog {
	
	public static int[] letTheFrogJump(Vertex start, Vertex end, int numberOfTrees, List<Vertex> treesCoodrinates){
		if(start==null || end==null || treesCoodrinates==null){
			System.out.println("Incorrect input");
			return null;
		}
			
		int numberOfSteps = 0;
		
		
		
		
		
		
		int[][] field = new int[16][10];

		for(int i=0; i<field.length; i++){
			for(int j=0; j<10; j++){
				field[i][j]=j;
			}
		}
		
		
		return null;
	}
	
	
	
	
	public static void main(String []args){
		
		final int[] tree2 = {5,8};
		final int[] tree1 = {14,9};

		final int[] aimX={9,10};

	}
	
	

}
