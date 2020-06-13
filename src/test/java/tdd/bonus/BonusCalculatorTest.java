package tdd.bonus;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BonusCalculatorTest {

    @Test
    void should_calculate_no_bonus_if_sales_is_below_quota() {
        // given
        BonusCalculator bonusCalculator = new BonusCalculator();

        // when
        Integer bonus = bonusCalculator.calculateIndividualBonus(13000, 15000);

        // then
        assertThat(bonus).isEqualTo(0);
    }

    @Test
    void should_calculate_no_bonus_if_sales_is_equal_quota() {
        // given
        BonusCalculator bonusCalculator = new BonusCalculator();

        // when
        Integer bonus = bonusCalculator.calculateIndividualBonus(15000, 15000);

        // then
        assertThat(bonus).isEqualTo(0);
    }

    @Test
    void should_calculate_10_percent_bonus_anf_tax_if_sales_is_above_quota() {
        // given
        BonusCalculator bonusCalculator = new BonusCalculator();

        // when
        Integer bonus = bonusCalculator.calculateIndividualBonus(12000, 11000);

        // then
        assertThat(bonus).isGreaterThan(0);
        assertThat(bonus).isEqualTo(90);
    }

}
