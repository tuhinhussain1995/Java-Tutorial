package udemySection06;

public class StaticAndInstanceMethod {
    private static String uni_name;
    private static String location;

    private String dept_name;
    private String student_name;
    private int roll_no;

    public StaticAndInstanceMethod(){
        this("Null", "Null", 00000);
    }

    public StaticAndInstanceMethod(String dept_name ,String student_name, int roll_no){
        this.dept_name = dept_name;
        this.student_name = student_name;
        this.roll_no = roll_no;
    }


    public static void setUni_name(String uni_name) {
        StaticAndInstanceMethod.uni_name = uni_name;
    }
    public static void setLocation(String location) {
        StaticAndInstanceMethod.location = location;
    }


    public static String getUni_name() {
        return uni_name;
    }
    public static String getLocation() {
        return location;
    }


    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }
    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }
    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }


    public String getDept_name() {
        return dept_name;
    }
    public String getStudent_name() {
        return student_name;
    }
    public int getRoll_no() {
        return roll_no;
    }


    public void display(){
        System.out.println("University Name: " + StaticAndInstanceMethod.getUni_name());
        System.out.println("University Location: " + getLocation());

        System.out.println("Department Name: " + this.getDept_name());
        System.out.println("Student Name: " + getStudent_name());
        System.out.println("Student Roll No: " + getRoll_no());
    }
}
