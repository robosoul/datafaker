package net.datafaker.providers.show;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class StarTrekTest extends ShowFakerTest {

    @Test
    void character() {
        assertThat(faker.starTrek().character()).matches("^(\\w+-?'?\\.?\\s?)+$");
    }

    @Test
    void location() {
        assertThat(faker.starTrek().location()).matches("^(\\w+'?\\s?)+$");
    }

    @Test
    void species() {
        assertThat(faker.starTrek().species()).matches("^(\\w+-?'?\\s?)+$");
    }

    @Test
    void villain() {
        assertThat(faker.starTrek().villain()).matches("^(\\w+'?\\.?\\s?)+$");
    }

    @Test
    void klingon() {
        assertThat(faker.starTrek().klingon()).isNotEmpty();
    }
}
