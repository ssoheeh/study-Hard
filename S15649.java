package Silver;

import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class S15649 {
	public static int[] arr;
	public static boolean[] visit;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		arr = new int[m];
		visit = new boolean[n];
		dfs(n,m,0);
		bw.flush();
		br.close();
		bw.close();
	}

	public static void dfs(int n, int m, int k) {
		// TODO Auto-generated method stub
		if(k==m) {
			for(int a:arr) {
				System.out.print(a+" ");
			}
			System.out.println();
			return;
		}
		for (int i = 0; i < n; i++) {
			if(!visit[i]) {
				visit[i] = true;
				arr[k] = i+1;
				dfs(n,m,k+1);
				visit[i] = false;
			}
		}
	}

}
