package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Set;
import model.ArticulationPoint;
import model.Graph;
import model.Vertex;

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
        Vertex h = new Vertex("H");
        Vertex i = new Vertex("I");
        
        graph.addVertex(a);
        graph.addVertex(b);
        graph.addVertex(c);
        graph.addVertex(d);
        graph.addVertex(e);
        graph.addVertex(f);
        graph.addVertex(g);
        graph.addVertex(h);
        graph.addVertex(i);
        
        graph.addEdge(a, d);
        graph.addEdge(d, c);
        graph.addEdge(c, e);
        graph.addEdge(e, f);
        graph.addEdge(f, g);
        graph.addEdge(g, h);
        graph.addEdge(h, i);
        graph.addEdge(i, g);//...........
        graph.addEdge(f, c);//...........
        graph.addEdge(c, b);
        graph.addEdge(b, a); //..........
        
        graph.printGraph();
        
        ArticulationPoint ap = new ArticulationPoint();
        Set<Vertex> aPoints = ap.findarticulationPoints(graph);
        System.out.print("Articulation Points : ");
        aPoints.forEach(point -> System.out.print(point+", "));
        System.out.println("\n\n");
        
    }
    
    
}
