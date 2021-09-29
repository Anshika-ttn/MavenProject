public class seventh {
    //static block
    static{System.out.println("Hello!! My name is Anshika Jain. My age is 22. I print this using static block");}

    //static variable
    public static String description;

    //static method
    public static void showInfo(){
        System.out.println("Hello!! My name is Anshika Jain. My age is 22. I print this using static method");
    }
    public static void main(String[] args){
        //Static variable
         description = "Hello!! My name is Anshika Jain. My age is 22. I print this using static variable";
         System.out.println(description);

        //Static method
        seventh.showInfo();
    }
}

