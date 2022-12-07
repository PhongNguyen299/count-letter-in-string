import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str;
        char letter;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String: ");
        str = input.nextLine();
        System.out.print("Enter letter: ");
        letter = input.next().charAt(0);

        System.out.printf("Count of %c in '%s': %d ",letter,str,count(str,letter));
    }

    public static int count(String str,char letter){
        int count = 0;
        char [] ch = str.toCharArray();

        for (int i = 0; i < ch.length ; i++){
            if(ch[i] == letter) count++;
        }
        return count;
    }
}