//Java class ForLoops.java

/**
 * Skeleton code for the forloops practice day
 * 
 * @author Roy Chancellor
 * @version 2/26/2019
 */
public class ForLoops
{
    public static void main( String args[]) {
        //variable declarations
        int i, cube; 
       
        System.out.println ("i\tcube");
        //for loop to perfrom the task
        for(i=1; i<=10; i = i+1) {
            
            cube = i*i*i;
            System.out.println (i  + "\t" + cube);
            
        }
        int odd;
        System.out.println ("odd");
        for(odd=99; odd>=1; odd = odd-2) {
            System.out.println (odd);
        }
        
        String a = "The quick brown fox jumped over the lazy dog";
        int n = a.length();
        
        a.charAt (0);
        for (int j = 0; j < a.length(); j++) {
            System.out.println(a.charAt(j));
        }
        
        
    }  //end main
} //end ForLoops class

    
    