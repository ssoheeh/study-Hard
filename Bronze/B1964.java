package Main;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int a = 5;
		for (int i = 2; i <= n; i++) {
			a = (a+i+1+i+i)%45678;
		}
		bw.write(Integer.toString(a));
		bw.flush();
		br.close();
		bw.close();
	}
}