package Main;

import java.io.*;
import java.util.*;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int m = Integer.parseInt(br.readLine());
		List<Short> list = new ArrayList<>();
		List<Short> alllist = new ArrayList<>();
		for (short i = 1; i <= 20; i++) {
			alllist.add(i);
		}
		String s;
		short num=0;
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			s = st.nextToken();
			if(st.hasMoreTokens())
				num = Short.parseShort(st.nextToken());
			switch(s) {
			case "add":
				list.add(num);
				break;
			case "remove":
				if(list.contains(num))
					list.remove(list.indexOf(num));
				break;
			case "check":
				if(list.contains(num))
				{	
					bw.write("1");
					bw.newLine();
				}
				else
				{
					bw.write("0");
					bw.newLine();
				}
				break;
			case "toggle":
				if(list.contains(num))
					list.remove(list.indexOf(num));
				else
					list.add(num);
				break;
			case "all":
				list.clear();
				list.addAll(alllist);
				break;
			case "empty":
				list.clear();
				break;
			}
		}
		br.close();
		bw.flush();
		bw.close();
	}

}