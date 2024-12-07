import java.util.*;

public class Roster {

    public static int findDays(int n, int m, List<int[]> edges, int k) {
        int days = 1, activeCount = n;
        List<Set<Integer>> connections = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            connections.add(new HashSet<>());
        }

        for (int[] edge : edges) {
            connections.get(edge[0]).add(edge[1]);
            connections.get(edge[1]).add(edge[0]);
        }

        boolean[] status = new boolean[n];
        Arrays.fill(status, true);

        while (activeCount < k) {
            boolean[] newStatus = new boolean[n];
            for (int i = 0; i < n; i++) {
                int count = 0;
                for (int neighbor : connections.get(i)) {
                    if (status[neighbor]) {
                        count++;
                    }
                }

                if (status[i] && count == 3) {
                    newStatus[i] = true;
                } else if (!status[i] && count < 3) {
                    newStatus[i] = true;
                }
            }

            status = newStatus;
            activeCount += Arrays.stream(status).filter(b -> b).count();
            days++;
        }

        return days;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(), m = sc.nextInt();
        List<int[]> edges = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt(), v = sc.nextInt();
            edges.add(new int[]{u, v});
        }

        int k = sc.nextInt();
        System.out.println(findDays(n, m, edges, k));
    }
}