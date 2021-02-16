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
		Set<String> set = new HashSet<>();
		String name, status;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			name = st.nextToken();
			status = st.nextToken();
			if(set.contains(name)) {
				set.remove(name);
			}else {
				set.add(name);
			}
		}
		List<String> list = new ArrayList<>();
		list.addAll(set);
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			bw.write(list.get(list.size()-i-1));
			bw.newLine();
		}
		br.close();
		bw.flush();
		bw.close();
	}

	
}