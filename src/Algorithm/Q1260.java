package Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q1260 {
    static int Edge_arr[][];
    static boolean visited_arr[];
    static int N, M, V;
    static int count;
    static Queue<Integer> queue = new LinkedList<>();

    public static void BFS(int start){
        queue.offer(start);
        visited_arr[start] = true;
        System.out.print(start + " ");

        while(!queue.isEmpty()){
            start = queue.poll();

            for(int i=1; i<=N; i++){
                if(Edge_arr[start][i] == 1 && !visited_arr[i]){
                    queue.offer(i);
                    visited_arr[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }

    public static void DFS(int start){
        visited_arr[start] = true;
        System.out.print(start + " ");

        if(count == N){
            return;
        }
        count++;

        for(int i=1; i<=N; i++){
            if(Edge_arr[start][i] == 1 && !visited_arr[i]){
                DFS(i);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        Edge_arr = new int[N + 1][N + 1];
        visited_arr = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            Edge_arr[x][y] = Edge_arr[y][x] = 1;
        }

        DFS(V);
        System.out.println();

        visited_arr = new boolean[N + 1];
        BFS(V);

    }
}
