import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


    public class AirConditionerTest{

        
        @Test
        public void TestThatAirConditionerExists(){

            AirConditioner myAirconditioner = new AirConditioner();

        }
        @Test
        public void TestThatAirConditionComesUpWhenTurnedOn(){
    
            AirConditioner myAirconditioner = new AirConditioner();
        
            boolean isOn =  myAirconditioner.airConditionerIsOn();

            assertTrue(isOn);              

        }    
        @Test 
        public void TestThat_AirConditionGoesOff_WhenTurnedOff(){

            AirConditioner myAirconditioner = new AirConditioner();

            boolean isOff =  myAirconditioner.airConditionerIsOff();

            assertTrue(isOff);
        } 
        @Test
        public void TestThatTemperature_OfAirConditioner_Increases_When_Temperature_Is_Raised(){

            AirConditioner myAirconditioner = new AirConditioner();

            int temperature = 20;
            int incrementFactor = 4;

            assertEquals(24, myAirconditioner.temperatureIncrease());

        } 
       @Test
       public void TestThatAirConditioner_Temperature_Changes_From_Lower_To_Higher_Temperature(){

            AirConditioner myAirconditioner = new AirConditioner();

            int temperature = 20;
            int incrementFactor = 4;

            boolean isIncreased = myAirconditioner.isTemperatureIncreased();

            assertTrue(isIncreased);


        }
        @Test
        public void TestThatTemperature_OfAirConditioner_Decreases_When_Temperature_Is_Reduced(){

           AirConditioner myAirconditioner = new AirConditioner();

           int temperature = 20;

           int decrementFactor = 5;

           assertEquals(15, myAirconditioner.temperatureDecrease()); 

        }   
        @Test 
        public void TestThatAirConditioner_Temperature_Changes_From_Higher_To_Lower_State(){

            AirConditioner myAirconditioner = new AirConditioner();

            int temperature = 20;
            int decrementFactor = 5;

            boolean isDecreased = myAirconditioner.isTemperatureDecreased();

            assertTrue(isDecreased);


        }
        @Test
        public void TestThatTemperature_RemainsTheSame_WhenIncreased_Above_Maximum(){

          AirConditioner myAirconditioner = new AirConditioner(); 

          int thresholdTemperature = 30;
          int incrementFactor = 15;

          assertEquals(30, myAirconditioner.isTheSameWhenRaised());
 


        }
        @Test
        public void TestThatTemperature_RemainsTheSame_WhenReduced_Below_MinimumTemperature(){ 

            AirConditioner myAirconditioner = new AirConditioner();

            int minimumTemperature = 16;
            int incrementFactor = 10;

            assertEquals(16, myAirconditioner.isTheSameWhenReduced());


        }
            

    }










