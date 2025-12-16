package C02MethodClass;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class C07Constructor {
    public static void main(String[] args) {
//        캘린더 객체 생성
        Calendar cal = new Calendar("2025", "12", "16");
//        캘린더 객체 출력
//        cal.setYear("2025");
//        cal.setMonth("12");
//        cal.setDay("16");
        System.out.println(cal);

        //java자료구조내에 직접 만든 객체를 담아 관리
        List<Calendar> myList = new ArrayList<>();
        myList.add(cal);
        myList.add(new Calendar("2024", "01", "01"));
        System.out.println(myList);
    }
}

//    클래스명 : Calendar, 변수 : year, month, day 모두 String. 프린트메서드
class Calendar {
    private String year;  // 변수의 안정성 높이기 위해 private 선언
    private String month;
    private String day;

    //    생성자 : 객체가 만들어지는(new) 시점에 호출되는 메서드
//    생성자 특징 : 1)클래스명과 메서드명이 동일. 2)반환타입이 없음(void X)
//    생성자의 사용목적 : 객체 생성시점에 객체변수값들을 초기화(세팅). 변수의 안정성을 위해 setter사용을 지양하고 생성자를 사용
    public Calendar(String year, String month, String day) {
        this.year=year;
        this.month=month;
        this.day=day;
    }
    //직접 생성자를 1개라도 추가할경우 초기(기본)생성자는 무시가 되므로 필요시 별도로 추가
    public Calendar() {}  // 객체를 만들 때(new) 할 때 자동으로 호출되는 생성자 메서드. 이 생성자 메서드가 숨어있음 자동으로 만들어져서 호출함.

    public String getYear() {
        return year;
    }
    public String getMonth() {
        return month;
    }
    public String getDay() {
        return day;
    }

    //toString메서드는 객체명으로 출력시 자동으로 메서드가 호출
    @Override
    public String toString() {
        return "{" +
                "year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", day='" + day + '\'' +
                '}';
    }
//    public void setYear(String year) {
//        this.year = year;
//    }
//    public void setMonth(String month) {
//        this.month = month;
//    }
//    public void setDay(String day) {
//        this.day = day;
//    }

    public String returnCalendar(){
        return this.year + "년" + this.month + "월" + this.day + "일";
    }
}