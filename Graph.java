import java.util.Scanner;

public class Graph {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of nodes: ");
        int node_count= sc.nextInt();
        System.out.println("Enter no of edges: ");
        int edge_count= sc.nextInt();
        int adj[][] = new int [node_count][node_count];
        System.out.println("Enter the edges: ");
        for (int i = 0; i < edge_count; i++) {

            int u1=sc.nextInt();
            int v1=sc.nextInt();
            adj[u1][v1]=1;
            adj[v1][u1]=1;
            
        }
        System.out.println("Adjacency Matrix: ");
        for (int i = 0; i < node_count; i++) { 
            for (int j = 0; j < node_count; j++) {
                System.out.print(adj[i][j]+" ");
            }
            System.out.println();
            
        }
        sc.close();

        
    }

}
