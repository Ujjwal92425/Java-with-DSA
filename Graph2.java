import java.util.ArrayList;
import java.util.Scanner;

public class Graph2 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of nodes: ");
        int node_count= sc.nextInt();
        System.out.println("Enter no of edges: ");
        int edge_count= sc.nextInt();

        ArrayList <Integer> adj[] = new ArrayList [node_count+1];

        for (int i = 1; i <=node_count ; i++) {

            adj[i]=new ArrayList<>();
        }
        for (int i = 0; i < edge_count; i++) {
            int u = sc.nextInt();
            int v= sc.nextInt();

            adj[u].add(v);
            adj[v].add(u);//if undirected
            
        }
        System.out.println("Output: ");
        for (int i = 1; i <=node_count; i++) {
            System.out.print(i+" -> [ ");
            for (int j = 0; j < adj[i].size(); j++) {
                System.out.print(adj[i].get(j)+ " ");
                
            }
            System.out.println("]");
            
        }
        sc.close();
    }
    
}


