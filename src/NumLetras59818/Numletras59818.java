/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numLetras59818;

import java.util.Scanner;

/**
 *
 * @author caroc
 */
public class Numletras59818 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Pedir un número de 0 a 99 y mostrarlo en letras. 
        Scanner entrada = new Scanner (System.in) ;
        int numero = 0 ;
        
         System.out.print("Ingresa un numero del 0 al 99: ");
            numero = entrada.nextInt();
    
        int decena = (numero / 10)% 10;
        int unidad = (numero % 10) ;
    
        String uni = "";  
        String dec = "";
  
    
        
        if (numero < 10 && numero >=0){  
        switch (numero) {
            case 0: 
                uni = "cero" ; 
                break;  
            case 1:
                uni = "uno";
                break;
            case 2:
                uni = "dos";
                break;
            case 3:
                uni = "tres";
                break;
            case 4:
                uni = "cuatro";
                break;
            case 5:
                uni = "cinco";
                break;
            case 6:
                uni = "seis";
                break;
            case 7:
                uni = "siete";
                break;
            case 8:
                uni = "ocho";
                break;
            case 9:
                uni = "nueve";
                break;
            default:
               throw new AssertionError (); 
        }
      } 
        else {
         switch (unidad) {
            case 0: 
                uni = "cero" ; 
                break;  
            case 1:
                uni = "uno";
                break;
            case 2:
                uni = "dos";
                break;
            case 3:
                uni = "tres";
                break;
            case 4:
                uni = "cuatro";
                break;
            case 5:
                uni = "cinco";
                break;
            case 6:
                uni = "seis";
                break;
            case 7:
                uni = "siete";
                break;
            case 8:
                uni = "ocho";
                break;
            case 9:
                uni = "nueve";
                break;
            default:
               throw new AssertionError ();   
         }
            switch (decena) {
                case 1:
                    dec = "diez";
                    switch (unidad) {
                        case 0:
                            dec = "diez" ;                            
                            uni = "";
                         break;
                    case 1:
                            dec = "once" ;                            
                            uni = "";
                         break;
                    case 2:
                            dec = "doce" ;                            
                            uni = "";
                         break;    
                    case 3:
                            dec = "trece" ;                            
                            uni = "";
                         break;   
                    case 4:
                            dec = "catorce" ;                            
                            uni = "";
                         break;   
                    case 5:
                            dec = "quince" ;                            
                            uni = "";
                         break;   
                        default: 
                          dec = "dieci" ; 
                    }       
                  break; 
                case 2: 
                    dec = "veinte" ; 
                    switch (unidad) {
                        case 0:
                            dec = "veinte" ;                            
                            uni = "";
                            break;
                        default:
                            dec = "veinti " ; 
                    }       
                     break; 
                case 3: 
                    dec = "treinta" ; 
                    switch (unidad) {
                        case 0:
                            dec = "treinta" ;                            
                            uni = "";
                            break;
                        default:
                            dec = "treinta y "; 
                      }           
                         break; 
                case 4 : 
                    dec = "cuarenta" ;
                        switch (unidad) {
                        case 0:
                            dec = "cuarenta" ;                            
                            uni = "";
                            break;
                        default:
                            dec = "cuarenta y" ;   
                   }
                    break; 
                      case 5 : 
                    dec = "cincuenta" ;
                        switch (unidad) {
                        case 0:
                            dec = "cincuenta" ;                            
                            uni = "";
                            break;
                        default:
                            dec = "cincuenta y" ;
                   }
                     break; 
                      case 6 : 
                    dec = "sesenta" ;
                        switch (unidad) {
                        case 0:
                            dec = "sesenta" ;                            
                            uni = "";
                            break;
                        default:
                            dec = "sesenta y" ;
                    }
                     break; 
                      case 7 : 
                    dec = "setenta" ;
                        switch (unidad) {
                        case 0:
                            dec = "setenta" ;                            
                            uni = "";
                            break;
                        default:
                            dec = "setenta y" ;  
                    }
                     break; 
                      case 8 : 
                    dec = "ochenta" ;
                        switch (unidad) {
                        case 0:
                            dec = "ochenta" ;                            
                            uni = "";
                            break;
                        default:
                            dec = "ochenta y" ;        
                    }
                     break; 
                      case 9 : 
                    dec = "noventa" ;
                        switch (unidad) {
                        case 0:
                            dec = "noventa" ;                            
                            uni = "";
                            break;
                        default:
                            dec = "noventa y " ;     
                    }
                        break;
                      default: 
                          throw new AssertionError ();
            }
        }
              System.out.println(dec + "" + uni );
        }
    
     }
                          
                       
                            
            
            
            
            
            
            
            
            
            
            
            
            
            
  