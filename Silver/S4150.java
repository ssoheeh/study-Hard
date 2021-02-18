package Main;

import java.io.*;
import java.math.BigInteger;
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

	public static BigInteger fibonacci(int n) {
		// TODO Auto-generated method stub
		BigInteger[] arr = new BigInteger[n+1];
		arr[0] = BigInteger.ZERO;
		arr[1] = BigInteger.ONE;
		if(n==0||n==1)
			return BigInteger.valueOf(n);
		else {
			for (int i = 2; i <= n; i++) {
				arr[i] = arr[i-2].add(arr[i-1]);
			}
			return arr[n];
		}
	}
}