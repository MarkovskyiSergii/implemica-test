package service;

import org.junit.jupiter.api.Test;
import tasks.second.Graph;

import static org.junit.jupiter.api.Assertions.*;

class MinCostTransportingBetweenCitiesServiceTest {

    @Test
    void calculateMinCost() {
        Graph graph = new Graph();
        graph.initTestDataWithEightCities();
        MinCostTransportingBetweenCitiesService minCost = new MinCostTransportingBetweenCitiesService();

        minCost.calculateMinCost(graph.getCityList().get(0), graph.getCityList().get(7), graph);
        assertEquals(20, graph.getCityList().get(7).getMinWeight());
    }
}