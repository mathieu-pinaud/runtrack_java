public class Boite<T> {
    private T value;

    public Boite(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
