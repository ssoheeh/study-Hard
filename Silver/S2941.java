package Main;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		StringTokenizer st;
		String str = br.readLine();
		List<String> list = new ArrayList<>();
		list.add("c=");
		list.add("c-");
		list.add("dz=");
		list.add("d-");
		list.add("lj");
		list.add("nj");
		list.add("s=");
		list.add("z=");
		for (int i = 0; i < list.size(); i++) {
			if(str.contains(list.get(i))) {
				str = str.replace(list.get(i), "0");
			}
		}
		bw.write(Integer.toString(str.length()));
		bw.flush();
		br.close();
		bw.close();
	}

}