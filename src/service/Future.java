package service;

public interface Future<V> {

    boolean isCancelled();

    boolean isDone();
    
    V get();
}
