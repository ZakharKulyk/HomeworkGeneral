package ua.goit.polymorpism.Module10.Streams.HomeworkGeneral.Homework10Task3;

import ua.goit.polymorpism.Module10.Streams.HomeworkGeneral.Homework10Task3.Reader.Reader;
import ua.goit.polymorpism.Module10.Streams.HomeworkGeneral.Homework10Task3.Reader.ReaderImplementation;

import java.io.File;
import java.util.*;
import java.util.stream.Collectors;

public class wordCounter {
    public static void main(String[] args) {
        File file = new File("words.txt");
        ArrayList<String> text = new ArrayList<>();
        Reader reader = new ReaderImplementation(file);
        text = reader.getText();
        calculateWords(text);

    }

    public static void calculateWords(ArrayList<String> data) {
        HashMap<String, Integer> wordCounterMap = new HashMap<>();
        for (String line : data) {
            String words[] = line.split(" ");
            for (String word : words) {
                if (!word.isEmpty()) {
                    wordCounterMap.put(word, wordCounterMap.getOrDefault(word, 0) + 1);
                }
            }
        }
        wordCounterMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);
    }

}
