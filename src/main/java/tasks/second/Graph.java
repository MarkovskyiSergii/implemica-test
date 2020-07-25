package tasks.second;


import java.util.*;

public class Graph {
    private Map<City, List<Distance>> citiesGraph = new HashMap<>();
    private List<City> cityList = new ArrayList<>();

//    Init graph data from test task
    public void initTestDataFromTestTask() {
        City gdansk = new City("Gdansk");
        City bydgoszcz = new City("Bydgoszcz");
        City torun = new City("Torun");
        City warszawa = new City("Warszawa");

        this.cityList.addAll(Arrays.asList(gdansk, bydgoszcz, torun, warszawa));

        this.getCitiesGraph().put(gdansk, new ArrayList<>(Arrays.asList(
                new Distance(gdansk, bydgoszcz, 1),
                new Distance(gdansk, torun, 3))));
        this.getCitiesGraph().put(bydgoszcz, new ArrayList<>(Arrays.asList(
                new Distance(bydgoszcz, gdansk, 1),
                new Distance(bydgoszcz, torun, 1),
                new Distance(bydgoszcz, warszawa, 4))));
        this.getCitiesGraph().put(torun, new ArrayList<>(Arrays.asList(
                new Distance(torun, gdansk, 3),
                new Distance(torun, bydgoszcz, 1),
                new Distance(torun, warszawa, 1))));
        this.getCitiesGraph().put(warszawa, new ArrayList<>(Arrays.asList(
                new Distance(warszawa, bydgoszcz, 4),
                new Distance(warszawa, torun, 1))));
    }

//    Init test data to check algorithm at biggest graph
//    in resources "graph with eight cities.jpeg" with schema of this graph
    public void initTestDataWithEightCities() {
        City kiev = new City("Kiev");
        City tbilisi = new City("Tbilisi");
        City dakar = new City("Dakar");
        City viena = new City("Viena");
        City mumbai = new City("Mumbai");
        City suzkou = new City("Suzkou");
        City osaka = new City("Osaka");
        City tokyo = new City("Tokyo");

        this.cityList.addAll(Arrays.asList(kiev, tbilisi, dakar, viena, mumbai, suzkou, osaka, tokyo));

        this.getCitiesGraph().put(kiev, new ArrayList<>(Arrays.asList(
                new Distance(kiev, tbilisi, 15),
                new Distance(kiev, dakar, 12))));
        this.getCitiesGraph().put(tbilisi, Arrays.asList(
                new Distance(tbilisi, kiev, 15),
                new Distance(tbilisi, dakar, 5),
                new Distance(tbilisi, viena, 1)));
        this.getCitiesGraph().put(dakar, Arrays.asList(
                new Distance(dakar, kiev, 12),
                new Distance(dakar, tbilisi, 5),
                new Distance(dakar, viena, 3),
                new Distance(dakar, suzkou, 15)));
        this.getCitiesGraph().put(viena, Arrays.asList(
                new Distance(viena, tbilisi, 1),
                new Distance(viena, dakar, 3),
                new Distance(viena, mumbai, 1),
                new Distance(viena, osaka, 11),
                new Distance(viena, tokyo, 5)));
        this.getCitiesGraph().put(mumbai, Arrays.asList(
                new Distance(mumbai, viena, 1),
                new Distance(mumbai, suzkou, 2),
                new Distance(mumbai, tokyo, 88)));
        this.getCitiesGraph().put(suzkou, Arrays.asList(
                new Distance(suzkou, dakar, 15),
                new Distance(suzkou, mumbai, 2)));
        this.getCitiesGraph().put(osaka, Arrays.asList(
                new Distance(osaka, viena, 11),
                new Distance(osaka, tokyo, 2)));
        this.getCitiesGraph().put(tokyo, Arrays.asList(
                new Distance(tokyo, viena, 5),
                new Distance(tokyo, mumbai, 88),
                new Distance(tokyo, osaka, 2)));
    }

    public Map<City, List<Distance>> getCitiesGraph() {
        return citiesGraph;
    }

    public List<City> getCityList() {
        return cityList;
    }
}
