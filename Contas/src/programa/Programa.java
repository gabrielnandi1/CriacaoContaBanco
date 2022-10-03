package programa;

import contas.ContaBanco;

public class Programa {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        
        p1.setNumConta(1);
        p1.setDono("Gabriel");
        p1.setTipo("CC");
        p1.abrirConta();
        p1.depositar(50);
        p1.estadoAtual();

        ContaBanco p2 = new ContaBanco();

        p2.setNumConta(2);
        p2.setDono("Jubileu");
        p2.setTipo("CP");
        p2.abrirConta();
        p2.depositar(120);
        p2.estadoAtual();
    }

   
    
}
