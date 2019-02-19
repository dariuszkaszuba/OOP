package controller;

import java.util.regex.Pattern;

public class RegExpController {
    public boolean checkPostalCode(String postalCode) {
        String pattern = "^\\d{2}-\\d{3}$";

        return Pattern.matches(pattern, postalCode);
    }

    public boolean checkPesel(String pesel) {
        String patternPesel = "\\d{11}";
        return Pattern.matches(patternPesel, pesel);
    }

    public boolean checkPhone(String phone) {
        String patterPhone1 = "^[+]{1}\\d{2,3}-\\d{3}-\\d{3}-\\d{3}";
        String patterPhone2 = "\\d{2,3}-\\d{3}-\\d{3}-\\d{3}";
        return Pattern.matches(patterPhone1 +"|"+patterPhone2, phone);
    }
    public boolean checkEmailAddress(String email){
        String template="^[a-zAz0-9]*[.]?[a-zAz0-9]*[@]{1}[a-zAz0-9]*[.]{1}[a-zAz0-9]*$";
        return  Pattern.matches(template,email);
    }

    public static void main(String[] args) {
        RegExpController rec = new RegExpController();
//        System.out.println(rec.checkPostalCode("02-891"));
//        System.out.println(rec.checkPostalCode("02-X91"));
//        System.out.println(rec.checkPostalCode("02-8912"));
//        System.out.println(rec.checkPostalCode(" 02-891"));
//        System.out.println(rec.checkPesel(" 12323232323"));
//        System.out.println(rec.checkPesel("1232323232"));
//        System.out.println(rec.checkPesel(" 123232323223"));
//        System.out.println(rec.checkPhone("+48-345-567-543"));
//        System.out.println(rec.checkPhone("+483-345-567-543"));
//        System.out.println(rec.checkPhone("48-345-567-543"));
//        System.out.println(rec.checkPhone("+48-345-567"));
        System.out.println(rec.checkEmailAddress("dariusz.kaszuba11@gmai.com"));
        System.out.println(rec.checkEmailAddress("dariusz.kaszuba11gmai.com"));
        System.out.println(rec.checkEmailAddress("dariusz.kaszuba11@gmaicom"));
    }
}
