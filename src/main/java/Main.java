public class Main {


    public static double spiderToFly(final String spider, final String fly) {

        char letter1 = spider.charAt(0);
        char letter2 = fly.charAt(0);
        int i1 = Integer.valueOf(spider.split("")[1]);
        int i2 = Integer.valueOf(fly.split("")[1]);

        if (letter1 == letter2) {
            if (i1 > i2) {
                return i1 - i2;
            }
            return i2 - i1;
        }

        String abc = "ABCDEFGH";

        int indexLetter1 = abc.indexOf(letter1);
        int indexLetter2 = abc.indexOf(letter2);






        return 0d;


    }


}


//H1", "H2
