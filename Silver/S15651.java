package Main;

import java.io.*;
import java.util.*;



public class Main {
	public static int n,m; 
	public static int[] arr;
	public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[m];
		dfs(0);
		System.out.println(sb.toString());
		bw.flush();
		br.close();
		bw.close();
	}
	public static void dfs(int depth) {
		// TODO Auto-generated method stub
		if(depth==m) {
			for(int i:arr) {
				sb.append(i+" ");
			}
			sb.append("\n");
			return;
		}
		for (int i = 1; i <= n; i++) {
			arr[depth] = i;
			dfs(depth+1);
		}
	}
	

}