package oops.day6.enumExamples;

public class Basic {
    enum Week implements A{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // these are enum constants
        // public, static and final
        // since its final you cannot create child enums
        // type is Week

        void display() {

        }

        // this is not public or protected, only private or default
        // why? we don't want to create new objects
        // this is not the enum concept, that's why
        // internally: public static final Week Monday = new Week();

        Week() {
            System.out.println("Constructor called for " + this);
        }

        @Override
        public void hello() {
            System.out.println("hey how are you");
        }

    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        week.hello();
        System.out.println(Week.valueOf("Tuesday"));
//        for(Week day : Week.values()) {
//            System.out.println(day);
//        }

//        System.out.println(week.ordinal());
    }
}
