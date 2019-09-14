/**
 * Editor: Nkem Ohanenye
 * Date: 05/08/2018
 * Purpose: changing the hardcoded values to user imputable values.
 */

package Lab9;

import java.util.List;
import java.util.Scanner;

//your class test shortest path
public class TestShortestPath {
	public static void main(String[] args) {

		String ver0;
		String ver1;
		String ver2;
		String ver3;
		String ver4;

		int to0;
		int to1;
		int to2;
		int to3;
		int to4;

		Scanner scan = new Scanner(System.in);

		System.out.println("Please input the city > ");
		ver0 = scan.nextLine();
		System.out.println("Please input the distance to city 2 > ");
		to1 = scan.nextInt();
		System.out.println("Please input the distance to city 3 > ");
		to2 = scan.nextInt();
		System.out.println("Please input the distance to city 4 > ");
		to3 = scan.nextInt();
		System.out.println("------------------------------------------------");
		System.out.println("Please input the city > ");
		scan.next();
		ver1 = scan.nextLine();
		System.out.println("Please input the distance to city 1 > ");
		to0 = scan.nextInt();
		System.out.println("Please input the distance to city 3 > ");
		to2 = scan.nextInt();
		System.out.println("Please input the distance to city 5 > ");
		to4 = scan.nextInt();
		System.out.println("------------------------------------------------");
		System.out.println("Please input the city > ");
		scan.next();
		ver2 = scan.nextLine();
		System.out.println("Please input the distance to city 1 > ");
		to0 = scan.nextInt();
		System.out.println("Please input the distance to city 2 > ");
		to1 = scan.nextInt();
		System.out.println("------------------------------------------------");
		System.out.println("Please input the city > ");
		scan.next();
		ver3 = scan.nextLine();
		System.out.println("Please input the distance to city 1 > ");
		to0 = scan.nextInt();
		System.out.println("Please input the distance to city 5 > ");
		to4 = scan.nextInt();
		System.out.println("------------------------------------------------");
		System.out.println("Please input the city > ");
		scan.next();
		ver4 = scan.nextLine();
		System.out.println("Please input the distance to city 2 > ");
		to1 = scan.nextInt();
		System.out.println("Please input the distance to city 4 > ");
		to3 = scan.nextInt();

		Vertex v0 = new Vertex(ver0);
		Vertex v1 = new Vertex(ver1);
		Vertex v2 = new Vertex(ver2);
		Vertex v3 = new Vertex(ver3);
		Vertex v4 = new Vertex(ver4);

		v0.adjacencies = new Edge[]{new Edge(v1, to1),
				new Edge(v2, to2),
				new Edge(v3, to3)};
		v1.adjacencies = new Edge[]{new Edge(v0, to0),
				new Edge(v2, to2),
				new Edge(v4, to4)};
		v2.adjacencies = new Edge[]{new Edge(v0, to0),
				new Edge(v1, to1)};
		v3.adjacencies = new Edge[]{new Edge(v0, to0),
				new Edge(v4, to4)};
		v4.adjacencies = new Edge[]{new Edge(v1, to1),
				new Edge(v3, to3)};
		Vertex[] vertices = {v0, v1, v2, v3, v4};
		Dijkstra.computePaths(v0);
		for (Vertex v : vertices) {
			System.out.println("Distance to " + v + ": " + v.minDistance);
			List<Vertex> path = Dijkstra.getShortestPathTo(v);
			System.out.println("Path: " + path);
		}
	}//end main
}//end class
