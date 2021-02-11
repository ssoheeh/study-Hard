package Main;

import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		List<Integer> list = new ArrayList<>();
		List<Integer> ori = new ArrayList<>();
		for (int i = 0; i < 8; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		ori.addAll(list);
		Collections.sort(list);
		int[] arr = new int[5];
		int sum = 0;
		for (int i = 3; i < 8; i++) {
			sum += list.get(i);
			arr[i-3] = ori.indexOf(list.get(i))+1;
		}
		System.out.println(sum);
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			bw.write(Integer.toString(arr[i]));
			bw.write(" ");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}

	
}
