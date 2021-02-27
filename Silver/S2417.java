package Main;

import java.io.*;
import java.util.*;



public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		StringTokenizer st;
		long n = Long.parseLong(br.readLine());
		System.out.println((int)Math.ceil(Math.sqrt(n)));

		bw.flush();
		br.close();
		bw.close();
	}
}