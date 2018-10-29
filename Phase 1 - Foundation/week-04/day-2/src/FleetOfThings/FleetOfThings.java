package FleetOfThings;

import java.util.ArrayList;
import java.util.Collections;

public class FleetOfThings {

    public static void main(String[] args) {

        Fleet fleet = new Fleet();
        Fleet fleetX = new Fleet();

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
        Thing stand = new Thing(standUpString);
        Thing lunch = new Thing(lunchString);
        Thing milk = new Thing(milkString);
        Thing fans = new Thing(fansString);
        Thing peanuts = new Thing(peanutsString);

        fleet.add(obstacles);
        fleet.add(stand);
        fleet.add(lunch);
        fleet.add(milk);
        fleet.add(fans);
        fleet.add(peanuts);



        peanuts.complete();
        stand.complete();
        fans.complete();


        System.out.println(fleet);
        fleet.sortStuff();
        System.out.println(fleet);

    }
}