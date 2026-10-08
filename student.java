/**
 * student
 */
public class student {

    public String name;
    public int id;
    public double cgpa;
    public String email;
    public static String dept_name = "CSE";
    public final String ins_name = "DIU";
    public double balance;


    public  void update_balance_deposite(double balance){

        this.balance =  this.balance +balance;
        System.out.println("Updated : " + this.balance);

    }


    // Constructor

    public student(String name, int id, String email){
        this.name = name;
        this.id = id;
        this.email = email;

    }
    public student(String n){
        name = n;

    }

    public student(){

    }

    public void display_info(){

        System.out.println("Name :" + name + " ID : "+id + " CGPA : "+cgpa);


    }

    public static void Print_msg(){
        System.out.println("Hello My Friend");
        
    }
    public static void main(String[] args) {

}
}