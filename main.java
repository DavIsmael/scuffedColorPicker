import java.io.IOException;
public class main {
    public static void main(String[] args) throws IOException{
        char choice;
        System.out.println("Option one: Green");
        System.out.println("Option two: Blue");
        System.out.println("Option three: Red");
        System.out.println("Option four: Yellow");
        do{
            System.out.print("Choose which option you want: ");
            choice = (char)System.in.read();
        }while(choice < '1' || choice > '4');
        switch(choice){
            case '1':
                System.out.println("You chose green");
                break;
            case '2':
                System.out.println("You chose blue");
                break;
            case '3':
                System.out.println("You chose red");
                break;
            case '4':
                System.out.println("You chose yellow");
                break;
            default:
                System.out.println("This option for a color doesn't exist");
        }
    }
}