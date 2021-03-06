package Main;

import java.io.*;
import java.util.*;



public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[101];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(st.nextToken());
			if(arr[a]!=0)
				sum++;
			else {
				arr[a]=1;
			}
		}
		System.out.println(sum);
		bw.flush();
		br.close();
		bw.close();
	}
}