// I made this because the stupid independent study homework is tedious and I don't want to go through the process of 
looking at a random number, looking at the list, writing the response down, then repeating that shiz 15 * 5 times over
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String[][] dorms = new String[10][10];
    for(int i = 0; i < dorms.length; i++) {
      for(int j = 0; j < dorms.length;j++)
          // Tedious to enter the opinions, but it is a lot more convenient than searching them lists
          System.out.print("Are students in dorm [" + i + "] [" + j + "] in favor? y/n: ");
          String favor = scan.next();
          if(favor.equals("y"))
          {
            dorms[i][j] = "in favor";
          }
          else
          {
            dorms[i][j] = "not in favor";
          }
        }
  }
    int count = 0;
    while(true)
      {
        System.out.println("Which dorm do you want to check?");
        System.out.println("Enter the floor: ");
        int floor = scan.nextInt();
        if(floor == 100)
        {
          count = 0;
          System.out.println("Counter has been reset!"); // idk how else i would've reset it
          floor = scan.nextInt();
        }
        System.out.println("Enter the room number: ");
        int room = scan.nextInt();
        if(dorms[floor][room].equals("in favor"))
        {
          count++;
        }
        System.out.println("The opinion of room [" + floor + "] [" + room + "] is: " + dorms[floor][room]);
        System.out.println("Number in favor: " + count);
      }
  }
}
