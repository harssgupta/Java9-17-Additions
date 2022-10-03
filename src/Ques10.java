public class Ques10 {
    public static void main(String[] args) {
        String string= "This is a BootCamp Exercise ";
        System.out.println(string.repeat(2));
        String stringWithSpaces="       This is a BootCamp Exercise     ";
        System.out.println(stringWithSpaces.strip());
        String blankString="     ";
        System.out.println(blankString.isBlank());
//        System.out.println(blanckString.isEmpty());
        System.out.println(string.indent(10));
        String resultString = string.transform(newString-> new StringBuilder(string).reverse().toString());
        System.out.println(resultString);
        String multiLineString=
                "\tStringLine 1\n"
                        +"\t\tStringLine 2\n"
                        +"\t\t\tStringLine 3\n"
                        +"\t\tStringLine 4\n"
                        +"\tStringLine 5";
        System.out.println(multiLineString);
        System.out.println(multiLineString.stripIndent());
        String stringWithEscapes="\"This is a \\nString with Escapes\"";
        System.out.println(stringWithEscapes);
        System.out.println(stringWithEscapes.translateEscapes());
        System.out.println(String.format("Harsh %s","Gupta"));
        System.out.println("Harsh %s".formatted("Gupta"));
    }
}
