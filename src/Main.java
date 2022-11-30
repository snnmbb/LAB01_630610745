public class Main {
    public static void main(String[] args) {
        AirPurifier airPurifier = new AirPurifier(100.0 ,30.0);
        AirPurifier airPurifier2 = new AirPurifier();

        airPurifier.company = "Xiaomi";
        airPurifier.color = "white";
        airPurifier.year = 2019;
        airPurifier.showinformation();
        airPurifier.displayAirQuality();

        System.out.println();

        airPurifier2.company = "Philips";
        airPurifier2.color = "white";
        airPurifier2.year = 2022;
        airPurifier2.showinformation();
        airPurifier2.displayAirQuality();
    }
}