/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package support;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import model.Graph;
import model.Vertex;

/**
 *
 * @author kkddu
 */
//Watch https://www.youtube.com/watch?v=aMCI4AqVUug
public class BFS {

    public static LinkedHashSet breadthFirstSearch(Graph graph, Vertex start_vertex) {

        Queue<Vertex> vertexsQueue = new LinkedList<>();
        LinkedHashSet<Vertex> visited = new LinkedHashSet<>();

        vertexsQueue.add(start_vertex);
        Vertex vertex;
        while (!vertexsQueue.isEmpty()) {
            vertex = vertexsQueue.poll();
            if (!visited.contains(vertex)) {
                visited.add(vertex);
                for (Vertex v : graph.getAdjacentVertexs(vertex)) {
                    vertexsQueue.add(v);
                }
            }

        }
        return visited;
    }

}
