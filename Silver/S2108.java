package Main;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

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
		bw.write(Integer.toString((int)Math.round(sum/n)));
		bw.newLine();
		bw.write(Integer.toString(list.get(n/2)));
		bw.newLine();
		if(n==1) {
			bw.write(Integer.toString(list.get(0)));
			bw.newLine();
		}
		else {
			int[] fre = new int[8001];
			for (int i = 0; i < n; i++) {
				fre[list.get(i)+4000]++;
			}
			int maxfre=0,maxidx=0;
			for (int i = 0; i < 8001; i++) {
				if(fre[i]>maxfre)maxfre = fre[i];
			}
			boolean check = false;
			for (int i = 0; i < 8001; i++) {
				if(fre[i]==maxfre) {
					if(check) {
						maxidx = i-4000;
						break;
					}
					maxidx = i-4000;
					check = true;
				}
			}
			bw.write(Integer.toString(maxidx));
			bw.newLine();
		}
		
		bw.write(Integer.toString(list.get(list.size()-1)-list.get(0)));
		bw.flush();
		br.close();
		bw.close();
	}
}