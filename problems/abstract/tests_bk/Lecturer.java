public class Lecturer extends Person implements Payable {
      private String timetable;

      public void setTimeTable(String new_tt) {
          timetable = new_tt;
      }

      public String getTimeTable() {
          return timetable;
      }

      public void payAmount(int amount) {
          System.out.println(amount);
      }
  }
