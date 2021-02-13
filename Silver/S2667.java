package Main;

import java.io.*;
import java.util.*;


public class Main {
	public static int n;
	public static int[][] arr;
	public static boolean[][] home;
	public static char[] num;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		n = Integer.parseInt(br.readLine());
		arr = new int[n+1][n+1];
		home = new boolean[n+1][n+1];
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			String s = br.readLine();
			for (int j = 1; j <= n; j++) {
				arr[i][j] = s.charAt(j-1)-'0';
			}
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if(check(i,j)) {
					int ans = dfs(i,j);
					list.add(ans);
				}
			}
		}
		Collections.sort(list);
		bw.write(Integer.toString(list.size()));
		bw.newLine();
		for (int i = 0; i < list.size(); i++) {
			bw.write(Integer.toString(list.get(i)));
			bw.newLine();
		}
		br.close();
		bw.flush();
		bw.close();
	}

	public static int dfs(int i, int j) {
		// TODO Auto-generated method stub
		int ans = 1;
		home[i][j] = true;
		if(check(i-1,j))
			ans += dfs(i-1,j);
		if(check(i,j-1))
			ans += dfs(i,j-1);
		if(check(i,j+1))
			ans += dfs(i,j+1);
		if(check(i+1,j))
			ans += dfs(i+1,j);
		
		return ans;
	}

	public static boolean check(int i, int j) {
		// TODO Auto-generated method stub
		if(i<1||i>n||j<1||j>n)return false;
		if(home[i][j]==true||arr[i][j]==0)return false;
		return true;
	}

	
}
