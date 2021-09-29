public class eleven {
    public static void main(String[] args){
        Bank b1 = new SBI();
        Bank b2 = new BOI();
        Bank b3 = new ICICI();
        System.out.println("SBI Rate of Interest: "+ b1.getRateOfInterest());
        System.out.println("BOI Rate of Interest: "+ b2.getRateOfInterest());
        System.out.println("ICICI Rate of Interest: "+ b3.getRateOfInterest());
    }
}
    class Bank{
        int getRateOfInterest(){
        return 0;
        }
    }
    class SBI extends Bank{
        int getRateOfInterest(){
        return 5;
        }
    }
    class BOI extends Bank{
        int getRateOfInterest(){
            return 6;
        }
    }
    class ICICI extends Bank{
        int getRateOfInterest(){
            return 8;
        }
    }

