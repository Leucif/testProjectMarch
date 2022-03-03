import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


public class SimpleReader {
    public static void main(String[] arg) throws IOException {
        System.out.println("Test project. 03.03.2022");
        List<String> lines = Files.readAllLines(Path.of("src\\users.txt"));
        User[] userdata = new User[lines.size()/3];

        for(int i=0;i<lines.size();i=i+3) {
            userdata[i/3] = new User(lines.get(i),lines.get(i+1),Integer.parseInt(lines.get(i+2)));
            System.out.println(userdata[i/3]);
        }
    }

}
