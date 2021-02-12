package Main;

import java.io.*;
import java.util.*;


public class Main {
	public static int sum = 0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;	
		String s = br.readLine();
		int t = s.length();
		StringBuilder sb = new StringBuilder();
		if(t%3==1) {
			sb.append(s.charAt(0));
		}if(t%3==2) {
			sb.append((s.charAt(0)-'0')*2+s.charAt(1)-'0');
		}
		for (int i = t%3; i < t; i+=3) {
			sb.append((s.charAt(i)-'0')*4+(s.charAt(i+1)-'0')*2+s.charAt(i+2)-'0');
		}
		bw.write(sb.toString());
		br.close();
		bw.flush();
		bw.close();
	}	
}