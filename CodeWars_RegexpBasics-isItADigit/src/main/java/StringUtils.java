import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {

    public static boolean isDigit(String s) {
    Pattern pattern = Pattern.compile("\\d$");  //"d" is regex for only one number (0-9), "$" is here to assert return true only in case the input consisted ONLY one number in range 0-9
    Matcher matcher = pattern.matcher(s);

        return matcher.matches();
    }

}
