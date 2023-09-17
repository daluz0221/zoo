package zoo;

public class Oviparous implements Animal {
    
    private String name;
    private String type = "Ovíparo";
    private double size;
    private double weight;
    

    public Oviparous(String name,  double size, double weight){
         this.name = name;
         this.size = size;
         this.weight = weight;
    }


    public String getName() {
        return name;
    }

    @Override
    public void SetName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }

    public double getSize() {
        return size;
    }


    public void setSize(Double size) {
        this.size = size;
    }


    public double getWeight() {
        return weight;
    }


    public void setWeight(Double weight) {
        this.weight = weight;
    }



    
}
