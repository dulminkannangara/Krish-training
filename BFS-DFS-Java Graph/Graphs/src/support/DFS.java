/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package support;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import model.Edge;
import model.Graph;
import model.Vertex;

/**
 *
 * @author kkddu
 */

// watch https://www.youtube.com/watch?v=aMCI4AqVUug
public class DFS {
    
    public static LinkedHashSet depthFirstSearch(Graph graph, Vertex start_vertex){
        
        Stack<Vertex> vertexsStack = new Stack<>();
        LinkedHashSet <Vertex> visited = new LinkedHashSet<>();
        
        vertexsStack.push(start_vertex);
        
        Vertex vertex;
        while (!vertexsStack.isEmpty()) {
            vertex = vertexsStack.pop();
            if(!visited.contains(vertex)){
                visited.add(vertex);
                for (Vertex v : graph.getAdjacentVertexs(vertex)) {
                    vertexsStack.push(v);
                }
            }
        }
        return visited;
    }
    
    
    
    
}
