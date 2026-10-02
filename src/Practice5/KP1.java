package Practice5;

public class KP1 {

    public static void main(String[] args) {

        //не задано значение x - нужно указать, например 0
        //y — double, z — int - нужно приведение int z = (int) (25 - y);
        //System.out.println(x+' '+y+' '+z) - ' ' число 32, а не пробел- заменить на "" System.out.println(x + " " + y + " " + z);
      double x = 0, y = 10;
        System.out.println(x + y);
        System.out.println("ы" + x + y);
        int z = (int) (25 - y);
        System.out.println(x + ' ' + y + ' ' + z);
        System.out.println(x + " " + y + " " + z);


//Аналитически (не запуская код) определить, что выведет фрагмент программы
/*        int i=0, N=7, x= 2;
//i=5;
        while(i<=N)
        {
            ++i;
            x *= 2;
        }
        System.out.println("i="+i+" x="+x);
    }*/

        // Аналитически (не запуская код) определить, что выведет фрагмент программы
/*        int i, N=7, x=2;
        for(i=4; i<N; i++);
        x*=2;
        System.out.println("i="+i+" x="+x);*/

        //Какую строку выведет следующая программа
/*        int k = 5;
        f1(k);
        System.out.println("" + k);
    }

        public static void f1(int x){
                x += x--;
            }*/

    }
}

