import static java.lang.Math.sqrt;

public class Main {


    public static double spiderToFly(final String spider, final String fly) {

        char letter1 = spider.charAt(0);
        char letter2 = fly.charAt(0);
        int i1 = Integer.valueOf(spider.split("")[1]);
        int i2 = Integer.valueOf(fly.split("")[1]);

        String abc = "ABCDEFGH";

        int indexLetter1 = abc.indexOf(letter1);
        int indexLetter2 = abc.indexOf(letter2);

        int substratcion = -1;

        if (indexLetter1 == indexLetter2) {
            substratcion = 0;
        } else if (indexLetter1 > indexLetter2) {
            substratcion = indexLetter1 - indexLetter2;
        } else if (indexLetter1 < indexLetter2) {
            substratcion = indexLetter2 - indexLetter1;
        }


        if (substratcion == 0) {
            if (i1 > i2) {
                return i1 - i2;
            } else if (i1 < i2) {
                return i2 - i1;
            }
        }

        if (substratcion == 2 || substratcion == 6) {
            return Math.sqrt(Math.pow(i1, 2) + Math.pow(i2, 2));
        }

        if (substratcion == 4) {
            return i1 + i2;
        }

        if (substratcion == 1) {
            if (i1 > i2) {
                double a = Math.sqrt((i2 * i2) / 2);
                return Math.sqrt(a * a + (i1 - a) * (i1 - a));
            } else if (i1 < i2) {
                double a = Math.sqrt((i1 * i1) / 2);
                return Math.sqrt(a * a + (i2 - a) * (i2 - a));
            }

        }

        if (substratcion == 3) {
            if (i1 > i2) {
                double a = Math.sqrt((i2 * i2) / 2);
                return Math.sqrt(a*a + (i1+a)*(i1+a));
            } else if (i1 < i2) {
                double a = Math.sqrt((i1 * i1) / 2);
                return Math.sqrt(a*a + (i2+a)*(i2+a));
            }

        }

        return 0d;
    }

}

