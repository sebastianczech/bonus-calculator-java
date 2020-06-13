package tdd.bonus;

class BonusCalculator {

    Integer calculateIndividualBonus(Integer sales, Integer quota, Integer commissionPercentage, Integer taxPercentage) {
        if (sales <= quota) {
            return 0;
        } else {
            return calculateBonusAfterTax(sales, quota, commissionPercentage, taxPercentage);
        }
    }

    Integer calculateTeamBonus(Integer sales, Integer quota, Integer commissionPercentage, Integer teamMembers) {
        return 0;
    }

    private Integer calculateBonusAfterTax(Integer sales, Integer quota, Integer commissionPercentage, Integer taxPercentage) {
        Integer profit = calculateProfit(sales, quota, commissionPercentage);
        Integer tax = percentageOfValue(profit, taxPercentage);
        return  profit - tax;
    }

    private int percentageOfValue(Integer value, Integer percentage) {
        return value * percentage / 100;
    }

    private int calculateProfit(Integer sales, Integer quota, Integer commissionPercentage) {
        return percentageOfValue(salesAboveQuota(sales, quota), commissionPercentage);
    }

    private int salesAboveQuota(Integer sales, Integer quota) {
        return sales - quota;
    }

}
