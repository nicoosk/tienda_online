package controlador;

public interface ControladorPaneles {
    
    public abstract javax.swing.JPanel getPanel();
    
    public void refrescarPanel(javax.swing.JPanel panel, javax.swing.JPanel bg);
}
