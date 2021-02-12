package Main;

import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		System.out.println(fibonacci(n));
		br.close();
		bw.flush();
		bw.close();
	}

	public static BigInteger fibonacci(int n) {
		// TODO Auto-generated method stub
		BigInteger[] fib = new BigInteger[n+1];
		if(n>=0)
			fib[0] = BigInteger.ZERO;
		if(n>=1)
			fib[1] = BigInteger.ONE;
		for (int i = 2; i <= n; i++) {
			fib[i] = fib[i-1].add(fib[i-2]);
		}
		return fib[n];


	}
}