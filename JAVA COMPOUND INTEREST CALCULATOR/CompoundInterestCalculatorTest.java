import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

    public class CompoundInterestCalculatorTest{

        @Test
        public void TestThatCompoundInterestCalculatorExists(){

            CompoundInterestCalculator calculator = new CompoundInterestCalculator();

           

        }
        @Test
        public void TestThatCompoundInterestCalculatorReturnsCorrectInterestRate(){
            
            CompoundInterestCalculator calculator = new CompoundInterestCalculator();

            double estimatedInterestRate = 5.0;
            int timeInterestCompounded = 12;
            assertEquals(0.004166666666666667, calculator.estimatedInterestPerYear(estimatedInterestRate, timeInterestCompounded));           


        }
        @Test
        public void TestThatCompoundCalculatorReturnsCorrectTotalPeriod(){
            CompoundInterestCalculator calculator = new CompoundInterestCalculator();
            double year = 10.0;

            int timeInterestCompounded = 12;

            assertEquals(120.0, calculator.calculatedTotalPeriod(year, timeInterestCompounded));

            


        }
        @Test
        public void TestThatCompoundInterestCalculatorReturnsCorrectFutureGrowthInInvestment(){

            CompoundInterestCalculator calculator = new CompoundInterestCalculator();

            double principal = 10000.0;
            double estimatedInterestRate = 5.0;
            int timeInterestCompounded = 12;
            double amount = 500;
            double year = 10.0;

            assertEquals(16470.0949769028, calculator.growthInInvestment(principal, estimatedInterestRate, timeInterestCompounded,  amount, year));



        }
        @Test
        public void TestThatCompoundInterestCalculatorReturnsCorrectFutureAmountForCompoundFrequency(){

            CompoundInterestCalculator calculator = new CompoundInterestCalculator();

            double principal = 10000.0;
            double estimatedInterestRate = 5.0;
            int timeInterestCompounded = 12;
            double amount = 500;
            double year = 10.0;

            assertEquals(94111.23469973668, calculator.futureInvestmentWithinPeriodOfCompoundFrequency(principal, estimatedInterestRate, timeInterestCompounded,  amount, year));            
        
    
        }
        @Test
        public void TestThatCompoundCalculatorReturnsCorrectInterestAtLowerBoundary(){

            CompoundInterestCalculator calculator = new CompoundInterestCalculator();

    
            double lowerBoundInterestRate = 4.0;

            int timeInterestCompounded = 12;

            assertEquals(0.0033333333333333335, calculator.estimatedInteresRateAtLowerBound(lowerBoundInterestRate, timeInterestCompounded));

                         
        }
        @Test
        public void TestThatCompoundCalculatorReturnsCorrectInterestAtUpperBoundary(){
    
            CompoundInterestCalculator calculator = new CompoundInterestCalculator();

            double upperBoundInterestRate = 6.0;
    
            int timeInterestCompounded = 12;

            assertEquals(0.005, calculator.estimatedInterestRateAtUpperBound(upperBoundInterestRate, timeInterestCompounded));        
        

        }
        @Test
        public void TestThatCompoundCalculatorReturnsCorrectInitialAmountForLowerBound(){
            CompoundInterestCalculator calculator = new CompoundInterestCalculator();

            double principal = 10000.0;
            double estimatedInterestRate = 5.0;
            int timeInterestCompounded = 12;
            double amount = 500;
            double year = 10.0;

            double lowerBoundInterestRate = 4.0;
            
            
            assertEquals(14908.32682418262, calculator.calculateFutureAmountAtLowerBoundInterest(principal, estimatedInterestRate, timeInterestCompounded, amount, year, lowerBoundInterestRate));
         

        }
        @Test
        public void TestThatCompoundCalculatorReturnsCorrectAmountForCompoundFrequencyLowerBound(){
            CompoundInterestCalculator calculator = new CompoundInterestCalculator();

            double principal = 10000.0;
            double estimatedInterestRate = 5.0;
            int timeInterestCompounded = 12;
            double amount = 500;
            double year = 10.0;

            double lowerBoundInterestRate = 4.0;

            assertEquals(88533.2291869202, calculator.calculateGrowthInFutureInvestmentAtLowerBoundInterest(principal, estimatedInterestRate, timeInterestCompounded, amount, year, lowerBoundInterestRate));

        }
        @Test
        public void TestThatCompoundCalculatorReturnsCorrectInitialAmountForUpperBoundInterest(){

            CompoundInterestCalculator calculator = new CompoundInterestCalculator();
        
            double principal = 10000.0;
            double estimatedInterestRate = 5.0;
            int timeInterestCompounded = 12;
            double amount = 500;
            double year = 10.0;

            double upperBoundInterestRate = 6.0;

            assertEquals(18193.9673403229, calculator.calculateAmountAtUpperBoundInterestcalculateFutureAmountAtUpperBoundInterest(principal, estimatedInterestRate, timeInterestCompounded, amount, year, upperBoundInterestRate));



        }
        @Test
        public void TestThatCompoundCalculatorReturnsCorrectCompoundAmountForUpperBoundInterest(){

            CompoundInterestCalculator calculator = new CompoundInterestCalculator();


            double principal = 10000.0;
            double estimatedInterestRate = 5.0;
            int timeInterestCompounded = 12;
            double amount = 500;
            double year = 10.0;

            double upperBoundInterestRate = 6.0;

            assertEquals(100133.64074355364, calculator.calculateCompoundAmountAtUpperBoundInterest(principal, estimatedInterestRate, timeInterestCompounded, amount, year, upperBoundInterestRate));

        }

        
       

    }













