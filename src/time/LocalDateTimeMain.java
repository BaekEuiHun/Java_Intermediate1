package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime nowDate = LocalDateTime.now();
        System.out.println("현재 날짜 시간 : " + nowDate);
        LocalDateTime myDate = LocalDateTime.of(2020, 1, 1, 8, 9, 10);
        System.out.println("지정 날짜 시간 : " + myDate);

        //날짜와 시간 분리

        LocalDate localDate = myDate.toLocalDate();
        LocalTime localTime = myDate.toLocalTime();
        System.out.println("localTime = " + localTime);
        System.out.println("localDate = " + localDate);

        //계산 (불변)
        LocalDateTime ofDtPlus = myDate.plusDays(1000);
        System.out.println("지정날짜 + 1000일 = " + ofDtPlus);

    }
}
