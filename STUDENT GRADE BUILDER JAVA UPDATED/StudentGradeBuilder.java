
import java.util.Arrays;


    public class StudentGradeBuilder{
        private String nameOfExam;
        private static int[][] scores;

    


        public StudentGradeBuilder(String nameOfExam, int[][] scores){
            this.nameOfExam = nameOfExam;
            this.scores = scores;


        }
        public void setNameOfExam(String nameOfExam){
            this.nameOfExam = nameOfExam;

        }
        public String getNameOfExam(){
            return nameOfExam;


        }
        public static int totalStudentScore(int[] studentScores){
                int totalScore = 0;
                

                for (int value : studentScores){
                  
                        totalScore += value;
                    
            
                }
                return totalScore;


    
        }
        public static double studentAverageScore(int[] studentScores){
            int averageScore = 0;
            
            return (double)  totalStudentScore(studentScores)/studentScores.length;



        }
       
        public static int position(int[] studentScores, int numberOfStudents, int numberOfSubjects){
          
            int position = 1; 
            
            

                int value = totalStudentScore(studentScores);

                 

                
                for (int count1 = 0; count1 < numberOfStudents; count1 ++){
                        
                        int newTotal = 0;
                        
                        for (int count2 = 0; count2 < numberOfSubjects; count2 ++){
                            newTotal += scores[count1][count2];
                        }  
                    

                        if (newTotal > value) position ++;  
                       
                    


                }
            
            
            return position;
            
       


        }       
        public void studentSummary(int[][] scores, int numberOfStudents, int numberOfSubjects, int[] subjectLevelCount){

            System.out.println("\n\nSUBJECT SUMMARY");

            System.out.println();
            
            
            for (int counter = 0; counter < numberOfSubjects; counter ++){
                int highestScore = scores[0][counter];
                int lowestScore = scores[0][counter];
                int totalSubjectScore = scores[0][counter];
                double averageScore = 0.0;
                int countPassSubject = 0;
        
                
                
                
                
                if (scores[0][counter] >= 50) {

                    countPassSubject = 1;

                    subjectLevelCount[counter] += 1;
                    
                

                    

                }
                int highestScoreHolder = 1;
                int lowestScoreHolder = 1;


                for (int count = 1; count < numberOfStudents; count ++){
                    totalSubjectScore += scores[count][counter];  
                    averageScore = (double) totalSubjectScore/numberOfStudents;

                    if (scores[count][counter] >= 50) {

                        countPassSubject ++;
                        subjectLevelCount[counter] ++;

                    
                        

                   
                    }
                    if (scores[count][counter] > highestScore){
                        highestScore = scores[count][counter];
                        highestScoreHolder = count + 1;
                
                       

                    

                    }
                    if (scores[count][counter] < lowestScore){
                        lowestScore = scores[count][counter];
                        lowestScoreHolder = count + 1;

                     


                    }              
               
                

                }
                System.out.printf("Subject: %d%nBest student in SUB: %d is Student: %d with score: %d%nWorst student in SUB: %d is Student: %d with score: %d%nclass Total Score is :%d%nClass Average score is: %.2f%nNumber of Passes is: %d%nNumber of Failures is: %d%n%n", counter + 1, counter + 1, highestScoreHolder, highestScore, counter + 1, lowestScoreHolder, lowestScore, totalSubjectScore, averageScore, countPassSubject, numberOfStudents - countPassSubject);
                



            
            }
            int easiestSubject = subjectLevelCount[0];
            int hardestSubject = subjectLevelCount[0];
        
            int subjectCountEasy = 1;
            int subjectCountHard = 1;

           
            
            for (int count = 1; count < numberOfSubjects; count ++){
                if (subjectLevelCount[count] > easiestSubject){

                    easiestSubject = subjectLevelCount[count];

                    subjectCountEasy = count + 1;
                    
                 
                
                }
                if (subjectLevelCount[count] < hardestSubject){

                    hardestSubject = subjectLevelCount[count];
                    subjectCountHard = count + 1;

                }
                    


             
            
            
            }
            for (int count = 0; count < 78; count ++){
                System.out.print("="); 



    

            }
            System.out.println();

            System.out.printf("The hardest subject is SUB: %d with %d failures%nThe easiest subject is SUB: %d with %d passes%n%n", subjectCountHard,  numberOfStudents - hardestSubject , subjectCountEasy, easiestSubject);
            
            
         }
         public void getBeGraduatingStudent(int[][] scores, int numberOfStudents, int numberOfSubjets){


            int[] totalList = new int[numberOfStudents];
    
            int classOverAllScore = 0;
            double classOverAllAverage = 0.0;


            int[] oneDimensionScores = Arrays.stream(scores).flatMapToInt(Arrays::stream).toArray();

       
            int highestClassScore = oneDimensionScores[0];

            
            int highScoreIndex = 0;
            
            


            int lowestClassScore = oneDimensionScores[0];
            int lowScoreIndex = 0;

            for (int count = 1; count < oneDimensionScores.length; count ++){
               if (oneDimensionScores[count] > highestClassScore){
                    highestClassScore = oneDimensionScores[count];
                    highScoreIndex = count;

                } 
                if (oneDimensionScores[count] < lowestClassScore){
                    lowestClassScore = oneDimensionScores[count];
                    lowScoreIndex = count;

                }

            
            }
            int studentHighScoreIndex = highScoreIndex / numberOfSubjets;
            int subjectHighScoreIndex = highScoreIndex % numberOfSubjets;


            int studentLowScoreIndex =  lowScoreIndex / numberOfSubjets;
            int subjectLowScoreIndex =  lowScoreIndex % numberOfSubjets;
            
  
        

            for (int count = 0; count < 78; count ++){
                System.out.print("=");

            }
            System.out.println();


  
        
            System.out.printf("The Overall Highest score is scored by student: %d in Subject: %d scoring: %d%nThe Overall Lowest score is scored by student: %d in Subject: %d, scoring: %d", studentHighScoreIndex + 1, subjectHighScoreIndex + 1, highestClassScore, studentLowScoreIndex + 1, subjectLowScoreIndex + 1, lowestClassScore);
            

            System.out.println();
            for (int count1 = 0; count1 < numberOfStudents; count1 ++){

                for (int count2 = 0; count2 < numberOfSubjets; count2 ++){
                    totalList[count1] += scores[count1][count2];

                }

            

            }
            for (int number : totalList){
                classOverAllScore += number;
    
            
            }
            classOverAllAverage = (double) classOverAllScore/numberOfStudents;

      
    
            int bestStudentScore = totalList[0];
            int worstStudentScore = totalList[0];

            int bestStudentScoreCount = 1;
            int worstStudentScoreCount = 1;

        
            for (int counter = 1; counter < totalList.length; counter ++){
                if (totalList[counter] > bestStudentScore){
                    bestStudentScore = totalList[counter];
    
                    bestStudentScoreCount = counter + 1;

                }
                if (totalList[counter] < worstStudentScore){
                    worstStudentScore = totalList[counter];

                     worstStudentScoreCount = counter + 1;          
    
             
                }


            }
            for (int count = 0; count < 78; count ++){
                System.out.print("=");

            
            }
            System.out.println();
            System.out.print("CLASS SUMMARY\n");

            for (int count = 0; count < 78; count ++){
                System.out.print("=");


            }
            System.out.println();
        
            System.out.printf("Best Graduating Student is: Student %d scoring %d%n", bestStudentScoreCount, bestStudentScore);

            for (int count = 0; count < 78; count ++){
                System.out.print("=");




            }
            System.out.println("\n");
            
            for (int count = 0; count < 78; count ++){
                System.out.print("!");



            }
            System.out.println("\n");



            System.out.printf("Worst Graduating Student is: Student %d scoring %d%n", worstStudentScoreCount, worstStudentScore);

            for (int count = 0; count < 78; count ++){
                System.out.print("!");




            }
            System.out.println();



            for (int count = 0; count < 78; count ++){
                System.out.print("=");



            }
            System.out.println();




            System.out.printf("Class total score is: %d%nClass Average is: %.2f%n", classOverAllScore, classOverAllAverage);

            for (int count = 0; count < 78; count ++){
                System.out.print("="); 





            }
            System.out.println(); 

            for (int count = 0; count < 78; count ++){
                System.out.print("="); 


          

            
            }
            

        

        } 
               
    }



















