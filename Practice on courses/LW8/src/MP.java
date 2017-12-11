import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MP {
    public static void main(String[] args) {
        String str = "http://google.com";
        Pattern pattern = Pattern.compile("\\w*");
        Matcher m = pattern.matcher(str);
        System.out.println(m.matches());

    }
}
