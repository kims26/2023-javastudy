package myutil;

public class MyMath {
	
	public static int plus(int a, int b) {
		return a+b;
	}
	
	public static int minus(int a, int b) {
		return a-b;
	}
	public static int multply(int a, int b) {
		return a*b;
	}
	public static int divide(int a, int b) {
		//젯수가 0이면 결과값을 0을 반환
		
		return (b==0) ?0 : a/b;
	}
	
	//n까지의 합 
	public static int hap(int n) {
		int sum =0;
		for(int i=0; i<=n;i++) {
			sum =sum +i;
			
		}
		
		return sum;
	}
	//2수중 큰수 구하기
	public static int max(int a,int b) {
		
		return (a>b)? a:b;
	
	}
	//3수중에 큰수 구하기
	public static int max(int a, int b,int c) {
		//2수를 먼저비교
		int big = a>b?a:b;
		//int big = max(a,b);
		
		return 0;
	}
	//절대값 구하기
	public static int abs(int n) {
		
		return (n<0)? -n :n;
	}
	
	//팩토리얼 구하기 :4! =4*3*2*1
	public static double factorial(int n) {
		
		    int result = 1;
		    for (int i = n; i >= 1; i--) 
		    {
		        result *= i;
		    }
		    return result;
		}

	
	
	//배수의 합
	// int result = MyMath.hap(10,3):=>0+3+6+9
	// int result = MyMath.hap(10,4):=>0+4+8
	
	public static int hap(int n,int baesu) {
		    int sum = 0;
		    for (int i = baesu; i < n; i += baesu) {
		        sum += i;
		    }
		    return sum;
		    }

		
	
	//누적승 구하기: n s m승 구하기
	//result = MyMath.pow(2,3); => 2*2*2
	
	public static double pow(int n,int m) {
		
		    double result = 1;
		    for (int i = 0; i < m; i++) {
		        result *= n;
		    }
		    return result;
		}

	}
	
