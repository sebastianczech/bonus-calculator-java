package tdd.bonus;

class BonusCalculator {

    Double calculateIndividualBonus(Integer sales, Integer quota, Double commissionPercentage, Double taxPercentage) {
        if (sales <= quota) {
            return 0.0;
        } else {
            return calculateBonusAfterTax(sales, quota, commissionPercentage, taxPercentage);
        }
    }

    Double calculateTeamBonus(Integer sales, Integer quota, Double commissionPercentage, Integer teamMembers) {
        if (sales <= quota) {
            return 0.0;
        } else {
            return calculateProfit(sales, quota, commissionPercentage) / teamMembers;
        }
    }

    private Double calculateBonusAfterTax(Integer sales, Integer quota, Double commissionPercentage, Double taxPercentage) {
        Double profit = calculateProfit(sales, quota, commissionPercentage);
        Double tax = profit * taxPercentage;
        return profit - tax;
    }

    private Double calculateProfit(Integer sales, Integer quota, Double commissionPercentage) {
        return (sales - quota) * commissionPercentage;
    }

}
