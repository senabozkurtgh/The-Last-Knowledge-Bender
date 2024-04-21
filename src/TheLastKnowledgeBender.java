import java.util.Scanner;

public class TheLastKnowledgeBender {
public static void main(String[] args) {
	System.out.println("Welcome to THE LAST KNOWLEDGE BENDER");

    Scanner input = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = input.next();

    System.out.print("Enter your surname: ");
    String surname = input.next();

    System.out.println("Welcome " + name + " " + surname);
    System.out.print("\nScore table ;"
    		+ "\n There are 6 questions prepared by Öykü, Beril, Sena, Sabri, Halil, Arif"
    		+ "\n 1) 10 points"
    		+ "\n 2) 20 points"
    		+ "\n 3) 20 points"
    		+ "\n 4) 15 points"
    		+ "\n 5) 15 points"
    		+ "\n 6) 20 points"
    		+ " \n            Good Luck ");

    // QUESTION 1#
    System.out.println("\nAre you ready for the first question? If okay, please enter '1': ");

    boolean user_response = false;
    int p_1 = 0;  

    while (!user_response) {
        int being_ready = input.nextInt();

        if (being_ready == 1) {
            boolean situation = false;
            int attempts_1 = 0;

            while (!situation) {
            	int a = (int) (Math.random()*10)+1;
	        	int b = (int) (Math.random()*10)+1;
                System.out.println("Question 1:");
                System.out.println("Choose an integer between 1 and 4 (both included): ");
	        	int num = input.nextInt();
	        	
	        	switch (num)
	        	{
	        	   case 1:
	        			
	        	System.out.printf(" What is the answer of %d + %d ? ",a ,b);
				 int ans_1 = input.nextInt();
	            attempts_1++;
	            
	             if (ans_1 == a+b ) {
	                System.out.println("Congratulations! Correct!");
	                System.out.println("You got the answer in "+ attempts_1 +". attempt");
	                p_1 = 10-2*(attempts_1-1);
	                System.out.println("You obtained "+ p_1 +" point from this question");
	                situation = true;}
	             
	             else if (attempts_1 == 5) {
	            	 System.out.println("YOU GAIN NOTHING IN THIS PART");
	            	 break;
	            } else {
	                System.out.println("Wrong answer, Another similar question is here: ");}
	            
	        user_response = true;
	       
         break;
       case 2 :
    	
    	  System.out.printf(" What is the answer of %d - %d ? ",a ,b);
		 int ans1_1 = input.nextInt();
       attempts_1++;
       
        if (ans1_1 == a-b ) {
           System.out.println("Congratulations! Correct!");
           System.out.println("You got the answer in "+ attempts_1 +". attempt");
           p_1 = 10-2*(attempts_1-1);
           System.out.println("You obtained "+ p_1 +" point from this question");
           situation = true;}
        
        else if (attempts_1 == 5) {
       	 System.out.println("YOU GAIN NOTHING IN THIS PART");
       	 break;
       } else {
           System.out.println("Wrong answer, Another similar question is here: ");}
       
   user_response = true;
   
   break;
   
   case 3 :
   System.out.printf(" What is the answer of %d * %d ? ",a ,b);
	 int ans_1_2 = input.nextInt();
  attempts_1++;
  
   if (ans_1_2 == a*b ) {
      System.out.println("Congratulations! Correct!");
      System.out.println("You got the answer in "+ attempts_1 +". attempt");
      p_1 = 10-2*(attempts_1-1);
      System.out.println("You obtained "+ p_1 +" point from this question");
      situation = true;}
   
   else if (attempts_1 == 5) {
  	 System.out.println("YOU GAIN NOTHING IN THIS PART");
  	 break;
  } else {
      System.out.println("Wrong answer, Another similar question is here: ");}
  
user_response = true;

        break;
   case 4:
	   
	   System.out.printf(" What is the answer of %d / %d ? (round it nearest integer value)",a ,b);
		 int ans_1_3 = input.nextInt();
    attempts_1++;
    double answer =  (double)a/b;
     if (ans_1_3 == rounding(answer) ) {
        System.out.println("Congratulations! Correct!");
        System.out.println("You got the answer in "+ attempts_1 +". attempt");
        p_1 = 10-2*(attempts_1-1);
        System.out.println("You obtained "+ p_1 +" point from this question");
        situation = true;}
     
     else if (attempts_1 == 5) {
    	 System.out.println("YOU GAIN NOTHING IN THIS PART");
    	 break;
    } else {
        System.out.println("Wrong answer, Another similar question is here: ");}
    
user_response = true;

          break;
	   
	        	}
            }
        }

                
         else {
            System.out.println("Please type '1' to open the first question: ");
        }
    }
    
      //QUESTION 2#
		System.out.println("Are you ready for the second question? If okey, please enter '2': ");
		
		boolean user_response_2 = false;
		
		int p_2=0;
		
		while (!user_response_2) {
			
			int being_ready_2 = input.nextInt();
		  
		if (being_ready_2 == 2) {
			  String hints1[]= {"Hint 1: the first letter is 'c'","Hint 2: this art kind requires just one colour pencil","Hint 3: the colour is black","Hint 4: it is all about coal","charcoal"};
			
			  String ch = "charcoal";
			  
			  int hints_inx = 0;
			  int attempts_2 = 0;
			  
			  System.out.println("Question 2: ");
			  System.out.println("The word's lenght is "+ ch.length() );
			  System.out.println("That is a kind of art");
			  System.out.println("Guess the hidden word: ");
			  System.out.print(" (express your answer in same case size, e.g. , 'FOOTBALL' or 'football') ");
			  while (true) {
				  
				  String ans_2 = input.next();
				  attempts_2++;
				 
				  
				  if (ans_2.equals("charcoal") || ans_2.equals("CHARCOAL")) {
					  System.out.println("Congratulations! Correct!");
		                System.out.println("You got the answer in "+ attempts_2 +". attempt");
		                p_2 = 20-4*(attempts_2-1);
		                System.out.println("You obtained "+ p_2 +" point from this question");
		                System.out.println("Total point until second question is "+(p_1+p_2)+" points");
		                break;
		               
				  }
				  else if (attempts_2 == 5) {
		            	 System.out.println("That was 'charcoal'"+"\n YOU GAIN NOTHING IN THIS QUESTION");
		            	 break;}
				  
				  else {
					  System.out.println("Wrong answer. Try again.");
					  System.out.println("Availible "+ hints1[hints_inx]);
					  hints_inx++;}
				  
				  
		           }
			user_response_2 = true;}
		else System.out.println("Please type '2' to open the second question: ");
		 }
		
		//QUESTION 3#
		System.out.println("Are you ready for the third question? If okey, please enter '3': ");
		
		boolean user_response_3 = false;
		int p_3=0;
		while (!user_response_3) {
		
		int a = input.nextInt(); 
		if(a==3) {
		System.out.print("Let's start the third question.");
		System.out.print("Which 3 numbers have the same answer if they’re added or multiplied together?");
		System.out.println("\n1-6,5,4\n2-5,4,3\n3-4,3,2\n4-3,2,1");
		int attempts=4;
		
		
		for(int attempt3=1;attempt3<=attempts;attempt3++) {	
		int ans3=input.nextInt();
		p_3= 20-5*(attempt3-1);
		int b = 5;
		
		
		
		switch(ans3) {
		 case 1:
			 System.out.println("Wrong answer!");
			 System.out.println("At this attempt, you lost " + b);
			 break;		 
		 case 2:
			 System.out.println("Wrong answer!");
			 System.out.println("At this attempt, you lost " + b);
			 break;
		 case 3:
			 System.out.println("Wrong answer but it was close!");
			 System.out.println("At this attempt, you lost " + b);
			 break;
		 case 4:
			 System.out.println("You knew it,you gain "+p_3+" points"+"\nTotal point until third question is "+(p_1 + p_2 + p_3)+" points");
			 break;
		 default:
			 System.out.println("This answer is invalid, please try again!");}
		if(ans3==4) {
			break;
		}else {
			continue;
		}
		}
		user_response_3 = true;}
		else System.out.println("Please type '3' to open the third question: ");
		}

		//QUESTION 4#
		System.out.println("Are you ready for the fourth question? If okay, please enter '4':");

		boolean user_response_4 = false;
		int p_4 = 0;

		while (!user_response_4) {
		    int being_ready_4 = input.nextInt();

		    if (being_ready_4 == 4) {
		        boolean situation = false;
		        int attempts_4 = 0;

		        while (!situation) {
		            System.out.println("Question 4:");
		            System.out.printf("What is the capital of North Macedonia: ");
		            String ans_4 = input.next();
		            attempts_4++;

		            if (ans_4.equalsIgnoreCase("skopje")) {
		                System.out.println("Congratulations! Correct!");
		                System.out.println("You got the answer in " + attempts_4 + ". attempt");
		                p_4 = 15 - 3 * (attempts_4 - 1);
		                System.out.println("You obtained " + p_4 + " point from this question\nTotal point until fourth question is " + (p_1 + p_2 + p_3 + p_4) + " points");
		                situation = true;
		            } else if (attempts_4 == 5) {
		                System.out.println("YOU GAIN NOTHING IN THIS PART\nTotal point until fourth question is " + (p_1 + p_2 + p_3 + p_4) + " points");
		                break;
		            } else {
		            	System.out.println("Wrong answer. Try again.");}
		        }
		            
		        user_response_4 = true;
		    } else {
		        System.out.println("Please type '4' to open the fourth question: ");
		    }
		}

		//QUESTION 5#
		System.out.println("Are you ready for the fifth question? If okay, please enter '5':");

		boolean user_response_5 = false;
		int p_5 = 0;

		while (!user_response_5) {
		    int being_ready_5 = input.nextInt();
		    input.nextLine(); 
		    

		    if (being_ready_5 == 5) {
		        boolean situation = false;
		        int attempt_5 = 0;

		        while (!situation) {
		            System.out.println("Question 5:");
		            System.out.printf("Who is the author of Crime And Punishment?\n (Be careful about case sizes,"
		            		+ "\n e.g. ; Salvador Dali");
		            String ans_5 = input.nextLine();
		            attempt_5++;

		            if (ans_5.equals("Fyodor Dostoyevsky")) {
		                System.out.println("Congratulations! Correct!");
		                System.out.println("You got the answer in " + attempt_5 + ". attempt");
		                p_5 = 15 - 3 * (attempt_5 - 1);
		                System.out.println("You obtained " + p_5 + " point from this question\nTotal point until fifth question is " + (p_1 + p_2 + p_3 + p_4 + p_5) + " points");
		                situation = true;
		            } else if (attempt_5 == 5) {
		                System.out.println("YOU GAIN NOTHING IN THIS PART\nTotal point until fifth question is " + (p_1 + p_2 + p_3 + p_4 + p_5) + " points");
		                break;
		            }else {
		            	System.out.println("Wrong answer. Try again.");}
		        } 
		        
		        user_response_5 = true;
		    } else {
		        System.out.println("Please type '5' to open the fifth question: ");
		    }
		}
		
		//QUESTION 6#

try {
    System.out.println("Are you ready for the sixth question? If okay, please enter '6':");
    boolean correctAnswerProvided = false;
    int p_6 = 0;

    while (!correctAnswerProvided) {
        int being_ready_6 = input.nextInt();

        if (being_ready_6 == 6) {
            int attempts_6 = 0;

            while (true) {
                try {
                    System.out.println("You'll see a maze which has an entry and an exit.");
                    System.out.println("Here are rules to help you find the correct answer.");
                    System.out.println(" 1) You can go only by pressing 0's. You cannot press 1's");
                    System.out.println(" 2) You can go only left right up or down and only 1 unit for each step.");
                    System.out.println(" 3) Crossing up or down is forbidden");
                    System.out.println("You can start from the upper left corner. Good luck!");
                    System.out.println("010000010");
                    System.out.println("000111001");
                    System.out.println("101011101");
                    System.out.println("000000101");
                    System.out.println("101110100");
                    System.out.println("001111110");
                    System.out.println("110000000");
                    System.out.println("011011111");
                    System.out.println("000000000");

                    displayMazeOptions();

                    int ans_6 = input.nextInt();
                    input.nextLine();
                    int C = 29;
                    attempts_6++;

                    if (ans_6 == 29) {
                        System.out.println("Congratulations! The answer is " + C);
                        System.out.println("You got the answer in " + attempts_6 + ". attempt");
                        p_6 = 20 - 4 * (attempts_6 - 1);
                        System.out.println("You obtained " + p_6 + " points from this question\nTotal points until the sixth question is " + (p_1 + p_2 + p_3 + p_4 + p_5 + p_6)); 
                        System.out.println("Here are the scores of all questions:\n1.score: "+(p_1)+" points");
                        System.out.println("2.score: "+(p_2)+" points");
                       	System.out.println("3.score: "+(p_3)+" points");
                       	System.out.println("4.score: "+(p_4)+" points");
                       	System.out.println("5.score: "+(p_5)+" points");
                       	System.out.println("6.score: "+(p_6)+" points");
                    	System.out.println("You gained "+(p_1+p_2+p_3+p_4+p_5+p_6)+" points");
                    	System.out.println("Thank you for solving THE LAST KNOWLEDGE BENDER!");
                       	
                        correctAnswerProvided = true; 
                        break;
                        }
                      else if (attempts_6 == 5) {
                       	 System.out.println("YOU GAIN NOTHING IN THIS PART");
                       	System.out.println("You gained "+(p_1+p_2+p_3+p_4+p_5+p_6)+" points");
                       	System.out.println("Thank you for solving THE LAST KNOWLEDGE BENDER!");
                        break;
                    } else {
                        System.out.println("Wrong! Try again.");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("Please type '6' to open the sixth question:");
        }
    }
} catch (Exception e) {
    e.printStackTrace();
}

input.close();

}
private static void displayMazeOptions() {
System.out.println("How many steps do you have to take to exit the maze? (Count the steps you take outside the maze)"+"\n Which one is the answer given below?");
System.out.println(" 24 ");
System.out.println(" 26 ");
System.out.println(" 29 ");
System.out.println(" 32 ");

		 	 

}public static int rounding(double num) {
	if (num >= (int)num +0.5)
		return (int)num +1;
	else 
		return (int)num;
	
}}


