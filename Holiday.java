import java.util.Scanner;

public class Holiday {
    public static void main(String[] args){
        String continuegame = "continue";

while(continuegame.equals("continue")) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your heros name: ");
        String name = input.nextLine();

        System.out.println("Welcome to Tylers Christmas Adventure " + name + "!");
        System.out.println("In this game you will be given a series of choices...");
        System.out.println("Make the right choices and save Christmas!");
        System.out.println("Make the wrong choices and well.....");
        System.out.println("Lets Begin!");

        System.out.println("");
        System.out.print("When waking up on Christmas Eve, you see that outise there is over 2 feet of snow!");
        System.out.println("Do you: ");
        System.out.println("A: Sleep in");
        System.out.println("B:Run outside with no jacket because being cold is for the weak");
        System.out.println("or C: Put on 20 layers and shovel your driveway");

        String CorrectChoice1 = "C";
        System.out.print("What will you choose? ");
        String choice1 = input.nextLine();

        if (choice1.equals(CorrectChoice1)) {
            System.out.println("You successfully get all of your snow off your driveway while making a snow fort in the process +100 score");
        } else if (choice1.equals("B")){
            System.out.println("Although courageous, you catch frostbite on your pinky toe making it nearly impossible to walk -100 score");
        } else {
            System.out.println("Really? Sleeping? You sleep straight through New Years. GAME OVER");
            continuegame = "lose";
        }

        String CorrectChoice2 = "A";
        
        System.out.println("A clean driveway = a clean mind");
        System.out.println("You want to make some hot chocolate");
        System.out.println("What temperature will you heat the water to?");
        System.out.println("A: 100 degrees");
        System.out.println("B: 500 degrees");
        System.out.println("C: Ice Cold");
        
        System.out.print("What will you choose? ");
        String choice2 = input.nextLine();

        if (choice2.equals(CorrectChoice2)){
            System.out.println("Your Hot chocolate was the perfect temperature! Delicious! + 50 score!");
        } else if(choice2.equals("B")){
            System.out.println("You burn your tongue and now can only eat liquid food for 6 months. - 50 score");
        } else {
            System.out.println("Just why? Unpleasant, but not bad. + 0 score");
        }


        System.out.println("It is now the night of Christmas Eve");
        System.out.println("The phone starts ringing, its from an unknown number, Do you answer it?");
        String choice3 = input.nextLine();

        if(choice3.equals("yes") || choice3.equals("Yes") || choice3.equals("YES")){
            System.out.println("It's Santa, he needs your help.");
            System.out.println("He misplaced all of the childrens toys and needs help finding them");
            System.out.println("Its time to start searching");
        } else {
            System.out.println("You didnt answer Santas call and now Christmas is ruined. GAME OVER");
            continuegame = "lose";
        }
    boolean location1 = true;
    boolean location2 = true;
    boolean location3 = true;
    int wrestlescore = 0;
    int tmoneyscore = 0;
    int numberguess = 0;
    int numberreal = 3;
    while (location3 || location2 || location1) {
        System.out.println("Where will you search?");
        System.out.println("A: The forest");
        System.out.println("B: The Wrestling room");
        System.out.println("C: Wendys");
        
        String searchchoice = input.nextLine();

        if(searchchoice.equals("A") && location1) {
            System.out.println("In the forest you discover a tree shaped monster with green bushy hair");
            System.out.println("'Hello!' He says. 'If youre looking for some toys, I can help you.'");
            System.out.println("But you need to help me first. He says");
            System.out.println("Beat me in my number guessing game and you cn have them");
            System.out.println("Im thinking of  number from 1-20");
            while (numberguess != numberreal) {
            numberguess = Integer.parseInt(input.nextLine());
                if(numberguess == numberreal) {
                    System.out.println("'WOW! GOOD JOB! You got it' He says");
                    System.out.println("Now take these toys and get out of my sight.");
                    location1 = false;
                } else {
                    System.out.println("HAHA! INCORRECT");
                }
            }
  
   

            }
       
         else if(searchchoice.equals("B") && location2){
            System.out.println("You arrive at the wrestling room.");
            System.out.println("Nobody is here except for a shadow in the back corner");
            System.out.println("If you want these toys youre going to have to beat me in a match.");
            System.out.println("Do you dare challenge T Money the Terrifying?");
            String wrestlingchoice = input.nextLine();
                if(wrestlingchoice.equals("Yes") || (wrestlingchoice.equals("yes"))) {
                    System.out.println("A smile streches across his face");
                    System.out.println("The whistle blows, T money immediately dives at your legs");
                    System.out.println("Do you...");
                    System.out.println("A: Defend with your arms and circle away");
                    System.out.println("B: Reattack by shooting at his legs");
                   
                    String Wrestlingmatchchoice = input.nextLine();
            
                
                    if(Wrestlingmatchchoice.equals("A")) {
                        System.out.println("You sucessfully defend your legs");
                        System.out.println("A surprised T Money stumbles in his shock");
                        System.out.println("Leading to you getting an easy takedown");
                        wrestlescore +=3;
                    } else {
                        System.out.println("T money saw that coming from a mile away");
                        System.out.println("He's able to defend it and circle behind for an easy takedown");
                        tmoneyscore +=3;
                    }

                    System.out.println("Second Period:");
                    System.out.println("You start on bottom, do you....");
                    System.out.println("A: Try to stand up");
                    System.out.println("B: Sit out and turn");
                    Wrestlingmatchchoice = input.nextLine();

                    if(Wrestlingmatchchoice.equals("A")) {
                        System.out.println("You stand up and immedietly feel a lock around your waist");
                        System.out.println("T Money mat returns you so hard you start seeing stars");
                        System.out.println("In the process, he gets 4 backpoints");
                        tmoneyscore +=4;
                    } else {
                        System.out.println("The sit out caught T Money off guard");
                        System.out.println("Afte a quick scramble you were able to get a reversal");
                        wrestlescore +=2;
                    }

                    System.out.println("Third Period:");
                    System.out.println("You start on top, do you....");
                    System.out.println("A: Let T money up and work from neutral");
                    System.out.println("B: Try to lock in a tilt and get backpoints");
                    Wrestlingmatchchoice = input.nextLine();
                    
                    if(Wrestlingmatchchoice.equals("A")) {
                        System.out.println("As soon as Money gets up he hits a blast double");
                        System.out.println("Takedown and backpoints are scored by T Money");
                    tmoneyscore += 7;
                    } else {
                        System.out.println("The tilt was successful!");
                        System.out.println("Backpoints are scored and you ride out T money for the rest of the period");
                        wrestlescore +=4;
                    }
                    System.out.println("Final Score:");
                    System.out.println("T Money: "+ tmoneyscore);
                    System.out.println("Your Score: " + wrestlescore);
                    if(tmoneyscore <= wrestlescore) {
                        System.out.println("You have won the match");
                        System.out.println("T money hands over the toys, dissapointed, but proud");
                        location2 = false;
                    } else{
                        System.out.println("You have lost the match");
                        System.out.println("T money takes the toys and leaves to get a workout in");
                        continuegame = "lose";
                    }
                }

                       else {
                    continuegame = "lose";
                    }
                } else if(searchchoice.equals("C") && location3) {
            System.out.println("You go to Wendys");
            System.out.println("The man at the register asks what you would like");
            System.out.println("You say a baconator and the missing toys");
            System.out.println("He looks confused, but gets the manager.");
            System.out.println("'Hello' he says.'My name is Boozon and im the manager of this fine establishment");
            System.out.println("If you want these toys, you will have to get a perfect score in a game of Wendys trivia");
            System.out.println("Otherwise, im just going to use them in the kids meals");
            System.out.println("Want to play?");
            String wendychoice = input.nextLine();
            if(wendychoice.equals("yes" )|| wendychoice.equals("Yes")) {
                System.out.println("Excellent.");
                System.out.println("Question 1:Who is the Wendys Chain named after?");
                System.out.println("A:Founder Dave Thomas's Daughter");
                System.out.println("B:Founder Dave Thomas's Mom");
                System.out.println("C:Its a random name");

                String wendytriviachoice = input.nextLine();

                if(wendytriviachoice.equals("A")){
                    System.out.println("Correct");
                } else {
                            System.out.println("Incorrect lol");
                            continuegame = "lose";
                }
                    System.out.println("Question 2");
                    System.out.println("Why are Wendy's hamburger patties square instead of round?");
                    System.out.println("A: It looks cool");
                    System.out.println("B: Saves money");
                    System.out.println("C: It shows that Wendys doesnt cut corners");
                    wendytriviachoice = input.nextLine();
                        if(wendytriviachoice.equals("C")) {
                            System.out.println("Correct");
                            System.out.println("Final Question...");
                            System.out.println("What dessert has been on the menu since the resturant opened in 1969");
                            System.out.println("A: The Frosty");
                            System.out.println("B: The Chocolate chunk cookie");
                            System.out.println("C: The cinnabon pull apart");
                            wendytriviachoice = input.nextLine();

                            if (wendytriviachoice.equals("A")) {
                                System.out.println("Correct");
                                System.out.println("You won these fair and square");
                                System.out.println("Thank you for choosing Wendys, come again soon.");
                                location3 = false;
                            }
                        } else {
                            System.out.println("Incorrect lol");
                            continuegame = "lose";
                        }
                }
                      continuegame = "win";

            }
        }
        input.close();
    }
     if (continuegame.equals("lose")){
        System.out.println("You lost and Christmas is ruined. Try again?");
    } else if (continuegame.equals("win")){
        System.out.println("You won and Christmas is saved! CONGRATULATIONS! Play again?");
}
}
}