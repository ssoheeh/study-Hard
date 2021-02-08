package Main;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		int sum = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sum += arr[i];
		}
		int m = Integer.parseInt(br.readLine());
		Arrays.sort(arr);
		int ans = arr[0];
		if(sum<=m) {
			bw.write(Integer.toString(arr[n-1]));
		}else {
			while(true) {
				sum = 0;
				for (int i = 0; i < n; i++) {
					if(arr[i]<=ans) {
						sum += arr[i];
					}else {
						sum += ans;
					}
				}
				if(sum==m) {
					bw.write(Integer.toString(ans));
					break;
				}else if(sum>m) {
					bw.write(Integer.toString(ans-1));
					break;
				}	
				ans++;			
			}
		}
		bw.flush();
		br.close();
		bw.close();
	}
}