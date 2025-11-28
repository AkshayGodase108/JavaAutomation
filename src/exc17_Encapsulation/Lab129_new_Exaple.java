package exc17_Encapsulation;

public class Lab129_new_Exaple {
    public static void main(String[] args) {
        ICICIBank akshay = new ICICIBank("Akshay",10);
        long bal = akshay.getBal();
        System.out.println(bal);
        akshay.setBal(1000000,true);
        akshay.setBal(1,false);
        long bal_updated = akshay.getBal();
        System.out.println(bal_updated);
    }
}
class ICICIBank {
    private String name; //instance variable / Attribute /Data variable / Fields / Properties /Member variables
    private long bal;

    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean IsCashier) {
        if (IsCashier) {
            this.bal = bal;
        } else {
            System.out.println("Not allowed to change the bal");
        }
    }
}