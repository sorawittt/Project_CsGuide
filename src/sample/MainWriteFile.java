package sample;

import com.google.gson.Gson;

import java.util.ArrayList;

public class MainWriteFile {
    public static void main(String[] args) {
        ArrayList<Subject> array = new ArrayList<>();

        array.add(new Subject("A", "1", 1));
        array.add(new Subject("B", "2", 2));
        array.add(new Subject("C", "3", 3));
        array.add(new Subject("D", "4", 1));

        Gson gson = new Gson();
        String json = gson.toJson(array);

//        System.out.println(json);

    }
}
