package ErrorMessage;

public class NotFoundAnimal extends RuntimeException{
    public NotFoundAnimal(String message) {
        super(message);
    }
}
