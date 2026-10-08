public class StudentTest {
    public static void main(String[] args) {
        student s1 = new student("Noman", 101, "noman@gmail.com");
        s1.cgpa = 3.75;
        s1.display_info();
        s1.update_balance_deposite(500);
        s1.update_balance_deposite(300);
        student.Print_msg();
    }
}