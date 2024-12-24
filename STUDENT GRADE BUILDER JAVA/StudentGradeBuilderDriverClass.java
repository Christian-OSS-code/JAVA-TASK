import java.util.Scanner;
import java.util.Arrays;


    public class StudentGradeBuilderDriverClass{
        public static void main(String... args){
            Scanner input = new Scanner(System.in);



         System.out.println("How many students are in your class?: ");
            int numberOfStudents = input.nextInt();



            System.out.println("How many subjects does your students offer?: ");
            int numberOfSubjects = input.nextInt();


            int[][] scores = new int[numberOfStudents][numberOfSubjects];

            int[] subjectLevelCount = new int[numberOfSubjects];



            StudentGradeBuilder studentGrade = new StudentGradeBuilder("FINAL YEAR EXAMINATION LAGB AJA SCHOOL", scores); 



            

            for (int count1 = 0; count1 < numberOfStudents; count1 ++){
                System.out.printf("Student: %d%n", (count1 + 1));


                System.out.println("Enter score between 0 and 100: ");        
                for (int count2 = 0; count2 < numberOfSubjects; count2 ++){
                    
                    scores[count1][count2] = input.nextInt();





                }
                System.out.println();

            }

            System.out.println("\n\nFINAL YEAR EXAMINATION SCORE SHEET, LAGBAJA SCHOOL");




            for (int count = 0; count < 78; count ++){
                System.out.print("=");




            }
            System.out.println();





            System.out.printf("STUDENT\t\t");





            for (int count = 0; count < numberOfSubjects; count ++){
               
                System.out.printf("SUB%d\t", (count + 1));




            }
            System.out.print("TOTAL\tAVERAGE\tPOSITION\n");


            

            for (int count = 0; count < 78; count ++){
                System.out.print("=");



            
            }            
            System.out.println();



        
            for (int count = 0; count < scores.length; count ++){
                System.out.printf("Student: %d\t", (count + 1));
                

                for (int counter = 0; counter < numberOfSubjects; counter ++){
                    System.out.printf("%d\t", scores[count][counter]);



                

                }
                int totalScore = studentGrade.totalStudentScore(scores[count]);

                double averageScore = studentGrade.studentAverageScore(scores[count]);

                int position = studentGrade.position(scores[count], numberOfStudents, numberOfSubjects);

                System.out.printf("%d\t%.2f\t%d%n", totalScore, averageScore, position);

            
            }
            for (int count = 0; count < 78; count ++){
                System.out.print("=");



            }
            System.out.println();
            for (int count = 0; count < 78; count ++){
                System.out.print("=");



            }
            System.out.println();




            studentGrade.studentSummary(scores, numberOfStudents, numberOfSubjects, subjectLevelCount);

            studentGrade.getBeGraduatingStudent(scores, numberOfStudents, numberOfSubjects);
            








        }

    }
