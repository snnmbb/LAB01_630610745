public class AirPurifier {
    String company;
    String color;
    int year;
    double Airquality;
    double pm2_5;

    void showinformation()
    {
        System.out.println("Color : " + color);
        System.out.println("From : " + company);
        System.out.println("Made in : " + year);
    }

    void displayAirQuality() {
        System.out.println("Airquality : " + this.Airquality);
        System.out.println("P.M 2.5 : " + this.pm2_5);
    }
    AirPurifier()
    {

    }

    AirPurifier(double Airquality , double pm2_5) {
        this.Airquality =  Airquality;
        this.pm2_5 = pm2_5;
    }
}
