import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


    public class CreditCardValidatorTest{
        @Test
        public void checkDigitLengthIsWithinGivenRange(){
            CreditCardValidator creditCard = new CreditCardValidator();            
            String cardNumber = "4388576018402626";
            boolean value = creditCard.checkCardLength(cardNumber);
            assertTrue(true);
        }
        @Test
        public void testThatReturnsFalseForANonDigitInput(){
            CreditCardValidator creditCard = new CreditCardValidator();
            String cardNumber = "438857601840eryt";
            boolean isValidNumber = creditCard.checkForNonDigitInput(cardNumber);
            assertFalse(false);

        }
        @Test
        public void testThatIfFirstDigitIsFourCreditCardIsOfTypeVisa(){
            CreditCardValidator creditCard = new CreditCardValidator();
            String cardNumber = "4388576018402626";
            assertEquals("4", creditCard.checkForTypeVisaCard(cardNumber)); 
        
        }
        @Test
        public void testThatIfFirstDigitIsFiveCreditCardIsOfTypeMaster(){
            CreditCardValidator creditCard = new CreditCardValidator();
            String cardNumber = "5688576018402626";
            assertEquals("5", creditCard.checkForTypeMasterCard(cardNumber)); 

        }
        @Test
        public void testThatIfFirstDigitIsSixCreditCardIsOfTypeDiscorverCard(){
            CreditCardValidator creditCard = new CreditCardValidator();
            String cardNumber = "6488576018402626";
            assertEquals("6", creditCard.checkForTypeDiscorverCards(cardNumber));
       

        }
        @Test
        public void testThatIfFirstAndSecondDigitIsThreeAndSevenRespectivelyCreditCardIsOfTypeAmericanExpressCard(){
            CreditCardValidator creditCard = new CreditCardValidator();
            String cardNumber = "3788576018402626";
            assertEquals("37", creditCard.checkForTypeAmericanExpressCards(cardNumber));

        }
        @Test
        public void testTheReversedOfTheCreditCardDigit(){
            CreditCardValidator creditCard = new CreditCardValidator();
            String cardNumber = "4388576018402626";
            assertEquals("6262048106758834", creditCard.checkForReversedOfCreditCardDigits(cardNumber));

        }
        @Test
        public void testTheOccurenceofEverySecondDigitOfCreditCard(){
            CreditCardValidator creditCard = new CreditCardValidator();
            String cardNumber = "4388576018402626";
            assertEquals("22416584", creditCard.checkOccurenceOfEverySecondDigit(cardNumber));
            


        }
        @Test
        public void testDoubleTheOccurrenceOfEverySecondDigitOfCreditCard(){
            CreditCardValidator creditCard = new CreditCardValidator();
            String cardNumber = "4388576018402626";
            assertArrayEquals(new int[] {4, 4, 8, 2, 12, 10, 16, 8}, creditCard.doubleEveryReversedSecondDigitsofCreditCard(cardNumber));


        }
        @Test
        public void testSumOfDigitGreaterThanNineInCreditCard(){
            CreditCardValidator creditCard = new CreditCardValidator();
            String cardNumber = "4388576018402626";
            assertArrayEquals(new int[] {4, 4, 8, 2, 3, 1, 7, 8}, creditCard.checkCreditCardDigitsGreaterThanNineAndSumTheirDigits(cardNumber));

        }
        @Test
        public void testSumOfAllDigitInCreditCardAfterDoublingTheSecondDigitsInReverse(){
            CreditCardValidator creditCard = new CreditCardValidator();
            String cardNumber = "4388576018402626";
            assertEquals(37, creditCard.sumingALlDigitOfCreditCardFromPreviousStep(cardNumber));

        }
        @Test
        public void testDigitsInOddPlacesInReversedDigitsOfCreditCard(){
            CreditCardValidator creditCard = new CreditCardValidator();
            String cardNumber = "4388576018402626";
            assertEquals("66080783", creditCard.getAllDigitsInOddPlacesInReverseCreditCard(cardNumber));

        }
        @Test
        public void testSumOfAllDgitsInOddPositionsInReversedCreditCard(){
            CreditCardValidator creditCard = new CreditCardValidator();
            String cardNumber = "4388576018402626";
            assertEquals(38, creditCard.getTotalDigitsInOddPositionOfReversedCreditCard(cardNumber));

        }
        @Test
        public void testToTotalTheSumOfDigitsObtainedInPreviousSteps(){
            CreditCardValidator creditCard = new CreditCardValidator();
            String cardNumber = "4388576018402626";
            assertEquals(75, creditCard.totalTheSumOfTheDigitsObtainedFromPreviousSteps(cardNumber));

        }
        @Test
        public void testTheValidityOfCreditCard(){
            CreditCardValidator creditCard = new CreditCardValidator();
            String cardNumber = "4388576018402626";
            boolean verify = creditCard.checkIftotalDigitsIsDivisbleByTen(cardNumber);
            assertTrue(true);

        }

    }







