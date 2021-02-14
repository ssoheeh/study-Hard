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
		int k = Integer.parseInt(br.readLine());
		int[][] arr = new int[k+2][2];
		arr[0][0] = 1;
		arr[0][1] = 0;
		arr[1][0] = 0;
		arr[1][1] = 1;
		for (int i = 2; i <= k; i++) {
			for (int j = 0; j < 2; j++) {
				arr[i][j] = arr[i-2][j]+arr[i-1][j];
			}
		}
		System.out.println(arr[k][0]+" "+arr[k][1]);
		br.close();
		bw.flush();
		bw.close();
	}

}
