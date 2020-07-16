public class Division {
    public static void main(String[] args) {
        String str = new String("abc,def,ghi,gkl");
        String[] newstr = str.split(",",2);
        for(int i = 0;i<newstr.length;i++){
            System.out.println(newstr[i]);
        }
    }
}
