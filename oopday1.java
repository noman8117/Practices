public class oopday1 {
   public static void main(String[] args) {
       System.out.println("yhfggfu");

       int a= 35;
       float g= 3.5f;
       char c='c';
       double y = 3.592132;

       System.out.println("a="+a+","+"x="+g+","+"c="+c+","+"y="+y);
       byte b= 123;
       System.out.println("b="+b);
       String [] cars = {"BMW", "AUDI","TOYOTA"};
       String s= "hey myself chutiya";
       System.out.println(s);
       int arr[]={2,323,4342,12,32};
       int []arr2= new int[10];
       System.out.println(arr);
       int arr_len = arr.length;
       for( int i = 0; i<arr_len; i++){
           System.out.println(arr[i]);
       }
       for(String t:cars){
           System.out.println(t);
       }
       byte z=50;
       byte m= 50;
       byte p = (byte) ((byte)z+m);
       System.out.println(p);

       int o=3, v=6,t=34;
       if(o>v &&  o>t){
           System.out.println(o+" largest");
       }if(v>o &&  v>t){
           System.out.println(o+" largest");
       }if(t>v &&  o<t){
           System.out.println(o+" largest");
       }
      
      
       }
   }

