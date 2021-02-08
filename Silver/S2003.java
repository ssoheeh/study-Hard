package Main;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		short[] arr = new short[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Short.parseShort(st.nextToken());
		}
		int sum = 0;
		int ans = 0;
		for (int i = 0; i < n; i++) {
			sum = 0;
			for (int j = i; j < n; j++) {
				sum += arr[j];
				if(sum==m) {
					ans++;
					break;
				}if(sum>m) {
					break;
				}
			}
		}
		bw.write(Integer.toString(ans));
		bw.flush();
		br.close();
		bw.close();
	}

}