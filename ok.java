public class ok {
    public static void main(String[] args) {

        //String Length
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int num = txt.length();
        System.out.println(num);

        //String to lowercase
        String newtxt =txt.toLowerCase();
        System.out.println(newtxt);

        //Locate word in a string
        System.out.println(newtxt.indexOf("yz"));

        //Random
        System.out.println(Math.random() *150);

        //--- if --- else --- else if ---
        int x =40;
        int y =30;
        if (y>x){
            System.out.println("y is bigger than x");
        }else if ( x>y ) {
            System.out.println("x is bigger than y");
        }else {
            System.out.println("x=y");
        }

        //quick if

        String result = (y>x) ? "y is bigger than x" : "x is bigger than y";
        System.out.println(result);


    }

}