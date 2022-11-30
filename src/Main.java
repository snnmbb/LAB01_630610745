public class Main {
    public static void main(String[] args) {
        AirPurifier airPurifier = new AirPurifier("airpurifier001","Xiaomi","white",2019,100.0 ,30.0,"Power on",3);
        AirPurifier airPurifier2 = new AirPurifier();

        airPurifier.showinformation();
        airPurifier.system();
        airPurifier.displayAirQuality();

        System.out.println();

        airPurifier2.module_code = "airpurifier002";
        airPurifier2.company = "Philips";
        airPurifier2.color = "white";
        airPurifier2.year = 2022;
        airPurifier2.status = "Power off";
        airPurifier2.level = 0;
        airPurifier2.showinformation();
        airPurifier2.system();
        airPurifier2.displayAirQuality();
    }
}