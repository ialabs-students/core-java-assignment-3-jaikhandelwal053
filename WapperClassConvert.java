public class WapperClassConvert {
    public static void main(String[] args) {
        int object = 10;
       convertToWrapper(object);
    }
    public static Integer convertToWrapper(int object){
        Integer wobj = Integer.valueOf(object);
        System.out.println(wobj);
        if(wobj instanceof Integer){
            System.out.println("Convert Sucessfully "+ wobj);
        }
        return wobj;
    }
}
