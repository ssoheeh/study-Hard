package Main;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		pascal(r,c,w);
		bw.flush();
		br.close();
		bw.close();
	}

	public static void pascal(int r, int c, int w) {
		// TODO Auto-generated method stub
		int[][] pascal = new int[29][29];
		for (int i = 0; i < 29; i++) {
			for (int j = 0; j <= i; j++) {
				if(i==j)
					pascal[i][j] = 1;
				else if(j==0)
					pascal[i][j] = 1;
				else {
					pascal[i][j] = pascal[i-1][j]+pascal[i-1][j-1];
				}
			}
		}
		int sum = 0;
		int k = 1;
		for (int i = r-1; i < r-1+w; i++) {
			for (int j = c-1; j < c-1+k; j++) {
				sum += pascal[i][j];
			}	
			if(k<w)
				k++;
		}
		System.out.println(sum);
	}

	
}