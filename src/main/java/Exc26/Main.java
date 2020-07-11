package Exc26;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Car rio = new Car("Rio", "Red", CarType.HATCHBACK);
        Car rio2 = new Car("Rio2", "Blue", CarType.SEDAN);
        Car venga = new Car("Venga", "Yellow", CarType.COUPE);
        Car venga2 = new Car("Venga2", "Green", CarType.SEDAN);
        Car polo = new Car("Polo", "Blue", CarType.HATCHBACK);
        Car golf = new Car("Golf", "Red", CarType.CABRIO);
        Car golf2 = new Car("Golf2", "Red", CarType.SEDAN);
        Car touran = new Car("Touran", "Black", CarType.SEDAN);

        List<Car> golfCars = new ArrayList<>();
        golfCars.add(golf);
        golfCars.add(golf2);
        List<Car> poloCars = new ArrayList<>();
        golfCars.add(polo);
        List<Car> rioCars = new ArrayList<>();
        rioCars.add(rio);
        rioCars.add(rio2);
        List<Car> vengaCars = new ArrayList<>();
        vengaCars.add(venga);
        vengaCars.add(venga2);
        List<Car> touranCars = new ArrayList<>();
        touranCars.add(touran);

        Model rioModel = new Model("Rio", 1991, rioCars);
        Model vengaModel = new Model("Venga", 2020, vengaCars);
        Model golfModel = new Model("Golf", 1971, golfCars);
        Model poloModel = new Model("Polo", 1950, poloCars);
        Model touranModel = new Model("Touran", 2020, touranCars);

        List<Model> kiaModels = new ArrayList<>();
        kiaModels.add(rioModel);
        kiaModels.add(vengaModel);
        List<Model> volkswagenModels = new ArrayList<>();
        volkswagenModels.add(golfModel);
        volkswagenModels.add(poloModel);
        volkswagenModels.add(touranModel);

        Manufacturer volkswagen = new Manufacturer("Volkswagen", 1900, volkswagenModels);
        Manufacturer kia = new Manufacturer("Kia", 1949, kiaModels);
        List<Manufacturer> manufacturers = new ArrayList<>();
        manufacturers.add(volkswagen);
        manufacturers.add(kia);

//        point 1
//        List<Model> models = manufacturers.stream()
//                .flatMap(manufacturer -> manufacturer.getModels().stream())
//                .collect(Collectors.toList());
//
//        System.out.println(models);

//        point 2
//        List<Car> cars = manufacturers.stream()
//                .flatMap(manufacturer -> manufacturer.getModels().stream())
//                .flatMap(model -> model.getCars().stream())
//                .collect(Collectors.toList());
//
//        System.out.println(cars);

//        point 3
//        List<String> manufacturersList  = manufacturers.stream()
//                .map(manufacturer -> manufacturer.getName())
//                .collect(Collectors.toList());
//
//        System.out.println(manufacturersList);

//        point 4
//        Map<String, Integer> yearOfStartCompanyList  = manufacturers.stream()
//                .collect(Collectors.toMap(
//                        Manufacturer::getName,
//                        Manufacturer::getYearOfCreation
//                ));
//
//        System.out.println(yearOfStartCompanyList);

//          point 5
//        List<String> namesOfModelList  = manufacturers.stream()
//                .flatMap(manufacturer -> manufacturer.getModels().stream())
//                .map(Model::getName)
//                .collect(Collectors.toList());
//
//        System.out.println(namesOfModelList);

//          point 6
//        Map<String, Integer> yearOfStartModelsList = manufacturers.stream()
//                .flatMap(manufacturer -> manufacturer.getModels().stream())
//                .collect(Collectors.toMap(
//                        Model::getName,
//                        Model::getProductionStartYear
//                ));
//
//        System.out.println(yearOfStartModelsList);

//        point 7
//        List<String> namesOfCarsList  = manufacturers.stream()
//                .flatMap(manufacturer -> manufacturer.getModels().stream())
//                .flatMap(model -> model.getCars().stream())
//                .map(Car::getName)
//                .collect(Collectors.toList());
//
//        System.out.println(namesOfCarsList);

//        point 8
//        List<String> namesOfCarsList  = manufacturers.stream()
//                .flatMap(manufacturer -> manufacturer.getModels().stream())
//                .flatMap(model -> model.getCars().stream())
//                .map(Car::getDescription)
//                .collect(Collectors.toList());
//
//        System.out.println(namesOfCarsList);

//        point 9
//        List<Model> namesOfModelWithEvenStartYearProduction = manufacturers.stream()
//                .flatMap(manufacturer -> manufacturer.getModels().stream())
//                .filter(model -> model.getProductionStartYear() % 2 == 0)
//                .collect(Collectors.toList());
//
//        System.out.println(namesOfModelWithEvenStartYearProduction);

//        point 10
//        List<Car> listOfCarsFromProducerWithEvenStartYear = manufacturers.stream()
//                .filter(manufacturer -> manufacturer.getYearOfCreation() % 2 == 0)
//                .flatMap(manufacturer -> manufacturer.getModels().stream())
//                .flatMap(model -> model.getCars().stream())
//                .collect(Collectors.toList());
//
//        System.out.println(listOfCarsFromProducerWithEvenStartYear);

//        point 11
//        List<Car> listProducerWithOddModelWithEvenStartYear = manufacturers.stream()
//                .filter(manufacturer -> manufacturer.getYearOfCreation() % 2 != 0)
//                .flatMap(manufacturer -> manufacturer.getModels().stream())
//                .filter(model -> model.getProductionStartYear() % 2 == 0)
//                .flatMap(model -> model.getCars().stream())
//                .collect(Collectors.toList());
//
//        System.out.println(listProducerWithOddModelWithEvenStartYear);

//        point 12
//        List<Car> listCabrioProducerWithEvenModelWithOddStartYear = manufacturers.stream()
//                .filter(manufacturer -> manufacturer.getYearOfCreation() % 2 == 0)
//                .flatMap(manufacturer -> manufacturer.getModels().stream())
//                .filter(model -> model.getProductionStartYear() % 2 != 0)
//                .flatMap(model -> model.getCars().stream())
//                .filter(car -> car.getCarType() == CarType.CABRIO)
//                .collect(Collectors.toList());
//
//        System.out.println(listCabrioProducerWithEvenModelWithOddStartYear);

//        point 13
        List<Car> listSedanProducerOlderThan1919ModelYoungerThan2019 = manufacturers.stream()
                .filter(manufacturer -> manufacturer.getYearOfCreation() < 1919)
                .flatMap(manufacturer -> manufacturer.getModels().stream())
                .filter(model -> model.getProductionStartYear() > 2019)
                .flatMap(model -> model.getCars().stream())
                .filter(car -> car.getCarType() == CarType.SEDAN)
                .collect(Collectors.toList());

        System.out.println(listSedanProducerOlderThan1919ModelYoungerThan2019);

    }
}
