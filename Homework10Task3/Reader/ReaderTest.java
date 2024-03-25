package ua.goit.polymorpism.Module10.Streams.HomeworkGeneral.Homework10Task3.Reader;

import java.io.File;
import java.util.ArrayList;

public class ReaderTest {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Acer\\Desktop\\java_practice\\inheritage\\ua\\goit\\polymorpism\\Module10\\Streams\\Homework10Task3\\file.txt");
        ArrayList<String>data = new ArrayList<>();
        Reader reader = new ReaderImplementation(file);
        data= reader.getText();
        System.out.println(data);
    }
}
