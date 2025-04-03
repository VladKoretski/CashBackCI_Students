import org.example.CashBackService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCashBack {

    @Test
    public void shouldCheckRegistredUnderLimit() {
        CashBackService CashBackService = new CashBackService();
            int actual = CashBackService.cashBackCalculation( 5_000, true);
            int expected = 250;

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldCheckUnregistredUnderLimit() {
        CashBackService CashBackService = new CashBackService();
        int actual = CashBackService.cashBackCalculation( 5_000, false);
        int expected = 50;

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldCheckRegistredOverLimit() {
        CashBackService CashBackService = new CashBackService();
        int actual = CashBackService.cashBackCalculation( 25_000, true);
        int expected = 1000;

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldCheckUnregistredOverLimit() {
        CashBackService CashBackService = new CashBackService();
        int actual = CashBackService.cashBackCalculation( 110_000, true);
        int expected = 1000;

        Assertions.assertEquals(expected,actual);
    }

}
