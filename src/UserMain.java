import controller.UserContoller;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class UserMain {
    public static void main(String[] args) {
        UserContoller uc= new UserContoller();
        uc.addUser(
                "M",
                "K",
                "m",
                "l",
                "mk@mk.pl",
                "450909099",
                LocalDate.of(2000,01,01),
                LocalDateTime.now()
        );
        uc.addUser(
                "M",
                "K",
                "m",
                "l",
                "m@op.pl",
                "450909099",
                LocalDate.of(2034,3,01),
                LocalDateTime.now()
        );
        uc.addUser(
                "M",
                "K",
                "m",
                "l",
                "mk@mk.pl",
                "450909099",
                LocalDate.of(2010,10,01),
                LocalDateTime.now()
        );
        uc.addUser(
                "M",
                "K",
                "m",
                "l",
                "mk@mk.pl",
                "450909099",
                LocalDate.of(1997,01,01),
                LocalDateTime.now()
        );
        uc.addUser(
                "M",
                "K",
                "m",
                "l",
                "mk@mk.pl",
                "450909099",
                LocalDate.of(1993,04,01),
                LocalDateTime.now()
        );

        uc.getAllUsers();
        System.out.println();
        System.out.println("test date");
        System.out.println("User pierwszy starszy od drugiego: "+uc.birthDateComparator(0,1));
        System.out.println("User pierwszy starszy od drugiego: "+uc.birthDateComparator(1,2));
        System.out.println("Elementy posortowane po dacie ASC");
        uc.sortByBirthdate();
        uc.getAllUsers();
    }
}
