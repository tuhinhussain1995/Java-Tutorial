package encapsulation1;

public class Printer {
    private final float color_page = .50f;
    private final float gray_page = .10f;

    private float total_cost = 0;
    private boolean isColor;
    private boolean isDuplex;

    private int number_of_page = 0;


    public Printer(boolean isColor, boolean isDuplex, int number_of_page){
        this.isColor = isColor;
        this.isDuplex = isDuplex;
        this.number_of_page = number_of_page;

        setTotal_cost();
    }

    public void setTotal_cost(){
        int total_page = 0;
        if(isColor){
            if(isDuplex){
                total_page = (this.number_of_page / 2) + (this.number_of_page % 2);
            }
            else{
                total_page = this.number_of_page;
            }
            this.total_cost = this.color_page * total_page;
            this.number_of_page = total_page;
        }
        else if (!isColor){
            if(isDuplex){
                total_page = (this.number_of_page / 2) + (this.number_of_page % 2);
            }
            else{
                total_page = this.number_of_page;
            }
            this.total_cost = this.gray_page * total_page;
            this.number_of_page = total_page;
        }
    }

    public float getTotal_cost(){
        return this.total_cost;
    }

    public int getNumber_of_page(){
        return this.number_of_page;
    }
}
