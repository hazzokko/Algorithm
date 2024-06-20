import java.io.*;
import java.util.*;

public class Main {

  static Map<Integer, ArrayList<Integer>> graph = new HashMap<>();
  static int[] visited;

  public static void bfs(int start) {
    Queue<Integer> queue = new LinkedList<>();
    queue.add(start);
    int cnt = 1;
    visited[start] = cnt++;

    while (!queue.isEmpty()) {
      Integer poll = queue.poll();
      if (graph.get(poll) != null) {
        for (int neighbor : graph.get(poll)) {
          if (visited[neighbor] != 0) {
            continue;
          }
          queue.add(neighbor);
          visited[neighbor] = cnt++;
        }
      }
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int[] split = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

    for (int i = 0; i < split[1]; i++) {
      int[] vertex = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      graph.putIfAbsent(vertex[0], new ArrayList<>());
      graph.putIfAbsent(vertex[1], new ArrayList<>());
      graph.get(vertex[0]).add(vertex[1]);
      graph.get(vertex[1]).add(vertex[0]);
    }

    for (ArrayList<Integer> nodes : graph.values()) {
      nodes.sort(Collections.reverseOrder());
    }

    visited = new int[split[0] + 1];
    bfs(split[2]);
    for (int i = 1; i < visited.length; i++) {
      System.out.println(visited[i]);
    }
  }
}