public class DNA {
 
  public static void main(String[] args) {
 
    //  -. .-.   .-. .-.   .
    //    \   \ /   \   \ / 
    //   / \   \   / \   \  
    //  ~   `-~ `-`   `-~ `-
 String dna1 = "ATGCGATACGCTTGA";
String dna2 = "ATGCGATACGTGA";
String dna3 = "ATTAATATGTACTGA";
String dna = dna1;
int length = dna.length();
System.out.println("Length: " + length);
int protein = dna.indexOf("ATG");
int proteinEnd= dna.indexOf("TGA");
if (protein != -1 && proteinEnd != -1){
  System.out.println("Hurra");
} ;

  }
 
}