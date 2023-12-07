public class RewardValue {
    private double cashValue;
    private int milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = (int) (cashValue / 0.0035);
    }

    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
        return milesValue;
    }

    public static void main(String[] args) {
        RewardValue cashReward = new RewardValue(50.0);
        RewardValue milesReward = new RewardValue(100);

        System.out.println("Cash Reward: $" + cashReward.getCashValue());
        System.out.println("Miles Reward: " + milesReward.getMilesValue() + " miles");
    }
}
