package Main;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		Scanner sc = new Scanner(System.in);
		char[] sen;
		while(sc.hasNextLine()) {
			sen = sc.nextLine().toCharArray();
			int up=0,low=0,digit=0,space=0;
			for (int i = 0; i < sen.length; i++) {
				char ch = sen[i];
				if(Character.isUpperCase(ch))
					up++;
				else if(Character.isLowerCase(ch))
					low++;
				else if(Character.isDigit(ch))
					digit++;
				else if(Character.isSpaceChar(ch))
					space++;
			}
			System.out.print(low+" "+up+" "+digit+" "+space);
			System.out.println();
		}
		
		
		bw.flush();
		br.close();
		bw.close();
	}
}
