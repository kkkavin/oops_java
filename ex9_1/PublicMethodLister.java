import java.io.*;
import java.util.*;
import java.util.regex.*;

public class PublicMethodLister {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java PublicMethodLister <filename>");
            return;
        }
        
        String fileName = args[0];
        try {
            List<String> publicMethods = getPublicMethodNames(fileName);
            System.out.println("Public methods:");
            for (String method : publicMethods) {
                System.out.println(method);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    private static List<String> getPublicMethodNames(String fileName) throws IOException {
        List<String> publicMethods = new ArrayList<>();
        Pattern methodPattern = Pattern.compile("\\bpublic\\s+\\w+\\s+(\\w+)\\s*\\(");
        
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Matcher matcher = methodPattern.matcher(line);
                if (matcher.find()) {
                    publicMethods.add(matcher.group(1));
                }
            }
        }
        
        return publicMethods;
    }
}
