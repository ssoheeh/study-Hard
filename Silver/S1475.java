package Main;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		StringTokenizer st;
		int[] arr = new int[10];
		String n = br.readLine();
		for (int i = 0; i < n.length(); i++) {
			int num = Character.getNumericValue(n.charAt(i));
			if(num==6||num==9) {
				arr[6]++;
			}else
				arr[num]++;
		}
		int max = 0;
		for (int i = 0; i < 10; i++) {
			if(i==6)
			{
				arr[i] = (int)(Math.round(arr[i]/1.8));
				if(max<arr[i])
					max = arr[i];
			}else {
				max = max<arr[i]?arr[i]:max;
			}
		}
		System.out.println(max);
		bw.flush();
		br.close();
		bw.close();
	}
}