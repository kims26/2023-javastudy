package mymain;

import myutil.MyMath;

public class Mymain_메소드1 {
	
	
public static int plus(int a,int b) {
	int c = a+b;
	return c;
}

	public static void main(String[] args) {
		
		int x 	=10;
		int	y	=5;
		int res;
		
//	    res= Mymain_메소드1.plus(x,y);
		
//		같은 클래스 영역에 있을경우 클래스명은 생략가능
	    res= plus(x,y);
	    System.out.printf("%d+%d=%d\n",x,y,res);
	    
	    //myutil.MyMath를 사용해서 연산
//	    res = MyMain_메소드1.plus(x,y);
	    
	    //같은 클래스영역에 있을경우 클래스명은 
		
	    
	   res =MyMath.hap(x);
	   
	   System.out.printf("%d까지의합:%d\n",x,res);
	   
	   x=10;
	   y=5;
	   res=MyMath.max(x, y);
	   
	   
	   double res1 = MyMath.factorial(y);
	   System.out.println(res1);
	   
	   
	   int res2 = MyMath.hap(12);
	   System.out.println(res2);
	   
	   double res3 = MyMath.pow(10, 5);
	   System.out.println(res3);
	   
	   
	   

	}

}
