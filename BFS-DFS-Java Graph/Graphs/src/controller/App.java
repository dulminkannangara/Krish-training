/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Edge;
import model.Graph;
import model.Vertex;
import support.BFS;
import support.DFS;

/**
 *
 * @author kkddu
 */
public class App {
    public static void main(String[] args) {
        
        Graph graph = new Graph();
        
        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");
        Vertex e = new Vertex("E");
        Vertex f = new Vertex("F");
        Vertex g = new Vertex("G");
        
        graph.addVertex(a);
        graph.addVertex(b);
        graph.addVertex(c);
        graph.addVertex(d);
        graph.addVertex(e);
        graph.addVertex(f);
        graph.addVertex(g);
        
        graph.addEdge(a, c);
        graph.addEdge(a, b);
        graph.addEdge(b, d);
        graph.addEdge(c, e);
        graph.addEdge(e, f);
        graph.addEdge(f, g);
        graph.addEdge(c, g);
        
        
        graph.printGraph();
        System.out.println("BFS : "+BFS.breadthFirstSearch(graph, a));
        System.out.println("DFS : "+DFS.depthFirstSearch(graph, a));
        
        
    }
}
