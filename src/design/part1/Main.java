package design.part1;

import java.util.Scanner;

/**
 * Part1: 简单工场模式
 */
public class Main {

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("请输入数字A：");
            double numberA = input.nextDouble();
            System.out.println("请输入运算符号（+、-、*、/）：");
            String strOperate = input.next();
            System.out.println("请输入数字B：");
            double numberB = input.nextDouble();

            // 使用简单工厂模式
            Operation operation;
            operation = OperationFactory.createOperate(strOperate);
            operation.setNumberA(numberA);
            operation.setNumberB(numberB);
            double result = operation.GetResult();
            System.out.println("结果是：" + result);
        } catch (Exception e) {
            System.out.println("您输入的有误：" + e.getMessage());
        }
    }
}
