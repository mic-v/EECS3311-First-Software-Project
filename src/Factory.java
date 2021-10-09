/**
 * Base interface for Factory design pattern that retrieves object to user
 * @param <T>
 */
public interface Factory<T> {
    T getObject(String type);
}
