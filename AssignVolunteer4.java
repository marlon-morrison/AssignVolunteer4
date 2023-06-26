import java.util.Scanner;
public class AssignVolunteer4{
   public static void main(String[] args){
      int donationType;
      String volunteer;
      String message;
      final int CLOTHING_CODE = 1;
      final int FURNITURE_CODE = 2;
      final int ELECTRONICS_CODE = 3;
      final int OTHER_CODE = 4;
      final String CLOTHING_PRICER = "Regina";
      final String OTHER_PRICER = "Marco";
      final String FURNITURE_PRICER = "Walter";
      final String ELECTRONICS_PRICER = "Lydia";
      
      Scanner input = new Scanner(System.in);
      System.out.println("You agreed to donate at the checkout.");
      System.out.println("What type of donation would you like to give to?");
      System.out.println("CLOTHING - 1");
      System.out.println("FURNITURE - 2");
      System.out.println("ELECTRONICS - 3");
      System.out.println("OTHER - 4");
      System.out.print("Please enter the respectadle integer you would like to donate your change to... ");
      donationType = input.nextInt();
      
      switch(donationType) {
      case(CLOTHING_CODE):
         volunteer = CLOTHING_PRICER;
         message = "a clothing donation";
      break;
      case(FURNITURE_CODE):
         volunteer = FURNITURE_PRICER;
         message = "a furniture donation";
      break;
      case(ELECTRONICS_CODE):
         volunteer = ELECTRONICS_PRICER;
         message = "an electronics donation";
      break;
      case(OTHER_CODE):
         volunteer = OTHER_PRICER;
         message = "another donation type";
      break;
      default:
         volunteer = "invalid";
         message = "an invalid donation type";
      }
      System.out.println("You entered " + donationType);
      System.out.println("This is " + message);
      System.out.println("The volunteer who will price this item is " + volunteer);
   }
}