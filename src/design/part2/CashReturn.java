package design.part2;

public class CashReturn extends CashSuper {
    private double moneyCondition = 0;
    private double moneyReturn = 0;

    // 满减活动，初始化时需要输入返利条件和返利值
    // 如：满300返100则，moneyCondition=300，moneyReturn=100
    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if (money >= moneyCondition) {
            result = money - (int) (money / moneyCondition) * moneyReturn;
        }
        return result;
    }
}
