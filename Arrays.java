public class Arrays{
    public static void main(String []args){
        byte[] bytes = {32, 5 , 2 , 19, 31};
        short[] shorty = {2 , 3 , 4, 122, 19};
        char[] chars = {'A', 'u', 'r','e','o'};
        int[] interger = {2048, 4096, 8192, 16384, 32768};
        float[] floater = {98233.232f, 128000.92f, 90000000f, 1.3414f, 200f};
        long[] longer = {1234567890L, 987654321L, 120000000000L, 321321321L, 800L};
        double[] doubled = {12331d, 999999999999999929d, 421421.23d, 9999123321321312313.32332d, 200000000000000000.0d };
        String[] string = {"Sea", "Dog", "Owl", "ABC-0000", "R$20,00"};
        Object[] obj = {1, 'd', "Bow", 90000000L, 29999343530.2123d};

        byte i = 0;
        //1
        for( i=0 ; i<bytes.length;i++ ){ 
            System.out.print(bytes[i]+", ");
        }
        //2
        jump();
        for( i=0 ; i<shorty.length;i++ ){
            System.out.print(shorty[i]+", ");
        }
        //3
        jump();
        for( i=0 ; i<chars.length;i++ ){
            System.out.print(chars[i]+", ");
        }
        //4
        jump();
        for( i=0 ; i<interger.length;i++ ){
            System.out.print(interger[i]+", ");
        }
        //5
        jump();
        for( i=0 ; i<floater.length;i++ ){
            System.out.print(floater[i]+", ");
        }
        //6
        jump();
        for( i=0 ; i<longer.length;i++ ){
            System.out.print(longer[i]+", ");
        }
        //7
        jump();
        for( i=0 ; i<doubled.length;i++ ){
            System.out.print(doubled[i]+", ");
        }
        //8
        jump();
        for( i=0 ; i<string.length;i++ ){
            System.out.print(string[i]+", ");
        }
        //9
        jump();
        for( i=0 ; i<obj.length;i++ ){
            System.out.print(obj[i]+", ");
        }
        
    }
    static void jump(){
        System.out.println();
    }

}
