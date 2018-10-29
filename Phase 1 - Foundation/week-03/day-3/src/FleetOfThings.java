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
        String lunchString = "Eal lunch";

        Thing obstacles = new Thing(obstaclesString);
        Thing standUp = new Thing(standUpString);
        Thing lunch = new Thing(lunchString);
        Thing milk = new Thing(milkString);

        fleet.add(obstacles);
        fleet.add(standUp);
        fleet.add(lunch);
        fleet.add(milk);

        lunch.complete();
        milk.complete();

        System.out.println(fleet);
    }
}