package Silver;

import java.io.*;
import java.util.*;

//반복문 안에서 확인계속 -> 메모리 

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		String num = Integer.toString(n);
		StringBuffer sb = new StringBuffer();
		for (int i = 1; i <= n; i++) {
			sb.append(i);
		}
		bw.write(Integer.toString(sb.indexOf(num)+1));
		bw.flush();
		br.close();
		bw.close();
	}
}
