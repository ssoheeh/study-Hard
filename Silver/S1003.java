package Main;

import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		int n;
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(0);
		list.add(0);
		list.add(1);
		for (int i = 0; i <= 76; i+=2) {
			list.add(list.get(i)+list.get(i+2));
			list.add(list.get(i+1)+list.get(i+3));
		}
		for (int i = 0; i < t; i++) {
			n = Integer.parseInt(br.readLine());
			bw.write(Integer.toString(list.get(2*n))+" "+Integer.toString(list.get(2*n+1)));
			bw.newLine();
		}
		bw.flush();
		br.close();
		bw.close();
	}
	
}