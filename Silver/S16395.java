package Main;

import java.io.*;
import java.util.*;



public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		System.out.println(pascal(n,m));
		bw.flush();
		br.close();
		bw.close();
	}

	public static long pascal(int n, int m) {
		// TODO Auto-generated method stub
		long[][] arr = new long[n+1][m+1];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if(i==j||j==1)
					arr[i][j] = 1;
				else
					arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
			}
		}
		return arr[n][m];
	}


}