package Main;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		Set<Integer> set = new HashSet<>();
		List<Integer> list = new ArrayList<>();
		List<Integer> ans = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken());
			set.add(num);
			ans.add(num);
		}
		list.addAll(set);
		Collections.sort(list);
		for (int i = 0; i < n; i++) {
			bw.write(Integer.toString(Collections.binarySearch(list, ans.get(i))));
			bw.write(" ");
		}
		bw.flush();
		bw.close();
		br.close();
	}
}