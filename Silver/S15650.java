package Silver;

import java.io.*;
import java.util.*;

//백트래킹 알고리즘이 어려워,,,,알고리즘 강의를 다시 들어봐야겠다

public class S15650 {
	public static int[] arr;
	public static int n;
	public static int m;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[m];
		dfs(1,0);
		
		bw.flush();
		br.close();
		bw.close();
	}

	public static void dfs(int at, int depth) {
		// TODO Auto-generated method stub
		if(depth==m) {
			for(int a: arr) {
				System.out.print(a+" ");
			}
			System.out.println();
			return;
		}
		for (int i = at; i <= n; i++) {
			arr[depth] = i;
			dfs(i+1, depth+1);
		}
	}
}
