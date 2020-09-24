package Lesson3;

public class ProductNotFound extends RuntimeException {
    public ProductNotFound(String message){
        super(message);
    }

}