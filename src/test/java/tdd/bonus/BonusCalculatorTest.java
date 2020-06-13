package tdd.bonus;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BonusCalculatorTest {

    @Test
    public void should_calculate_no_bonus_if_sales_is_below_quota() {
        // given
        BonusCalculator bonusCalculator = new BonusCalculator();

        // when
        Integer bonus = bonusCalculator.calculateIndividualBonus(13000, 15000);

        // then
        assertThat(bonus).isEqualTo(0);
    }

    @Test
    public void should_calculate_no_bonus_if_sales_is_equal_quota() {
        // given
        BonusCalculator bonusCalculator = new BonusCalculator();

        // when
        Integer bonus = bonusCalculator.calculateIndividualBonus(15000, 15000);

        // then
        assertThat(bonus).isEqualTo(0);
    }

}
