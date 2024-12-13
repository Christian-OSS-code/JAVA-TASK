import java.util.Scanner;
 public class PersonalityTest31{
  public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   int extrovert = 0;
   int introvert = 0;
   int sensing = 0;
   int intuition = 0;
   int thinking = 0;
   int feeling = 0;
   int judging = 0; 
   int perceptive = 0;

   String [][] questions = {
{"A: expend energy, energy groups", "B. conserve energy, enjoy one-on-one"},
{"A: interpret literally", "B. look for meaning and possibilities"},
{"A: logical, thinking, questioning", "B. empathetic, feeling, accomodating"}, 
{"A: organized, orderly", "B. flexible adaptable"}, 
{"A. more outgoing, think out loud", "B. more reserved, think to yourself"}, 
{"A. practical, realistic, experiential", "B. imaginative, innovative, theoretical"}, 
{"A: candid, straight forward, frank", "B. tactful, kind, encouraging"}, 
{"A: plan, schedule", "B. unplanned, spontaneous"}, 
{"A: seek, many tasks, public activities, interaction with others", "B. seek private, solitary activities with quiet to concentrate"}, 
{"A: standard, usual, conventional", "B. different, novel, unique"}, 
{"A: firm, tend to criticize, hold the line", "B; gentle, tend to appreciate, conciliate"}, 
{"A: regulate, structured", "B: easygoing, \"live\" and \"let live\""}, 
{"A: external, communicative, express yourself", "B: internal, reticent, keep to yourself"}, 
{"A: focus on here,-and-now", "B: look to the future, global perspective, \"big picture\""}, 
{"A: tough minded, just", "B: tendere-hearted, merciful"}, 
{"A: preparation, plan, ahead", "B: go with flow, adapts as you go"}, 
{"A: active, initiate", "B: effective, delibrate"}, 
{"A: facts, things, \"what is\"", "B; ideas, dreams, \"what could be\", philosophicate"}, 
{"A: matter of fact, issue-oriented", "B: seneitive, people-oriented, compassionate"}, 
{"A: control, govern", "B: lattitude, freedom"} 
   };
   System.out.println("What is your name: ");
   String name = input.nextLine();
   String[] response = new String[20];
   for (int count1 = 0; count1 < 20; count1 = count1 + 4){
    System.out.printf("%s\t", questions[count1][0]);
    System.out.printf("%s%n", questions[count1][1]);
    System.out.println("Select from option A and B: ");
    response[count1] = input.nextLine();
    if (response[count1].equalsIgnoreCase("A")){
     System.out.println("selection has been collected. You may proceed to the next question");
     extrovert = extrovert + 1;
    }
    else if (response[count1].equalsIgnoreCase("B")){
     System.out.println("selection has been collected. You may proceed to the next question");
     introvert = introvert + 1;
    }
    else{
     System.out.println("Invalid input. Enter either A or B for your option");
     count1 = count1 - 1;
    }
   }
   for (int count2 = 1; count2 < 20; count2 = count2 + 4){
    System.out.printf("%s\t", questions[count2][0]);
    System.out.printf("%s%n", questions[count2][1]);
    System.out.println("Select from option A and B: ");
    response[count2] = input.nextLine();
    if (response[count2].equalsIgnoreCase("A")){
    System.out.println("selection has been collected. You may proceed to the next question"); 
    sensing = sensing + 1;
    }
    else if (response[count2].equalsIgnoreCase("B")){
     intuition = intuition + 1;
    }
    else{
     System.out.println("Invalid input. Enter either A or B for your option");
     count2 = count2 - 1;
    }
   }
   for (int count3 = 2; count3 < 20; count3 = count3 + 4){
    System.out.printf("%s\t", questions[count3][0]);
    System.out.printf("%s%n", questions[count3][1]);
    System.out.println("Select from option A and B: ");
    response[count3] = input.nextLine();
    if (response[count3].equalsIgnoreCase("A")){
     System.out.println("Your response has been collected. You may proceed to the next question");
     thinking = thinking + 1;
    }
    else if (response[count3].equalsIgnoreCase("B")){
     feeling = feeling + 1;
    }
    else{
     System.out.println("Invalid input. Enter either A or B for your option");
     count3 = count3 - 1;
    }
   }
   for (int count4 = 3; count4 < 20; count4 = count4 + 4){
    System.out.printf("%s\t", questions[count4][0]);
    System.out.printf("%s%n", questions[count4][1]);
    System.out.println("Select from option A and B: ");
    response[count4] = input.nextLine();
    if (response[count4].equalsIgnoreCase("A")){
     System.out.println("Your response has been collected. You may proceed to the next question");
     judging = judging + 1; 
    }
    else if (response[count4].equalsIgnoreCase("B")){ 
     perceptive = perceptive + 1;
    }
    else{
     System.out.println("Invalid input. Enter either A or B for your option");
     count4 = count4 - 1;
    }
   }
   String evaluationPersonality = "";
    if (extrovert > introvert) evaluationPersonality += "E";
    else evaluationPersonality += "I";

    if (sensing > intuition) evaluationPersonality += "S";
    else evaluationPersonality += "N"; 
   
    if (thinking > feeling) evaluationPersonality += "T";
    else evaluationPersonality += "F";
   
    if (judging > perceptive) evaluationPersonality += "J";
    else evaluationPersonality += "P";
    
   
        System.out.println("extrovertness: " + extrovert + "\nIntrovertness: " + introvert + "\nSensing: " + sensing + "\nIntuition: " + intuition + "\nThinking: " + thinking + "\nFeeling " + feeling + "\nJudging: " + judging + "\nPerceptive: "+ perceptive);
        System.out.println(evaluationPersonality);
        System.out.println("From your personality evaluation, you are of the personality " + evaluationPersonality);
        
    
            switch (evaluationPersonality){
                case "ISTJ":
                    System.out.println("Quiet, serious earn success by being thorough and dependable. Practical, matter-of-fact, realistic, and responsible. Decide logically what should be done and work toward it steadily, regardless of distractions. Take pleasure in making everything orderly and organized-their life. Value traditions and loyalty");


                    System.out.print("\nThank you for your patronage\n Stay safe");


                    break;

                case "ISFJ":

                    System.out.println("Quiet, friendly, responsible, and conscientious. Commited and steady in meeting their obligations. Thorough, painstaking, and accurate. Loyal, considerate, notice and remember specifics about people who are important to them, concerned with how others feel. Strive to create an orderly and harmonious environmnet at work and at home");


                    System.out.print("Thank you for your patronage\n Stay safe");
            
                    break;



                case "INFJ":
                    System.out.println("Seek meaning and connection in ideas, relationships, and material possesions. Want to understand what motivates");


                    System.out.print("\nThank you for your patronage\n Stay safe");

                    break;


                case "INTJ": 

                    System.out.print("Have original minds and great drive for implementing their ideas and achieving their goals. Quickly see patterns in external events and develop long-range explanatory perspectives. When committed, organize a job and carry it through. Skeptical and independent, have high standards of competence and performance—for themselves and others");

                    System.out.print("\nThank you for your patronage\n Stay safe");


                    break;

                case "ISTP": 

                    System.out.print("Tolerant and flexible, quiet observers until a problem appears, then act quickly to find workable solutions. Analyze what makes things work and readily get through large amounts of data to isolate the core of practical problems. Interested in cause and effect, organize facts using logical principles, value efficiency");

                    System.out.print("\nThank you for your patronage\n Stay safe");


                    break;
    
                case "ISFP":

                    System.out.print("Quiet, friendly, sensitive, and kind. Enjoy the present moment, what's going on around them. Like to have their own space and to work within their own time frame. Loyal and committed to their values and to people who are important to them. Dislike disagreements and conflicts; don't force their opinions or values on others");

                    System.out.print("\nThank you for your patronage\n Stay safe");


                    break;

                case "INFP":

                    System.out.print("Idealistic, loyal to their values and to people who are important to them. Want to live a life that is congruent with their values. Curious, quick to see possibilities, can be catalysts for implementing ideas. Seek to understand people and to help them fulfill their potential. Adaptable, flexible, and accepting unless a value is threatened");

                    System.out.print("\nThank you for your patronage\n Stay safe");


                    break;


                case "INTP":

                    System.out.println("Seek to develop logical explanations for everything that interests them. Theoretical and abstract, interested more in ideas than in social interaction. Quiet, contained, flexible, and adaptable. Have unusual ability to focus in depth to solve problems in their area of interest. Skeptical, sometimes critical, always analytical");

                    System.out.print("\nThank you for your patronage\n Stay safe");

                    break;


                case "ESTP":

                    System.out.println("Flexible and tolerant, take a pragmatic approach focused on immediate results. Bored by theories and conceptual explanations; want to act energetically to solve the problem. Focus on the here and now, spontaneous, enjoy each moment they can be active with others. Enjoy material comforts and style. Learn best through doing");

                    System.out.print("\nThank you for your patronage\n Stay safe");

                    break;



                case "ESFP":

                    System.out.println("Outgoing, friendly, and accepting. Exuberant lovers of life, people, and material comforts. Enjoy working with others to make things happen. Bring common sense and a realistic approach to their work and make work fun. Flexible and spontaneous, adapt readily to new people and environments. Learn best by trying a new skill with other people");

                    System.out.print("\nThank you for your patronage\n Stay safe");

                    break;


                case "ENFP":

                    System.out.println("Warmly enthusiastic and imaginative. See life as full of possibilities. Make connections between events and information very quickly, and confidently proceed based on the patterns they see. Want a lot of affirmation from others, and readily give appreciation and support. Spontaneous and flexible, often rely on their ability to improvise and their verbal fluency");

                    System.out.print("\nThank you for your patronage\n Stay safe");

                    break;

                case "ENTP":

                    System.out.println("Quick, ingenious, stimulating, alert, and outspoken. Resourceful in solving new and challenging problems. Adept at generating conceptual possibilities and then analyzing them strategically. Good at reading other people. Bored by routine, will seldom do the same thing the same way, apt to turn to one new interest after another");

                    System.out.print("\nThank you for your patronage\n Stay safe");

                    break;


                    case "ESTJ":
    
                        System.out.println("Practical, realistic, matter-of-fact. Decisive, quickly move to implement decisions. Organize projects and people to get things done, focus on getting results in the most efficient way possible. Take care of routine details. Have a clear set of logical standards, systematically follow them and want others to also. Forceful in implementing their plans");

                        System.out.print("\nThank you for your patronage\n Stay safe");

                        break;

                    case "ESFJ":

                        System.out.println("Warmhearted, conscientious, and cooperative. Want harmony in their environment, work with determination to establish it. Like to work with others to complete tasks accurately and on time. Loyal, follow through even in small matters. Notice what others need in their day-to-day lives and try to provide it. Want to be appreciated for who they are and for what they contribute");

                        System.out.print("\nThank you for your patronage\n Stay safe");


                        break;


                   case "ENFJ":

                        System.out.println("Warm, empathetic, responsive, and responsible. Highly attuned to the emotions, needs, and motivations of others. Find potential in everyone, want to help others fulfill their potential. May act as catalysts for individual and group growth. Loyal, responsive to praise and criticism. Sociable, facilitate others in a group, and provide inspiring leadership");

                        System.out.print("\nThank you for your patronage\n Stay safe");


                        break;


                case "ENTJ":
                        System.out.println("Frank, decisive, assume leadership      readily. Quickly see illogical and inefficient procedures and policies, develop and implement comprehensive systems to solve organizational problems. Enjoy long-term planning and goal setting. Usually well informed, well read, enjoy expandin g their knowledge and passing it on to others. Forceful in presenting their ideas");

                        System.out.print("\nThank you for your patronage\n Stay safe");
        

            
    

         
        
       
       
     
   }

 }
}


