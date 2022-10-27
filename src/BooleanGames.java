public class BooleanGames {
    private int number;  // instance variable

    // constructor
    public BooleanGames(int number) {
        this.number = number;
    }

    /* Returns true if the instance variable, number, is negative;
       returns false otherwise */
    public boolean isNegative() {
        return (number < 0);
    }

    /* Returns true if the instance variable, number, is greater than num */
    public boolean exceeds(int num){
        return (number > num);
        /* implement this method! */
    }

    /* Returns true if the instance variable, number, is even;
       returns false otherwise */
    public boolean isEven() {
        return (number % 2) == 0;
        /* implement this method! */
    }

    /* Returns true if the instance variable, number, is odd; returns false
       otherwise; needs to be able to handle case when number is negative */
    public boolean isOdd() {
        if (number < 0) {
            return (-1 * number) % 2 > 0;
        }
        return (number % 2) > 0;
        /* implement this method! */
    }

    /* Returns true if the instance variable, number, is a multiple of x;
       returns false otherwise */
    public boolean isMultipleOf(int x) {
         return number % x == 0;
        /* implement this method! */
    }

    /* Returns true if the ones digit of the instance variable, number, is equal
       to num; e.g. if number is 437, then isOnesDigit(7) would return true and
       isOnesDigit(5) would return false
       This method should handle the case when number is negative, so if
       number is -123, then isOnesDigit(3) should return true.

       PRECONDITION:  num >= 0
     */
    public boolean isOnesDigit(int num) {
        String number2 = number + "";
        int length = number2.length();
        Math.pow(10, length-1);


        return (Math.abs(number) % 10) == num;




        /* implement this method! */
    }
}
