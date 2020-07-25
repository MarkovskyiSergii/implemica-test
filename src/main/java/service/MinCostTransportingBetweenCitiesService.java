package service;

import tasks.second.City;
import tasks.second.Distance;
import tasks.second.Graph;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Service uses a weighted undirected graph
 * After input cities "start" and "finish"
 * method "calculateMinCost" calculate shortest distance between city of start
 * and city finish. Method "calculateMinCost" uses Dijkstra algorithm
 */
public class MinCostTransportingBetweenCitiesService {
    public String calculateMinCost(City start, City finish, Graph graphWithCities) {
        Map<City, List<Distance>> citiesMap = graphWithCities.getCitiesGraph();

//          Start variable is start city and we setting field "isChecked" = true,
//          and "MinWeight" = 0, because the city is first step in algorithm

        start.setChecked(true);
        start.setMinWeight(0);


        City minCostTransCity = start;

//          The loop is working until graph have unchecked Cities
        while (minCostTransCity != null) {
//          Local final variable need to use in Lambda expression
            City finalMinCostTransCity = minCostTransCity;
//          Lambda use "minCostTransCity" and take all unchecked Distance
            List<Distance> listWithCompareDistance = citiesMap.get(minCostTransCity).stream()
//                    Filtered Distance (edges) to Cities
                    .filter(distance -> !distance.getV2().isChecked())
//                    Compare and setting less value in in field "weightToCompare".
                    .peek(distance -> distance.getV2()
                            .setWeightToCompare(
                                    Math.min(finalMinCostTransCity.getMinWeight() + distance.getWeightOfEdge()
                                            , distance.getV2().getWeightToCompare())))
                    .collect(Collectors.toList());
//          Checked List Distance of City - must have unchecked Distance
            if (!listWithCompareDistance.isEmpty()) {
//              Find City with least Distance
                minCostTransCity = listWithCompareDistance.stream()
                        .map(Distance::getV2)
                        .min(Comparator.comparing(City::getWeightToCompare)).get();
//              Setting "minWeight" and mark as Checked. After this loop repeat with this City
                minCostTransCity.setMinWeight(minCostTransCity.getWeightToCompare());
                minCostTransCity.setChecked(true);
            } else {
//               This block return unchecked City or return null.
//               That meaning graph is don't have unchecked Cities and loop is done
                minCostTransCity = citiesMap.keySet().stream().filter(city -> !city.isChecked()).findFirst().orElse(null);
//
                if (minCostTransCity != null) {
                    minCostTransCity.setMinWeight(minCostTransCity.getWeightToCompare());
//                   If City have unchecked Distance "isChecked" don't set
                    if (citiesMap.get(minCostTransCity).stream().map(Distance::getV2).allMatch(City::isChecked))
                        minCostTransCity.setChecked(true);
                }
            }
        }

        String costResult = String.valueOf(finish.getMinWeight());
        return start.getName() + " to " + finish.getName() + " = " + costResult;
    }
}
