package Laboration1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidatorTests {
Validator validator = new Validator();
    //Test phoneNumber


    @Test
    void ShouldEqualTrueIfPhoneNumberIsANumber() {

        String phoneNumber = "0708903269";

        boolean result = validator.isPhoneNumberValid(phoneNumber);

        Assertions.assertTrue(result);
    }

    @Test
    void ShouldEqualFalseIfPhoneNumberIsCharacters() {

        String phoneNumber = "asdfgh";

        boolean result = validator.isPhoneNumberValid(phoneNumber);

        Assertions.assertFalse(result);
    }

    @Test
    void ShouldEqualFalseIFNumberIsTooShort() {

        String phoneNumber = "01234";

        boolean result = validator.isPhoneNumberValid(phoneNumber);

        Assertions.assertFalse(result);
    }

    @Test
    void shouldEqualsFalseIfPhonenumberDoesNotStartWith0() {

        String phoneNumber = "123456789";

        boolean result = validator.isPhoneNumberValid(phoneNumber);

        Assertions.assertFalse(result);
    }

    @Test
    void shouldEqualsFalseIfNumberIsTooLong() {

        String phoneNumber = "070890326912";

        boolean result = validator.isPhoneNumberValid(phoneNumber);

        Assertions.assertFalse(result);
    }

    @Test
    void shouldEqualsFalseIfNumberContainSpace() {

        String phoneNumber = "070 123456";

        boolean result = validator.isPhoneNumberValid(phoneNumber);

        Assertions.assertFalse(result);
    }

    @Test
    void shouldEqualsFalseIfNumberContainPlus() {

        String phoneNumber = "+4621098";

        boolean result = validator.isPhoneNumberValid(phoneNumber);

        Assertions.assertFalse(result);
    }

    @Test
    void ShouldEqualTrueIfPhoneNumberIsSixToTenNumbersLong() {

        String phoneNumber = "0701234567";

        boolean result = validator.isPhoneNumberValid(phoneNumber);

        Assertions.assertTrue(result);
    }

    @Test
    void ShouldEqualFalseIfPhoneNumberContainsNumbersAndCharacters() {

        String phoneNumber = "070asdfgh";

        boolean result = validator.isPhoneNumberValid(phoneNumber);

        Assertions.assertFalse(result);
    }

    //Test email

    @Test
    void emailIsCorrect() {

        String email = "neha@oneagency.com";

        boolean result = validator.isEmailValid(email);

        Assertions.assertTrue(result);
    }

    @Test
    void emailHaveAtButNotDot() {

        String email = "neha@oneagencycom";

        boolean result = validator.isEmailValid(email);

        Assertions.assertFalse(result);
    }

    @Test
    void emailMissingName() {

        String email = "@oneagency.com";

        boolean result = validator.isEmailValid(email);

        Assertions.assertFalse(result);
    }

    @Test
    void emailMissingDomainName() {

        String email = "neha@.com";

        boolean result = validator.isEmailValid(email);

        Assertions.assertFalse(result);
    }

    @Test
    void emailMissingTopLevelDomain() {

        String email = "neha@oneagency.";

        boolean result = validator.isEmailValid(email);

        Assertions.assertFalse(result);
    }
    @Test
    void emailMissingAtAndDot() {

        String email = "nehaoneagencycom";

        boolean result = validator.isEmailValid(email);

        Assertions.assertFalse(result);
    }


}
