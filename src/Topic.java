import java.util.Scanner;



public class Topic
{
  private String name;
private String notes;
      


  public Topic(String n, String no)
  {
    this.name = n;
    this.notes = no;
  }


    // public void tNotes(String[] tname, String[] notes)
    // { 
     
//  System.out.println("\nSelect a lesson/note(0-4)");
//       selc = scan.nextInt(); 
    // }
 
  public String toString()
  {
  return "This is " + name +"\n"+notes;
  }
  
  
  
  

}
