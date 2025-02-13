import java.util.ArrayList;
import java.util.Scanner;

public class GraphDFS {
    static void dfs(int u, ArrayList<Integer>[] adj, boolean[] vis) {
        if (vis[u]) {
            return;
        }
        System.out.print(u + " "); // Node visit karte waqt print kar raha hoon
        vis[u] = true;

        for (int v : adj[u]) {
            if (!vis[v]) {
                dfs(v, adj, vis);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of nodes: ");
        int node_count = sc.nextInt();
        System.out.println("Enter number of edges: ");
        int edge_count = sc.nextInt();

        // Graph adjacency list banane ke liye
        ArrayList<Integer>[] adj = (ArrayList<Integer>[]) new ArrayList[node_count + 1];

        // Har node ke liye ek empty list banao
        for (int i = 1; i <= node_count; i++) {
            adj[i] = new ArrayList<>();
        }

        // Graph ka input lo (edges)
        for (int i = 0; i < edge_count; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj[u].add(v);
            adj[v].add(u); // Undirected graph ke liye
        }

        boolean[] vis = new boolean[node_count + 1]; // Visited array

        System.out.println("DFS Traversal:");
        dfs(1, adj, vis); // DFS ko node 1 se start kar rahe hain

        sc.close();
    }
}

