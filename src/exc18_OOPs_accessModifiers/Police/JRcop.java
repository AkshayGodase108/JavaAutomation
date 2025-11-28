package exc18_OOPs_accessModifiers.Police;

public class JRcop {
    public static void main(String[] args) {
        cop JRcop = new cop(100);
        JRcop.canIShoot();
        System.out.println(JRcop.gun);
    }

}
