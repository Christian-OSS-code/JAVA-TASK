public class AirConditioner{

   private boolean isOn;

   int temperature = 20;

    public boolean airConditionerIsOn(){
        return true;

    }
    public boolean airConditionerIsOff(){

        if (!isOn) {

            isOn = true;

        }

        return isOn;

    }
    public int temperatureIncrease(){

       int incrementFactor = 4;  
      
    
       if (!isOn) {

            temperature += incrementFactor;
           
       }
       return temperature;
    }
    public boolean isTemperatureIncreased(){

        int incrementFactor = 4;

        if (!isOn) {

            temperature += incrementFactor;

            if (temperature > 20){

                return true;
            }
            
    
        }
        return false;

   }
   public int temperatureDecrease(){

       int decrementFactor = 5;  
      
    
       if (!isOn) {

            temperature -= decrementFactor;
           
       }
       return temperature;
    }
    public boolean isTemperatureDecreased(){
        
          int decrementFactor = 5;

        if (!isOn) {

            temperature -= decrementFactor;

            if (temperature < 20){

                return true;
            }
            
    
        }
        return false;

    } 
    public int isTheSameWhenRaised(){

        int incrementFactor = 15;

        int thresholdTemperature = 30;

        int newTemperature = 0;

        if (!isOn){


            if(temperature + incrementFactor
> thresholdTemperature){
                newTemperature = thresholdTemperature;
        
            } 
               

        }
        return newTemperature;


    } 
    public int isTheSameWhenReduced(){

        int decrementFactor = 10;

        int minimumTemperature = 16;

        int newTemperature = 0;

        if (!isOn){


            if(temperature - decrementFactor
< minimumTemperature){
                newTemperature = minimumTemperature;
        
            } 
               

        }
        return newTemperature;


    } 


    
    

}













