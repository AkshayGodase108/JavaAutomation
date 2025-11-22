package exc15_OOPs_Inheritance._1_SingleInheritance;

public class TestCase1 extends Common_To_All{

    void runningTC1(){

        startBrowser();
        System.out.println("Running TC1 !!");
        readExcelFile();
        readDBFile();
        closeBrowser();
    }
}
