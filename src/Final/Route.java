/**
  * User: Nkem Ohanenye
  * Date: 4/23/18
  * Purpose: to create the route which was the BFS  traversal Graph for the car
  * Note: works but failed to implement
  */
package Final;

import java.util.*;

public class Route {

    // the variables
    private static final int DEFCAP = 17;           //the amount of vertices entered
    private int destination;
    private LinkedList<Integer> adj[];

    public Route(){         //sets up linkedlist making vertices max of 17

        adj = new LinkedList[DEFCAP];
        for (int i = 0; i < DEFCAP; i++)
            adj[i] = new LinkedList();

    }

    public void addEdge(int fromVertex, int toVertex) {         //creates the edges

        destination = toVertex;
        adj[fromVertex].add(destination);

    }

    public void BFS(){

        int start = 0;      // sets initial vertex as zero
        boolean visited[] = new boolean[DEFCAP]; //(initially false) checks if visited
        LinkedList<Integer> queue = new LinkedList<Integer>();          //create queue for BFS

        visited[start] = true;      // makes visited true
        queue.add(start);

        while (!queue.isEmpty()) {

            //dequeued the top vertex
            start = queue.poll();

            // gets all dequeued vertices
            Iterator<Integer> i = adj[start].listIterator();

            // would have like to have changed the code below but didnt know how
            while (i.hasNext()){

                int n = i.next();
                if (!visited[n]){       //if the vertex was not visited, visited and enqueued

                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

}