package software.ulpgc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonSexStatitic implements PeopleStatistic {

    @Override
    public Map<String, Integer> calculate(List<Person> people) {
        Map<String, Integer> map = new HashMap<>();
        for (Person person : people) {
            String key = person.sex();
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        return map;
    }
}
