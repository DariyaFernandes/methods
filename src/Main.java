import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {



        checkYearIsLeap(2020);
        checkYearIsLeap(2010);
        checkYearIsLeap(2030);
        getOsRecommendation(2015, 0);
        getOsRecommendation(2014, 1);

        computeDeliveryDays(20);
        computeDeliveryDays(40);
        computeDeliveryDays(60);


    }


    public static void checkYearIsLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(+year + " является високосным");
        } else {
            System.out.println(+year + " не является високосным");
        }

    }

    public static void getOsRecommendation(int deviceYear, int clientOs) {
        int borderYear = 2015;
        int currentYear = LocalDate.now().getYear();
        
        String lightInfo;

        if (deviceYear < currentYear) {
            lightInfo = "облегченную ";
        } else {
            lightInfo = "";
        }
        String osType;
        if (clientOs == 0) {
            osType = "IOS";
        } else {
            osType = "Android";
        }
        String generalInfo = "Установите " + lightInfo + "версию приложения для " + osType + " по ссылке ";
        System.out.println(generalInfo);

    }
    public  static int computeDeliveryDays (int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance > 20 && distance <= 60) {
            return 2;
        } else if (distance > 60 && distance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }
    }
