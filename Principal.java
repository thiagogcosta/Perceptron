/*
Nome: Thiago Aparecido Gonçalves da Costa       R.A:537241
      João Ricardo Ito Messias                  R.A:537241
      Leonardo Ademir Tonezi                    R.A:537241
 */

package perceptron;
import static java.lang.System.exit;
import java.util.Scanner; 

public class Principal {
    
   
    
    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);
        int escolha;
            
        
        
        System.out.print("O que você deseja treinar: 1)AND - 2)OR - 3)Letra A ou T - 0)Sair");
        escolha = scan.nextInt();
        System.out.println(escolha);
        
        switch(escolha){
            
            case(1):
                //*******************AND*******************
                int padroes1 [][]= {
                                {0,0},
                                {0,1},
                                {1,0},
                                {1,1}
                };

                int dj1[] = {
                            0,
                            0,
                            0,
                            1
                            };
                
                //cria um Perceptron com 2 entradas
                Perceptron p1 = new Perceptron(2);
                
                //eta = 0.2
                p1.atualizarY(padroes1);
                p1.treinar(padroes1,dj1,0.2);
                break;
                //*****************************************
            case(2):
               //*******************OR*********************
                int padroes2 [][]= {
                                {0,0},
                                {0,1},
                                {1,0},
                                {1,1}
                };

                int dj2[] = {
                            0,
                            1,
                            1,
                            1
                            };
                
                //cria um Perceptron com 2 entradas
                Perceptron p2 = new Perceptron(2);
                
                //eta = 0.2
                p2.atualizarY(padroes2);
                p2.treinar(padroes2,dj2,0.2);
                break;
                //******************************************
                
            case(3):
                //*******************LETRA A ou T***********
                int padroes3 [][]= {
                                {1,1,1,1,1,
                                 1,0,0,0,1,
                                 1,0,0,0,1,
                                 1,1,1,1,1,
                                 1,0,0,0,1},
                                {1,1,1,1,1,
                                 0,0,1,0,0,
                                 0,0,1,0,0,
                                 0,0,1,0,0,
                                 0,0,1,0,0},


                };

                int dj3[] = {
                            0,
                            1
                            };
                
                //cria um Perceptron com 2 entradas
                Perceptron p3 = new Perceptron(25);
                
                //eta = 0.2
                p3.atualizarY(padroes3);
                p3.treinar(padroes3,dj3,0.2);
                break;
                //******************************************
                case(0):
                    exit(1);
                    break;
                default:
                    System.out.println("Informe uma opção válida!");
                    break;          
        } 
       
    }
}
