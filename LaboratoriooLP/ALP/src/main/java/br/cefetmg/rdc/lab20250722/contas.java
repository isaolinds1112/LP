
package br.cefetmg.rdc.lab20250722;


public class contas {
    public static double inss(double salario ){
        if(salario <= 1212.00) return salario * 0.075;
        if(salario <= 2427.35) return salario * 0.09;
        if(salario <= 3641.03) return salario * 0.12;
        if(salario <= 7087.22) return salario * 0.14;
        return salario * 0.14;    
    }
    
    public static double inssAliq(double salario){
        if(salario <= 1212.00) return 7.5;
        if(salario <= 2427.35) return 9;
        if(salario <= 3641.03) return 12;
        
            
        return 14;
    }
    
    public static double[] irpf(double base){
        double a = 0, d = 0;
        if (base <= 1903.98){
            a = 0; d = 0;
        }
        else if (base <= 2826.65){
            a = 7.5; d = 142.80;
        }
        else if ( base <= 3751.05){
            a = 15; d = 354.80;
        }
        else if ( base <= 4664.68){
            a = 27.5; d = 636.13;
        }
        else{ 
            a = 27.5; d = 869.36;
        }
        
        double val = base * (a/100) - d;
        if (val < 0) val = 0 ; 
        return new double[] {
            a, val};
       
}
