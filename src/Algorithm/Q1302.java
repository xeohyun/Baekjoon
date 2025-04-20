package Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> book_cnt = new HashMap<>();
        int max = 0;
        for(int i=0; i<n; i++){
            String book = br.readLine();
            book_cnt.put(book, book_cnt.getOrDefault(book, 0) + 1);
            max = Math.max(max, book_cnt.get(book));
        }
        List<String> list = new ArrayList<>();
        for(Map.Entry<String,Integer> entry : book_cnt.entrySet()){
            if(entry.getValue() == max){
                list.add(entry.getKey());
            }
        }
        Collections.sort(list);
        System.out.println(list.get(0));
    }
}
