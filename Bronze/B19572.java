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
		double d1,d2,d3;
		st = new StringTokenizer(br.readLine());
		d1 = Double.parseDouble(st.nextToken());
		d2 = Double.parseDouble(st.nextToken());
		d3 = Double.parseDouble(st.nextToken());
		double a,b,c;
		b = (d1-d2+d3)/2;
		a = d1-b;
		c = d2 - a;
		if(a<=0||b<=0||c<=0)
			System.out.println("-1");
		else {
			System.out.println("1");
			System.out.println(a+" "+b+" "+c);
		}
			
		br.close();
		bw.flush();
		bw.close();
	}

}