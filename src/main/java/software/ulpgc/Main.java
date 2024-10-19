package software.ulpgc;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Person> people = CsvFilePersonLoader.with(new File("people-10000.csv")).load();

        PeopleStatistic statistics = new PersonSexStatitic();

        Map<String, Integer> map = statistics.calculate(people);
        for (String key : map.keySet()) {
            System.out.println("Total" + key + "s =  " + map.get(key));
        }

    }
}
