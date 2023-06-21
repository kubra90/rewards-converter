public class RewardValue {


    private double cash;
    private int valueInMiles;
    //it has two constructors one that accepts a cash value and one that accepts a value in miles.
    public RewardValue(double cash) {
        this.cash = cash;
    };

    public RewardValue(int valueInMiles) {
        this.valueInMiles = valueInMiles;
    }
}
