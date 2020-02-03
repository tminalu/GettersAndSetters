public class Main {
    public static void main(String[] args) {
     Burrito b = new Burrito();
     Veggies v = new Veggies();
     b.SetBean("Black Beans");
     b.SetMeat("Chicken");
     b.setRice("white rice");
     b.setVeggies(v);
        System.out.println(b.getBean());
        System.out.println(b.getMeat());
        System.out.println(b.getRice());


    }

}