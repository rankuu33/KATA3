package software.ulpgc;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("Por favor, proporciona la ruta del archivo CSV como argumento.");
            return;
        }

        String csvPath = args[0];
        List<Person> people = CsvFilePersonLoader.with(new File(csvPath)).load();

        PeopleStatistic statistics = new PersonSexStatitic();
        PeopleStatistic agePeopleStatistic = new PersonAgeStatistic();

        Map<String, Integer> map = statistics.calculate(people);
        for (String key : map.keySet()) {
            System.out.println("Total " + key + "s = " + map.get(key));
        }

        Map<String, Integer> map2 = agePeopleStatistic.calculate(people);
        for (String key : map2.keySet()) {
            System.out.println(key + " = " + map2.get(key));
        }

        MainFrame mainFrame = new MainFrame();
        mainFrame.barChartDisplay().show(agePeopleStatistic.calculate(people));
        mainFrame.setVisible(true);
    }
}