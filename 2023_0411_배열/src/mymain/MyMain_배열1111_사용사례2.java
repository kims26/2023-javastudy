package mymain;

import java.util.Scanner;

public class MyMain_배열1111_사용사례2 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		// TODO Auto-generated method stub
int year1 = 0;
String tti = null;
//System.out.print("출생년도");
//
//    year =scanner.nextInt();
    
    
    
    int age = 2023-year1;
    //띠 구하기
    //12지
    //4  5 6  7 8 9 10 11 0 1  2  3  <= 출생년도 %12(0~11)
    //자 축 인 묘 진 사 오 미 신 유 술 해
    //쥐 소 범 토 용 뱀 말 양 원 닭 개 돼
    
    //띠 배열  
    		String[] tti_array = {"원숭이", "닭", "개", "돼", "쥐", "소", "범", "토", "용", "뱀", "말", "양"};
            
            
           
            System.out.print("출생년도를 입력하세요: ");
            int year11 =scanner.nextInt();
            
            
            int tti_index = year11 % 12;
            String tti1 = tti_array[tti_index];
            System.out.println(year11 + "년 출생자 띠는 " + tti1 + "입니다.");
            
    
 
    

    
//    switch(year11%12) 
//    {
//    case 0: tti1="원숭이";	break;
//    case 1: tti1="닭";	break;
//    case 2: tti1="개";	break;
//    case 3: tti1="돼지";	break;
//    case 4: tti1="쥐";	break;
//    case 5: tti1="소";	break;
//    case 6: tti1="범";	break;
//    case 7: tti1="토끼";	break;
//    case 8: tti1="용";	break;
//    case 9: tti1="뱀";	break;
//    case 10: tti1="말";	break;
//    case 11: tti1="양";	break;
//    		
//    }


//    	System.out.printf("나이:,%d(살)\n",age);
//    	System.out.printf("띠:%s(띠)\n",tti1);

    		scanner.close();
	}

}
