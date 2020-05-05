import java.io.OutputStream;

public class CounterWordServer extends SimpleLineProcessingServer {

  public CounterWordServer(int port, String quitCommand, OutputStream os) {
    super(port, quitCommand, os);
  }
  /*
    Hx code := char
   \x2E = .
   \x2C = ,
   \x3B = ;
   \x3A = :
   \x3F = ?
   \x21 = !
   */
  @Override
  protected String process(String input) {
    String oneSpaceFromWordsLineString = input.trim().replaceAll("\\s+", " ");
    String[] words = oneSpaceFromWordsLineString.split("\\s|\\t|\\x2E|\\x2C|\\x3B|\\x3A|\\x3F|\\x21");
    return String.valueOf(words.length);
  }
}
