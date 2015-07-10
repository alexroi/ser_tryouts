/**
 * Created by HooT on 16.06.2015.
 */
/****************** Exercise 1 *****************
 * Create a class containing an int and a char
 * that are not initialized. Print their values
 * to verify that Java performs default
 * initialization.
 ***********************************************/
public class EX01 {
    int i;
    double d;
    boolean b;

    public static void main(String[] args){
        EX01 data2 = new EX01();
        data2.i = 74;
        System.out.println("d.i: " + data2.i);
        data2.d = 0.45;
        System.out.println("d.d: " + data2.d);
        data2.b = false;
        System.out.println("d.b: " + data2.b);
    }
}
