package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

public class FuncaoAutenticacao { //deve receber o contrato da interface PermitirAcesso e chamar o autenticar()

    private PermitirAcesso permitirAcesso;

    public boolean autenticar () {
        return permitirAcesso.autenticar();
    }

    public FuncaoAutenticacao (PermitirAcesso acesso) {
        this.permitirAcesso = acesso;
    }
}