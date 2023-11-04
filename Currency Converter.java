package currency;

public class CurrencyConverter {
    public double convertUSDToEUR(double usdAmount) {
        return usdAmount * 0.88;
    }

    public double convertEURToUSD(double eurAmount) {
        return eurAmount / 0.88;
    }
}
package distance;

public class DistanceConverter {
    public double convertMilesToKilometers(double miles) {
        return miles * 1.60934;
    }

    public double convertKilometersToMiles(double kilometers) {
        return kilometers / 1.60934;
    }
}
package time;

public class TimeConverter {
    public double convertHoursToMinutes(double hours) {
        return hours * 60;
    }

    public double convertMinutesToHours(double minutes) {
        return minutes / 60;
    }
}

// Main Package
import currency.CurrencyConverter;
import distance.DistanceConverter;
import time.TimeConverter;

public class Main {
    public static void main(String[] args) {
        CurrencyConverter currencyConverter = new CurrencyConverter();
        DistanceConverter distanceConverter = new DistanceConverter();
        TimeConverter timeConverter = new TimeConverter();
        double usdAmount = 100.0;
        double eurAmount = currencyConverter.convertUSDToEUR(usdAmount);
        System.out.println(usdAmount + " USD is equal to " + eurAmount + " EUR");
        double miles = 50.0;
        double kilometers = distanceConverter.convertMilesToKilometers(miles);
        System.out.println(miles + " miles is equal to " + kilometers + " kilometers");
        double hours = 2.5;
        double minutes = timeConverter.convertHoursToMinutes(hours);
        System.out.println(hours + " hours is equal to " + minutes + " minutes");
    }
}
