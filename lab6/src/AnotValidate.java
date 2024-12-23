@Validate(value = {String.class, Integer.class})
public class AnotValidate {
    public void start() {
        System.out.println("Этот класс аннотировано @Validate!");
    }
}
