package Main;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int re = rev(x)+rev(y);
		bw.write(Integer.toString(rev(re)));
		bw.flush();
		br.close();
		bw.close();
	}

	public static int rev(int n) {
		// TODO Auto-generated method stub
		int len = Integer.toString(n).length();
		int temp = 0;
		for (int i = 0; i < len; i++) {
			temp += n/(int)Math.pow(10, len-i-1)*(int)Math.pow(10, i);
			n %= (int)Math.pow(10, len-i-1);
		}
		return temp;
	}

}
