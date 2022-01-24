import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regx {
  public static void main(String[] args) {
    final String REGEX_PATTERN = "foo.*bar";
    Pattern r = Pattern.compile(REGEX_PATTERN);
    try {

      FileReader fr = new FileReader("C:\\Users\\LENOVO\\Desktop\\siddiqa\\java programs\\data.txt");
      BufferedReader br = new BufferedReader(fr);
      String line;
      while ((line = br.readLine()) != null) {
        Matcher m = r.matcher(line);
        if (m.find()) {
          System.out.println(line);

        }

      }
      br.close();
    } catch (IOException e) {
      e.printStackTrace();

    }
  }
}
