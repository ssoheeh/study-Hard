package Main;

import java.io.*;
import java.util.*;

class Ans implements Comparator<Ans>{
	int sum;
	int ans;

	public Ans(int sum, int ans) {
		super();
		this.sum = sum;
		this.ans = ans;
	}
	public Ans() {

	}
	@Override
	public int compare(Ans o1, Ans o2) {
		// TODO Auto-generated method stub
		if(o1.sum==o2.sum)
			return o1.ans-o2.ans;
		else
			return o1.sum-o2.sum;
	}


}
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int sum = 0;
		List<Ans> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			sum = 0;
			for (int j = 0; j < n; j++) {
				sum += Math.abs(arr[i]-arr[j]);
			}
			list.add(new Ans(sum,arr[i]));
		}
		Collections.sort(list, new Ans());
		System.out.println(list.get(0).ans);

		bw.flush();
		br.close();
		bw.close();
	}
}