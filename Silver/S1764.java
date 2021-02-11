package Main;

import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < n; i++) {
			set.add(br.readLine());
		}
		String name;
		List<String> list = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			name = br.readLine();
			if(set.contains(name)) {
				list.add(name);
			}
		}
		Collections.sort(list);
		bw.write(Integer.toString(list.size()));
		bw.newLine();
		for (int i = 0; i < list.size(); i++) {
			bw.write(list.get(i));
			bw.newLine();
		}
		br.close();
		bw.flush();
		bw.close();
	}


}
