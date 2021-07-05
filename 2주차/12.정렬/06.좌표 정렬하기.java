import java.util.*;
import java.io.*;

public class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        ArrayList<Node> list = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.add(new Node(x, y));
        }
        
        Collections.sort(list);
        
        for (int i = 0; i < n; i++) {
            bw.append(String.valueOf(list.get(i).x) + " " + String.valueOf(list.get(i).y) + "\n");
        }
        
        bw.flush();
        br.close();
        bw.close();
        
    }
    
    static class Node implements Comparable<Node> {
        int x;
        int y;
        
        public Node (int x, int y) {
            this.x = x;
            this.y = y;
        }
        
        @Override
        public int compareTo (Node node) {
            if (node.x < this.x) {
                return 1;
            }
            else if (node.x > this.x) {
                return -1;
            }
            else {
                if (node.y < this.y) {
                    return 1;
                }
                else {
                    return -1;
                }
            }
        }
    }
}