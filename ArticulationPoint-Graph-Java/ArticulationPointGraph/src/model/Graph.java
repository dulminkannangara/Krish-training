/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author kkddu
 */
public class Graph {

    private ArrayList<Vertex> vertex_list = new ArrayList<>();
    private ArrayList<Edge> edge_list = new ArrayList<>();

    public void addVertex(Vertex vertex) {
        vertex_list.add(vertex);
    }

    public void addEdge(Vertex u, Vertex v) {
        if (getEdge(u, v) == null) {

            Edge edge = new Edge(u, v);
            edge_list.add(edge);

            u.addAdjacentEdge(v, edge);
            v.addAdjacentEdge(u, edge);

        } else {
            throw new IllegalArgumentException("This edge is already added!");
        }
    }

    public ArrayList<Vertex> getVertex_list() {
        return vertex_list;
    }

    public void removeEdge(Edge edge) {
        if (edge_list.contains(edge)) {
            for (Vertex vertex : edge.getVertexs()) {
                vertex.removeEdge(edge);
            }
            edge_list.remove(edge);
        } else {
            throw new IllegalArgumentException("Could not find this Edge!");
        }
    }

    public void removeVertex(Vertex vertex) {
        if (vertex_list.contains(vertex)) {

            for (Edge edge : vertex.getEdges()) {
                removeEdge(edge);
            }
//            for (Vertex v : vertex.getAdjacentVertexs()) {
//                v.removeVertex(vertex);
//            }
            vertex_list.remove(vertex);
        } else {
            throw new IllegalArgumentException("Could not find this Edge!");
        }

    }

//     Returns the number of vertices of the graph 
    public int numVertex() {
        return vertex_list.size();
    }

//    Returns the number of edges of the graph
    public int numEdges() {
        return edge_list.size();
    }

//     Returns the number of edges for which vertex v is the origin.
    public int getDegree(Vertex vertex) {
        return vertex.getDegree();
    }

    public ArrayList<Edge> getEdges(Vertex vertex) {
        return vertex.getEdges();
    }

    public Edge getEdge(Vertex u, Vertex v) {
        return u.getEdge(v);
    }

    public ArrayList<Vertex> getAdjacentVertexs(Vertex vertex) {
        return vertex.getAdjacentVertexs();
    }

    // This will returns endpots of the edge as an array.
    public Vertex[] getVertices(Edge edge) {
        return edge.getVertexs();
    }

    // This will return the other vertex in the edge.
    public Vertex getoppositeVertice(Vertex vertex, Edge edge) {
        return edge.getOppositeVertex(vertex);
    }

    public void printGraph() {
        for (Vertex vertex : vertex_list) {
            for (Edge edge : vertex.getEdges()) {
                System.out.println("Vertex : " + vertex + " --------- " + getoppositeVertice(vertex, edge));
            }
            System.out.println("\n");
        }
    }

}
