public class Main {
    public static void main(String[] args) {


        //static void addNumber(int a, int b){
        //   System.out .println( a+b)
        Ram ram = new Ram();
        processor processor = new processor();
        storage storage = new storage();

//create an instance of computer using the above instances
        Computer computer = new Computer(ram, processor, storage)

        //print the details of the computer
        System.out.println(computer);
    }
}
