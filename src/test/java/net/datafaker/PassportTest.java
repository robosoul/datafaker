package net.datafaker;

import org.junit.jupiter.api.RepeatedTest;

import java.util.Locale;

import static org.assertj.core.api.Assertions.assertThat;

class PassportTest extends AbstractFakerTest {

    @RepeatedTest(10)
    void testDefaultLocale() {
        assertThat(new Faker().passport().valid())
            .hasSize(9);
    }

    @RepeatedTest(10)
    void testValidDutch() {
        assertThat(new Faker(new Locale("nl", "nl")).passport().valid())
            .hasSize(9)
            .doesNotContain("O")
            .matches(".*?\\d$");
    }

    @RepeatedTest(10)
    void testValidChinese() {
        assertThat(new Faker(new Locale("zh", "CN")).passport().valid())
            .hasSize(9);
    }

    @RepeatedTest(10)
    void testValidUnitedStates() {
        assertThat(new Faker(new Locale("en", "US")).passport().valid())
            .hasSize(9);
    }

    @RepeatedTest(10)
    void testValidAustralia() {
        assertThat(new Faker(new Locale("en", "AU")).passport().valid())
            .hasSize(8)
            .matches("[A-Z][0-9]{7}");
    }

    @RepeatedTest(10)
    void testValidCanada() {
        assertThat(new Faker(new Locale("en", "CA")).passport().valid())
            .hasSize(8);
    }

    @RepeatedTest(10)
    void testValidUnitedKingdom() {
        assertThat(new Faker(new Locale("en", "GB")).passport().valid())
            .hasSize(9);
    }

    @RepeatedTest(10)
    void testValidJapan() {
        assertThat(new Faker(new Locale("ja")).passport().valid())
            .hasSize(9)
            .matches("[MT][A-Z][0-9]{7}");
    }

    @RepeatedTest(10)
    void testValidSpain() {
        assertThat(new Faker(new Locale("es")).passport().valid())
            .matches("[A-z0-9]{2,3}[0-9]{6}");
    }

    @RepeatedTest(10)
    void testValidBulgaria() {
        assertThat(new Faker(new Locale("bg")).passport().valid())
            .hasSize(9);
    }

    @RepeatedTest(10)
    void testValidFinland() {
        assertThat(new Faker(new Locale("fi", "FI")).passport().valid())
            .hasSize(9);
    }

}
