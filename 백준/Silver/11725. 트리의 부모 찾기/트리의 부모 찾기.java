import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 노드 개수 입력

		ArrayList<ArrayList<Integer>> tree = new ArrayList<>();
		for (int i = 0; i < n; i++)
			tree.add(new ArrayList<>());

		for (int i = 0; i < n - 1; i++) {
			int n1 = sc.nextInt() - 1;
			int n2 = sc.nextInt() - 1;
			tree.get(n1).add(n2);
			tree.get(n2).add(n1);
		}

		boolean[] visited = new boolean[n]; // 방문 여부 확인용 배열
		int[] parentNode = new int[n]; // 부모 노드 저장 배열

		Queue<Integer> queue = new LinkedList<>();
		queue.add(0);
		visited[0] = true;
		while (!queue.isEmpty()) {
			int v = queue.remove();
			for (int node : tree.get(v))
				if (!visited[node]) {
					visited[node] = true;
					queue.add(node);
					parentNode[node] = v; // 부모 노드 찾은 후 저장
				}
		}
		for (int i = 1; i < n; i++)
			System.out.println(parentNode[i] + 1);
	}
}