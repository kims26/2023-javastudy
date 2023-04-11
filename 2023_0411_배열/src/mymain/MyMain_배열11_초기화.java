package mymain;

import java.util.Arrays;

import myutil.MyArrays;

public class MyMain_배열11_초기화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		
		//배열 초기화시에는 갯수부분 생략
		int []mr = new int [] {1,3,5,7,9};
		
		MyArrays.display_arrays(mr);
		
		int [] nr = {5,4,3,2,1};
		MyArrays.display_arrays(nr);
		
		//Ascending sort(오름차순 정렬)
		Arrays.sort(nr);
		MyArrays.display_arrays(nr);
		
		//Descending sort(내림차순 정렬)
		
		
//		
//		// 정수형 배열 nr을 내림차순으로 정렬
//		MyArrays.sort_desc(nr);
//		MyArrays.display_arrays(nr);
//
//		
		

	}

}
