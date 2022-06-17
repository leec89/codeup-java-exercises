public class Person {

    private String name;

    public Person(String personName) {
        name = personName;
    }

    //TODO: return the person's name
    public String getName() {
        return name;
    }
    //TODO: change the name field to the passed value
    public void setName(String name) {
        this.name = name;
    }

    public void sayHello(){
    //TODO: print a message to the console using the person's name
        System.out.printf("Hello %s %n", name);
    }

    public void sayHiya(){
        //TODO: print a message to the console using the person's name
        System.out.printf("Hiya %s %n", name);
    }

    public Person() {};

    public static void main(String[] args) {

        // 1a - Object basics
        Person person1 = new Person("Chris");
//        person1.setName("Chris");                         //Not needed with first constructor on Line 5
        person1.sayHello();

        System.out.printf("Hiya " + person1.getName());
        System.out.println();

        Person fred = new Person("Fred");
        fred.sayHello();
        fred.sayHiya();

        // 1b - Understanding references - first block
//        Person person2 = new Person("John");
//        Person person3 = new Person("John");
//        System.out.println(person2.getName().equals(person3.getName()));
//        System.out.println(person2 == person3);

        // 1b - Understanding references - second block
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        person2 = person1;
//        System.out.println(person1 == person2);

        // 1b - Understanding references - third block

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());



    }

}
