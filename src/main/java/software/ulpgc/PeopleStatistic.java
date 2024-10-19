package software.ulpgc;

import java.util.List;
import java.util.Map;

public interface PeopleStatistic {
    Map<String, Integer> calculate(List<Person> people);
}
