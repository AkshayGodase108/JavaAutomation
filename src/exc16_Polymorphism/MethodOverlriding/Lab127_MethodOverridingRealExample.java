package exc16_Polymorphism.MethodOverlriding;

import exc15_OOPs_Inheritance._1_SingleInheritance.Common_To_All;

public class Lab127_MethodOverridingRealExample {
    public static void main(String[] args) {
        FireFoxTC F1 = new FireFoxTC();
        F1.openBrowser();
        System.out.println("----------");
        ChromeTC C = new ChromeTC();
        C.openBrowser();
        System.out.println("----------");
        common_to_all common = new common_to_all();
        common.openBrowser();
        System.out.println("----------");

        //Dynamic Dispatch
        common_to_all C1 = new ChromeTC();
        C1.openBrowser();

        common_to_all C2 = new FireFoxTC();
        C2.openBrowser();
    }
}
class common_to_all{
    void openBrowser(){
        System.out.println("Open the IE browser");
    }
}
class ChromeTC extends common_to_all{
    @Override                                                //Override is optional
    void openBrowser(){
        System.out.println("Open the Chrome Browser");
    }
}
class FireFoxTC extends common_to_all{
    @Override
    void openBrowser(){
        System.out.println("Open the FireFox Browser");
    }
}