import java.util.Scanner;    
    public class CreditCardValidator{
        public boolean checkCardLength(String cardNumber){
            boolean check = false;
            
            int cardLength = cardNumber.length();
            if (cardLength >= 13 && cardLength <= 16){
                check = true;
            
            }
            else{
                check = false;


            }
            return check;
            
        }
        public boolean checkForNonDigitInput(String cardNumber){
            boolean isValidNumber = false;
            if (cardNumber.matches("\\d+")){
                isValidNumber = true;
            }
            else{
                isValidNumber = false;
            

            }
            return isValidNumber;
           
        }
        public String checkForTypeVisaCard(String cardNumber){
           
            String[] numberList = new String[cardNumber.length()];
            for (int count = 0; count < cardNumber.length(); count ++){
                numberList[count] = String.valueOf(cardNumber.charAt(count)); 
                     

            } 
            return numberList[0];
                

        }
        public String checkForTypeMasterCard(String cardNumber){
            String[] numberList = new String[cardNumber.length()];
            for (int count = 0; count < cardNumber.length(); count ++){
                numberList[count] = String.valueOf(cardNumber.charAt(count));

            }
            return numberList[0];
    
        }
        public String checkForTypeDiscorverCards(String cardNumber){
            String[] numberList = new String[cardNumber.length()];
            for (int count = 0; count < cardNumber.length(); count ++){
                numberList[count] = String.valueOf(cardNumber.charAt(count));

            }
            return numberList[0];

        }
        public String checkForTypeAmericanExpressCards(String cardNumber){
            String[] numberList = new String[cardNumber.length()];
            for (int count = 0; count < cardNumber.length(); count ++){
                numberList[count] = String.valueOf(cardNumber.charAt(count));

            }
            return numberList[0] + numberList[1];


        }
        public String checkForReversedOfCreditCardDigits(String cardNumber){
            String reversedCardDigit = "";
            for (int count = cardNumber.length() - 1; count >= 0; count --){
                reversedCardDigit += cardNumber.charAt(count);


            }
            return reversedCardDigit;

        }
        public String checkOccurenceOfEverySecondDigit(String cardNumber){
            String reversedCardDigit = "";
            for (int count = cardNumber.length() - 1; count >= 0; count --){
                if (count % 2 == 0){
                    reversedCardDigit += cardNumber.charAt(count);
                
                }
                

            } 
            return reversedCardDigit;


        }
        public int[] doubleEveryReversedSecondDigitsofCreditCard(String cardNumber){
            String reversedCardDigit = "";
            for (int count = cardNumber.length() - 1; count >= 0; count --){
                if (count % 2 == 0){
                    reversedCardDigit += cardNumber.charAt(count);
                
                }
            }
             int[] numberList = new int[reversedCardDigit.length()];
             for (int count = 0; count < reversedCardDigit.length(); count ++){
                numberList[count] = Character.getNumericValue(reversedCardDigit.charAt(count));
                numberList[count] = 2 * numberList[count];

            }  
            return numberList;
                

        }
        public int[] checkCreditCardDigitsGreaterThanNineAndSumTheirDigits(String cardNumber){

            String reversedCardDigit = "";
            for (int count = cardNumber.length() - 1; count >= 0; count --){
                if (count % 2 == 0){
                    reversedCardDigit += cardNumber.charAt(count);
                
                }
            }
             int[] numberList = new int[reversedCardDigit.length()];
             for (int count = 0; count < reversedCardDigit.length(); count ++){
                numberList[count] = Character.getNumericValue(reversedCardDigit.charAt(count));
                numberList[count] = 2 * numberList[count];

             
                for (int count1 = 0; count1 < numberList.length; count1 ++){
                    if (numberList[count1] > 9){
                        int numberDigit = numberList[count1];
                        int sumDoubleDigit = 0;
                        int remainderDigit = 0;
                        while(numberDigit > 0){
                            remainderDigit = numberDigit % 10;
                            sumDoubleDigit += remainderDigit;
                            numberDigit = numberDigit/10;

                        }
                        numberList[count1] = sumDoubleDigit;

                    }

                }
            }
            return numberList;
            

        }
        public int sumingALlDigitOfCreditCardFromPreviousStep(String cardNumber){
            String reversedCardDigit = "";
            for (int count = cardNumber.length() - 1; count >= 0; count --){
                if (count % 2 == 0){
                    reversedCardDigit += cardNumber.charAt(count);
                
                }
            }
             int[] numberList = new int[reversedCardDigit.length()];
             for (int count = 0; count < reversedCardDigit.length(); count ++){
                numberList[count] = Character.getNumericValue(reversedCardDigit.charAt(count));
                numberList[count] = 2 * numberList[count];

             
                for (int count1 = 0; count1 < numberList.length; count1 ++){
                    if (numberList[count1] > 9){
                        int numberDigit = numberList[count1];
                        int sumDoubleDigit = 0;
                        int remainderDigit = 0;
                        while(numberDigit > 0){
                            remainderDigit = numberDigit % 10;
                            sumDoubleDigit += remainderDigit;
                            numberDigit = numberDigit/10;

                        }
                        numberList[count1] = sumDoubleDigit;

                    }

                }
            }
            int sumDigits = 0;
            for (int number : numberList){
                sumDigits += number;

            }
            return sumDigits;
        

        }
        public String getAllDigitsInOddPlacesInReverseCreditCard(String cardNumber){
            String reversedCardDigit = "";
            for (int count = cardNumber.length() - 1; count >= 0; count --){
      
                if (count % 2 != 0){
                    reversedCardDigit += cardNumber.charAt(count);
    
                }
           

            }
            return reversedCardDigit;
        }
        public int getTotalDigitsInOddPositionOfReversedCreditCard(String cardNumber){
            String reversedCardDigit = "";
            for (int count = cardNumber.length() - 1; count >= 0; count --){
      
                if (count % 2 != 0){
                    reversedCardDigit += cardNumber.charAt(count);
    
                }
           

            }
            int sumDigitOddPositions = 0;
            for (int counter = 0; counter < reversedCardDigit.length(); counter ++){
                sumDigitOddPositions += Character.getNumericValue(reversedCardDigit.charAt(counter));

            }
            return sumDigitOddPositions;

        }
        public int totalTheSumOfTheDigitsObtainedFromPreviousSteps(String cardNumber){
            String reversedCardDigit1 = "";
            int totalDigits = 0;
            for (int count = cardNumber.length() - 1; count >= 0; count --){
                if (count % 2 == 0){
                    reversedCardDigit1 += cardNumber.charAt(count);
                
                }
            }
             int[] numberList = new int[reversedCardDigit1.length()];
             for (int count = 0; count < reversedCardDigit1.length(); count ++){
                numberList[count] = Character.getNumericValue(reversedCardDigit1.charAt(count));
                numberList[count] = 2 * numberList[count];

             
                for (int count1 = 0; count1 < numberList.length; count1 ++){
                    if (numberList[count1] > 9){
                        int numberDigit = numberList[count1];
                        int sumDoubleDigit = 0;
                        int remainderDigit = 0;
                        while(numberDigit > 0){
                            remainderDigit = numberDigit % 10;
                            sumDoubleDigit += remainderDigit;
                            numberDigit = numberDigit/10;

                        }
                        numberList[count1] = sumDoubleDigit;

                    }

                }
            }
            int sumDigits = 0;
            for (int number : numberList){
                sumDigits += number;

            }
           


            String reversedCardDigit2 = "";
            for (int count = cardNumber.length() - 1; count >= 0; count --){
      
                if (count % 2 != 0){
                    reversedCardDigit2 += cardNumber.charAt(count);
    
                }
           

            }
            int sumDigitOddPositions = 0;
            for (int counter = 0; counter < reversedCardDigit2.length(); counter ++){
                sumDigitOddPositions += Character.getNumericValue(reversedCardDigit2.charAt(counter));

            }
            totalDigits = sumDigits + sumDigitOddPositions;
            return totalDigits;

        

        }
        public boolean checkIftotalDigitsIsDivisbleByTen(String cardNumber){
            String reversedCardDigit1 = "";
            int totalDigits = 0;
            boolean verify = false;
            for (int count = cardNumber.length() - 1; count >= 0; count --){
                if (count % 2 == 0){
                    reversedCardDigit1 += cardNumber.charAt(count);
                
                }
            }
             int[] numberList = new int[reversedCardDigit1.length()];
             for (int count = 0; count < reversedCardDigit1.length(); count ++){
                numberList[count] = Character.getNumericValue(reversedCardDigit1.charAt(count));
                numberList[count] = 2 * numberList[count];

             
                for (int count1 = 0; count1 < numberList.length; count1 ++){
                    if (numberList[count1] > 9){
                        int numberDigit = numberList[count1];
                        int sumDoubleDigit = 0;
                        int remainderDigit = 0;
                        while(numberDigit > 0){
                            remainderDigit = numberDigit % 10;
                            sumDoubleDigit += remainderDigit;
                            numberDigit = numberDigit/10;

                        }
                        numberList[count1] = sumDoubleDigit;

                    }

                }
            }
            int sumDigits = 0;
            for (int number : numberList){
                sumDigits += number;

            }
           


            String reversedCardDigit2 = "";
            for (int count = cardNumber.length() - 1; count >= 0; count --){
      
                if (count % 2 != 0){
                    reversedCardDigit2 += cardNumber.charAt(count);
    
                }
           

            }
            int sumDigitOddPositions = 0;
            for (int counter = 0; counter < reversedCardDigit2.length(); counter ++){
                sumDigitOddPositions += Character.getNumericValue(reversedCardDigit2.charAt(counter));

            }
            totalDigits = sumDigits + sumDigitOddPositions;
            if (totalDigits % 10 == 0) verify = true;
            else verify = false;
            return verify;


        }


    }













