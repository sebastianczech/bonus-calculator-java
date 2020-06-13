package tdd.bonus;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BonusCalculatorTest {

    @Test
    void should_calculate_individual_no_bonus_if_sales_is_below_quota() {
        // given
        BonusCalculator bonusCalculator = new BonusCalculator();

        // when
        Integer bonus = bonusCalculator.calculateIndividualBonus(13000, 15000, 10, 10);

        // then
        assertThat(bonus).isEqualTo(0);
    }

    @Test
    void should_calculate_individual_no_bonus_if_sales_is_equal_quota() {
        // given
        BonusCalculator bonusCalculator = new BonusCalculator();

        // when
        Integer bonus = bonusCalculator.calculateIndividualBonus(15000, 15000, 10, 10);

        // then
        assertThat(bonus).isEqualTo(0);
    }

    @Test
    void should_calculate_individual_10_percent_bonus_and_tax_if_sales_is_above_quota() {
        // given
        BonusCalculator bonusCalculator = new BonusCalculator();

        // when
        Integer bonus = bonusCalculator.calculateIndividualBonus(12000, 11000, 10, 10);

        // then
        assertThat(bonus).isGreaterThan(0);
        assertThat(bonus).isEqualTo(90);
    }

    @Test
    void should_calculate_team_no_bonus_if_sales_is_below_quota() {
        // given
        BonusCalculator bonusCalculator = new BonusCalculator();

        // when
        Integer bonus = bonusCalculator.calculateTeamBonus(13000, 15000, 10, 4);

        // then
        assertThat(bonus).isEqualTo(0);
    }

    @Test
    void should_calculate_team_no_bonus_if_sales_is_equal_quota() {
        // given
        BonusCalculator bonusCalculator = new BonusCalculator();

        // when
        Integer bonus = bonusCalculator.calculateTeamBonus(12000, 12000, 10, 4);

        // then
        assertThat(bonus).isEqualTo(0);
    }

}
