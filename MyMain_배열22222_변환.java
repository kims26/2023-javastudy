package mymain;

import myutil.MyArrayChange;
import myutil.MyArrays2;

public class MyMain_배열22222_변환 {

	public static void main(String[] args) {
		
		
		int [][] src =new int[5][5];
		
		MyArrays2.set(src);
		
		System.out.println("---[원본]---");
		MyArrays2.display_array(src);
		
		//오른쪽 90도 회전시키기
		int [][] dest = MyArrayChange.rotate_right_90(src);
		System.out.println("---[Rotage Right 90]---");
		MyArrays2.display_array(dest);
		
		//좌우 뒤집기
		 dest = MyArrayChange.flip_left_right(src);
	        System.out.println("---[Flip Left-Right]---");
	        MyArrays2.display_array(dest);

		//180도 회전시키기
		  dest = MyArrayChange.rotate_180(src);
	        System.out.println("---[Rotate 180]---");
	        MyArrays2.display_array(dest);
	        
	        //대각 뒤집기
	        
	        dest = MyArrayChange.flip_up_down(src);
	        System.out.println("---[flip_up_down]---");
	        MyArrays2.display_array(dest);
	        
	        //역대각뒤집기
	        
	        dest = MyArrayChange.flip_diagonal2(src);
	        System.out.println("---[flip_diagonal2]---");
	        MyArrays2.display_array(dest);
	    }
	
	
		
		
	

	}


