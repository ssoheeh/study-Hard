package Main;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		StringTokenizer st;
		char[] c = br.readLine().toCharArray();
		int sum = 1;
		for (int i = 0; i < c.length; i++) {
			if(c[i]=='c') {
				if(i==0||c[i-1]!=c[i]) {
					sum*=26;
				}
				else
					sum*=25;
			}if(c[i]=='d') {
				if(i==0||c[i-1]!=c[i]) {
					sum*=10;
				}
				else
					sum*=9;
			}
		}
		bw.write(Integer.toString(sum));
		bw.flush();
		br.close();
		bw.close();
	}
}