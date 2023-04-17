public class Main {
    public static void main(String[] args) {

       System.out.println(f("gran cursos online"));



    }
    public static String f (String a ){
        if(a.isEmpty()){
            return a;
        }
        String[] b = a.split("",2);
        String x =  b[0];
        String z;
        if(b.length == 2)
            z= b[1];
        else
            z = "";
        return  f(z) + x + "";



    }
}
