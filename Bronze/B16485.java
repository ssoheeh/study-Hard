package Main;

import java.io.*;
import java.util.*;



public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int c = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		if(c%b==0)
			System.out.println(c/b);
		else {
			System.out.println((double)c/b);
		}
		bw.flush();
		br.close();
		bw.close();
	}
}