package java2;


public class Bhaskara {
        private float a,b,c;

    public Bhaskara() {
    }

        
        
        
    public Bhaskara(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double valordelta(){
       return Math.pow(b, 2)-(4*a*c); 
    }
    
    public double denominador(){
        return 2*a;
    }
    
    public double valorx1(){
        return b+Math.sqrt(valordelta());
    }
    
    public double valorx2(){
        return b-Math.sqrt(valordelta());
    }
    
public double x1(){
    return valorx1()/denominador();
}

public double x2(){
    return valorx2()/denominador();
}

public void print(){
    if(valordelta()==0){
        System.out.println("X1 = X2 ="+x1());
    }else if (valordelta()!=0 && valordelta()>0){
        System.out.println("X1 : "+x1());
        System.out.println("X2 : "+x2());
    }else{
        System.out.println("Raiz nao existe ");
    }
} 

    public void mostra(){

        System.out.println("X1 : "+x1());
        System.out.println("X2 : "+x2());

    }

    public float getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
