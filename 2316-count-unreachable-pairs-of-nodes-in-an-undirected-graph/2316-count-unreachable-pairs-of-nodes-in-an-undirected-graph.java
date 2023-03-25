public class Solution {

    private List<Integer>[] graph;

    public long countPairs(int n, int[][] edges) {
        createGraph(n, edges);
        boolean[] visited = new boolean[n];
        int numVisitedNodes = 0;
        long numUnreachablePairsOfNodes = 0;

        for (int node = 0; node < n; ++node) {
            if (!visited[node]) {
                int numNodesInCurrentGroup = depthFirstSearch_countConnectedNodesInCurrentGroup(node, visited);
                numUnreachablePairsOfNodes += (long) numNodesInCurrentGroup * numVisitedNodes;
                numVisitedNodes += numNodesInCurrentGroup;
            }
        }
        return numUnreachablePairsOfNodes;
    }

    private int depthFirstSearch_countConnectedNodesInCurrentGroup(int node, boolean[] visited) {
        visited[node] = true;
        int numConnectedNodes = 1;

        for (int neighbor : graph[node]) {
            if (!visited[neighbor]) {
                numConnectedNodes += depthFirstSearch_countConnectedNodesInCurrentGroup(neighbor, visited);
            }
        }
        return numConnectedNodes;
    }

    private void createGraph(int n, int[][] edges) {
        graph = new List[n];
        for (int node = 0; node < n; ++node) {
            graph[node] = new ArrayList<>();
        }
        for (int i = 0; i < edges.length; ++i) {
            graph[edges[i][0]].add(edges[i][1]);
            graph[edges[i][1]].add(edges[i][0]);
        }
    }
}
