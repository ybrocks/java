package C02MethodClass;

import java.util.ArrayList;
import java.util.List;

public class C00Practice {
    public static void main(String[] args) {
        //객체생성 : 생성자에서 year/month/day 세팅
        MyCalendar cal = new MyCalendar("2025", "12", "16");
        System.out.println(cal); //toString 자동호출

        //객체를 List에 추가
        List<MyCalendar> myList = new ArrayList<>();
        myList.add(cal); //객체 추가
        myList.add(new MyCalendar("2024", "01", "01")); //새 객체 생성/추가
        System.out.println(myList); //toString 자동호출
        System.out.println(cal.returnMyCalendar()); //출력하고싶은 포맷 설정가능
    }
}
//두번째 클래스 선언
    class MyCalendar{
        private String year;
        private String month;
        private String day;

        //객체(생성자)생성 및 값 초기화
        public MyCalendar(String year, String month, String day){
            this.year = year;
            this.month = month;
            this.day = day;
        }
        public MyCalendar(){}

        @Override
        public String toString() {
            return "{" +
                    "year='" + year + '\'' +
                    ", month='" + month + '\'' +
                    ", day='" + day + '\'' +
                    '}';
        }
        public String returnMyCalendar(){
            return year+"년 "+month+"월 "+day+"일";
        }
    }
