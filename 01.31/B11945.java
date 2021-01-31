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
		int[][] bread = new int[n][m];
		for (int i = 0; i < n; i++) {
			char[] b = br.readLine().toCharArray();
			for (int j = 0; j < m; j++) {
				bread[i][j] = Character.getNumericValue(b[j]);
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(bread[i][m-j-1]);
			}
			System.out.println();
		}
		

		bw.flush();
		br.close();
		bw.close();
	}

	
}