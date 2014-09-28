package gofsandbox.emissor.decorator;

/**
 *
 * @author hudson.sales
 */
public class EmissorBasico implements Emissor {

    @Override
    public void envia(String mensagem) {
        System.out.println(" Enviando uma mensagem : ");
        System.out.println(mensagem);
    }
}
