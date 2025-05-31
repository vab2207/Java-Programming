public class TypeCastingAllExample {
    public static void main(String[] args) {
        byte b = 10;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;

        double d2 = 99.99;
        float f2 = (float) d2;
        long l2 = (long) f2;
        int i2 = (int) l2;
        short s2 = (short) i2;
        byte b2 = (byte) s2;

        char c = 'A';
        int i3 = c;
        char c2 = (char) 66;

        System.out.println("Implicit\n" + s + "\n" + i + "\n" + l + "\n" + f + "\n" + d + "\n" + i3);
        System.out.println("Explicit\n" + f2 + "\n" + l2 + "\n" + i2 + "\n" + s2 + "\n" + b2 + "\n" + c2);
    }
}
