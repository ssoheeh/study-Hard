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
		int k = Integer.parseInt(st.nextToken());
		int[] temp = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			temp[i] = Integer.parseInt(st.nextToken());
		}
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i <= n-k; i++) {
			int sum = 0;
			for (int j = i; j < i+k; j++) {
				sum+=temp[j];
			}
			list.add(sum);
		}
		bw.write(Integer.toString(Collections.max(list)));
		bw.flush();
		br.close();
		bw.close();
	}

	
}