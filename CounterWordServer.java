import java.io.OutputStream;

public class CounterWordServer extends SimpleLineProcessingServer {

  public CounterWordServer(int port, String quitCommand, OutputStream os) {
    super(port, quitCommand, os);
  }

  @Override
  protected String process(String input) {
    String trimString = input.trim().replaceAll("\\s+", " ");
    String[] words = trimString.split("\\s|\\.|\\,");
    return String.valueOf(words.length);
  }
}
