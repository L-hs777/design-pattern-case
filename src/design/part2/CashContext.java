package design.part2;

public class CashContext {
    private CashSuper cs = null;

    public CashContext(int type) {
        // 传入参数从具体的策略对象改为收费类型，将工厂模式和策略模式相结合
        switch (type) {
            // 正常收费
            case 1:
                cs = new CashNormal();
                break;
            // 满300返100
            case 2:
                cs = new CashReturn(300, 100);
                break;
            // 打8折
            case 3:
                cs = new CashRebate(0.8);
                break;
        }
    }

    public double GetResult(double money) {
        return cs.acceptCash(money);
    }
}
