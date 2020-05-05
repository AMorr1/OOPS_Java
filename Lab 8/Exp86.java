public class Exp86 {

    public static void main(String[] args) {
        System.out.println("convert FloatToString " + convertFloatToString(34.0f));

        System.out.println("convert FloatToStr Using Float Method " + convertFloatToStrUsingFloatMethod(23.0f));

        System.out.println("convert FloatToStr Using String Method " + convertFloatToStrUsingFloatMethod(233.0f));

        float f = Float.valueOf("23.00");
    }

    public static String convertFloatToString(float f) {
        return "" + f;
    }

    public static String convertFloatToStrUsingFloatMethod(float f) {
        return Float.toString(f);
    }

    public static String convertFloatToStrUsingStringMethod(float f) {
        return String.valueOf(f);
    }

}