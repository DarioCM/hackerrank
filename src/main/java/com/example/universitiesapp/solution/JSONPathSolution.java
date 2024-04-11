package com.example.universitiesapp.solution;


import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class JSONPathSolution {

    public static void main(String[] args) {

        String country = "India";
        List<University> listResult = new ArrayList<University>();

        try {
            for (int i = 1; i <= 20; i++) {

                URL url = new URL("https://jsonmock.hackerrank.com/api/universities?page=" + i);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");

                try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {

                    // reader.lines()  it returns a Stream of strings
                    List<String> list = reader.lines().filter(x -> x.contains(country)).collect(Collectors.toList());

                    for (String jsonString : list) {

                        JSONObject obj = new JSONObject(jsonString);
                        JSONArray dataArray = obj.getJSONArray("data");
                        int n = dataArray.length();

                        for (int x = 0; x < n; ++x) {
                            JSONObject university = dataArray.getJSONObject(x);
                            if (country.equals(university.getJSONObject("location").getString("country"))) {
                                University object = new University();
                                object.setUniversity(university.getString("university"));
                                object.setRank_display(university.getInt("rank_display"));
                                listResult.add(object);
                            }
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            University result = listResult.stream().min(Comparator.comparing(University::getRank_display)).orElseThrow(NoSuchElementException::new);
            System.out.println(">>>>>>>>>> Result ");
            System.out.println(result.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
