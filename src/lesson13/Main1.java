package lesson13;

public class Main1 {
    public static void main(String[] args) {
        StringUtilsImpl utils = new StringUtilsImpl();

        try{
            utils.div(null, "23");
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
