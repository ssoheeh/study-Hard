package Main;

import java.io.*;
import java.util.*;


public class Main {
	public static int sum = 0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;	
		String a,b;
		st = new StringTokenizer(br.readLine());
		a = st.nextToken();
		b = st.nextToken();
		diff(a,b);
		
		br.close();
		bw.flush();
		bw.close();
	}
	public static void diff(String a, String b) {
		// TODO Auto-generated method stub
		int diff = 0;
		List<Integer> list = new ArrayList<>();
		String temp;
		for (int i = 0; i <= b.length()-a.length(); i++) {
			diff = 0;
			temp = b.substring(i, i+a.length());
			for (int j = 0; j < a.length(); j++) {
				if(a.charAt(j)!=temp.charAt(j))
					diff++;
			}
			list.add(diff);
		}
		System.out.println(Collections.min(list));
	}	
}