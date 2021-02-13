package Main;

import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());	
		String str;
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		Map<String,Integer> map = new HashMap<>();
		List<String> list = new ArrayList<>();
		String name;
		for (int i = 0; i < n; i++) {
			name = br.readLine();
			map.put(name, i+1);
			list.add(name);
		}
		for (int i = 0; i < m; i++) {
			str = br.readLine();
			if(Character.isDigit(str.charAt(0))) {
				bw.write(list.get(Integer.parseInt(str)-1));
				bw.newLine();
			}else {
				bw.write(Integer.toString(map.get(str)));
				bw.newLine();
			}
		}
		
		br.close();
		bw.close();
	}
}
