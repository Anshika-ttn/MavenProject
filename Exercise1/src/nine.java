enum House {
    House1(50),House2(20),House3(76),House4(37), House5(66);
    private int price;
    House(int p) {
        price = p;
    }
    int getPrice() {
        return price;
    }
}
public class nine {
    public static void main(String args[]){
        System.out.println("All House prices:");
        for (House h : House.values())
            System.out.println(h + " costs " + h.getPrice() + " Lac.");
    }
}
