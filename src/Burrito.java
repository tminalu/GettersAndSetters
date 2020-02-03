public class Burrito {
    private String rice;
    private String bean;
    private String meat;
    //This is composition--class inside a class
    //decleared a class onside a class
    private Veggies veggies;

    //default constructor is needed after creating class and  declaring variables
    public Burrito() {

    }

    public void setRice(String rice) {
        this.rice = rice;
    }

    public String getRice() {
        return this.rice;
    }

    public void SetBean(String bean) {
        this.bean = bean;
    }

    public String getBean() {
        return  this.bean = bean;
    }

    public void SetMeat(String meat) {
        this.meat = meat;
    }

    public String getMeat() {
        return this.meat = meat;
    }
    public void setVeggies(Veggies veggies){
        this.veggies=veggies;
    }
    public Veggies getVeggies(){
        return this.veggies;
    }
}

