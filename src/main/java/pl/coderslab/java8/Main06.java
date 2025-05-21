package pl.coderslab.java8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main06 {
    public static void main(String[] args) {
        Path path = Paths.get("earnings.txt");

        try{
            Files.readAllLines(path).stream()
                    .filter(s -> !s.contains("Kowa"))
                    .filter(s -> s.contains("9"))
                    .limit(3)
                    .forEach(System.out::println);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
