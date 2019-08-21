import static java.lang.Math.sqrt;

public class Main {


    public static double spiderToFly(final String spider, final String fly) {

        double i1 = Integer.valueOf(spider.split("")[1]);
        double i2 = Integer.valueOf(fly.split("")[1]);

        String abc = "ABCDEFGH";
        int indexLetter1 = abc.indexOf(  spider.charAt(0)  );
        int indexLetter2 = abc.indexOf( fly.charAt(0)  );

        int substratcion = 0;

        if (indexLetter1 == indexLetter2) {
            substratcion = 0;
        } else if (indexLetter1 > indexLetter2) {
            substratcion = indexLetter1 - indexLetter2;
        } else {
            substratcion = indexLetter2 - indexLetter1;
        }

        switch (substratcion) {
            case 0:
                if (i1 > i2) {
                    return i1 - i2;
                } else if (i1 < i2) {
                    return i2 - i1;
                }
                break;
            case 1:
                if (i1 > i2) {
                    double a = Math.sqrt((i2 * i2) / 2);
                    return Math.sqrt(a * a + (i1 - a) * (i1 - a));
                } else if (i1 < i2) {
                    double a = Math.sqrt((i1 * i1) / 2);
                    return Math.sqrt(a * a + (i2 - a) * (i2 - a));
                }
                break;
            case 2:
                return Math.sqrt( Math.pow(i1, 2) + Math.pow(i2, 2) );
            case 3:
                if (i1 > i2) {
                    double a = Math.sqrt((i2 * i2) / 2);
                    return Math.sqrt((a * a) + ((i1+a)*(i1+a)) );
                } else if (i1 < i2) {
                    double a = Math.sqrt((i1 * i1) / 2);
                    return Math.sqrt((a * a) + ((i2 + a) * (i2 + a)) );
                }
                break;
            case 4:
                return i1 + i2;
        }
        return 0d;
    }


}

