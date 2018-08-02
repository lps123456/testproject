package test;

/**
 * Hello world!
 *
 */
public class App 
{
    //.编写一个截取字符串的函数，输入为一个字符串和字节数，
    // 输出为按字节截取的字符串，但要保证汉字不被截取半个
    public static void main( String[] args )
    {
     String strone="我ABC";
     String strtwo="我ABC汉DEF";
      splitString(strone,5);
        splitString(strtwo,7);
    }

    private static void splitString(String str, int lenght) {

        int num=0;
        //判断字符串是否为空
        if (null == str){
            System.out.println("字符串为空!");
            return;
        }
        int bytenum=0;
        byte[] bt=str.getBytes();
        bytenum =bt.length;
        if (lenght>bytenum){
            lenght=bytenum;
        }
        if (bt[lenght]<0){
            str =new String (bt,0,--lenght);
            System.out.println(str);
        }else{
            str =new String (bt,0,lenght);
            System.out.println(str);
        }
    }
}
