package Main;

import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		Set<Integer> set = new HashSet<Integer>();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			set.add(Integer.parseInt(st.nextToken()));
		}
		List<Integer> list = new ArrayList<>();
		list.addAll(set);
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			bw.write(Integer.toString(list.get(i))+" ");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}