import java.util.Scanner;
public class AOperator {
    public static void main(String[] args) throws Exception {
      Scanner scan = new Scanner(System.in);

Topic intb = new Topic("Ints","When working with ints they should probably be written as  int *name* = *whatever value you want*;  \n\t(NEVER FORGET THE SMICOLIN)\n Things you can't do:\n\nInts hold a total byte data of 32 and cant hold the extra parts of a decimal\n\n If you intend to put a double in a int like 6.5, it would become 6 cause a int cant hold a byte size that is bigger than its own.\n___________________________________\n\n\n");
System.out.println(intb);

Topic doubleb = new Topic("Doubles","While working with doubles the code to make the double should look like\n\tdouble *name* = *what ever value as a decimal*;\n Being able to work on the code is one thing but now its pacialy-time to learn how help full print can be\n Using *System.out.print(name of object);*\n\n This prints the value held within the double same as int and more.\n The big thing with prints is that when you get the value showed in the Console and if its an awnser that you weren't tying to get you can go and fix it in a better way. \n\n   Just to note: doubles can't hold int values it automatically become a double like 8.0");

System.out.println(doubleb);

// System.out.println("Welcome to your easy java learning course.\n Here You Will begin with learning the basics of math\n If you want to practice go to Replit.com");

  
   

/* 
The number 1 is to refer to notes on how ints and doubles work

The number 2 is for a begining lesson on strings
*/

}

    
} // dont delete this line
