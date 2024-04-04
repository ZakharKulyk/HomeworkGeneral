package ua.goit.polymorpism.Module10.Streams.HomeworkGeneral.Homework10Task3.Homework10Task2;



import java.io.*;
import java.util.ArrayList;

public class TxtToJson {
private static String FILE_PATH;
private  static String FILE_PATH_TO_JSON;
    public static void main(String[] args)  {
        ArrayList<User>data = new ArrayList<>();

        File file = new File(FILE_PATH);
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

        String json = "[";
        for (int i = 0; i < data.size(); i++) {
            User user = data.get(i);
            json += "{\"name\":\"" + user.getName() + "\",\"age\":" + user.getAge() + "}";
            if (i < data.size() - 1) {
                json += ",";
            }
        }
        json += "]";


        File jsonFile = new File(FILE_PATH_TO_JSON);
        try (FileWriter fileWriter = new FileWriter(jsonFile);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(json);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}



