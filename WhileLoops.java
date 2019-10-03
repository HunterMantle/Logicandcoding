

/**
 * Skeleton code for the while loops practice day.
 * 
 * @author Roy Chancellor
 * @version 3/15/2019
 */

//import java.util.Scanner;
//public class WhileLoops
//{
    //public static void main( String args[] ) {
        
        //Scanner q = new Scanner (System.in);
        //int a=1;
        //outerloop:
        //while (a==1){
            //System.out.println("Press 1 to square a number");
            //System.out.println("Press 2 to cube a number");
            //System.out.println("Press 3 to end the program");
            //int command= q.nextInt();
            
            //while (command ==3) {
                //System.out.println("End program");
               // break outerloop;
            //}
            //System.out.println ("Enter the number you want to use");
            //int b=q.nextInt();
            //int square, cube;
            //while (command ==1) {
                //square=b*b;
                //System.out.println(square);
                //break;
            //}
            //while (command ==2) {
                //cube=b*b*b;
                //System.out.println(cube);
                //break;
            //}
            //System.out.println();
        //}
    //}
//}


//CLASS VERSION 2

//import java.util.Scanner;
//public class WhileLoops
//{
    //public static void main( String args[] ) {
        //Scanner q = new Scanner (System.in);
        //int n;
        //int d;
        //int c=0;
        //System.out.println("type out a numerater");
        //n=q.nextInt();
        //System.out.println("type out a demoninator");
        //d=q.nextInt();
        //while (n>d) {
           // n=n-d;
           // c++;
        //}
           // System.out.print(c + " " + n + "/" + d);
       // }
   // }
   
   
   import java.util.Scanner;
public class WhileLoops
{
    public static void main( String args[] ) {
        Scanner q = new Scanner (System.in);
        
        int f=0;
        System.out.println ("Knock, Knock, Who's there?");
        String Joke = q.nextLine();
        outerloop:
        while (f==0){
        if (Joke.equalsIgnoreCase("banana")){
        System.out.println ("Banana who?");
        Joke=q.next();
    }
        else if (Joke.equalsIgnoreCase("Orange")) {
        System.out.println ("Orange you glad you didn't type banana");
        Joke=q.next();
    }
        else {
        System.out.println("You are not playing my game very well");
        Joke=q.next();
    }
    if (Joke.equalsIgnoreCase("Hunter")){
        break outerloop;
    }
}
}
     }   
        
   
        

                