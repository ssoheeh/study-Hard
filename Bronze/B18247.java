package Main;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		int n,m;
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			if(n<12||m<4)
				bw.write("-1");
			else {
				bw.write(Integer.toString(11*m+4));
			}
			bw.newLine();
		}
		
		
		
		

		bw.flush();
		br.close();
		bw.close();
	}

	
}