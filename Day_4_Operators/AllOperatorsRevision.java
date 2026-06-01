class AllOperatorsRevision
{
    public static void main(String args[])
    {
        System.out.println("===== ALL OPERATORS REVISION =====");

        int num1 = 10;
        int num2 = 5;
        String s = " Hi frnds ";

        System.out.println();
        System.out.println("===== ARITHMETIC OPERATORS =====");

        System.out.println("Addition : " + (num1 + num2));
        System.out.println("Addition : " + (num1 + s));
        System.out.println("Addition : " + (num1 + s + num2));
        
        System.out.println("Subtraction : " + (num1 - num2));
        System.out.println("Multiplication : " + (num1 * num2));
        System.out.println("Division : " + (num1 / num2));
        System.out.println("Modulo : " + (num1 % num2));

        System.out.println();
        System.out.println("===== RELATIONAL OPERATORS =====");

        System.out.println("num1 > num2 : " + (num1 > num2));
        System.out.println("num1 < num2 : " + (num1 < num2));
        System.out.println("num1 == num2 : " + (num1 == num2));
        System.out.println("num1 != num2 : " + (num1 != num2));
        System.out.println("num1 >= num2 : " + (num1 >= num2));
        System.out.println("num1 <= num2 : " + (num1 <= num2));

        System.out.println();
        System.out.println("===== UNARY OPERATORS =====");

        int x = 10;

        System.out.println("Original x : " + x);

        System.out.println("Post Increment x++ : " + x++);
        System.out.println("After Post Increment : " + x);

        System.out.println("Pre Increment ++x : " + ++x);

        System.out.println("Post Decrement x-- : " + x--);
        System.out.println("After Post Decrement : " + x);

        System.out.println("Pre Decrement --x : " + --x);

        boolean isMajor = true;

        System.out.println("isMajor : " + isMajor);
        System.out.println("!isMajor : " + !isMajor);

        System.out.println();
        System.out.println("===== LOGICAL OPERATORS =====");

        boolean hasVoterId = false;

        System.out.println("isMajor && hasVoterId : "
                           + (isMajor && hasVoterId));

        System.out.println("isMajor || hasVoterId : "
                           + (isMajor || hasVoterId));

        System.out.println("!isMajor || hasVoterId : "
                           + (!isMajor || hasVoterId));

        System.out.println();
        System.out.println("===== TERNARY OPERATOR =====");

        String bigNum =
                (num1 > num2)
                ? (num1 + " is Big")
                : (num2 + " is Big");

        System.out.println(bigNum);

        String evenOdd =
                (num1 % 2 == 0)
                ? "Even Number"
                : "Odd Number";

        System.out.println("num1 : " + evenOdd);

        System.out.println();
        System.out.println("===== MIXED OPERATORS =====");

        int result =
                ++num1
                + num2++
                + (num1 * num2)
                - (num1 / num2);

        System.out.println("Result : " + result);

        boolean check =
                (num1 > num2)
                && (result > 50)
                || (num2 < 100);

        System.out.println("Check : " + check);

        String finalResult =
                (check)
                ? "All Conditions Passed"
                : "Conditions Failed";

        System.out.println(finalResult);

        System.out.println();
        System.out.println("===== PROGRAM END =====");
    }
}


/*

OUTPUT

  ===== ALL OPERATORS REVISION =====

===== ARITHMETIC OPERATORS =====
Addition : 15
Addition : 10 Hi frnds 
Addition : 10 Hi frnds 5
Subtraction : 5
Multiplication : 50
Division : 2
Modulo : 0

===== RELATIONAL OPERATORS =====
num1 > num2 : true
num1 < num2 : false
num1 == num2 : false
num1 != num2 : true
num1 >= num2 : true
num1 <= num2 : false

===== UNARY OPERATORS =====
Original x : 10
Post Increment x++ : 10
After Post Increment : 11
Pre Increment ++x : 12
Post Decrement x-- : 12
After Post Decrement : 11
Pre Decrement --x : 10
isMajor : true
!isMajor : false

===== LOGICAL OPERATORS =====
isMajor && hasVoterId : false
isMajor || hasVoterId : true
!isMajor || hasVoterId : false

===== TERNARY OPERATOR =====
10 is Big
num1 : Even Number

===== MIXED OPERATORS =====
Result : 81
Check : true
All Conditions Passed

===== PROGRAM END =====

=== Code Execution Successful ===

  */
