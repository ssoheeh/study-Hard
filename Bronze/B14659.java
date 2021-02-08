package Main;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int[] s = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			s[i] = Integer.parseInt(st.nextToken());
		}
		int max = 0;
		int i,j;
		List<Integer> list = new ArrayList<>();
		for (i = 0; i < n-1; i++) {
			max = 0;
			for (j = i+1; j < n; j++) {
				if(s[i]>s[j])
					max++;
				else
					break;
			}
			list.add(max);
		}
		System.out.println(Collections.max(list));
		
		bw.flush();
		br.close();
		bw.close();
	}
}