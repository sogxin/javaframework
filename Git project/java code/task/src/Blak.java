public class Blak {
    public static void main(String[] args) {
        String str = "  Java class";
        System.out.println("字符串原来的长度: "+str.length());
        System.out.println("去掉空格后的长度: "+str.trim().length());
         //trim只去掉前导和尾部的空格，对中间的空格不进行操作
    }
}
