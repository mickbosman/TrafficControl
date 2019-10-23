import java.util.Random;

public class TrafficLight {

    private int id;
    private int numberOfLights;
    private int defaultColor;
    private int currentColor;

    /**
     *  Initialize a new TrafficLight
     */

    public TrafficLight() {
        id = 0;
        numberOfLights = 3;
        defaultColor = 1;
    }

    /**
     *
     * @param id
     * @param numberOfLights
     */

    public TrafficLight(int id, int numberOfLights) {
        this.id = id;
        this.numberOfLights = numberOfLights;

        //Random light color
        setCurrentColor(createRandomNumber(3) + 1);

    }

    /**
     *
     * @param light
     * @return
     */

    public String showColor(int light) {

        String result;
        switch (light) {
            case 1:
                System.out.println("Red");
                result = "Red";
                break;
            case 2:
                System.out.println("Orange");
                result = "Orange";
                break;
            case 3:
                System.out.println("Green");
                result = "Green";
                break;
            default:
                System.out.println("Invalid Light Number");
                result = "Invalid Light Number";
                break;
        }
        return result;
    }

    private int createRandomNumber(int seed) {
        Random rand = new Random();
        int value = rand.nextInt(seed);

        return value;
    }

    /**
     *
     * @return
     */

    public int getId() {
       return id;
    }

    /**
     *
     * @param light
     */

    public void showColorAndId(int light) {
        String result;
        result = showColor(light);

        System.out.println("My color is "
                + result
                + " and my id is: "
                + getId()
        );
    }

    /**\
     *
     * @param number
     * @return
     */

    public boolean isPositiveNumber(int number) {
        return number > 0;
    }

    /**
     *
     * @return
     */

    public int getDefaultColor() {
        return defaultColor;
    }

    /**
     *
     * @param defaultColor
     */

    public void setDefaultColor(int defaultColor) {
        this.defaultColor = defaultColor;
    }

    /**
     *
     * @return
     */

    public int getNumberOfLights() {
        return numberOfLights;
    }

    /**
     *
     * @param numberOfLights
     */

    public void setNumberOfLights(int numberOfLights) {
        this.numberOfLights = numberOfLights;
    }

    /**
     *
     * @return
     */

    public int getCurrentColor() {
        return currentColor;
    }

    /**
     *
     * @param currentColor
     */

    public void setCurrentColor(int currentColor) {
        this.currentColor = currentColor;
    }
}
