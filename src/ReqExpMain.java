import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReqExpMain {
    public static void main(String[] args) {
        String name="alex@com.pl";
        String name1="al@com.pl";
        String name2="a@com.pl";
        String name3="kk@com.pl";
        String template="^a.*[@]{1}.*[lm]$";
        boolean isMatched=Pattern.matches(template,name);
        System.out.println(isMatched);

//        Pattern pattern=Pattern.compile(template);
//        Matcher matcher=pattern.matcher(name);
//        System.out.println(matcher.matches());
//        pattern.matcher(name1);
    }
}
