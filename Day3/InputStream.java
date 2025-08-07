import java.io.BufferedReader;
import java.io.InputStreamReader;

class Sample {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    Sample() {
        try {
            int str1 = Integer.parseInt(reader.readLine());
            int str2 = Integer.parseInt(reader.readLine());
            System.out.println(str1 + str2);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

public class InputStream {
    public static void main(String[] args) {
        new Sample();
    }
}

 
