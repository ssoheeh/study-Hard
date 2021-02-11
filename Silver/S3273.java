package Main;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int x = Integer.parseInt(br.readLine());
		int re = 0;
		for (int i = 0; i < arr.length; i++) {
			if(Arrays.binarySearch(arr, x - arr[i])>=0)
				re++;
		}
		bw.write(Integer.toString(re/2));
		br.close();
		bw.flush();
		bw.close();
	}
}
