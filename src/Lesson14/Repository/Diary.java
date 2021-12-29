package Lesson14.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Diary {
    private final Map<String, Integer> mapSubjects = new HashMap<>();

    {

        mapSubjects.put("Мат.анализ", new Random().nextInt(10));
        mapSubjects.put("Английский язык", new Random().nextInt(10));
        mapSubjects.put("САПР", new Random().nextInt(10));
        mapSubjects.put("ТАУ", new Random().nextInt(10));
        mapSubjects.put("ТВиМС", new Random().nextInt(10));

    }


    public Map<String, Integer> getMapSubjects() {
        return mapSubjects;
    }
    public int averageScore(){
        int i=0;
        for (String e: mapSubjects.keySet()){
            i += mapSubjects.get(e);
        }
      return i/mapSubjects.size();
    }
}
