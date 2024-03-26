public class Main{
    public static void main(String[] args) {
        cat eshan = new cat("Eshan", 3, "male", "clingy");
        cat coki = new cat("Coki", 1, "male", "lazy");
        cat lala = new cat("Lala", 2, "female", "likes to steal");


        eshan.meow();
        eshan.sleep();
        coki.meow();
        coki.eat();
        lala.meow();
        lala.play();

        System.out.println("Cat's Information:");
        System.out.println("1. " + eshan.getName() + " (" + eshan.getGender() + ")");
        System.out.println("   Age: " + eshan.getAge() + " old");
        System.out.println("   Personality: " + eshan.getPersonality());
        System.out.println("2. " + coki.getName() + " (" + coki.getGender() + ")");
        System.out.println("   Age: " + coki.getAge() + " old");
        System.out.println("   Personality: " + coki.getPersonality());
        System.out.println("3. " + lala.getName() + " (" + lala.getGender() + ")");
        System.out.println("   Age: " + lala.getAge() + " old");
        System.out.println("   Personality: " + lala.getPersonality());
    }
}