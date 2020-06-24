package exceptions;

public class CustomException  extends Exception{
       String message;
    CustomException(String errorMassage){
        super(errorMassage);
        this.message = errorMassage;
    }

    public String showMessage(){
        return message + "???????";
    }
}
