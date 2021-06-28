package design.part2;

public class CashRebate extends CashSuper {
    private double moneyRebate = 1d;

    // 打折收费初始化折扣率
    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
