package Array_Searching_And_Sorting_problrms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Result {

public static void findFloorSequence(String direction, int currentFloor, List<Integer> floorRequests) {

// Sort the floor requests

Collections.sort(floorRequests);

// If the direction is upwards

if (direction.equals("UP")) {

// Find all requests above or at the current floor

List<Integer> upRequests = new ArrayList<>();

for (int request : floorRequests) {

if (request >= currentFloor) {

upRequests.add(request);

}

}

// Print the requests above or at the current floor in ascending order

for (int request : upRequests) {

System.out.println(request);

}

// Print the requests below the current floor in descending order

for (int i = floorRequests.size() - 1; i >= 0; i--) {

if (floorRequests.get(i) < currentFloor) {

System.out.println(floorRequests.get(i));

}

}

}

// If the direction is downwards

else if (direction.equals("DN")) {

// Find all requests below or at the current floor

List downRequests = new ArrayList<>();

for (int request : floorRequests) {

if (request <= currentFloor) {

downRequests.add(request);

}

}

// Print the requests below or at the current floor in descending order

for (int i = downRequests.size() - 1; i >= 0; i--) {

System.out.println(downRequests.get(i));

}

// Print the requests above the current floor in ascending order

for (int request : floorRequests) {

if (request > currentFloor) {

System.out.println(request);

}

}

}

// If the direction is invalid

else {

System.out.println("Invalid direction");

}

}

}
