package Laboration1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidatorTests {
Validator validator = new Validator();
    //Test phoneNumber
    @Test
    void phoneNumberStartWith0() {

        String phoneNumber = "0708903269";

        boolean result = !phoneNumber.startsWith("0");

        Assertions.assertFalse(result);

    }

    @Test
    void phoneNumberDoesNotStartWith0() {

        String phoneNumber = "21098";

        boolean result = !phoneNumber.startsWith("0");

        Assertions.assertTrue(result);

    }

    @Test
    void phoneNumberIsANumber() {

        String phoneNumber = "0708903269";

        boolean result = phoneNumber.matches("[0-9]+");

        Assertions.assertTrue(result);
    }

    @Test
    void phoneNumberIsNotANumber() {

        String phoneNumber = "asd";

        boolean result = phoneNumber.matches("[0-9]+");

        Assertions.assertFalse(result);
    }

    @Test
    void phoneNumberIsMoreThan6Numbersandlessthan10() {

        String phoneNumber = "0708903269";

        boolean result = phoneNumber.length() < 6 || phoneNumber.length() > 10;

        Assertions.assertFalse(result);
    }

    @Test
    void phoneNumberIsMoreTLessThan6NumbersandMoreThan10() {

        String phoneNumber = "21098";

        boolean result = phoneNumber.length() < 6 || phoneNumber.length() > 10;

        Assertions.assertTrue(result);
    }

    @Test
    void phoneNumberHaveCorrectNumbersAndAreNumbers() {

        String phoneNumber = "0708903269";

        boolean result = phoneNumber.length() < 6 || phoneNumber.length() > 10 && phoneNumber.matches("[0-9]+");

        Assertions.assertFalse(result);

    }

    @Test
    void phoneNumberAreNotNumbers() {

        String phoneNumber = "asdfgh";

        boolean result = phoneNumber.length() > 6 || phoneNumber.length() < 10;

        Assertions.assertTrue(result);
    }

    @Test
    void phoneNumberHaveCorrectLengthAndAreNotNumbers() {

        String phoneNumber = "asdfghjkl";

        boolean result = phoneNumber.length() > 6 || phoneNumber.length() < 10 && phoneNumber.matches("[0-9]+");

        Assertions.assertTrue(result);
    }

    @Test
    void phoneNumberHaveCorrectLengthAndAreCharactersAndStartWith0() {

        String phoneNumber = "0708903269";

        boolean result = !phoneNumber.startsWith("0") && phoneNumber.length() > 6 || phoneNumber.length() < 10 && phoneNumber.matches("[0-9]+");

        Assertions.assertFalse(result);
    }

    @Test
    void ShouldEqualTrueIfPhoneNumberIsAPhoneNumber() {

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
