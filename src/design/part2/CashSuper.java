package design.part2;

public abstract class CashSuper {
    private double txtPrice = 0;
    private int txtNum = 0;

    public double getTxtPrice() {
        return txtPrice;
    }

    public void setTxtPrice(double txtPrice) {
        this.txtPrice = txtPrice;
    }

    public int getTxtNum() {
        return txtNum;
    }

    public void setTxtNum(int txtNum) {
        this.txtNum = txtNum;
    }

    public abstract double acceptCash(double money);
}
