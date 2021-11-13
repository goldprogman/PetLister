import java.util.Scanner;
import java.util.ArrayList;
class PetLister {
    public static ArrayList<Pet> petarray = new ArrayList<Pet>();
    public static void main(String[] args) {
        boolean exit = false;
        Scanner inputscan = new Scanner(System.in);
        while (!exit) {
            System.out.println("1 - Add new pet, 2 - List pets, 3 - Quit, 4 - Remove Pet");
            int choice = inputscan.nextInt();
            switch(choice) {
                case 1: System.out.println("1-Caine, 2-Pisica, 3-Hamster");
                int typenr = inputscan.nextInt();
                Pet newpet = new Pet();
                switch(typenr) {
                    case 1:
                    newpet.Animaltype = "Caine";
                    break;
                    case 2:
                    newpet.Animaltype = "Pisica";
                    break;
                    case 3:
                    newpet.Animaltype = "Hamster";
                    break;
                }
                System.out.println("Numeste Animalul");
                newpet.Animalname = inputscan.next();
                System.out.println("Ce varsta are?");
                newpet.Animalage = inputscan.next();
                switch(typenr) {
                    case 1:
                    System.out.println("Ce tip de talie are?");
                    break;
                    default:
                    System.out.println("Ce culoare?");
                }
                newpet.Animalspecial = inputscan.next();
                petarray.add(newpet);
                break;
                case 2:
                for (int i = 0; i < petarray.size(); i++) {
                    Pet currentpet = petarray.get(i);
                    String currentmessage = i+1 + ") " + currentpet.Animaltype + " (" + currentpet.Animalname + ", " + currentpet.Animalage + ", " + currentpet.Animalspecial + ")";
                    System.out.println(currentmessage);
                  }
                  break;
                case 3: exit = true;
                break;
                case 4: System.out.println("Care animal? (trimite numarul animalului)");
                int deadpet = inputscan.nextInt();
                petarray.remove(deadpet-1);
            }
        }
        return;
    }
}