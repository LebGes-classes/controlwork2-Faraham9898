public class volk extends animal{

    public void printinfo(){
        hf = 20;
        System.out.println("Введите сколько у волка хп не более 20");
        h = scan.nextInt();
        while(h > hf || h <= 0){
            System.out.println("Введите другое значение хп волка, не более 20");
            h = scan.nextInt();
        }
    }
}
