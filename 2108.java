package Main;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		int n = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<>();
		double sum = 0;
		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(br.readLine()));
			sum += list.get(i);
		}
		Collections.sort(list);
		Set<Integer> set = new HashSet<>();
		set.addAll(list);
		List<Integer> same = new ArrayList<Integer>();
		same.addAll(set);
		Collections.sort(same);
		bw.write(Integer.toString(Math.floorDiv((int)sum, n)));
		bw.newLine();
		bw.write(Integer.toString(list.get(list.size()/2)));
		bw.newLine();
		if(n==1) {
			bw.write(Integer.toString(list.get(0)));
			bw.newLine();
		}
		int max = 1;
		int check = 0;
		int check2 = 0;
		int idx = 0;
		for (int i = 0; i < same.size(); i++) {
			int num = same.get(i);
			int fre = list.lastIndexOf(num)-list.indexOf(num)+1;
			if(max==fre&&fre==1) {
				max = fre;
				check++;
			}else if(max==fre&&idx!=0) {
				max = fre;
				idx = i;
				bw.write(Integer.toString(same.get(idx)));
				bw.newLine();
				check2++;
				break;
			}
			else if(max<fre) {
				max = fre;
				idx = i;		
			}	
			if(check>=2) {
				bw.write(Integer.toString(same.get(i)));
				bw.newLine();
				break;
			}
		}	
		if(check==0&&check2==0) {
			bw.write(Integer.toString(same.get(idx)));
			bw.newLine();			
		}
		bw.write(Integer.toString(list.get(list.size()-1)-list.get(0)));
		bw.flush();
		br.close();
		bw.close();
	}
}
