package java;


public class IncomeTaxCalculator {
    public static double calculateTax(double income) {
        double tax = 0.0;
        // 简化的个人所得税计算规则示例
        if (income > 50000) {
            tax = (income - 50000) * 0.2;
        } else if (income > 30000) {
            tax = (income - 30000) * 0.15;
        } else if (income > 10000) {
            tax = (income - 10000) * 0.1;
        }
        return tax;
    }
}

