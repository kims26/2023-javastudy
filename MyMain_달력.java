//년도 월 입력받는다 (2023-4)
//년도/월의 1일에 해당되는 요일 구한다
//yoil=6
//해당월의 마지막날까지 채우기
package mymain;

import java.util.Scanner;

import myutil.calender;


public class MyMain_달력 {

	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in); 
        
        //년도와 월을 입력받음
        System.out.print("년도를 입력하세요(YYYY): ");
        int year = scanner.nextInt();
        
        
        
        System.out.print("월을 입력하세요(MM): ");
        int month = scanner.nextInt();
        
        //해당 월의 1일에 해당되는 요일 
        int dayOfWeek = calender.display_DayOfWeek(year, month,1);
        calender.display_DayOfWeek(year, month, dayOfWeek);
        
        
        //해당 월의 마지막 날짜 
        int lastDay = calender.display_LastDayOfMonth(year, month);
        calender.display_LastDayOfMonth(year, month);
        
        //달력 출력
        
        calender.display_printCalendar(year, month, dayOfWeek, lastDay);
       ;
        
        scanner.close();
    }

	
	
	
}
////년도 월 입력받는다 (2023-4)
////년도/월의 1일에 해당되는 요일 구한다
////yoil=6
////해당월의 마지막날까지 채우기
//
///년도 월 입력받는다 (2023-4)
////년도/월의 1일에 해당되는 요일 구한다
////yoil=6
////해당월의 마지막날까지 채우기
//package mymain;
//
//import java.util.Scanner;
//
//import myutil.calender;
//
//public class MyMain_달력 {
//
// public static void main(String[] args) {
//
//    Scanner scanner = new Scanner(System.in);
//
//    // 년도와 월을 입력받음
//    System.out.print("년도를 입력하세요(YYYY): ");
//    int year = scanner.nextInt();
//
//    System.out.print("월을 입력하세요(MM): ");
//    int month = scanner.nextInt();
//
//    // 해당 월의 1일에 해당되는 요일
//    //int dayOfWeek = display_DayOfWeek(year, month);
//    int dayOfWeek = calender.display_DayOfWeek(year, month,1);
//    calender.display_DayOfWeek(year, month, dayOfWeek);
//
//    // 해당 월의 마지막 날짜
//    int lastDay = calender.display_LastDayOfMonth(year, month);
//    calender.display_LastDayOfMonth(year, month);
//
//    // 달력 출력
//    calender.display_printCalendar(year, month, dayOfWeek, lastDay);
//
//    scanner.close();
// }
// 
// 
// 
//
//}
////년도 월 입력받는다 (2023-4)
////년도/월의 1일에 해당되는 요일 구한다
////yoil=6
////해당월의 마지막날까지 채우기
//
//


