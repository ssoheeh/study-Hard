package Main;

import java.io.*;
import java.util.*;



public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		System.out.println(fibonacci(n));

		bw.flush();
		br.close();
		bw.close();
	}

	public static long fibonacci(int n) {
		// TODO Auto-generated method stub
		if(n==0||n==1)
			return n;
		long[] fib = new long[n+1];
		fib[0] = 0;
		fib[1] = 1;
		for (int i = 2; i <= n; i++) {
			fib[i] = (fib[i-2]+fib[i-1]) % 1000000007;
		}
		return fib[n];
	}

	

}