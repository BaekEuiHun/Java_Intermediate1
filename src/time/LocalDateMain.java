package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        System.out.println("오늘 날짜 : " + nowDate);
        LocalDate myDate = LocalDate.of(2020, 1, 1);
        System.out.println("지정 날짜 : " + myDate);


    }


}
