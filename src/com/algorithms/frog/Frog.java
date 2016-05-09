package com.algorithms.frog;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Frog {
	private static Graph graph;
	private static int numberOfSteps = 0;
	private static int numberOfIterations = 0;
	private static Set<Vertex> vertexes = new HashSet<>();
	private static Set<Edge> edges = new HashSet<>();

	public static int[] letTheFrogJump(Vertex start, Vertex end, int numberOfTrees, List<Vertex> treesCoodrinates){
		if(start==null || end==null || treesCoodrinates==null){
			System.out.println("Incorrect input");
			return null;
		}
		return null;
	}

	public static void buildGraph(Vertex start, int numberOfTrees, Set<Vertex> treesCoord){
		Edge currentEdge = null;
		boolean isContinued = true;
		
		if(vertexes.isEmpty()){
			vertexes.add(start);
			System.out.println("The first vertex was created");
		}
		
		end:
//		for(Vertex e: currentVertexes){
		while(isContinued){
				Set<Vertex>currentVertexes = new HashSet<>();
			
				Vertex x1 = new Vertex(start.getPosX(), start.getPosY()+3);
				if(treesCoord.contains(x1)){
					System.out.println("The frog can't jump on this Vertex");
				}
				else{if(x1.getPosY()>10){
					System.out.println("Vertex leave the scope of the field (y>10)");
				}else if(x1.getPosX()>16){
					x1.setPosX(x1.getPosX()-16);
					System.out.println("Vertex starts new count on X axis (reached 16)");
					if(vertexes.contains(x1)) break end;
					currentEdge = new Edge(start, x1);
					edges.add(currentEdge);
					vertexes.add(x1);
					System.out.println("New edge was added");
					
					currentVertexes.add(x1);
					buildGraph(x1,numberOfTrees, treesCoord);
				}else{
					if(vertexes.contains(x1)) break end;
					currentEdge = new Edge(start, x1);
					edges.add(currentEdge);
					vertexes.add(x1);
					
					currentVertexes.add(x1);
					System.out.println("New edge was added");
					buildGraph(x1,numberOfTrees, treesCoord);
				}
				}
				Vertex x2 = new Vertex(start.getPosX()+1, start.getPosY()+2);
				if(treesCoord.contains(x2)){
					System.out.println("The frog can't jump on this Vertex");
				}
				else{if(x2.getPosY()>10){
					System.out.println("Vertex leave the scope of the field (y>10)");
				}else if(x2.getPosX()>16){
					x2.setPosX(x2.getPosX()-16);
					if(vertexes.contains(x2)) break end;
					System.out.println("Vertex starts new count on X axis (reached 16)");
					currentEdge = new Edge(start, x2);
					edges.add(currentEdge);
					vertexes.add(x2);
					
					currentVertexes.add(x2);
					System.out.println("New edge was added");
					buildGraph(x2,numberOfTrees, treesCoord);
				}else{
					if(vertexes.contains(x2)) break end;
					currentEdge = new Edge(start, x2);
					edges.add(currentEdge);
					vertexes.add(x2);
					
					currentVertexes.add(x2);
					System.out.println("New edge was added");
					buildGraph(x2,numberOfTrees, treesCoord);
				}
				}
				
				Vertex x3 = new Vertex(start.getPosX()-1, start.getPosY()+2);
				if(treesCoord.contains(x3)){
					System.out.println("The frog can't jump on this Vertex");
				}
				else{if(x3.getPosY()>10){
					System.out.println("Vertex leave the scope of the field (y>10)");
				}else if(x3.getPosX()>16){
					x3.setPosX(x3.getPosX()-16);
					if(vertexes.contains(x3)) break end;
					System.out.println("Vertex starts new count on X axis (reached 16)");
					currentEdge = new Edge(start, x3);
					edges.add(currentEdge);
					vertexes.add(x3);
					
					currentVertexes.add(x3);
					System.out.println("New edge was added");
					buildGraph(x3,numberOfTrees, treesCoord);
				}else{
					if(vertexes.contains(x3)) break end;
					currentEdge = new Edge(start, x3);
					edges.add(currentEdge);
					vertexes.add(x3);
					
					currentVertexes.add(x3);
					System.out.println("New edge was added");
					buildGraph(x3,numberOfTrees, treesCoord);
				}
				}

				Vertex x4 = new Vertex(start.getPosX()+2, start.getPosY()+1);
				if(treesCoord.contains(x4)){
					System.out.println("The frog can't jump on this Vertex");
				}
				else{if(x4.getPosY()>10){
					System.out.println("Vertex leave the scope of the field (y>10)");
				}else if(x4.getPosX()>16){
					x4.setPosX(x4.getPosX()-16);
					if(vertexes.contains(x4)) break end;
					System.out.println("Vertex starts new count on X axis (reached 16)");
					currentEdge = new Edge(start, x4);
					vertexes.add(x4);
					
					currentVertexes.add(x4);
					System.out.println("New edge was added");
					buildGraph(x4,numberOfTrees, treesCoord);
				}else{
					if(vertexes.contains(x4)) break end;
					currentEdge = new Edge(start, x4);
					vertexes.add(x4);
					
					currentVertexes.add(x4);
					System.out.println("New edge was added");
					buildGraph(x4,numberOfTrees, treesCoord);
				}
				}

				Vertex x5 = new Vertex(start.getPosX()-2, start.getPosY()+1);
				if(treesCoord.contains(x5)){
					System.out.println("The frog can't jump on this Vertex");
				}
				else{if(x5.getPosY()>10){
					System.out.println("Vertex leave the scope of the field (y>10)");
				}else if(x5.getPosX()>16){
					x5.setPosX(x5.getPosX()-16);
					if(vertexes.contains(x3)) break end;
					System.out.println("Vertex starts new count on X axis (reached 16)");
					currentEdge = new Edge(start, x5);
					edges.add(currentEdge);
					vertexes.add(x5);
					
					currentVertexes.add(x5);
					System.out.println("New edge was added");
					buildGraph(x5,numberOfTrees, treesCoord);
				}else{
					if(vertexes.contains(x3)) break end;
					currentEdge = new Edge(start, x5);
					edges.add(currentEdge);
					vertexes.add(x5);
					
					currentVertexes.add(x5);
					System.out.println("New edge was added");
					buildGraph(x5,numberOfTrees, treesCoord);
				}
				}
				
				if (currentVertexes.isEmpty()) isContinued=false;
			}
		
		graph = new Graph(vertexes, edges);
		System.out.println("The graph with " + vertexes.size() + " vertexes and " + edges.size() + " edges was created");
	}


	public static void main(String []args){
			Vertex tree1 = new Vertex(5,8);
			Vertex tree2 = new Vertex(14,9);
			Set<Vertex>trees = new HashSet<>();
			trees.add(tree2); trees.add(tree1);
			
			Vertex start = new Vertex(11,7);
			buildGraph(start, 2, trees);

	}


}
