public class Main {
    public static void main(String[] args) {
       /*Task 1.1
        int a = 650;
        int b = 500;
        while (a>=b){
            System.out.println(b);
            b = b+10;
        }  */

      /* Task 1.2
       for (int c=500;c<=650; c = c+10){
            System.out.println(c + " ");
        }*/

      /*  Task 1.3
        int i;
        i = 500;
        do{
        System.out.println(i);
        i = i+10;
        }
        while(i<650);
        */
        /*Task 2.1
        int a = 2;
        while(a<=5000){
            System.out.println(a);
            a = (a*2)-1;
        }   */
        /* Task 2.2
        for (int a=2;a<=5000;a=(a*2)-1){
            System.out.println(a);
        }
            */
        /* Task 2.3
        int a = 2;
        do{
            System.out.println(a);
            a = (a*2)-1;
        }
        while (a<=5000);
        */
        /* Task 3.1
        int n = 10;
        int i = 0;
        while (i<=n){
            i++;
            if (n%i==0){
                System.out.println(i);
            }
        }
        */
        /* Task 3.2
        int n = 10;
        for(int i=1;i<=n; i++){
            if (n%i==0){
                System.out.println(i);
            }
        }
         */
        /* Task 3.3
         int n = 10;
         int i = 1;
         do {
             if (n%i==0){
                 System.out.println(i);
             }
             i++;
         }
         while (i<=n);
            */
        /* Task 4.1
        int n = 10;
        int f = 1;
        int i = 1;
        while(i<=n){
            f=f*i;
            i++;
        }
        System.out.println(f);
         */
        /*Task 4.2
        int n = 10;
        int f = 1;
        for(int i = 1 ; i<=n; i++){
            f=f*i;
        }
        System.out.println(f);
         */
        /* Task 5
        int i = 0;
        for (int h = 0;h <= 23; ++h){
            for (int m = 0; m <= 60; ++m){
                int a = h / 10;
                int b = h % 10;
                int c = m / 10;
                int d = m % 10;
                if (a == c && b == d && d <=5){
                    ++i;
                }
        }

    }
        System.out.println("Кількість симетричних комбінацій:" + i);

         */
        /* Task 6
        int k = 0;
        for (int i = 1; i<=999999 ; i++){
            int a, b, c, d, e, f;
            a=i/100000;
            b = (i-(a*100000))/10000;
            c = (i-(a*100000)+(b*10000))/1000;
            d=(i-((a*100000)+(b*10000)+(c*1000)))/100;
            e=(i-((a*100000)+(b*10000)+(c*1000)+(d*100)))/10;
            f=(i-((a*100000)+(b*10000)+(c*1000)+(d*100)+(e*10)));
            if (a+b+c==d+e+f){
                String sum1 = Integer.toString(a)+Integer.toString(b)+Integer.toString(c);
                String sum2 = Integer.toString(d)+Integer.toString(e)+Integer.toString(f);
                k++;
                System.out.println(sum1+sum2);
            }
        }

         */

    }
}