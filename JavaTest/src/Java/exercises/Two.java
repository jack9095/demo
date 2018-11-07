package Java.exercises;

public class Two {

    public static void main(String[] args){
        System.out.println(getInt());
    }

    private static Integer getInt(){
        Integer fly = 5;
        try{
            return fly = 6;
        }catch (Exception e){
            return fly = 7;
        }finally {
            return fly = 8;
        }
    }

}
