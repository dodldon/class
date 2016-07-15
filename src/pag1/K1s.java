
package pag1;


public class K1s {
    public static void main(String args[]){
        K1 superA=new K1();
        K1_1 subB=new   K1_1();   
        K1_2 subC=new   K1_2();
        //superOB=subOB;//присвоить сылку подкласса суперклассу
        
        superA.showA();//метод супер класса
        subB.showB();  //метод под.класса B
        subC.showC();  //метод под.класса C
    }
    
}
