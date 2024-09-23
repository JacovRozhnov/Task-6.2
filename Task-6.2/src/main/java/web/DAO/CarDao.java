package web.DAO;

import org.springframework.stereotype.Component;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDao {

    private List<Car> carList;

    {
        carList = new ArrayList<>();

        carList.add(new Car(2007, "Hyndai", "Accent"));
        carList.add(new Car(1999, "UAZ", "469"));
        carList.add(new Car(2006, "LADA", "2114"));
        carList.add(new Car(2021, "LADA", "GRANTA"));
        carList.add(new Car(2011, "Ford", "Kuga"));
    }

    public List<Car> getCarList() {
        return carList;
    }
    public List<Car> getCarsNumber(int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
