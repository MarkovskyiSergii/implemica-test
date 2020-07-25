package tasks;

import service.MinCostTransportingBetweenCitiesService;
import tasks.second.City;
import tasks.second.Graph;

import java.util.List;

/**
 * Case Second task basis at Graphs and I'm use Dijkstra algorithm to
 * calculate less cost of transporting
 */

public class SecondTask implements TasksStartable {

    public void calculateCostDijkstraAlgo(int numberOfTests, int numberOfCities, int choiceTestData) {
        MinCostTransportingBetweenCitiesService minCostService;
        Graph graph = new Graph();
        while (graph.getCitiesGraph().isEmpty()) {
            if (numberOfTests < 1 || numberOfTests > 10) {
                System.out.println("Incorrect number of tests! Must be from 1 to 10");
                return;
            }

            if (numberOfCities < 2 || numberOfCities > 10000) {
                System.out.println("Incorrect number of cities! Must be from 2 to 10000");
                return;
            }

            if (choiceTestData < 1 || choiceTestData > 2) {
                System.out.println("Incorrect choice Data init! Must be 1 or 2");
                return;
            } else {
//                Choice test data
                switch (choiceTestData) {
                    case 1:
                        graph.initTestDataFromTestTask();
                        break;
                    case 2:
                        graph.initTestDataWithEightCities();
                        break;
                }
            }
        }

        minCostService = new MinCostTransportingBetweenCitiesService();
//          Generate random start city and finish city
        for (int i = 0; i < numberOfTests; i++) {
            System.out.println("\t\tTest - " + (i + 1));
            for (int j = 0; j < numberOfCities / 2; j++) {

                City start = graph.getCityList().get((int) (Math.random() * graph.getCityList().size()));
                City finish = graph.getCityList().get((int) (Math.random() * graph.getCityList().size()));
                while (start.equals(finish)) {
                    start = graph.getCityList().get((int) (Math.random() * graph.getCityList().size()));
                    finish = graph.getCityList().get((int) (Math.random() * graph.getCityList().size()));
                }

                System.out.println(minCostService.calculateMinCost(start, finish, graph));
                resetToInitValues(graph.getCityList());
            }
        }
    }
//          Reset values for correct work in loop
    private void resetToInitValues(List<City> cities) {
        for (City city : cities) {
            city.setChecked(false);
            city.setWeightToCompare(Integer.MAX_VALUE);
            city.setMinWeight(Integer.MAX_VALUE);
        }
    }

    @Override
    public void startTest(int numberOfTests,int numberOfCities,int choiceTestData) {
        calculateCostDijkstraAlgo(numberOfTests,numberOfCities,choiceTestData);
    }
}
