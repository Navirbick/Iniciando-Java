public class ArrayDentroDeArray {
    public static void main(String []args){
        byte[] bytes = {32, 5 , 2 , 19, 12};
        short[] shorty = {2 , 3 , 4, 122, 19};
        char[] chars = {'A','u','r','e','o'};
        String[] string = {"Aureo","Bruna","Carlos","Danny","Ezzy"};
        Object[][] arrei = new Object[4][5];
        int i;
        for( i = 0 ; i < arrei.length ; i++ ){
            for( int j = 0; j < arrei[i].length ; j++){
                    if( i == 0 ){
                    arrei[i][j] = bytes[j];                        
                    }
                    if( i == 1 ){    
                    arrei[i][j] =  shorty[j];
                    }         
                    if( i == 2 ){
                    arrei[i][j] =  chars[j];
                    }     
                    if( i == 3){
                    arrei[i][j] = string[j];
                    }  
            }
        }
        for( int b = 0 ; b<arrei.length;b++ ){
            for( int c = 0; c < arrei[b].length ; c++){
            if( c >= 0 & c <= 4 ){
            System.out.print(arrei[b][c]+" ");
                }if( c == 4){System.out.println();}
            }
        }
    }
}
