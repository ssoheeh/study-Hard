package Main;

import java.io.*;
import java.util.*;



public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		List<String> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(st.nextToken());
		}
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i!=j) {
					if(list.get(i).charAt(list.get(i).length()-1)!=list.get(j).charAt(0)) {
						System.out.println("0");
						return;
					}
				}
			}
		}
		System.out.println("1");


		bw.flush();
		br.close();
		bw.close();
	}
}