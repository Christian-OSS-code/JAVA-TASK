
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class MenstrualApplicationUpdate{
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println("You are welcome to Christian's menstrual application test");
            
        
                
                System.out.println("Enter Your name: ");

                String userName = input.nextLine();
                   

            
                System.out.printf("You are welcome %s%n%n ", userName);

        

                System.out.println("\nEnter the day of your last cyle: ");
                int day = input.nextInt();
                System.out.print("Day Collected successfully!\n\n");

             
                        

                   
                    

                System.out.println("Enter the month of your last cycle: ");
                int month = input.nextInt();
                System.out.print("Month Collected successfully!\n\n");

                        

           
                        

                    

                System.out.println("Enter the year of your  last cycle: "); 
                int year = input.nextInt();
                System.out.print("Year Collected successfully!\n\n");

  
            
                   
                  
                System.out.println("Enter your cycle length: You may want to enter between the range (26 - 29)");

                int cycleLength = input.nextInt();
                System.out.print("Length Collected successfully!\n\n");

         
              

                LocalDate cycleDate = LocalDate.of(year, month, day);
                LocalDate cyclePredictedDate = cycleDate.plusDays(cycleLength);

              

                String[] menstrualApplication = evaluateMenstrualCycle(cycleDate.toString(), cycleLength);
                for (String count : menstrualApplication ){
                    System.out.print("\n" + count);
            
                }

                System.out.print("\nYour predicted cycle date is " + cyclePredictedDate);

                printMedicalTipsForMenstrualCycle();

                   
       

            }
            public static void printMedicalTipsForMenstrualCycle(){

                System.out.print("\n\nYou are adviced to:\n1. Stay hydrated\n\n2. Maintain a good diet habit\n\n3. Engage in exercise\n\n4. Consult a medical practional when you notice any unsual symptons\n\n Thank you\n\nstay safe");

            }
         
            public static String[] evaluateMenstrualCycle(String cycleDate, int cycleLength){
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
          
                LocalDate cycleDateDate = LocalDate.parse(cycleDate, formatter);

                LocalDate nextPeriod = cycleDateDate.plusDays(cycleLength);
        
                LocalDate ovulationDate = nextPeriod.minusDays((cycleLength)/2);

                LocalDate fertileStart = ovulationDate.minusDays(2);

                LocalDate fertileEnd = ovulationDate.plusDays(2);

                LocalDate safeStart = fertileEnd.plusDays(1);
        
                LocalDate safeEnd = fertileStart.minusDays(1);

                return new String[] {
                    "Prediction of next possible period: " + nextPeriod.format(formatter),
                    
                     "Prediction of next ovulation Date:" + ovulationDate.format(formatter),
                     "prediction of period for fertility: " + fertileStart.format(formatter) + "to" + fertileEnd.format(formatter), 
                      "Predicted Safe period before ovulation: " + safeEnd.format(formatter), 

                    "prediction of safe period after ovulation: " + safeStart.format(formatter) + " onward" 

       
                };
       
            }
           
  
        
         }
                                                                                                        


             
            
      
        


        
