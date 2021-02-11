package Main;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		StringBuffer sb = new StringBuffer("9");
		int len = Integer.toString(n).length();
		int ans = 0;

		for (int i = 1; i < len; i++) {
			ans += i*Integer.parseInt(sb.toString());
			sb.append("0");
		}
		ans += len*(n-Math.pow(10, len-1)+1);
		bw.write(Integer.toString(ans));

		bw.flush();
		bw.close();
		br.close();
	}
}