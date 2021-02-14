package Main;

import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {

	public static int t;
	public static int m,n,k;
	public static int[][] arr;
	public static boolean[][] check;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			arr = new int[m+2][n+2];
			check = new boolean[m+2][n+2];
			for (int j = 0; j < k; j++) {
				st = new StringTokenizer(br.readLine());
				int k = Integer.parseInt(st.nextToken())+1;
				int l = Integer.parseInt(st.nextToken())+1;
				arr[k][l] = 1;
			}
			List<Integer> list = new ArrayList<>();
			for (int j = 1; j <= m; j++) {			
				for (int k = 1; k <= n; k++) {
					if(checkarr(j,k)) {	
						int ans = dfs(j,k);
						list.add(ans);
					}
				}
			}
			bw.write(Integer.toString(list.size()));
			bw.newLine();
			list.clear();
		}
		br.close();
		bw.flush();
		bw.close();
	}
	public static int dfs(int j, int k) {
		// TODO Auto-generated method stub
		int ans = 1;
		check[j][k] = true;
		if(checkarr(j-1,k))
			ans += dfs(j-1,k);
		if(checkarr(j,k-1))
			ans += dfs(j,k-1);
		if(checkarr(j,k+1))
			ans += dfs(j,k+1);
		if(checkarr(j+1,k))
			ans += dfs(j+1,k);
		return ans;
	}


	public static boolean checkarr(int j, int k) {
		// TODO Auto-generated method stub
		if(j<1||j>m||k<1||k>n)return false;
		if(check[j][k]==true||arr[j][k]==0)return false;
		return true;
	}



}
