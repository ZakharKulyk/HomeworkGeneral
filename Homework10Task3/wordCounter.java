package ua.goit.polymorpism.Module10.Streams.HomeworkGeneral.Homework10Task3;

import ua.goit.polymorpism.Module10.Streams.HomeworkGeneral.Homework10Task3.Reader.Reader;
import ua.goit.polymorpism.Module10.Streams.HomeworkGeneral.Homework10Task3.Reader.ReaderImplementation;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class wordCounter {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Acer\\Desktop\\java_practice\\inheritage\\ua\\goit\\polymorpism\\Module10\\Streams\\Homework10Task3\\file.txt");
        ArrayList<String> text = new ArrayList<>();
        Reader reader = new ReaderImplementation(file);
        text = reader.getText();
        calculateWords(text);

    }

    public static void calculateWords(ArrayList<String>data){
        HashMap<String, Integer>wordCounterMap = new HashMap<>();
        for(String line:data){
            String words[] = line.split(" ");
            for(String word:words){
                wordCounterMap.put(word, wordCounterMap.getOrDefault(word, 0)+1);
            }
        }
        for(Map.Entry<String, Integer>entry:wordCounterMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}