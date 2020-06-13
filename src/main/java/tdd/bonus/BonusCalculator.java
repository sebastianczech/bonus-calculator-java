package tdd.bonus;

class BonusCalculator {

    private static final Integer COMMISSION_PERCENTAGE = 10;
    private static final Integer TAX_PERCENTAGE = 10;

    public Integer calculateIndividualBonus(Integer sales, Integer quota) {
        if (sales <= quota) {
            return 0;
        } else {
            return calculateBonusAfterTax(sales, quota);
        }
    }

    private Integer calculateBonusAfterTax(Integer sales, Integer quota) {
        Integer profit = profit(sales, quota);
        Integer tax = percentageOfValue(profit, BonusCalculator.TAX_PERCENTAGE);
        return  profit - tax;
    }

    private int percentageOfValue(Integer value, Integer percentage) {
        return value * percentage / 100;
    }

    private int profit(Integer sales, Integer quota) {
        return percentageOfValue(salesAboveQuota(sales, quota), BonusCalculator.COMMISSION_PERCENTAGE);
    }

    private int salesAboveQuota(Integer sales, Integer quota) {
        return sales - quota;
    }

}
