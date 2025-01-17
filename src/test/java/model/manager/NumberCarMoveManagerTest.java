package model.manager;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class NumberCarMoveManagerTest {

    @ParameterizedTest
    @CsvSource(value = {"0:false", "1:false", "2:false", "3:false", "4:true", "5:true", "7:true", "8:true",
            "9:true"}, delimiter = ':')
    void boundaryTest(int input, boolean expected) {
        assertThat(new NumberCarMoveManager().isMove(input)).isEqualTo(expected);
    }
}