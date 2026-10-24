import java.io.File;
import java.io.IOException;

public class FileOperationUC2 {
    public static void main(String[] args) throws IOException {
        File file = new File("sample.txt");
        // Check whether file exists
        System.out.println("File Exists: " + file.exists());
        // Create an empty file
        if (file.createNewFile()) {
            System.out.println("File Created");
        } else {
            System.out.println("File Already Exists");
        }
        // Check file exists
        System.out.println("File Exists: " + file.exists());

        // Delete file
        if (file.delete()) {
            System.out.println("File Deleted");
        }

        // Check file does not exist
        System.out.println("File Exists: " + file.exists());

        // Create directory
        File directory = new File("MyDirectory");

        if (directory.mkdir()) {
            System.out.println("Directory Created");
        } else {
            System.out.println("Directory Already Exists");
        }

        // List files and directories
        File currentDirectory = new File(".");

        String[] files = currentDirectory.list();

        System.out.println("\nFiles and Directories:");

        if (files != null) {
            for (String name : files) {
                System.out.println(name);
            }
        }

        // List files with .java extension
        System.out.println("\nJava Files:");

        File[] javaFiles = currentDirectory.listFiles(
                (dir, name) -> name.endsWith(".java")
        );

        if (javaFiles != null) {
            for (File javaFile : javaFiles) {
                System.out.println(javaFile.getName());
            }
        }
    }
}
