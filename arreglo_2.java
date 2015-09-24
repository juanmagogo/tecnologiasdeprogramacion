package Ejercicios;

/**
 * Intergrantes: Alexis Maturano Melgosa G1546004
 *               Jorge Meza Leal G1546008
 *               Juan Manuel fernandez Alvarez G1546001 
 *  Fecha: 24 sept
 */
public class arreglo_2 {
    //Constructor vacío
    public arreglo_2 (){;}
    
// Metodo suma
    private int [][] sumMat(int [][] a, int[][] b){
        int[][] r;
        int x = a.length;
        r=new int [x][x];
        for (int i=0;i<x;i++)
            for(int j=0;j<x;j++)
                r[i][j]=a[i][j]+b[i][j];        
        return r;
    }
    //Método resta
    private int [][] resMat(int [][] a, int[][] b){
        int[][] r;
        int x= a.length;
        r=new int [x][x];
        for (int i=0;i<x;i++)
            for(int j=0;j<x;j++)
                r[i][j]=a[i][j]-b[i][j];    
        return r;
    }
    
    private int [][] mulMat(int [][] a, int[][] b){
        int[][] r;
        int x = a.length;
        r=new int [x][x];
        for(int i=0;i<x;i++)
        for (int j=0;j<x;j++)
            for(int k=0;k<x;k++)
                r[i][j]+=a[i][k]*b[k][j];    
        return r;
    }
    //Método imprima diagonal principal e inversa
    private void printDiagonal(int [][] a){
        System.out.println("DIAGONAL PRINCIPAL:");
        for (int i=0;i<100;i++)
            for(int j=0;j<100;j++)
                if(i==j)
                    System.out.println("Elemento ["+ i + ","+ j + "]: "+ a[i][j]);
        
        System.out.println("DIAGONAL INVERTIDA:");
        for (int i=99;i>=0;i--)
            for(int j=0;j<100;j++)
                if(99-i == j)
                    System.out.println("Elemento ["+ i + ","+ j + "]: "+ a[i][j]);
                
    }
    
    //Método que imprima el mayor y el menor elemento
    private void pMayMin(int [][] a){
        int may=a[0][0],men=a[0][0];
        for (int i=0;i<100;i++)
            for(int j=1;j<100;j++)
                if(a[i][j]>may)
                    may=a[i][j];
                else if(a[i][j]<men)
                    men=a[i][j];
        System.out.println("El mayor es: "+ may + "\nEl menor es: " + men);
        
    }
    
    //Método para llenar arreglo
    private int[][] fillArray(int[][] a){
       for (int i=0;i<a.length;i++)
           for(int j=0;j<a.length;j++)
                a[i][j]=(int)(Math.random()*100);
       return a;
    }
    //Método que imprime
    private void printArray(int [][] a){
        for (int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.println("Elemento ["+ i + ","+ j + "]: "+ a[i][j]);
            }
        }
    }
    
    //Método que imprime matrices acomodadas
    private void printA(int [][] a){
        for (int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(" "+ a[i][j] +" ");
            }
            System.out.print("\n");
        }
    }
    //main
    public static void main(String[] args) {
        int[][] vec,vec2,vr;
        int x=10;
        vec=new int [x][x];
        vec2=new int [x][x];
        vr= new int [x][x];
        //Declarar un objeto de la clase
        arreglo_2 ar = new arreglo_2();
        
        
        
        System.out.println("MATRIZ A:");
        ar.fillArray(vec);
        ar.printArray(vec);
        ar.printA(vec);
                
        System.out.println("MATRIZ B:");
        ar.fillArray(vec2);
        ar.printA(vec2);
        System.out.println("SUMA DE LAS MATRICES:");
        ar.sumMat(vec, vec2);
        ar.printA(vr);
        
        System.out.println("RESTA DE LAS MATRICES:");
        ar.resMat(vec, vec2);
        ar.printA(vr);
        
        System.out.println("MULTIPLICACION DE LAS MATRICES:");
        ar.mulMat(vec,vec2);
        ar.printA(vr);
        
        System.out.println("VALORES MAYOR Y MENOR:");
        ar.pMayMin(vec);
        ar.printDiagonal(vec);
               
    }
    
}

