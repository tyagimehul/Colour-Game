import java.util.HashMap;

public class Play {

  private HashMap < String,
  elements > subscribed;

  Play() {
    subscribed = new HashMap < String,
    elements > ();
  }

  /* ARTICLE FACTORY */

  private elements entityFactory(String entity) {

    entity = entity.toLowerCase();
    switch (entity) {
    case "apple":
      return new apple();

    case "frog":
      return new frog();

    case "banana":
      return new banana();

    case "salt":
      return new salt();

    case "ink":
      return new ink();

    case "blood":
      return new blood();

    case "sky":
      return new sky();

    default:
      return null;

    }
  }

  /* SUBSCRIPTION */
  private boolean subscribe(String entity) {
    elements ent = entityFactory(entity);
    if (ent == null) {
      return false;
    }

    subscribed.put(entity.toLowerCase(), ent);
    return true;
  }

  /* UNSUBSCRIPTION */

  private boolean unsubscribe(String entity) {

    if (subscribed.containsKey(entity.toLowerCase())) {
      subscribed.remove(entity.toLowerCase());
      return true;
    }
    return false;

  }

  /* COLORWISE PRINTING */

  private void colorMatch(String color) {

    subscribed.forEach((k, v) ->{

      if (v.colors.contains(color)) {
        System.out.println(v.speak(color.toLowerCase()));

      }
    });

  }

  /* PRINT SUBSCRIPTIONS*/

  private void printAllSubscribed() {
    System.out.print("[");
    subscribed.forEach((k, v) ->{

      System.out.print(k + " ");

    });
    System.out.println("]");
  }

  /* COMMAND EXTRACTION */

  private String toCommand(String command) {
    if (command.startsWith("+")) {
      return "Subscribe";
    }
    else if (command.startsWith("-")) {
      return "unSubscribe";
    }
    else {
      return command;
    }
  }

  /* EXECUTE COMMAND */
  void getCommmands(String command) {

    switch (toCommand(command)) {
    case "list":
      printAllSubscribed();
      break;
    case "Subscribe":

      if (subscribe(command.substring(1))) {
        System.out.println("Subscribed " + command.substring(1));
      }
      else {
        System.out.println("Cannot Subscribe!");
      }
      break;
    case "unSubscribe":
      if (unsubscribe(command.substring(1))) {
        System.out.println("unsubscribed " + command.substring(1));
      }
      else {
        System.out.println("Cannot Unsubscribe.");
      }
      break;
    case "exit":
      System.out.println("exit!");
      System.exit(0);
    default:
      colorMatch(command);
      break;

    }

  }

}
