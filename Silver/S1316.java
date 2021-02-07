package Main;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		String word;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			word = br.readLine();
			if(groupcheck(word))
				sum++;
		}
		bw.write(Integer.toString(sum));
		bw.flush();
		br.close();
		bw.close();
	}

	public static boolean groupcheck(String word) {
		// TODO Auto-generated method stub
		char[] w = word.toCharArray();
		List<Character> w1 = new ArrayList<>();
		for (int i = 0; i < word.length()-1; i++) {
			for (int j = i+1; j < word.length(); j++) {
				if(w[i]!=w[j]) {
					if(w1.indexOf(w[i])==-1) {
						w1.add(w[i]);
						i = j-1;
						break;
					}else {
						return false;
					}
				}
			}
		}	
		if(w1.indexOf(w[w.length-1])!=-1)
			return false;
		return true;
	}
}