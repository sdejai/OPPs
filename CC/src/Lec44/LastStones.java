package Lec44;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LastStones {
	public static int solution(int stones[]) {
		List<Integer> arrList = new ArrayList<Integer>();
		for (int val : stones) {
			arrList.add(val);
		}
		while (arrList.size() != 1) {
			int y = Collections.max(arrList);
			arrList.remove(Integer.valueOf(y));
			int x = Collections.max(arrList);
			arrList.remove(Integer.valueOf(x));
			int sub = y - x;
			arrList.add(sub);
		}
		int res = arrList.get(0);
		return res;
	}

	public static void main(String[] args) {
		int stones[] = { 2, 7, 4, 1, 8, 1 };
		System.out.println(solution(stones));
	}

}
