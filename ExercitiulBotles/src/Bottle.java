public class Bottle {
   private String liquid;
   private double volume;
   private double occupiedVolume;
   private String material;
   private boolean isEmpty;
    public Bottle(String liquid, double volume, double occupiedVolume,String material, boolean isEmpty){
        this.liquid = liquid;
        this.volume = volume;
        this.occupiedVolume = occupiedVolume;
        this.material = material;
        this.isEmpty = isEmpty;
    }
    public void drinkFromBottle(double consumedVolume) {
        this.occupiedVolume = this.occupiedVolume - consumedVolume;
    }
    public void fillBottle(){
        occupiedVolume = volume;
        isEmpty = false;
    }
    public void emptyBottle (){
     occupiedVolume = 0;
     isEmpty = true;
        }

    public void addLiquiToBottle(double addedLiquid){
        this.occupiedVolume = this.occupiedVolume + addedLiquid;
        if (occupiedVolume > volume) {
            System.out.println("Error - Max Volume is reached.");
            occupiedVolume = volume;
        }


    }

    public void setVolume(double volume){
        if (volume < 0){
            System.out.println("Input a valid volume (above 0)");
        } else {
            this.volume = volume;
        }
    }



    @Override
    public String toString() {
        return "Bottle{" +
                "liquid='" + liquid + '\'' +
                ", volume=" + volume +
                ", occupiedVolume=" + occupiedVolume +
                ", material='" + material + '\'' +
                ", isEmpty=" + isEmpty +
                '}';
    }
}

