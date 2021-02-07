package Main;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		StringBuffer sb = new StringBuffer();
		for (int i = 1; i <= n; i++) {
			sb.append(i);
		}
		List<String> di = new ArrayList<>();
		for (int i = 0; i < sb.toString().length(); i++) {
			di.add(sb.substring(i,i+1));
		}
		Collections.sort(di);
		bw.write(Integer.toString(Collections.frequency(di, Integer.toString(d))));
		
		bw.flush();
		br.close();
		bw.close();
	}
}
