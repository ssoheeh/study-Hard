package Main;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

class Rank implements Comparator<Rank>{
	String schoolName;
	int alcohol;
	public Rank(String schoolName, int alcohol) {
		super();
		this.schoolName = schoolName;
		this.alcohol = alcohol;
	}
	@Override
	public int compare(Rank o1, Rank o2) {
		// TODO Auto-generated method stub
		return o2.alcohol-o1.alcohol;
	}
	
	Rank(){}
	
}

public class Main {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int t = Integer.parseInt(br.readLine());
		int n;
		List<Rank> list = new ArrayList<>();
		for (int i = 0; i < t; i++) {
			n = Integer.parseInt(br.readLine());
			for (int j = 0; j < n; j++) {
				st = new StringTokenizer(br.readLine());
				list.add(new Rank(st.nextToken(),Integer.parseInt(st.nextToken())));
			}
			Collections.sort(list, new Rank());
			bw.write(list.get(0).schoolName);
			bw.newLine();
		}
		br.close();
		bw.flush();
		bw.close();
	}


	


}
