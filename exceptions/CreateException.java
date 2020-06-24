package exceptions;

public class CreateException {

    public static void main(String[] args){

        int x = 5;
        int y = 0;
        try{
            if (y == 0){
                throw new CustomException("y is equal to 0");
            }
            System.out.println(x/y);
        }
        catch( CustomException err){
            System.out.println(err.showMessage());
        }




    }
}
