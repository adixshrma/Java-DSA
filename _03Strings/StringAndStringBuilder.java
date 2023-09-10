package _03Strings;

public class StringAndStringBuilder {
    public static void main(String[] args) {
         float b = 45.85649f;
         System.out.printf(" This is formatted %.2f\n", b);
         String str = "";
         for (int i = 0; i < 26; i++) {   //this is creating new objects each time, hence not good;
             char ch = (char)('a' + i);
             str = str + ch;
         }
         System.out.print(str);
        System.out.println();
        int a = 56;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {      // this is not creating new objects. its changing itself each time.
            char ch = (char)('a'+ i);       //  hence it's better
            builder.append(ch);
        }
        System.out.println(builder.toString());
        builder.append(a);
        System.out.println(builder.toString());
    }
}