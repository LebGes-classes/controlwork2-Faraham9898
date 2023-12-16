public class ovca extends animal{
    public int r;
    public final int d = 4;
    ovca(){
        hf = 8;
        System.out.println("Введите хп овцы до 8");
        h = scan.nextInt();
        while(h > hf || h <= 0){
            System.out.println("Исправьте пх овцы, до 8");
            h = scan.nextInt();
        }
        System.out.println("Введите расстояние между животными");
        r = scan.nextInt();
        while(r == 0){
            System.out.println("расстояние не может быть равно нулю");
            r = scan.nextInt();
        }
    }
    public void attacked(){
        double res = (((double) h / hf) * (d / Math.pow(r, 2)));
        double a = h;
        a -= res;
        System.out.println("овца потеряла " + res + " хп.");
        int counter = 1;
        while (a > 0) {
            a -= res;
            counter++;
        }
        System.out.println("Волк съест овцу за  " + counter + " сек");

    }
}
