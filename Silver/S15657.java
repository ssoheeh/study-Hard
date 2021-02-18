package Main;

import java.io.*;
import java.util.*;



public class Main {
	public static int n,m;
	public static int[] arr;
	public static int[] check;
	public static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		arr = new int[n];
		check = new int[m];
		for (int i = 0; i < n; i++) {
			arr[i] = Short.parseShort(st.nextToken());
		}
		Arrays.sort(arr);
		dfs(0,0);
		bw.write(sb.toString());
		bw.flush();
		br.close();
		bw.close();
	}
	public static void dfs(int depth, int start) {
		// TODO Auto-generated method stub
		if(depth==m) {
			for(int i:check)
				sb.append(i+" ");
			sb.append("\n");
			return;
		}
		for (int i = start; i < n; i++) {
			check[depth] = arr[i];
			dfs(depth+1,i);
		}
	}


}