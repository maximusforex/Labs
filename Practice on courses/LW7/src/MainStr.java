import java.util.StringTokenizer;

public class MainStr {
    public static void main(String[] args) {
        String s = "Hello world";
        System.out.println(s.length());
        System.out.println(s.equals(("Hello world")));
        System.out.println(s.equals((("hello world"))));
        System.out.println(s.equalsIgnoreCase("hello WORLD"));
        System.out.println("    lolkek keklol    ".length());
        System.out.println("    lolkek keklol    ".trim());
        System.out.println("ar   ra  ara   7r".replaceAll(" ", ""));
        System.out.println("hello".contains("el"));
        System.out.println("hello".contains("elh"));
        System.out.println("gghHNt".toLowerCase());
        System.out.println("gghHNt".toUpperCase());
        System.out.println("strrrr".startsWith("st"));
        System.out.println("strrrr".startsWith("ast"));
        System.out.println("strrrr".endsWith("rrrr"));
        System.out.println("strRrr".toLowerCase().endsWith("rrrr"));
        System.out.println("rdrfk fkffl".isEmpty());
        System.out.println("".isEmpty());
        System.out.println(" ".isEmpty());
        System.out.println(" ".trim().isEmpty());
        System.out.println("*********************");

        StringBuilder sb = new StringBuilder("Hello world");
        System.out.println(sb.insert(3, "qwer "));
        System.out.println(sb.reverse());
        System.out.println(sb.append("zxcvbn"));
        System.out.println(sb.delete(0, 2));
        System.out.println("********************");

        String longStr = "wertyui, sdfghjk  xcvbnm dfghjkl. rtyuiop ";
        StringTokenizer sk = new StringTokenizer(longStr);
        System.out.println(sk.countTokens());
        while (sk.hasMoreElements()){
            System.out.println(sk.nextElement());
        }
        System.out.println("*********************");

        String mStr = " ertyuio rtyuiopokjhg bnmkjhg,  ,   vbnkgbn   ghHDKLDKbn ";
        System.out.println(changeStr(mStr));
        System.out.println("******************");

    }

    public static String changeStr(String mStr){
        String temp = mStr.replaceAll(",", "").trim().toUpperCase();
        StringBuilder result = new StringBuilder();
        StringTokenizer sk = new StringTokenizer(temp);
        while(sk.hasMoreElements()){
            result.append(sk.nextElement()).append(" ");
        }
        return result.toString().trim();
    }
}
