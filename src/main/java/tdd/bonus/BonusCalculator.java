package tdd.bonus;

class BonusCalculator {

    Double calculateIndividualBonus(Integer sales, Integer quota, Double commissionPercentage, Double taxPercentage) {
        if (sales <= quota) {
            return 0.0;
        } else {
            return calculateBonusAfterTax(sales, quota, commissionPercentage, taxPercentage);
        }
    }

    Double calculateIndividualBonus(Integer sales, Integer quota, Integer commissionPercentage, Integer taxPercentage) {
        return calculateIndividualBonus(sales, quota, Double.valueOf(commissionPercentage) / 100, Double.valueOf(taxPercentage) / 100);
    }

    Double calculateTeamBonus(Integer sales, Integer quota, Double commissionPercentage, Integer teamMembers) {
        if (sales <= quota) {
            return 0.0;
        } else {
            return calculateProfit(sales, quota, commissionPercentage) / teamMembers;
        }
    }

    Double calculateTeamBonus(Integer sales, Integer quota, Integer commissionPercentage, Integer teamMembers) {
        return calculateTeamBonus(sales, quota, Double.valueOf(commissionPercentage) / 100, teamMembers);
    }

    private Double calculateBonusAfterTax(Integer sales, Integer quota, Double commissionPercentage, Double taxPercentage) {
        Double profit = calculateProfit(sales, quota, commissionPercentage);
        Double tax = calculateTax(taxPercentage, profit);
        return profit - tax;
    }

    private double calculateTax(Double taxPercentage, Double profit) {
        return profit * taxPercentage;
    }

    private Double calculateProfit(Integer sales, Integer quota, Double commissionPercentage) {
        return (sales - quota) * commissionPercentage;
    }

}
