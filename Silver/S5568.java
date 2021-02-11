package Main;

import java.io.*;
import java.util.*;


public class Main {
	public static Set<String> set = new HashSet<>();
	public static boolean[] visit;
	public static int n;
	public static String[] arr;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		n = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());
		visit = new boolean[n+1];
		arr = new String[n+1];
		for (int i = 1; i <= n; i++) {
			arr[i] = br.readLine();
		}
		dfs(k,1,"");
		System.out.println(set.size());
		br.close();
		bw.flush();
		bw.close();
	}

	public static void dfs(int k, int i, String string) {
		// TODO Auto-generated method stub
		if(k==0) {
			set.add(string);
			return;
		}if(i>n) {
			return;
		}else{
			for (int j = 1; j <= n; j++) {
				if(!visit[j]) {
					visit[j] = true;
					dfs(k-1,j,string+arr[j]);
					visit[j] = false;
				}
			}
		}
	}
}
