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
		st = new StringTokenizer(br.readLine());
		int[] temp = new int[n];
		for (int i = 0; i < n; i++) {
			if(st.hasMoreTokens())
				temp[i] = Integer.parseInt(st.nextToken());
		}
		long sum;
		List<Long> re = new ArrayList<>();
		for (int i = 0; i <= n-k; i++) {
			sum = 0;
			for (int j = i; j < i+k; j++) {
				sum += temp[j];
			}
			re.add(sum);
		}
		bw.write(Long.toString(Collections.max(re)));
		bw.flush();
		br.close();
		bw.close();
	}
}