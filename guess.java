import java.util.Random;
import java.util.Scanner;



 class guess {
    public static void main(String[] args) {
        System.out.println("Welcome TO WonderLand..");
        System.out.println("May I Know Your Name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello " + name);

        System.out.println("Shall we start Game..");
        // ASK AGain and AGain to start a Number...
        int begin_ans = sc.nextInt();
        while (begin_ans != 1) {
            System.out.println("Shall we start Game..");
            begin_ans = sc.nextInt();
        }
        Random rand = new Random();
        int x = rand.nextInt( 20) + 1; // start from 1;
        System.out.println("Please Guess A Number:  ");
        int user_inp = sc.nextInt();

        int count = 0;
        boolean haswon = false;
        boolean max_times = false;

        while(max_times != true) {
            count++;

            if(count <= 5) {
                if (user_inp == x) {
                    haswon = true;
                    max_times = true;
                } else {
                    System.out.println("Opps... Wrong Guess:");
                    System.out.println("Guess In The range 20");
                    user_inp = sc.nextInt();
                }

            }
            else {
                max_times = true;
            }
        }

        if(haswon == true) {
            System.out.println("Congrulations You Won a Scratch Card");
        }
        else {
            System.out.println("Game Over");
            System.out.println("The Number Was: " + x);
            System.out.println("Try Again:");
        }

    }
}


