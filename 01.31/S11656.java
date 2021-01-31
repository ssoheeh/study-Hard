package Main;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		StringTokenizer st;
		String str = br.readLine();
		String[] arr = new String[str.length()];
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.substring(i,str.length());
		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			bw.write(arr[i]);
			bw.newLine();
		}
		
		bw.flush();
		br.close();
		bw.close();
	}

	
}
