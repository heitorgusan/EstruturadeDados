package Pilha;

import java.util.Arrays;

public class PilhaTest {
   public Object[] pilha;
   public int posicaoPilha;

   public PilhaTest(){
       this.posicaoPilha = -1 ;
       //-1 : Indica que a pilha está nula, pois a posição 0 do array já armazena informação.
       this.pilha= new Object[10];
   }

   public boolean isPilhaVazia(){
       if(this.posicaoPilha == -1)return true;
       return false;
   }

   public int tamanhoPilha(){
       if(this.isPilhaVazia())return 0;

       return this.posicaoPilha+1;
   }

   public void empilhar(Object valor){
       if(this.posicaoPilha <= this.pilha.length -1)this.pilha[++posicaoPilha] = valor;
   }

   public Object desempilhar(){
       if(isPilhaVazia())return null;
       System.out.println(this.posicaoPilha);
       return this.pilha[this.posicaoPilha--];
   }

    @Override
    public String toString() {
        return "PilhaTest{" +
                "pilha=" + Arrays.toString(pilha) +
                ", posicaoPilha=" + posicaoPilha +
                '}';
    }

    public static void main(String[] args) {
        PilhaTest p = new PilhaTest();
        p.empilhar("Pizza Portuguesa");//0
        p.empilhar("Pizza Queijo");//1
        p.empilhar("Pizza Carne");//2
        p.empilhar("Pizza Catupiryguesa");//3
        p.empilhar("Pizza Atum");//4
        p.empilhar("Pizza Bacon");//5
        p.empilhar("Pizza Banana com Chocolate");//6
        p.empilhar("Pizza Chocolate Branco");//7
        p.empilhar("Pizza da Casa");//8
        p.empilhar("Pizza 10");//9

        while(p.isPilhaVazia() == false){
            System.out.println("Tirando: "+ p.desempilhar());
        }
    }

}
//-- ou ++ -> A esquerda primeiro Soma ou Subtrai depois aplica o número no array
// -- ou ++ -> A direita primeiro Subtrai ou Soma e depois aplica a posição no array