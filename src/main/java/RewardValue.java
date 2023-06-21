public class RewardValue {


    private double cash;
    private int valueInMiles;
    //it has two constructors one that accepts a cash value and one that accepts a value in miles.
    public RewardValue(double cash) {
        this.cash = cash;
        this.valueInMiles = (int) (cash / 0.0035);
    };

    public RewardValue(int valueInMiles) {
        this.valueInMiles = valueInMiles;
        this.cash = valueInMiles * 0.0035;
    }

    //getCashValue
    public double getCashValue(){
        return cash;
    }

    public int getMilesValue(){
        return valueInMiles;
    }
}
