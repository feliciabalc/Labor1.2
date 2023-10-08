public class Main {
    public static void main(String[] args) {
        int a=maximumNr(new int[]{4,8,3,10,17});
        System.out.println(a);

        int b=minimumNr(new int[]{4,8,3,10,17});
        System.out.println(b);

        int c=maximSum(new int[]{4,8,3,10,17});
        System.out.println(c);

        int d=minimSum(new int[]{4,8,3,10,17});
        System.out.println(d);
    }

    public static int maximumNr(int[] array) {
        int maximum=array[0];
        for (int i=0;i<array.length; i++){
            if (array[i]>maximum){
                maximum=array[i];
            }
        }
        return maximum;
    }
    public static int minimumNr(int[] array){
        int minimum=array[0];
        for (int i=0;i<array.length; i++){
            if (array[i]<minimum){
                minimum=array[i];
            }
        }
        return minimum;
    }
    public static int maximSum(int[] array){
        int sum=0;
        int minimum=minimumNr(array);
        for (int i=0;i<array.length; i++){
            if(array[i]==minimum){
                continue;
            }else {
                sum = sum + array[i];
            }
        }
        return sum;
    }
    public static int minimSum(int[] array){
        int sum=0;
        int maximum=maximumNr(array);
        for (int i=0;i<array.length; i++){
            if(array[i]==maximum){
                continue;
            }else {
                sum = sum + array[i];
            }
        }
        return sum;
    }
}