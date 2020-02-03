package lambdas;

import com.sun.org.apache.xml.internal.serializer.utils.Messages;
import com.sun.xml.internal.ws.util.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Test {

    public static void main(String[] args) {

        List<String> messages = Arrays.asList("Orange", "Blue", "Red", "Golden");
        System.out.println(messages);

        //  messages.forEach(x -> System.out.println(x));
        System.out.println("REPLACE METHOD");
        String message = "Hello from my String ";
        message = message.replace("my", "your");
        System.out.println(message);

        System.out.println("SPLIT METHOD");
        String[] strArr = message.split(" ");
        for (String str : strArr) {
            System.out.println(str);
        }

        System.out.println("INDEX OF METHOD");

        String smh = "Muhammad Ali is THE GREATEST WHAT";
        System.out.println(smh.length());
        int pos = smh.indexOf("WHAT");
        System.out.println("position is: " + pos);

        double decimalExample = Double.parseDouble("31311");
        System.out.println(decimalExample);

    }

}
