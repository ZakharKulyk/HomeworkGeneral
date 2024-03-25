package ua.goit.polymorpism.Module10.Streams.HomeworkGeneral.Homework10Task3.Reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReaderImplementation implements  Reader{

    File file;

    public ReaderImplementation(File file){
        this.file = file;
    }

    @Override
    public ArrayList<String> getText() {
        ArrayList<String>data = new ArrayList<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
           String line;
            while ((line = bufferedReader.readLine())!=null){

                data.add(line);
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
       return  data;

    }
}
