package exc18_OOPs_accessModifiers.Police;

public class cop {
    protected int gun;
    String iCard;

    public cop(int bullet){     //parameter constructor
        this.gun = bullet;
    }
    protected void canIShoot(){ // method
        System.out.println("You can shoot!");
    }
}
