import java.util.Scanner;

public class ColourGame {

  public static void main(String[] args) {
    
    Play obj = new Play();
    Scanner s = new Scanner(System.in);
    String command;
    while (true) {
      command = s.next();
      obj.getCommmands(command);

    }
  }
}

