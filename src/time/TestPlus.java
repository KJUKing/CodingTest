package time;

import java.time.LocalDateTime;

/**
 2024년 1월 1일 0시 0분 0초에 1년 2개월 3일 4시간 후의 시각을 찾아라.
 */
public class TestPlus {

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2024, 1, 1, 0, 0, 0);
        LocalDateTime futureDateTime =
                dateTime.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);
        System.out.println("기준 시각 :" + dateTime);
        System.out.println("1년 2개월 3일 4시간 후의 시각 : " + futureDateTime);

        LocalDateTime dateTime2 = LocalDateTime.now();
        LocalDateTime futureDateTime2 = dateTime2.plusYears(1).plusMonths(2).plusDays(3).plusHours(4);
        System.out.println("지금 시간 : "+ dateTime2);
        System.out.println("지금 시간에서부터의 추가시간 : " + futureDateTime2);
    }
}
