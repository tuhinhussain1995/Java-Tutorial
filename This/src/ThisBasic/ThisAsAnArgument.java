package ThisBasic;

public class ThisAsAnArgument {

    private int x, y;

    ThisAsAnArgument(int x, int y) {
        this.x = x;
        this.y = y;

        add(this);         // We are passing here new created object's all fields.
    }

    private void add(ThisAsAnArgument myObj){
        myObj.x += 3;
        myObj.y -= 2;
    }


    @Override
    public String toString(){              // toString is return type method and must be public
        return this.x + " + " + this.y + " = " + (this.x+this.y);
    }


    public static void display(){
        ThisAsAnArgument obj = new ThisAsAnArgument(3, 5);
        System.out.println(obj);          // When we print out the object, it actually print out the toString
    }
}
