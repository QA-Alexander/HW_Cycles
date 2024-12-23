package  ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcServiceTest {
    @Test
    public void CalculateIfEarnTenThousands() {
        CalcService service = new CalcService();

        int income = 10000;
        int expenses = 3000;
        int treshold = 20000;
        int expected = 3;

        int actual = service.calculate(income, expenses, treshold);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void CalculateIfEarnHundredThousands () {
        CalcService service = new CalcService();

        int income = 100000;
        int expenses = 60000;
        int treshold = 150000;
        int expected = 2;

        int actual = service.calculate(income, expenses, treshold);
        Assertions.assertEquals(expected,actual);
    }
}
