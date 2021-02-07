package S1158;

import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		Queue<Integer> q = new ArrayDeque<>();
		for (int i = 1; i <= n; i++) {
			q.add(i);
		}
		bw.write("<");
		while(!q.isEmpty()) {
			for (int i = 0; i < k-1; i++) {
				int a = q.poll();
				q.offer(a);
			}
			bw.write(Integer.toString(q.poll()));
			if(!q.isEmpty())
				bw.write(", ");
		}
		bw.write(">");
		bw.flush();
		br.close();
		bw.close();
	}

}
