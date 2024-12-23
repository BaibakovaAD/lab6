
public class Main {
    public static void main(String[] args) {

        System.out.print("\nЗадачи на аннотацию 2.1-2.6: ");

        AnotInvoke ex21 = new AnotInvoke();
        ex21.start();

        System.out.print("\n");

        AnotDefault ex22 = new AnotDefault();
        ex22.start();

        System.out.print("\n");

        AnotToString ex23 = new AnotToString();
        ex23.start();
        System.out.println(ex23);

        System.out.print("\n");

        AnotValidate ex24 = new AnotValidate();
        ex24.start();

        System.out.print("\n");

        AnotTwo ex25 = new AnotTwo();
        ex25.start();

        System.out.print("\n");

        AnotCache ex26 = new AnotCache();
        ex26.start();
    }
}