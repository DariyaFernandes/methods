public class Main {
    public static void main(String[] args) {


        checkYearIsLeap(2020);
        checkYearIsLeap(2010);
        checkYearIsLeap(2030);
        getOsRecommendation(2018, 0);
        getOsRecommendation(2017, 1);

    }

    public static void checkYearIsLeap(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(+year + " является високосным");
        } else {
            System.out.println(+year + " не является високосным");
        }

    }

    public static void getOsRecommendation(int currentYear, int clientOs) {
        int borderYear = 2015;

        String lightInfo;
        if (currentYear < borderYear) {
            lightInfo = "облегченную ";
        } else {
            lightInfo = "";
        }
        String osType;
        if (currentYear == 0) {
            osType = "IOS";
        } else {
            osType = "Android";
        }
        String generalInfo = "Установите " + lightInfo + "версию приложения для " + osType + " по ссылке ";

    }
}