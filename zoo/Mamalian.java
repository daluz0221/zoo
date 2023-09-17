package zoo;

public class Mamalian implements Animal {
    
    private String name;
    private String type = "Mamífero";
    private String breed;
    private double size;
    private double weight;
    

    public Mamalian(String name, String breed, double size, double weight){
         this.name = name;
         this.breed = breed;
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


    public String getBreed() {
        return breed;
    }


    public void setBreed(String breed) {
        this.breed = breed;
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
