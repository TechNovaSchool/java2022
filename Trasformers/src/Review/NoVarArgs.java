package Review;

public class NoVarArgs {

    public static void main(String[] args) {
        NoVarArgs nvars = new NoVarArgs();

        double result = nvars.addNumbers(20, 20);
        result = nvars.addNumbers(20, 20, 20);
        result = nvars.addNumbers(20, 20, 20, 20);

        System.out.println(result);

        String subStr = nvars.subStr("abc", "xyz", "123", "qa", "sdet", "2111");
        subStr = nvars.subStr("hello", "java");
        System.out.println(subStr);
    }



    public double addNumbers(double ... args){

        double res = 0;
        for (double arg : args) {
            res += arg;
        }
        return res;
    }

    public String subStr(String  ... str){

        String result = "";
        for (String arg : str){
            result += arg.charAt(0);
        }

        return result;
    }


}
