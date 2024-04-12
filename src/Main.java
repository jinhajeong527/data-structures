import com.jjh.string.StringUtils;


public class Main {
    public static void main(String[] args) {
        int count1 = StringUtils.findNumberOfVowels("Hello World");
        int count2 = StringUtils.findNumberOfVowels("");
        int count3 = StringUtils.findNumberOfVowels(null);
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
    }
}