/*
 * Created by IntelliJ IDEA.
 * User: Nkem Ohanenye
 * Date: 5/8/18
 * Time: 1:33 PM
 */
package Final.Examples;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Graph2 {
    private HashMap<Integer, Node> nodeLookup = new HashMap<Integer, Node>();

    public static class Node{
        private int id;
        private LinkedList<Node> adjacent = new LinkedList<Node>();
        private Node(int id){
            this.id = id;
        }
    }

    private Node getNode(int id){
        return nodeLookup.get(id);
    }
    public void addEdge(int source, int destination){
        Node s = getNode(source);
        Node d = getNode(destination);
        s.adjacent.add(d);
    }
    public boolean hasPathDFS(int source, int desetination){        //recursive method
        Node s = getNode(source);
        Node d = getNode(desetination);
        HashSet<Integer> visited = new HashSet<Integer>();
        return hasPathDFS(s, d, visited);
    }

    private boolean hasPathDFS(Node source, Node destination, HashSet<Integer> visited){
        if (visited.contains(source.id)){           //checks if already visited
            return false;
        }
        visited.add(source.id);                     //otherwise, adds node as visited
        if (source == destination){                 //checks if at destination
            return true;
        }
        for (Node child : source.adjacent){             //otherwise, searches all children
            if (hasPathDFS(child, destination, visited)){
                return true;
            }
        }
        return false;                       //if no path, returns false
    }

    public boolean hasPathBFS(int source, int destination){         //takes source and ids then calls recursive method
        return hasPathBFS(getNode(source), getNode(destination));
    }

    private boolean hasPathBFS(Node source, Node destination){          //takes source and destination
        LinkedList<Node> nextToVisit = new LinkedList<Node>();          //creates nodes of nextToVisit
        HashSet<Integer> visited = new HashSet<Integer>();              //marks all nodes already visited
        nextToVisit.add(source);                                //next one to visit is source
        while (!nextToVisit.isEmpty()){             //if there is anything else to visit, pull up the next node
            Node node = nextToVisit.remove();
            if (node == destination){                   //check if where you should be
                return true;
            }

            if (visited.contains(node.id)){             //otherwise check and update visited
                continue;
            }
            visited.add(node.id);

            for (Node child : node.adjacent){           //queue up the next children to be visited
                nextToVisit.add(child);
            }
        }
        return false;                       //if nothing found, return false
    }
}