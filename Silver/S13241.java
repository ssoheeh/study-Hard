package Main;

import java.io.*;
import java.util.*;



public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		if(a>b&&a%b==0)
			bw.write(Long.toString(a));
		else if(a<b&&b%a==0)
			bw.write(Long.toString(b));
		else {
			long ans = gcd(a,b);
			if(ans==1)
				bw.write(Long.toString(a*b));
			else {
				bw.write(Long.toString(ans*(a/ans)*(b/ans)));
			}
		}

		bw.flush();
		br.close();
		bw.close();
	}

	private static long gcd(long a, long b) {
		// TODO Auto-generated method stub
		if(a<b) {
			long temp = a;
			a = b;
			b = temp;
		}
		if(a%b==0)
			return b;
		else
			return gcd(b,a%b);
	}


}