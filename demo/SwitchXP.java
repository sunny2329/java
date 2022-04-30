
public class SwitchXP {
  public enum Day { SUNDAY, MONDAY, TUESDAY,WEDNESDAY, THURSDAY, FRIDAY, SATURDAY }
  public static void main(String args[]) {
    var day = Day.SATURDAY;
    var isWeekend = switch (day) {
            case  MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> false;
            case  SUNDAY       -> true;
            case  SATURDAY     -> true;
            default -> throw new IllegalStateException("Invalid day: " + day);
    };
    if (isWeekend) System.out.println("Have a nice weekend");
    else System.out.println("Have a nice day");
  }
}