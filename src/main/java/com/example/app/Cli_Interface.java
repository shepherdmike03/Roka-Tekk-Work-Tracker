import java.util.Scanner;



public class Cli_Interface{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    boolean running = true;

    while(running){
      printMenu();
      int choice = readInt(sc,"=>");

      switch (choice){
        case 1 -> TotalTime(sc);
        case 2 -> TotalLine(sc);
        case 3 -> CurrentProject(sc);
        case 4 -> ChangeProject(sc);
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




  private static void ChangeProject(Scanner sc){
    while(true){
      System.out.println("Change the project");
      System.out.println("Current Project $ProjectName");
      System.out.println("0 - Refresh");
      System.out.println("1 - Back");


      int choice = readInt(sc,"=>");
      switch(choice){
        case 0 -> {
          continue;
        }
        case 1 -> {
          return;
        }
      }
    }
  }


  private static void TotalTime(Scanner sc){
    while(true){
      System.out.println("---Total-Time-Worked---");
      System.out.println("WW:DD:HH:MM:SS");
      System.out.println("-----------");
      System.out.println("0 - Refresh");
      System.out.println("1 - Back");

      int choice = readInt(sc,"=>");
      switch(choice){
        case 0 -> {
          continue;
        }
        case 1 -> {
          return;
        }
      }

    }
  }

  private static void TotalLine(Scanner sc){
    while(true){
      System.out.println("---Total-Lines---");
      System.out.println("XXXX- Lines");
      System.out.println("Project Size : - XX GB");
      System.out.println("---------");
      System.out.println("0 - Refresh");
      System.out.println("1 - Back");

      int choice = readInt(sc,"=>");
      switch(choice){
        case 0 -> {
          continue;
        }
        case 1 -> {
          return;
        }
      }

    }
  }


  private static void CurrentProject(Scanner sc){
    while(true){
      System.out.println("---Project-Statistics---");
      System.out.println("Project -> $ProjectName");
      System.out.println("Total Lines : XXXX Lines");
      System.out.println("Total Size  : XX GB ");
      System.out.println("Time Worked : WW:DD:HH:MM:SS");
      System.out.println("---------------------------------");
      System.out.println("Today's Session:\n WW:DD:HH:MM:SS\n XXXX: Lines");
      System.out.println("0 - Refresh");
      System.out.println("1 - Back");

      int choice = readInt(sc,"=>");
      switch(choice){
        case 0 -> {
          continue;
        }
        case 1 -> {
          return;
        }
      }

    }
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
      System.out.print(prompt);
      String line = sc.nextLine().trim();
      try {
        return Integer.parseInt(line);
      } catch (NumberFormatException e) {
        System.out.println("Please enter a valid number");
      }
    }
  }


}
