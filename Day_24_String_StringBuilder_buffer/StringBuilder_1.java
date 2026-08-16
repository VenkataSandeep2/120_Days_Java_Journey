public class StringBuilder_1
{
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder("Java");

        // 1. append()
        sb.append(" Developer");
        System.out.println("append()      : " + sb);

        // 2. insert()
        sb.insert(5, "Full Stack ");
        System.out.println("insert()      : " + sb);

        // 3. replace()
        sb.replace(5, 15, "Backend");
        System.out.println("replace()     : " + sb);

        // 4. delete()
        sb.delete(5, 12);
        System.out.println("delete()      : " + sb);

        // 5. append()
        sb.append(" Developer");
        System.out.println("append()      : " + sb);

        // 6. charAt()
        System.out.println("charAt(0)     : " + sb.charAt(0));

        // 7. setCharAt()
        sb.setCharAt(0, 'j');
        System.out.println("setCharAt()   : " + sb);

        // 8. length()
        System.out.println("length()      : " + sb.length());

        // 9. capacity()
        System.out.println("capacity()    : " + sb.capacity());

        // 10. indexOf()
        System.out.println("indexOf()     : " + sb.indexOf("Developer"));

        // 11. lastIndexOf()
        System.out.println(
            "lastIndexOf() : " + sb.lastIndexOf("Developer")
        );

        // 12. substring()
        System.out.println(
            "substring()   : " + sb.substring(0, 4)
        );

        // 13. toString()
        String result = sb.toString();
        System.out.println("toString()    : " + result);
    }
}


    // OUTPUT

// append()      : Java Developer
// insert()      : Java Full Stack Developer
// replace()     : Java Backend Developer
// delete()      : Java  Developer
// append()      : Java  Developer Developer
// charAt(0)     : J
// setCharAt()   : java  Developer Developer
// length()      : 25
// capacity()    : 42
// indexOf()     : 6
// lastIndexOf() : 16
// substring()   : java
// toString()    : java  Developer Developer
