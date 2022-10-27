public class Runner {
    public static void main(String[] args)
    {
        double e = 30.0;
        double f = 30.0;
        System.out.println(e == f);

        double g = 0.5;
        double h = (double) 1 / 2;
        System.out.println(g == h);

        double j = 1.0 / 3;
        double k = 2.0 / 6;
        System.out.println(j == k);

        double m = 6.66666666666;
        double n = 6.66666666667;
        System.out.println(m == n);

        double p = 1.0 / 3;
        double q = 1 - 2.0 / 3;
        System.out.println(p == q);
        System.out.println(p);
        System.out.println(q);

        Dog dog1 = new Dog("Spot", 10, false);
        Dog dog2 = new Dog("Petunia", 12, true);
        Dog dog3 = new Dog("Lucky", 3, false);
        Dog dog4 = new Dog("Spot", 5, true);
        Dog dog5 = new Dog("Petunia", 12, true);

        System.out.println("-- Set A --");
        System.out.println(dog1 == dog2);
        System.out.println(dog1 == dog3);
        System.out.println(dog1 == dog4);
        System.out.println(dog2 == dog5);

        // create new reference variables dog6, dog7, dog8
        Dog dog6 = dog1;
        Dog dog7 = dog2;
        Dog dog8 = dog6;

        System.out.println("-- Set B --");
        System.out.println(dog1 == dog6);
        System.out.println(dog2 == dog7);
        System.out.println(dog6 == dog8);
        System.out.println(dog1 == dog8);

        dog1 = null;
        System.out.println("-- Set C --");
        System.out.println(dog1 == dog6);
        System.out.println(dog2 == dog7);
        System.out.println(dog6 == dog8);
        System.out.println(dog1 == dog8);
        System.out.println(dog1 == null);
        System.out.println(dog6 != dog8);
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);
        System.out.println(dog5);
        System.out.println(dog6);
        System.out.println(dog7);
        System.out.println(dog8);


        // we can use >, <, >=, <=
        // to compare arithmetic expressions

        int a = 15;
        int b = 15;
        int c = 20;
        System.out.println("-- Set A --");
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        System.out.println("-- Set B --");
        System.out.println(a > c);
        System.out.println(a < c);
        System.out.println(a >= c);
        System.out.println(a <= c);

        System.out.println("-- Set C --");
        System.out.println((a >= 15) == (c > b));
        System.out.println((b < c) == (a < b));
        System.out.println((a == c) == (b == c));
        System.out.println((a == b) == (b == c));


        final int VOTING_AGE = 18;
        final int DRIVING_AGE = 16;

        int myAge = 17;

        boolean canVote = (myAge >= VOTING_AGE);
        boolean canDrive = (myAge >= DRIVING_AGE);

        System.out.println("I can vote: " + canVote);
        System.out.println("I can drive: " + canDrive);

        int yourAge = 18;

        boolean sameAge = (myAge == yourAge);
        System.out.println("We're the same age: " + sameAge);

        int num1 = 13;
        boolean isEven = (num1 % 2 == 0);
        System.out.println(num1 + " is even: " + isEven);

        boolean weird = (num1 <= 15) == (yourAge > 20);
        System.out.println(weird);



        BooleanGames game1 = new BooleanGames(10);
        System.out.println(game1.isNegative());
        System.out.println("----");
        System.out.println(game1.exceeds(9));
        System.out.println(game1.exceeds(10));
        System.out.println(game1.exceeds(11));
        System.out.println("----");
        System.out.println(game1.isEven());
        System.out.println(game1.isOdd());
        System.out.println("----");
        System.out.println(game1.isMultipleOf(1));
        System.out.println(game1.isMultipleOf(2));
        System.out.println(game1.isMultipleOf(5));
        System.out.println(game1.isMultipleOf(10));
        System.out.println(game1.isMultipleOf(4));
        System.out.println(game1.isMultipleOf(8));
        System.out.println(game1.isMultipleOf(20));
        System.out.println("----");
        System.out.println(game1.isOnesDigit(0));
        System.out.println(game1.isOnesDigit(1));
        System.out.println(game1.isOnesDigit(5));







    }
}
