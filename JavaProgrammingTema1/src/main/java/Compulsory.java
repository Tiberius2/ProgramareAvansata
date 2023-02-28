public class Compulsory {

    public static void main(String[] args){
        System.out.println("Hello World!");
        // Define an array of strings languages, containing {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"}
        System.out.println();
        String[] languages = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        // Just for testing
        for(int i = 0; i < languages.length; i++)
        {
            System.out.print(languages[i] + " ");
        }
        //Generate a random integer n: int n = (int) (Math.random() * 1_000_000);
        System.out.println();
        int n = (int) (Math.random() * 1_000_000);
        System.out.println(n + "\n");

        //Compute the result obtained after performing the following calculations:
        //  multiply n by 3;
        n = n * 3;
        //  add the binary number 10101 to the result;
        n += Integer.parseInt("10101",2);
        //  add the hexadecimal number FF to the result;
        n += Integer.parseInt("FF",16);
        //  multiply the result by 6;
        n = n * 6;
        System.out.println(n);

        //Compute the sum of the digits in the result obtained in the previous step. This is the new result. While the new result has more than one digit, continue to sum the digits of the result.
        int sum = 0;
        int result = 0;

        do{
            while(n != 0){
                sum = sum + n % 10;
                n = n/10;
            }
            n = sum;
            result = sum;
            sum = 0;
        }while(result >=10);
        n = result;
        System.out.println(n);
        //Display on the screen the message: "Willy-nilly, this semester I will learn " + languages[result].
        System.out.println('\n');

        System.out.println("Willy-nilly, this semester I will learn " + languages[result]);

    }
}
