/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author kkddu
 */
public class Edge {

    private final Vertex[] ENDPOINTS;

    protected Edge(Vertex u, Vertex v) {
        this.ENDPOINTS = new Vertex[]{u, v};
    }

    protected Vertex[] getVertexs() {
        return ENDPOINTS;
    }

    protected Vertex getOppositeVertex(Vertex vertex) {
        for (Vertex v : ENDPOINTS) {
            if (v != vertex) {
                return v;
            }
        }
        return null;
    }

}