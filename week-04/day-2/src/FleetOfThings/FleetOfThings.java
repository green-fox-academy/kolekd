package FleetOfThings;

import java.util.ArrayList;
import java.util.Collections;

public class FleetOfThings {

    public static void main(String[] args) {

        Fleet fleet = new Fleet();
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        String milkString = "Get milk";
        String obstaclesString = "Remove the obstacles";
        String standUpString = "Stand up";
        String lunchString = "Eat lunch";
        String peanutsString = "Pack peanuts";
        String fansString = "Meet the fans";

        Thing obstacles = new Thing(obstaclesString);
        Thing standUp = new Thing(standUpString);
        Thing lunch = new Thing(lunchString);
        Thing milk = new Thing(milkString);
        Thing fans = new Thing(fansString);
        Thing peanuts = new Thing(peanutsString);

        fleet.add(obstacles);
        fleet.add(standUp);
        fleet.add(lunch);
        fleet.add(milk);
        fleet.add(fans);
        fleet.add(peanuts);

        lunch.complete();
        milk.complete();
        fans.complete();

        fleet.sortStuff(fleet);
        System.out.println(fleet);
    }
}