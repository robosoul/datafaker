package net.datafaker.providers.show;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AquaTeenHungerForceTest extends ShowFakerTest {

    @Test
    void character() {
        assertThat(faker.aquaTeenHungerForce().character()).matches("[A-Za-z .]+");
    }
}
