package mymain;

import java.util.Random;

public class MyMain_배열111_사용사례 {

	public static void main(String[] args) {
		
		int [] month_array = {31,28,31,30,31,30,31,30
				,31,30,31,
		};
		//난수발생 객
		Random random = new Random();
		
		//                nextint(bound) : bound<-경우의 수
		//                범위 : 0~(bound-1)
		int month =random.nextInt(2)+1; // 0~11 +1-> 1~12
		
		int lastday = month_array[month-1];
		
		System.out.printf("[%d]월의 마지막날은 [%d]입니다 \n",
				            month,       lastday
				);
	}

}
