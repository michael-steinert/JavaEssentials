import java.io.*;

public class Files {
    public static void main(String[] args) {
        String fileName = "myFile.txt";
        File file = new File(fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("File was created");
            } catch (IOException exception) {
                System.out.println("Error during creating the File");
            }
        }

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.write("Hello from MyFile");
            printWriter.close();
            printWriter.flush();
            System.out.println("Content added to File");
        } catch (IOException exception) {
            System.out.println("Error during writing to File");
        }

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String lineFromFile = "";
            while((lineFromFile = bufferedReader.readLine()) != null) {
                System.out.println(lineFromFile);
            }
        } catch (IOException exception) {
            System.out.println("Error during reading from File");
        }

    }
}
