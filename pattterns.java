public class pattterns {
    public static void hollowRectangle(int row,int col){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==1||i==row||j==1||j==col){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void inv_rot_halfPyramid(int row,int col){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                   
            }
        }
    }

    public static void main(String[] args) {
        hollowRectangle(4,5);
    }
}
