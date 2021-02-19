package Main;

import java.io.*;
import java.util.*;



public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][5];
		boolean[][] check = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 5; j++) {
				for (int k = 0; k < n; k++) {
					if(arr[i][j]==arr[k][j]&&!check[i][k]) {
						check[i][k] = true;
					}
				}
			}
		}
		
		int[] ans = new int[n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(check[i][j])
					ans[i]++;
			}
		}
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(ans[i]-1);
		}
		int max = Collections.max(list);
		int idx = list.indexOf(max);
		System.out.println(idx+1);
		bw.flush();
		br.close();
		bw.close();
	}
}