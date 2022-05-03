package Demo06StringBuilder;

public class Demo01StringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        StringBuilder builder1 = builder.append("abc");
        System.out.println(builder);
        System.out.println(builder1);

        System.out.println(builder.append(1).append("sfsf").append('嘿'));
        String str = builder.toString();
        System.out.println(builder.getClass());
        System.out.println(str.getClass());
    }
}
