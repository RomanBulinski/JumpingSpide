public class Main {


    public static double spiderToFly(final String spider, final String fly) {

        char c1 = spider.charAt(0);
        char c2 = fly.charAt(0);
        int i1 = Integer.valueOf( spider.split("")[1] )  ;
        int i2 = Integer.valueOf( fly.split("")[1] )  ;


        if(c1==c2){
            if(i1>i2){
                return i1-i2;
            }
            return i2-i1;
        }


        return 0d;
    }


}



//H1", "H2
