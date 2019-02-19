package controller;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class DateTimeController {
    public int getAgeFromStringDate(String birthDate){
        LocalDate day = LocalDate.parse(birthDate);
        LocalDate today =LocalDate.now();
        Period period =Period.between(day,today);
        System.out.println(day);
        System.out.println(period);
        return  period.getYears();
    }

    public  int getMondaysBetweenDates(String d1, String d2){
        LocalDate date1=LocalDate.parse(d1);
        LocalDate date2=LocalDate.parse(d2);
        LocalDate lessDate=date1.isBefore(date2) ? date1 : date2;
        LocalDate greatherDate=date1.isAfter(date2) ? date1 : date2;
        int mondayCounter =0;

        for(LocalDate ld=lessDate; ld.isBefore(greatherDate); ld=ld.plusDays(1)){
            if(ld.getDayOfWeek()==DayOfWeek.MONDAY){
                mondayCounter++;
            }
        }
        return  mondayCounter;

//        System.out.println(DayOfWeek.MONDAY==date1.getDayOfWeek());

    }

    public LocalDate dateComparator(String d1, String d2){
        LocalDate date1=LocalDate.parse(d1);
        LocalDate date2=LocalDate.parse(d2);
        return date1.isBefore(date2) ? date1 : date2;
    }

    public DayOfWeek dayOfBirth(String date){
        LocalDate d1=LocalDate.parse(date);
        return d1.getDayOfWeek();
    }
    public void yearWithDayOfBirth(String date){
        LocalDate date1=LocalDate.parse(date);
        DayOfWeek myDay=date1.getDayOfWeek();
        LocalDate today=LocalDate.now();
        for(LocalDate ld=date1; ld.isBefore(today) ;ld=ld.plusYears(1) ){
            if(ld.getDayOfWeek()==myDay){
                System.out.println(ld);
            }
        }
    }


    public static void main(String[] args) {
        DateTimeController d= new DateTimeController();
//        d.getAgeFromStringDate("2000-09-22");
        System.out.println("Twoj wiek dokladny to "+ d.getAgeFromStringDate("2010-02-09")+" lat");
        System.out.println("Wczesniejsza data "+d.dateComparator("2001-09-08","2010-07-02"));
        System.out.println("Ilosc poniedzialkow "+d.getMondaysBetweenDates("2019-02-19","2019-02-05"));
        System.out.println("Dzien tygodnia "+d.dayOfBirth("1990-02-11"));

        d.yearWithDayOfBirth("1990-02-11");
    }
}
