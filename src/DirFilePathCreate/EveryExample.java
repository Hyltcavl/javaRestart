package DirFilePathCreate;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class EveryExample {
    public static void main(String[] args) {
        //----prints out all files and paths in directory----
        FilenameFilter filter = (file, fileName) -> {
            return fileName.contains(".");
        };
        String[] contents = new File(".").list(filter);
        for(String file: contents) {
            System.out.println(file);
        }

        //----tries to delete path -----
        new File("er2").mkdir();
        Path path = Paths.get("er2");
        try {
            Files.delete(path);
            Files.deleteIfExists(path);
        } catch (IOException ex) {
            System.out.println("could not delete path ");
        }
        Path path2 = Paths.get(".");
        System.out.println(path2.getParent());
        System.out.println(path2.getRoot());
        System.out.println(path2.getFileName());
        //-----------------------------------------------
        /*
        Path source = Paths.get("C:\\Users\\Bethan Palmer\\Desktop\\example.txt");
        Path dest = Paths.get("C:\\Users\\Bethan Palmer\\Desktop\\new.txt");
        try {
            Files.copy(source, dest, REPLACE_EXISTING);
        } catch (IOException ex) {
            ex.printStackTrace();
        }*/
        //------------------------------------------------
        File myFile = new File("test.txt");
        try {
            boolean fileCreated = myFile.createNewFile();
            System.out.println(fileCreated);
        } catch (IOException ioe) {

        }
    }
}
