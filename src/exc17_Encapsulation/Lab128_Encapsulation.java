package exc17_Encapsulation;

public class Lab128_Encapsulation {
    public static void main(String[] args) {
        LL_cat cat = new LL_cat("Tom", "America");
        cat.setName("Jimmy");
        System.out.println("We have a cat " + cat.getName() + " from the breed " + cat.getBreed());
    }
}
     class LL_cat {
        private String name;
        private String breed;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getBreed() {
            return breed;
        }

        public LL_cat(String name, String breed){
            this.name=name;
            this.breed=breed;
        }
    }

