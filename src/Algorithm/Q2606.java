package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2606 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        LinkedList<Integer>[] arr = new LinkedList[N+1];
        boolean[] visited = new boolean[N+1];
        for(int i=1; i<=N; i++){
            arr[i] = new LinkedList<>();
        }
        for(int i=0; i<M; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a].add(b);
            arr[b].add(a);
        }
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        visited[1] = true;
        int cnt = 0;
        while(!q.isEmpty()){
            int cur = q.poll();
            for(int i=0; i<arr[cur].size(); i++){
                int next = arr[cur].get(i);
                if(!visited[next]){
                    visited[next] = true;
                    q.add(next);
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
