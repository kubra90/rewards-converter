import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }


    //convert from cash to miles
    @Test
    void convert_from_cash_to_miles() {
        double cash = 100;
        int expectedResult = (int) (cash / 0.0035);
        var rewardValue = new RewardValue(cash);
        assertEquals (expectedResult,rewardValue.getMilesValue());
    }


    //convert miles to cash
    @Test
    void convert_from_miles_to_cash() {
        int miles = 10000;
        double expectedResult = miles * 0.0035;
        var rewardValue = new RewardValue(miles);
        assertEquals(expectedResult, rewardValue.getCashValue());

    }
}
