import java.util.Date;

public class MensagemDoDia {

    public void mandarMensagem (int hora) {
        if (hora > 7 && hora < 12) {
            System.out.println("Bom dia");
        } else if (hora > 12 && hora < 18) {
            System.out.println("Boa tarde");
        } else {
            System.out.println("Boa noite");
        }
    }
}
