import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileService {

    static void createFolder(String path) {
        File folder = new File(path);
        if(!folder.exists()) {
            folder.mkdirs();
        }
    }

    static void createFile(String path, String name) throws IOException {
        File folder = new File(path);
        if(!folder.exists()) {
            folder.mkdirs();
        }
        File file = new File(path + File.separator + name);
        file.createNewFile();
    }

    static void write(String path, String text) throws IOException {
        Files.write(Paths.get(path),text.getBytes(),StandardOpenOption.APPEND); //StandardOpenOption.APPEND
    }

    static String[] read(String path) throws IOException {
        return Files.readAllLines(Paths.get(path)).toArray(new String[0]);
    }
}
