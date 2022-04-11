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
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// watch https://www.youtube.com/watch?v=pmt8hXL1df8
public class ArticulationPoint {

    private int time;

    public Set<Vertex> findarticulationPoints(Graph graph) {
        time = 0;
        Set<Vertex> visited = new HashSet<>();
        Set<Vertex> articulationPoints = new HashSet<>();
        Vertex startVertex = graph.getVertex_list().iterator().next();

        Map<Vertex, Integer> visitedTime = new HashMap<>();
        Map<Vertex, Integer> lowTime = new HashMap<>();
        Map<Vertex, Vertex> parent = new HashMap<>();

        DFS(visited, articulationPoints, startVertex, visitedTime, lowTime, parent);
        return articulationPoints;
    }

    private void DFS(Set<Vertex> visited,
            Set<Vertex> articulationPoints, Vertex vertex,
            Map<Vertex, Integer> visitedTime,
            Map<Vertex, Integer> lowTime, Map<Vertex, Vertex> parent) {
        visited.add(vertex);
        visitedTime.put(vertex, time);
        lowTime.put(vertex, time);
        time++;
        int childCount = 0;
        boolean isArticulationPoint = false;
        for (Vertex adj : vertex.getAdjacentVertexs()) {
            //if adj is same as parent then just ignore this vertex.
            if (adj.equals(parent.get(vertex))) {
                continue;
            }
            //if adj has not been visited then visit it.
            if (!visited.contains(adj)) {
                parent.put(adj, vertex);
                childCount++;
                DFS(visited, articulationPoints, adj, visitedTime, lowTime, parent);

                if (visitedTime.get(vertex) <= lowTime.get(adj)) {
                    isArticulationPoint = true;
                } else {
                    //below operation basically does lowTime[vertex] = min(lowTime[vertex], lowTime[adj]);
                    lowTime.compute(vertex, (currentVertex, time)
                            -> Math.min(time, lowTime.get(adj))
                    );
                }

            } else { //if adj is already visited see if you can get better low time.
                //below operation basically does lowTime[vertex] = min(lowTime[vertex], visitedTime[adj]);
                lowTime.compute(vertex, (currentVertex, time)
                        -> Math.min(time, visitedTime.get(adj))
                );
            }
        }

        //checks if either condition 1 or condition 2 meets). If yes then it is articulation point.
        if ((parent.get(vertex) == null && childCount >= 2) || parent.get(vertex) != null && isArticulationPoint) {
            articulationPoints.add(vertex);
        }

    }

}

