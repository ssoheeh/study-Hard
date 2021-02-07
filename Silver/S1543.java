package Main;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		StringTokenizer st;
		String str = br.readLine();
		String search = br.readLine();
		String s;
		str = str.replaceAll(search, "A");
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='A')
				sum++;
		}
		bw.write(Integer.toString(sum));
		bw.flush();
		br.close();
		bw.close();
	}

}