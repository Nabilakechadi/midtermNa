package design;
import java.time.*;
public enum Months {
    January, February, March, April, May, June, July, August, September, October, November, December;
    public static void main(String[] args) {
            Month month = Month.from(LocalDate.now());

            System.out.println(month.name());
        }
    }



