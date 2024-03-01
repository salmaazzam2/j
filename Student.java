public class Student {

    private String name;
    private String email;
    private String dateOfBirth;
    private int yearOfBirth;
    private int enrolmentYear;
    private int studentId;
    private int grade = 0;
    private boolean hasSubmitted = false;

    public Student() {

    }

    public Student(String sName, String sEmail, int sYearOfBirth, int sEnrolmentYear, int sStudentId) {
        this.name = sName;
        this.email = sEmail;
        this.yearOfBirth = sYearOfBirth;
        this.enrolmentYear = sEnrolmentYear;
        this.studentId = sStudentId;
    }
    public Student(String sName, String sEmail, String sDateOfBirth, int sEnrolmentYear, int sStudentId) {
        this.name = sName;
        this.email = sEmail;
        this.dateOfBirth = sDateOfBirth;
        this.yearOfBirth = Integer.parseInt(sDateOfBirth.substring(6));
        this.enrolmentYear = sEnrolmentYear;
        this.studentId = sStudentId;
    }
    public Student(String sName, String sEmail, int sYearOfBirth) {
        this.name = sName;
        this.email = sEmail;
        this.yearOfBirth = sYearOfBirth;
    }

    public Student(String sName, String sEmail, String sYearOfBirth) {
        this.name = sName;
        this.email = sEmail;
        this.dateOfBirth = sYearOfBirth;
        this.yearOfBirth = Integer.parseInt(sYearOfBirth.substring(6));
    }

    public void submitCoursework() {
        hasSubmitted = true;
    }
/* 
    public void updateGrade(int mark) {
        this.grade += mark;
    }*/
    public int getGrade() {
        return this.grade;
    }
    public void updateGrade(int newGrade) {
        if (newGrade >= 0 && newGrade <= 100) {
            this.grade = newGrade;
        }
        else {
            System.out.println("Enter a grade from 0-100.");
            return;
        }
    }

    public void printStudent() {
        System.out.println("Name: " + name + "\nEmail: " + email + "\nDOB: " + yearOfBirth + "\nDate of birth: " + dateOfBirth +"\nEnrollment: "
                + enrolmentYear + "\nID: " + studentId);
    }


    public String getName() {
      return this.name;
    }
    public String getEmail() {
        return this.email;
      }
    public String getDateOfBirth() {
        return this.dateOfBirth;
      }
      public int getYearOfBirth() {
        return this.yearOfBirth;
      }
      public int getEnrolmentYear() {
        return this.enrolmentYear;
      }
      public int getStudentId() {
        return this.studentId;
      }
      public boolean getHasSubmitted() {
        return this.hasSubmitted;
      }
    public static void main(String[] args) {

    }
}
