public class AirPurifier {
    String company;
    String color;
    int year;
    double Airquality;
    double pm2_5;
    int level;
    String status;
    String module_code;

    void showinformation()
    {
        System.out.println("Module code : " + this.module_code );
        System.out.println("Color : " + this.color);
        System.out.println("From : " + this.company);
        System.out.println("Made in : " + this.year);
    }

    void system()
    {
        System.out.println("Status : " + this.status);
        System.out.println("Now , Working on level : " + this.level );
    }

    void displayAirQuality() {
        System.out.println("Airquality : " + this.Airquality);
        System.out.println("P.M 2.5 : " + this.pm2_5);
    }
    AirPurifier()
    {

    }

    AirPurifier(String module_code , String company , String color , int year , double Airquality , double pm2_5 , String status , int level ) {

        this.module_code = module_code;
        this.company = company;
        this.color = color;
        this.year = year;
        this.Airquality =  Airquality;
        this.pm2_5 = pm2_5;
        this.status = status;
        this.level = level;

    }


}
