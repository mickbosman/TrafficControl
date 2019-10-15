public class TrafficController {
    // Array of TrafficLight objects.
    private TrafficLight[] trafficLights;

    public TrafficController() {
        System.out.println(
          "Total number of Traffic lights: " +
           Crossing.getNumberOfTrafficLights());

        //set the array size
        this.trafficLights =
             new TrafficLight[
                     Crossing.getNumberOfTrafficLights()
                     ];

        // Fill the array and Initialize each trafficlight
        // with an unique id
        for(int count = 0;
            count < Crossing.getNumberOfTrafficLights();
            count++) {

            trafficLights[count] =
                    new TrafficLight(
                            count,
                            Crossing.getNumberOfTrafficLights()
                    );
        }

    }
}
