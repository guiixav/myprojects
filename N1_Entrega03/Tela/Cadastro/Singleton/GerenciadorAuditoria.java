package Tela.Cadastro.Singleton;
import java.util.LinkedList;

public class GerenciadorAuditoria {
    private static GerenciadorAuditoria instancia;
    ThreadGestaoMsgAuditoria thread;

    LinkedList<String> filaMensagens;
    private GerenciadorAuditoria() {
        filaMensagens = new LinkedList<>();
    }

    public static GerenciadorAuditoria getInstance(){
        if(instancia == null)
            instancia = new GerenciadorAuditoria();
        return instancia;
    }

    public synchronized void adicionaMsgAuditoria(String msgAuditoria){
        filaMensagens.add(msgAuditoria);
    }

    synchronized String retiraMsgAuditoria(){
        String msg = filaMensagens.poll();
        return msg;
    }

    public void ativar(){
        if(thread == null){
            thread = new ThreadGestaoMsgAuditoria();
            thread.start();
        }
    }

    public void desativar() throws InterruptedException {
        if(thread != null){
            thread.setStatus(false);
            thread.join(2000);
            if(thread.isAlive()){
                thread.interrupt();
            }
        }
    }
}
