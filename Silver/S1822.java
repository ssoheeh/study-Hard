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
		int na = Integer.parseInt(st.nextToken());
		int nb = Integer.parseInt(st.nextToken());
		Set<Integer> set = new HashSet<>();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < na; i++) {
			set.add(Integer.parseInt(st.nextToken()));
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < nb; i++) {
			int num = Integer.parseInt(st.nextToken());
			if(set.contains(num)) {
				set.remove(num);
			}
		}
		List<Integer> list = new ArrayList<>();
		list.addAll(set);
		Collections.sort(list);
		if(list.size()==0)
			bw.write("0");
		else {
			bw.write(Integer.toString(list.size()));
			bw.newLine();
			for (int i = 0; i < list.size(); i++) {
				bw.write(Integer.toString(list.get(i))+" ");
			}
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}