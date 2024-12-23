@Cache(value = {"item1", "item2", "item3"})
public class AnotCache {
    public void start() {
        System.out.println("@Cache Задает кэшируемые элементы в виде массива строк. \nЭтот класс аннотирован @Cache");
    }
}
