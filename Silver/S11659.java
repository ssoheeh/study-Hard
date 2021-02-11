package Main;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		short[] arr = new short[n];
		int[] re = new int[n];
		st = new StringTokenizer(br.readLine());
		int ans = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = Short.parseShort(st.nextToken());
			ans += arr[i];
			re[i] = ans;
		}
		int k,l;
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			k = Integer.parseInt(st.nextToken());
			l = Integer.parseInt(st.nextToken());
			if(k==1)
				bw.write(Integer.toString(re[l-1]));
			else {
				bw.write(Integer.toString(re[l-1]-re[k-2]));
			}
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
	}
}