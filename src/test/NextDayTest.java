package test;
import NextDay.*;

import static org.junit.Assert.*;
import org.junit.jupiter.api.DisplayName;

public class NextDayTest {

    @org.junit.Test
    @DisplayName("case 1-1-2018")
    public void getNextDay() {
        int inputDay =1 ;
        int inputMonth =1;
        int inputYear = 2018;

        String correctAnswer = "2-1-2018";

        NextDay testDay= new NextDay();
        String result = testDay.getNextDay(inputDay, inputMonth, inputYear);

        assertEquals(result,correctAnswer);
    }
    @org.junit.Test
    @DisplayName("case 31-1-2018")
    public void getNextDay1() {
        int inputDay =31 ;
        int inputMonth =1;
        int inputYear = 2018;

        String correctAnswer = "1-2-2018";

        NextDay testDay= new NextDay();
        String result = testDay.getNextDay(inputDay, inputMonth, inputYear);

        assertEquals(result,correctAnswer);
    }

    @org.junit.Test
    @DisplayName("case 30-4-2018")
    public void getNextDay2() {
        int inputDay =30 ;
        int inputMonth =4;
        int inputYear = 2018;

        String correctAnswer = "1-5-2018";

        NextDay testDay= new NextDay();
        String result = testDay.getNextDay(inputDay, inputMonth, inputYear);

        assertEquals(result,correctAnswer);
    }

    @org.junit.Test
    @DisplayName("case 28-2-2018")
    public void getNextDay3() {
        int inputDay =28 ;
        int inputMonth =2;
        int inputYear = 2018;

        String correctAnswer = "1-3-2018";

        NextDay testDay= new NextDay();
        String result = testDay.getNextDay(inputDay, inputMonth, inputYear);

        assertEquals(result,correctAnswer);
    }

    @org.junit.Test
    @DisplayName("case 29-2-2020")
    public void getNextDay4() {
        int inputDay =29 ;
        int inputMonth =2;
        int inputYear = 2020;

        String correctAnswer = "1-3-2020";

        NextDay testDay= new NextDay();
        String result = testDay.getNextDay(inputDay, inputMonth, inputYear);

        assertEquals(result,correctAnswer);
    }
    @org.junit.Test
    @DisplayName("case 31-12-2018")
    public void getNextDay5() {
        int inputDay =31 ;
        int inputMonth =12;
        int inputYear = 2018;

        String correctAnswer = "1-1-2019";

        NextDay testDay= new NextDay();
        String result = testDay.getNextDay(inputDay, inputMonth, inputYear);

        assertEquals(result,correctAnswer);
    }
}