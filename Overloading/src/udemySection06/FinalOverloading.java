package udemySection06;

// only focus on parameter
        // number of parameter
        // variable type of the parameter

public class FinalOverloading {
    public void add(int a){
        System.out.println(a+a);
    }

    public void add(char a){
        System.out.println(a + a);
    }

    public String add(String a){
        return (a+a);
    }

    public float add(float a){
        return (a+a);
    }

    public void add(double a){
        System.out.println(a+a);
    }


    public int add(int a, int b){
        return (a+b);
    }

    public void add(int a, float b){
        System.out.println(a+b);
    }

    public double add(int a, double b){
        return (a+b);
    }

    public float add(float a, int b){
        return (a+b);
    }

    public void add(float a, float b){
        System.out.println(a + b);
    }

    public double add(float a, double b){
        return (a+b);
    }

    public double add(double a, int b){
        return (a+b);
    }

    public void add(double a, float b){
        System.out.println(a+b);
    }

    public void add(double a, double b){
        System.out.println(a+b);
    }
}
