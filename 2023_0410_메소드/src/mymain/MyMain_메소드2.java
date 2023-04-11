package mymain;

import myutil.MyLine;

public class MyMain_메소드2 {
	
	

	public static void main(String[] args) {		// TODO Auto-generated method stub
		int line_len=42;
		
		System.out.printf("%20s\n","[성적처리]");
		
		MyLine.draw_line('=',line_len);
		System.out.println("번호 이름   국어 영어 수학 총점 평균");
		
		MyLine.draw_line('=',line_len);
		System.out.println("1   임길동  88  99  77 257");
		System.out.println("1   임길동  98  89  97 267");
		System.out.println("1   임길동  88  79  77 247");
		
		MyLine.draw_line(line_len);
		System.out.println("소계                   ");
		MyLine.draw_line(line_len);
		
		MyLine.draw_line("*~~",line_len/3);
		
		{
			MyLine.draw_line('*', 1, '-', 3, 42);
			MyLine.draw_line('*', 2, '-', 2, 42);
			MyLine.draw_line('*', 3, '-', 1, 42);
	    }
	
		
		
		

	}
	
	}


