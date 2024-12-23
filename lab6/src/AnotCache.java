@Cache(value = {"item1", "item2", "item3"})
public class AnotCache {
    public void start() {
        System.out.println("Этот класс аннотирован @Cache!");
    }
}
