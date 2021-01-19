public class Student extends Person implements Degreeable, Billable {
      private int grade;

      public void setGrade(int new_grade) {
          grade = new_grade;
      }

      public int getGrade() {
          return grade;
      }

      public void awardDegree() {
          if (grade > 40) {
            System.out.println("You Passed Your Degree, hooray!\n");
        }
      }

      public void payBill(int amount) {
          System.out.println(amount);
      }
  }
