package Main;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		int n,m,cnt;
		for (int i = 0; i < t; i++) {
			cnt = 0;
			 st = new StringTokenizer(br.readLine());
			 n = Integer.parseInt(st.nextToken());
			 m = Integer.parseInt(st.nextToken());
			 for (int j = n; j <= m; j++) {
				for (int k = 0; k < Integer.toString(j).length(); k++) {
					if(Integer.toString(j).charAt(k)=='0')
						cnt++;
				}
			}
			 bw.write(Integer.toString(cnt));
			 bw.newLine();
		}
		bw.flush();
		br.close();
		bw.close();
	}



}