import org.example.CashBackService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class TestParameterizedCashBack {
    @ParameterizedTest
    @CsvSource (value = {"1000,true,50","1000,false,10"})
    public void shouldCheckCashBack(int amount, boolean ifRegistered, int expected) {
        CashBackService CashBackService = new CashBackService();
        int actual = CashBackService.cashBackCalculation( amount, ifRegistered);
        //int expected = 50;

        Assertions.assertEquals(expected,actual);
    }
    @ParameterizedTest
    @CsvFileSource(resources = "Testdata.csv")
    public void testAllOptionsFileSource ( int  amount, boolean ifRegistered, int expected){
        CashBackService CashBackService = new CashBackService();
        int actual = CashBackService.cashBackCalculation( amount, ifRegistered);
        Assertions.assertEquals(expected,actual);

    }
}
