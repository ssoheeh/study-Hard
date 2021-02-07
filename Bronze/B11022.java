package Main;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		int a, b;
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			bw.write("Case #"+(i+1)+": "+Integer.toString(a)+" + "+Integer.toString(b)+" = "+Integer.toString(a+b));
			bw.newLine();
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}
