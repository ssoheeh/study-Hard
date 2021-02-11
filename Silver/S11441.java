package Main;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		short[] arr = new short[n];
		int[] ans = new int[n];
		int a = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = Short.parseShort(st.nextToken());
			a += arr[i];
			ans[i] = a;
		}
		int m = Integer.parseInt(br.readLine());
		int k,l;
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			k = Integer.parseInt(st.nextToken());
			l = Integer.parseInt(st.nextToken());
			if(k==1)
				bw.write(Integer.toString(ans[l-1]));
			else {
				bw.write(Integer.toString(ans[l-1]-ans[k-2]));
			}
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}
}