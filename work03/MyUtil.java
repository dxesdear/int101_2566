package work03;

public class MyUtil {

    private double weight;
    private double height;
    private int v1;
    private int v2;
    private int v3;

   
    public static double calculateBMI(double weight, double height ) {
        return weight / (height * height);
    }

    public static double average(int v1, int v2, int v3) {
        return (v1 + v2 + v3) / 3;
    }
}
