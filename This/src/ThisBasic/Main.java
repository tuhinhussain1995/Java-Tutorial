package ThisBasic;

public class Main {
    public static void main(String[] args) {

        ThisWithAmbiguityVariableNames.display();
        ThisWithGetterAndSetter.display();
        ThisInConstructorOverloading.display();
        ThisAsAnArgument.display();



// Basic of this keyword:

        // this keyword is used to refer to the current object inside a method or a constructor.
        // the reference(memory address) of both object and this is the same.


// Use of this Keyword:
        // 1. Using this for Ambiguity Variable Names
                // class Main {
                //
                //    int age;
                //    Main(int age){
                //        this.age = age;
                //    }
                // }

                // even if the name of the parameter and instance variable is different, the compiler automatically appends this keyword.

                // class Main {
                //    int age;
                //
                //    Main(int i) {
                //        age = i;        // this.age = i;
                //    }
                //}

        // 2. this with Getters and Setters
        // 3. Using this in Constructor Overloading
        // 4. Passing this as an Argument                // the reference(memory address) of both object and this is the same.



    }
}
