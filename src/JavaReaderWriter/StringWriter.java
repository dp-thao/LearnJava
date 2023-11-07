package JavaReaderWriter;

public class StringWriter {
    public static void main(String[] args) {
        String data = "Con chim co canh, co canh biet bay";
        try {
            // Create a StringWriter with default string buffer capacity
            StringWriter output = new StringWriter();

            // Writes data to the string buffer
//            output.write(data);
            System.out.println("Du lieu trong StringWriter: " + output);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
