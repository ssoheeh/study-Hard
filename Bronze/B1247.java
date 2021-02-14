package Main;

import java.io.*;
import java.math.BigInteger;
import java.util.*;


public class Main {
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int n;
		BigInteger a;
		BigInteger sum;
		for (int i = 0; i < 3; i++) {
			n = sc.nextInt();
			sum = BigInteger.ZERO;
			for (int j = 0; j < n; j++) {
				a = sc.nextBigInteger();
				sc.nextLine();
				sum = sum.add(a);
			}	
			if(sum.signum()<0)
				bw.write("-");
			else if(sum.signum()>0)
				bw.write("+");
			else
				bw.write("0");
			bw.newLine();
		}
		br.close();
		bw.flush();
		bw.close();
	}

	
	
}
