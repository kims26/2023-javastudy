package myutil;

public class calender {
	//특정 년, 월, 일에 해당하는 요일
    public static int display_DayOfWeek(int year, int month, int day) {
        int[] t = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        if (month < 3) {
            year -= 1;
        }
        int dayOfWeek = (year + year/4 - year/100 + year/400 + t[month-1] + day) % 7;
        return dayOfWeek;
    }
    
    //특정 년, 월의 마지막 날짜
    public static int display_LastDayOfMonth(int year, int month) {
        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month-1];
    }
    
    //윤년인지 판별
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
    
    //달력 출력
    public static void display_printCalendar(int year, int month, int dayOfWeek, int lastDay) {
        System.out.println(year + "년 " + month + "월");
        System.out.println("일  월  화  수  목  금  토");
        for (int i = 0; i < dayOfWeek; i++) {
            System.out.print("   ");
        }
        for (int i = 1; i <= lastDay; i++) {
            System.out.printf("%2d ", i);
            if ((i + dayOfWeek) % 7 == 0) {
                System.out.println();
            }
        }
    }
}

