/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author kkddu
 */
public class Vertex {

    private final String NAME;
    private final HashMap<Vertex, Edge> ADJACENT_EDGES_MAP = new HashMap();

    public Vertex(String name) {
        this.NAME = name;
    }

    protected int getDegree() {
        return ADJACENT_EDGES_MAP.size();
    }

    protected ArrayList<Edge> getEdges() {
        ArrayList<Edge> list = new ArrayList<>();
        for (Map.Entry<Vertex, Edge> entrySet : ADJACENT_EDGES_MAP.entrySet()) {
            list.add(entrySet.getValue());
        }
        return list;
    }

    protected ArrayList<Vertex> getAdjacentVertexs() {
        ArrayList<Vertex> list = new ArrayList<>();
        for (Map.Entry<Vertex, Edge> entrySet : ADJACENT_EDGES_MAP.entrySet()) {
            list.add(entrySet.getKey());
        }
        return list;
    }

    public void addAdjacentEdge(Vertex vertex, Edge edge) {
        ADJACENT_EDGES_MAP.put(vertex, edge);
    }

    protected Edge getEdge(Vertex vertex) {
        return ADJACENT_EDGES_MAP.get(vertex);
    }

    protected void removeEdge(Edge edge) {
        for (Map.Entry<Vertex, Edge> entrySet : ADJACENT_EDGES_MAP.entrySet()) {
            if (entrySet.getValue() == edge) {
                ADJACENT_EDGES_MAP.remove(entrySet.getKey());
            }

        }
    }

//    protected void removeVertex(Vertex vertex) {
//        ADJACENT_EDGES_MAP.remove(vertex);
//    }
    @Override
    public String toString() {
        return  NAME;
    }
}

