package Main;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		StringTokenizer st;
		List<Integer> seq = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		Map<Integer,Integer> map = new HashMap<>();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(st.nextToken());
			seq.add(a);
			if(map.containsKey(a))
				map.put(a, map.get(a)+1);
			else
				map.put(a, 1);
		}
		List<Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
		Collections.sort(list, new Comparator<Entry<Integer,Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				// TODO Auto-generated method stub
				if(o1.getValue()==o2.getValue()) {
					return seq.indexOf(o1.getKey())-seq.indexOf(o2.getKey());
				}
				return o2.getValue()-o1.getValue();
			}
		});
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.get(i).getValue(); j++) {
				bw.write(Integer.toString(list.get(i).getKey())+" ");
			}
		}
		bw.flush();
		br.close();
		bw.close();
	}

}