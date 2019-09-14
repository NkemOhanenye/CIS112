/**
  * User: Nkem Ohanenye
  * Date: 4/23/18
  * Purpose: to read the route and use the service
  * Note: Not implemented
  */
package Final;

public class Turn {

    // the variables
    protected Map edge;
    protected Route graph;

    public void Edge(){          // set the edges
        edge = new Map();
        graph = new Route();
        graph.addEdge(Integer.parseInt(edge.zero.getText()), Integer.parseInt(edge.one.getText()));
        graph.addEdge(Integer.parseInt(edge.zero.getText()), Integer.parseInt(edge.two.getText()));
        graph.addEdge(Integer.parseInt(edge.one.getText()), Integer.parseInt(edge.two.getText()));
        graph.addEdge(Integer.parseInt(edge.one.getText()), Integer.parseInt(edge.three.getText()));
        graph.addEdge(Integer.parseInt(edge.one.getText()), Integer.parseInt(edge.four.getText()));
        graph.addEdge(Integer.parseInt(edge.three.getText()), Integer.parseInt(edge.four.getText()));
        graph.addEdge(Integer.parseInt(edge.three.getText()), Integer.parseInt(edge.five.getText()));
        graph.addEdge(Integer.parseInt(edge.three.getText()), Integer.parseInt(edge.six.getText()));
        graph.addEdge(Integer.parseInt(edge.five.getText()), Integer.parseInt(edge.six.getText()));
        graph.addEdge(Integer.parseInt(edge.five.getText()), Integer.parseInt(edge.seven.getText()));
        graph.addEdge(Integer.parseInt(edge.five.getText()), Integer.parseInt(edge.eight.getText()));
        graph.addEdge(Integer.parseInt(edge.seven.getText()), Integer.parseInt(edge.eight.getText()));
        graph.addEdge(Integer.parseInt(edge.seven.getText()), Integer.parseInt(edge.nine.getText()));
        graph.addEdge(Integer.parseInt(edge.seven.getText()), Integer.parseInt(edge.ten.getText()));
        graph.addEdge(Integer.parseInt(edge.nine.getText()), Integer.parseInt(edge.ten.getText()));
        graph.addEdge(Integer.parseInt(edge.nine.getText()), Integer.parseInt(edge.eleven.getText()));
        graph.addEdge(Integer.parseInt(edge.nine.getText()), Integer.parseInt(edge.twelve.getText()));
        graph.addEdge(Integer.parseInt(edge.eleven.getText()), Integer.parseInt(edge.twelve.getText()));
        graph.addEdge(Integer.parseInt(edge.eleven.getText()), Integer.parseInt(edge.thirteen.getText()));
        graph.addEdge(Integer.parseInt(edge.eleven.getText()), Integer.parseInt(edge.fourteen.getText()));
        graph.addEdge(Integer.parseInt(edge.thirteen.getText()), Integer.parseInt(edge.fourteen.getText()));
        graph.addEdge(Integer.parseInt(edge.thirteen.getText()), Integer.parseInt(edge.fifteen.getText()));
        graph.addEdge(Integer.parseInt(edge.thirteen.getText()), Integer.parseInt(edge.sixteen.getText()));
        graph.addEdge(Integer.parseInt(edge.fifteen.getText()), Integer.parseInt(edge.sixteen.getText()));
        //graph.BFS();

    }
}