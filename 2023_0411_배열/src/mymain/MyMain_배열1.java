package mymain;

import java.util.Arrays;

import myutil.MyArrays;

public class MyMain_배열1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int [] mr = new int [4];
	
	System.out.printf("mr's length:%d(개)n",
	                       mr.length);
	//배열의 요소 에 값을 넣기
			mr[0]=1;
			mr[1]=2;
			mr[2]=3;
			mr[3]=4;
			
			//출력:일괄처리
			System.out.println("---[첨자를 이용]---");
			for(int i =0; i<mr.length; i++) {//i=0 1 2 3
			System.out.printf("mr[%d]:%d\n",i, mr[i]);
			
			}
			//              0 1 2 3 <-첨자
			//int []  mr ={ 1,2,3,4}
		System.out.println("---[개선 loop(JDK5.0 later)]---");
		//for(임시변수:배열)
		for(int m:mr) {
			System.out.println(m);
		}
		MyArrays.display_arrays(mr);
		
		//기존Java API :Arrays
		Arrays.fill(mr, 0);
		System.out.println("---[Arrays.fill(mr,0]---)");
		MyArrays.display_arrays(mr);
		
		//내가 만든 API
		Arrays.fill(mr, 1);
		System.out.println("---[Arrays.fill(mr,0]---)");
		MyArrays.display_arrays(mr);
		
		// 0 1 2 3 <-첨자
		// 1 5 5 1
		//        fromIndex toIndex value

		Arrays.fill(mr,1,3,5);
		MyArrays.display_arrays(mr);
		
		//새 배열 생성
		int [] nr =new int [10];
		MyArrays.display_arrays(nr);
		
		//순서대로 값을 부여
		MyArrays.set(nr);
		MyArrays.display_arrays(nr);
	
		
	}

}
