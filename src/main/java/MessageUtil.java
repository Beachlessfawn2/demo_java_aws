public class MessageUtil {
  private String message;

  public MessageUtil(String message) {
    this.message = message;
  }

  public String printMessage() {
    System.out.println(message);
    return message;
  }

  public String salutationMessage() {
    message = "Hi!" + message;
    System.out.println(message);
    return message;
  }
}

public class main {
  public static void main(String[] args) {
        MessageUtil mu = new MessageUtil("Idioten zijn er overal...");
        mu.printMessage();
        mu.salutationMessage();
  }
}