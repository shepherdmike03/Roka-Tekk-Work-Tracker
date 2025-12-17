import java.util.Scanner;



public class Cli_Interface{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    boolean running = true;

    while(running){
      printMenu();
      int choice = readInt(sc,"Choose an option: ");

      switch (choice){
        case 1 -> System.out.println("Total Worked hours :");
        case 2 -> System.out.println("Total written lines: ");
        case 3 -> System.out.println("Current Project stats: ");
        case 4 -> System.out.println("Change Project: ");
        case 5 -> {
          System.out.println("Exiting, Goodbye\n ~RokaTekk");
          running = false;
        }
        default -> System.out.println("Invalid option (1-5)");
      }
      System.out.println(); // spacing between the lines
    }
    sc.close();
  }

  private static void printMenu(){
    System.out.println("---RokaTekk - WorkTracker---");
    System.out.println("1 - Total worked time");
    System.out.println("2 - Total written lines");
    System.out.println("3 - Current Project Stats");
    System.out.println("4 - Change Project");
    System.out.println("5 - Exit");
  }

  private static int readInt(Scanner sc, String prompt){
    while(true){
      System.out.println(prompt);
      String line = sc.nextLine().trim();
      try {
        return Integer.parseInt(line);
      } catch (NumberFormatException e) {
        System.out.println("Please enter a valid number");
      }
    }
  }


}
