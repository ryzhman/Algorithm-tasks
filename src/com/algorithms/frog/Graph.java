package com.algorithms.frog;

import java.util.Set;

public class Graph {
  private final Set<Vertex> vertexes;
  private final Set<Edge> edges;

  public Graph(Set<Vertex> vertexes, Set<Edge> edges) {
    this.vertexes = vertexes;
    this.edges = edges;
  }

  public Set<Vertex> getVertexes() {
    return vertexes;
  }

  public Set<Edge> getEdges() {
    return edges;
  }
  
  
  
} 

