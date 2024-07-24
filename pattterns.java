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
    public static void star_pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void inv_rotHalf_Pyramid(int n){
        for(int i=1;i<=n;i++){
          for(int j=1;j<=n-i;j++){
            System.out.print("  ");
          }
          for(int j=1;j<=i;j++){
            System.out.print("* ");
          }
          System.out.println();
        }
      }
      public static void invHalfPyramidOfNum(int n) {
       
        for(int i=1;i<=n;i++){
            int counter=1;
          for(int j=1;j<=(n-i)+1;j++){
          System.out.print(counter+" ");
          counter++;
        }
        System.out.println();
      }
    }
     public static void floydTriangle(int n){
            int counter=1;
        for(int i=1;i<=n;i++){
          for(int j=1;j<=i;j++){
          System.out.print(counter+" ");
          counter++;    
       } 
        System.out.println();
      }
    } 
    public static void triangle01Pattern(int n){
        for(int i=1;i<=n;i++){
          for(int j=1;j<=i;j++){
            if((i+j)%2==0){
          System.out.print(1+" ");
            }
            else{
              System.out.print(0+" ");
            }    
       } 
        System.out.println();
      }
    }
      public static void butterfly(int n){
        //1st half
        for(int i=1;i<=n;i++){
          //star
          for(int j=1;j<=i;j++){
            System.out.print("* ");
          }
          //spaces
          for(int j=1;j<=(n-i)*2;j++){
            System.out.print("  ");
          }
           //star
          for(int j=1;j<=i;j++){
            System.out.print("* ");
          }
          System.out.println();
        }
        //2nd half
        for(int i=n;i>=1;i--){
          //star
          for(int j=i;j>=1;j--){
            System.out.print("* ");
          }
          //spaces
          for(int j=(n-i)*2;j>=1;j--){
            System.out.print("  ");
          }
           //star
          for(int j=i;j>=1;j--){
            System.out.print("* ");
          }
          System.out.println();
        }
      }
      public static void solidRhombus(int n){
        for(int i=1;i<=n;i++){
          //spaces
          for(int j=1;j<=n-i;j++){
            System.out.print("  ");
          }
          //stars
          for(int j=1;j<=n;j++){
            System.out.print("* ");
          }
          System.out.println();
        }
      }
      public static void hollowRhombus(int n){
        for(int i=1;i<=n;i++){
          //spaces
          for(int j=1;j<=n-i;j++){
            System.out.print("  ");
          }
          //stars
          for(int j=1; j<=n ; j++){
                if(i==1 ||i==n||j==1||j==n){
                  System.out.print("* ");
                }
                else{
                  System.out.print("  ");
                }
        }
        System.out.println();
      }
    }
      public static void diamond(int n){
        //1st half
        for(int i=1;i<=n;i++){
          //spaces
          for(int j=1;j<=n-i;j++){
            System.out.print("  ");
          }
          //stars
          for(int j=1;j<=(2*i)-1;j++){
             System.out.print("* ");
          }
          System.out.println();
        }
        //2nd half
        for(int i=n;i>=1;i--){
          //spaces
          for(int j=n-i;j>=1;j--){
            System.out.print("  ");
          }
          //stars
          for(int j=(2*i)-1;j>=1;j--){
             System.out.print("* ");
          }
          System.out.println();
        }
      }
      public static void numberPyramid(int n){
         for(int i=1;i<=n;i++){
          //spaces
          for(int j=1;j<=n-i;j++){
            System.out.print(" ");
          }
          //numbers
          for(int j=1;j<=i;j++){
             System.out.print(i+" ");
          }
          System.out.println();
        }
      }
      public static void palindromicWithNumbers(int n){
        for(int i=1;i<=n;i++){
          //spaces
          for(int j=1;j<=n-i;j++){
            System.out.print("  ");
          }
          //beforeone
          for(int j=i;j>=2;j--){
            System.out.print(j+" ");
          }
         /* another way for before one 
         for(int j=1;j<=i-1;j++){
              System.out.print(i-j+1 +" ");          
          }*/
      
          //from one
          for(int j=1;j<=i;j++){
            System.out.print(j+" ");
          }
          System.out.println();
        }
      }
    public static void main(String[] args) {
      butterfly(5);
       
    }
}
