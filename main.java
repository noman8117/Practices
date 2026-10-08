/**
 * main
 */
public class main {

    public static void main(String[] args) {

        student s1 =new student("joy",153,"j@gmail.com");
        student s2 = new student("jisan",190, "j@gmail.com");
        student s3 = new student("tuli");
        student s4 = new student();

        s1.display_info();
        s1.balance =500;
        System.out.println("Current Balance :" + s1.balance);
        s1.update_balance_deposite(200);
        System.out.println("Balance Updated to "+ s1.balance);

        int x = 3;
        System.out.println("Initial Value : "+ x);
        value_update(x);

        x = value_update(x);
        System.out.println(x);




       s1.name = "rabby";
       s1.id = 297;
       s1.cgpa = 3.5;
       s1.email = "rabby@gmail.com";

       s2.name ="neaam";
       s2.id= 142;
       s2.email = "neaam@gmail.com";
       s2.cgpa = 3.55;

       System.out.println("Before");
       System.out.println(s1.dept_name);
       System.out.println(s2.dept_name);

       s1.dept_name ="EEE";

       System.out.println("After");
       System.out.println(s1.dept_name);
       System.out.println(s2.dept_name);

       System.out.println(student.dept_name);

       student.Print_msg();


       s2.display_info();

       System.out.println(s1.name);
       System.out.println(s1.id);
       s1.id =321;
       System.out.println(s1.id);

       System.out.println(s1.ins_name);

       //s1.ins_name = "BUET";


    }

    public static int value_update(int parameter){
        parameter = parameter+2;
        System.out.println("Parameter :"+ parameter);
        return parameter;
        
    }
}