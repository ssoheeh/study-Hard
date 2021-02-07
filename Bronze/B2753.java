package Main;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		StringTokenizer st;
		int y = Integer.parseInt(br.readLine());
		if(y%4==0&&y%100!=0) {
			System.out.println(1);
			return;
		}
		if(y%400==0) {
			System.out.println(1);
			return;
		}
		System.out.println(0);	
		
		bw.flush();
		br.close();
		bw.close();
	}
}
