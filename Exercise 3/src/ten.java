class Line{
    synchronized public void getLine(){
        for(int i=0;i<3;i++){
            System.out.println(i);
            try{
                Thread.sleep(400);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
class Person extends Thread{
    Line line;
    Person(Line line){
        this.line = line;
    }
    @Override
    public void run(){
        line.getLine();
    }
}
public class ten {
    public static void main(String[] args){
        Line obj = new Line();
        Person t1 = new Person(obj);
        Person t2 = new Person(obj);
        t1.start();
        t2.start();
    }
}
