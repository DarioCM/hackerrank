package com.example.universitiesapp.solution;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class UniversitiesAPI {


    public static void main(String[] args) {
        try{

            String country = "India";

            for(int i=1; i <= 20; i++) {

                URL url = new URL("https://jsonmock.hackerrank.com/api/universities?page="+i);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");


                try (BufferedReader reader = new BufferedReader(
                        new InputStreamReader(conn.getInputStream()))) {


                    List<String> list = reader.lines()
                            .filter(x -> x.contains(country)).collect(Collectors.toList());


                    for (String s : list) {


                    }


                }


            }


        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
