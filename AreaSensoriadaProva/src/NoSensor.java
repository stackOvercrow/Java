
public class NoSensor {
	protected double valor;
    
    public NoSensor(String id){
        super();
        this.setValor();
    }    
    
    public void setValor(double valor){
        this.valor = valor;
    };
    
    public void setValor(){
        this.setValor(Math.random() * 10);
    };
    
    public  Mensagem processar(Mensagem minha, Mensagem filha){
        minha.adicionar(filha.getValores());
        return minha;
    }    
    
}
