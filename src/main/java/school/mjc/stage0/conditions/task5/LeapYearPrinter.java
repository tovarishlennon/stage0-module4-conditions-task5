package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        String result = year % 4 == 0 && !(year % 100 == 0) ? "leap" : year % 400 == 0 ? "leap" : "not leap";
        switch (result) {
            case "leap":
                System.out.println("leap");
                break;
            case "not leap":
                System.out.println("not leap");
                break;
        }
    }
}
