package Tela.Cadastro.Singleton;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class ThreadGestaoMsgAuditoria extends Thread {
    private boolean status;

    @Override
    public void run(){
        setStatus(true);
        while (status){
            String msg = GerenciadorAuditoria.getInstance().retiraMsgAuditoria();

            if(msg != null){
                try {
                    enviaMsgParaSistemaAuditoria(msg);
                } catch (InterruptedException | IOException e) {
                    e.printStackTrace();
                }
            }

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void enviaMsgParaSistemaAuditoria(String msg) throws IOException, InterruptedException {
        PrintWriter writer = new PrintWriter(new FileOutputStream(new File("Arquivos/Log.txt"),true));
        writer.printf(msg);
        writer.close();
        Thread.sleep(1000);
    }

    public void setStatus(boolean _status) {
        status = _status;
    }
}
