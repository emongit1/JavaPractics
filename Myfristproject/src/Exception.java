public class Exception {
    public static void main(String []args){
       try{
         int a =10;
        int b = 0;
        int result = a/b;
        
        System.out.println("result");
       }
       catch(ArrayIndexOutOfBoundsException s){
        System.out.println("exception:" +s);
       }
          catch(ArithmeticException s){
        System.out.println("exception:" +s);

       }
         finally{
             System.out.println("this is working now");
         }
    }
    
}
