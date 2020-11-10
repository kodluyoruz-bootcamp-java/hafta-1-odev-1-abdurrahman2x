public class Araba {
    private String model;
    private String renk;
    private String marka;
    private double motorGucu;
    public Araba(String marka, String model, String renk, double motorGucu ){
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.motorGucu = motorGucu;
        System.out.println("4 Parametreli Constructor");
    }
    public Araba(String marka, String model){
        this.marka = marka;
        this.model = model;
        System.out.println("2 Parametreli Contructor");
    }
}