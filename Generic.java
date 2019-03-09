import java.util.Arrays;
class Generic <T>{
    private T[] array;

    public Generic(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public static void main(String[] args) {
        String myArr[]={"один","два","три","четыре","пять"};
        Generic <String> array = new Generic <>(myArr);
        System.out.print("Это мой массив: ");


        for (int i=0; i<myArr.length; i++){
            System.out.print(myArr[i]+" ");
        }
        System.out.println();
        System.out.println ("Выведем элемент №2: " + myArr[2]);


        int n = myArr.length;
        String temp;
        for (int i = 0; i < n/2; i++) {
            temp = myArr[n-i-1];
            myArr[n-i-1] = myArr[i];
            myArr[i] = temp;
        }
        System.out.print("Это мой массив в обратном порядке: ");
        for (int i=0; i<myArr.length; i++) {
            System.out.print(myArr[i] + " ");
        }
        System.out.println();
        System.out.print("Далее поменяем нулевой и четвертый элементы местами, ну и хоть тут выведем через toString: ");
            String n1 = myArr[0];
            myArr[0] = myArr[4];
            myArr[4] = n1;
            String Arr = Arrays.toString(myArr);

            System.out.println(Arr);
        }
    }


