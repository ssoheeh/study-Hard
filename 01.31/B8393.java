package Main;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		bw.write(Integer.toString(sum));
		bw.flush();
		br.close();
		bw.close();
	}
}
