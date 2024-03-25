package ua.goit.polymorpism.Module10.Streams.HomeworkGeneral.Homework10Task3.Homework10Task2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;

public class TxtToJson {
    public static void main(String[] args)  {
        ArrayList<User>data = new ArrayList<>();

        File file = new File("C:\\Users\\Acer\\Desktop\\java_practice\\inheritage\\ua\\goit\\polymorpism\\Module10\\Streams\\Homework10Task2\\file.txt");
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
           String line;
           line = bufferedReader.readLine();
           while ((line = bufferedReader.readLine())!= null) {
               String parts[] = line.split(" ");

                if(parts.length ==2){
                    String name = parts[0];
                    int age = Integer.parseInt(parts[1]);
                    data.add(new User(name, age));
                }

           }

        }catch (IOException e){
            System.err.println(e.getMessage());
        }

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(data);

        try(FileWriter fileWriter =new FileWriter("C:\\Users\\Acer\\Desktop\\java_practice\\inheritage\\ua\\goit\\polymorpism\\Module10\\Streams\\Homework10Task2\\user.json")){
            fileWriter.write(json);

        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }



}
