package Main;

import java.io.*;
import java.util.*;


public class Main {
	public static int sum = 0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;	
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		boolean[] arr = new boolean[n+1];
		for (int i = 1; i <= n; i++) {
			if(Integer.parseInt(st.nextToken())==1)
				arr[i] = true;
			else
				arr[i] = false;
		}
		int t = Integer.parseInt(br.readLine());
		int s,idx;
		for (int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			s = Integer.parseInt(st.nextToken());
			idx = Integer.parseInt(st.nextToken());
			if(s==1) {
				for (int j = idx; j < n+1; j+=idx) {
					arr[j] = !arr[j];
				}
			}else {
				if(idx==1||idx==n||arr[idx-1]!=arr[idx+1]) {
					arr[idx] = !arr[idx];
				}else {
					arr[idx] = !arr[idx];
					int right = idx+1;
					int left = idx-1;
					while(right<=n&&left>0) {
						if(arr[right]==arr[left]) {
							arr[right] = !arr[right];
							arr[left] = !arr[left];
							right++;
							left--;
						}else
							break;
					}

				}
			}
		}
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if(arr[i]==true)
				bw.write("1 ");
			else
				bw.write("0 ");
			sum++;
			if(sum%20==0)
				bw.newLine();
			}
		br.close();
		bw.flush();
		bw.close();
	}	
}