package todo.model;

public class ModelException extends Exception {
    
    /** Creates a new instance of ModelException */
    public ModelException(String msg, Throwable cause) {
        super(msg, cause);        
    }
    
    public ModelException(String msg) {
        this(msg, null);        
    }
    
}
