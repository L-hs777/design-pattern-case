package design.part2;

import java.util.Scanner;

/**
 * Part2: 策略模式
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 总费用，通过打折、满减等优惠之后的实际付费
        double total = 0;
        System.out.println("单价：");
        double txtPrice = input.nextDouble();
        System.out.println("数量：");
        int txtNum = input.nextInt();
        System.out.println("1.正常收费；2.满300返100；3.打8折");
        System.out.println("收费标准：");
        int type = input.nextInt();
        double totalPrice = txtPrice * txtNum;

        // 策略模式
        CashContext cc = new CashContext(type);
        // 总费用为多种商品叠加，此处由于测试时只有一种商品，所以实际费用即为当前商品打折之后的价格
        total = total + cc.GetResult(totalPrice);

        System.out.println("单价：" + txtPrice + "数量：" + txtNum + "合计：" + totalPrice + "总费用：" + total);
    }
}
