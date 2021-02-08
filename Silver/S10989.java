package Main;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		StringTokenizer st;
		int[] count = new int[10001];
		int n = Integer.parseInt(br.readLine());
		Arrays.fill(count, 0);
		for (int i = 0; i < n; i++) {
			count[Integer.parseInt(br.readLine())]++;
		}
		for (int i = 1; i <= 10000; i++) {
			if(count[i]!=0)
				for (int j = 0; j < count[i]; j++) {
					bw.write(Integer.toString(i));
					bw.newLine();
				}
		}
		bw.flush();
		br.close();
		bw.close();
	}
}