import java.time.LocalDate;
import java.time.Period;
import java.lang.Comparable;
public class Event implements Comparable<Event> {
    public Event(LocalDate date, String category, String description) {
        this.date = date;
        this.category = category;
        this.description = description;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public String getCategory() {
        return this.category;
    }

    public String getDescription() {
        return this.description;
    }

    public static Boolean isNegative(int days){
        return days < 0;
    }
    public String getDifferenceString(Period period) {
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();
        if(isNegative(days)) {
            years = years *(-1);
            months = months * (-1);
            days = days * (-1);
            System.out.println("in " + years + " years " + months + " months " + days + " days " );
        } else if(!isNegative(days)){
            System.out.println(years + " years " + months + " months " + days + " days ago" );
        }
        if(period.isZero()){
            System.out.println("The event is happening today! ");
        }
        return period.toString();
    }
    @Override
    public String toString() {
        return this.date + ": " 
            + this.description
            + " (" + this.category + ")"; 
    }
    @Override
    public int compareTo( Event other ){
        return this.date.compareTo(other.date);
    }

    private LocalDate date;
    private String category;
    private String description;
}