public class StringBuffer_4
{
    public static void main(String[] args)
    {
        StringBuffer cart = new StringBuffer();

        // Add items
        cart.append("Mobile");
        cart.append(", ");
        cart.append("Laptop");
        cart.append(", ");
        cart.append("Mouse");

        System.out.println(
                "Cart : " + cart
        );

        // Insert an item
        cart.insert(8, "Keyboard, ");

        System.out.println(
                "After Insert : " + cart
        );

        // Find item
        int position = cart.indexOf("Laptop");

        System.out.println(
                "Laptop Position : " + position
        );

        // Delete an item
        int start = cart.indexOf("Mouse");

        if(start != -1)
        {
            cart.delete(
                    start,
                    start + "Mouse".length()
            );
        }

        System.out.println(
                "After Delete : " + cart
        );

        // Reverse
        cart.reverse();

        System.out.println(
                "Reverse : " + cart
        );
    }
}
