package MultipleInterfaceExample;

public class Main {
    public static void main(String[] args){

        Tiger myTiger = new Tiger(56.3);
        myTiger.display();
        myTiger.makeSound();
        System.out.println(myTiger.move());
        myTiger.canAttackOthers();


        Cat myCat = new Cat(15.5);
        myCat.display();
        myCat.makeSound();
        System.out.println(myCat.move());
        myCat.canPlayWithHuman();
    }
}
