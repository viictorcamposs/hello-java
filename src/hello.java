public class hello {
    public static void main(String[] args) {
        // How to print
        System.out.println("Hello World");

        // How to create variables
        int myNephewsAge  = 11;
        double myWeight = 68.5;
        String myName = "Victor";
        boolean amIAboutToLiveMyMomsHouse = true;
        char myInitial = 'V';

        // Conditionals / IF ELSE / Condition
        if (myNephewsAge < 18) {
            System.out.println("He's not an adult.");
        }

        if (amIAboutToLiveMyMomsHouse) {
            System.out.println("You're about to be freer than ever!");
            System.out.println("And have a lot of responsibilities.");
        }

        if (myName != "Victor") {
            System.out.println("Nice to meet you " + myName);
        } else {
            System.out.println("Ok. My two strings isn't equal to each other.");
        }

        // While, Do While, For Loops
        while(myNephewsAge < 18) {
            System.out.println("He still isn't an adult");
            myNephewsAge++;
        }

        for (int index = 0; index <= 20; index++) {
            System.out.println(index);
        }

        int x = 0;

        do {
            System.out.println(x);
            x++;
        } while(x < 10);
    }
}
