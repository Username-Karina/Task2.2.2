package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {
    private static int CARS_COUNT;
    private List<Car> allCars;

    {
        allCars = new ArrayList<>();
        allCars.add(new Car(++CARS_COUNT,"NISSAN", 2012, "BLACK"));
        allCars.add(new Car(++CARS_COUNT,"BMW", 2013, "SILVER"));
        allCars.add(new Car(++CARS_COUNT,"HONDA", 2014, "RED"));
        allCars.add(new Car(++CARS_COUNT,"TOYOTA", 2015, "YELLOW"));
        allCars.add(new Car(++CARS_COUNT,"LEXUS", 2016, "GREEN"));
    }

    @Override
    public List<Car> getCars(int i) {
        List<Car> cars = new ArrayList<>();
        for (int j = 0; j < i; j++) {
            cars.add(allCars.get(j));
        }
        return cars;
    }

    @Override
    public List<Car> getAllCars() {
        return allCars;
    }
}
