package Main;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		int n;
		int[] arr;
		for (int i = 0; i < t; i++) {
			n = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			arr = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			int max = Integer.MIN_VALUE;
			int sum = 0;
			for (int j = 0; j < n-1; j++) {
				sum = arr[j];
				for (int k = j+1; k < n; k++) {
					max = max<sum?sum:max;
					sum += arr[k];
					max = max<sum?sum:max;
				}
			}
			
			max = max<arr[n-1]?arr[n-1]:max;
			bw.write(Integer.toString(max));
			bw.newLine();
		}
		
		bw.flush();
		br.close();
		bw.close();
	}

}