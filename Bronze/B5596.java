package Main;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		StringTokenizer st;
		int s=0,t=0;
		st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			s+=Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			t+=Integer.parseInt(st.nextToken());
		}
		if(s>t) {
			bw.write(Integer.toString(s));
		}else if(s<t) {
			bw.write(Integer.toString(t));
		}else {
			bw.write(Integer.toString(s));	
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
