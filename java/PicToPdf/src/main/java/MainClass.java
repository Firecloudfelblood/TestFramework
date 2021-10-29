
import com.ErivalAxl.gui.*;
import com.itextpdf.text.DocumentException;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

class MainClass extends JPanel implements ActionListener {
    public JFrame frame = new JFrame("Super Duper conversor jpeg a PDF");
    JTextField tfFoto = new JFormattedTextField();
    JTextField tfPdf = new JFormattedTextField();
    JTextField tfNombre = new JFormattedTextField();
    JButton bSeleccionaArchivo = new JButton("Seleccionar Foto");
    JFileChooser fc = new JFileChooser();

    public void components(){
        Box container = Box.createHorizontalBox();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,300);
        bSeleccionaArchivo.addActionListener(this);
        JButton bCerrar = new JButton("Cerrar");
        container.add(bSeleccionaArchivo);
        container.add(bCerrar);
        container.add(tfFoto);
        container.add(tfPdf);
        container.add(tfNombre);
        frame.getContentPane().add(container);
    }
    public static void main(String[] args) throws DocumentException, IOException {
        MainClass mc = new MainClass();
        mc.components();
        mc.frame.setVisible(true);
        motor(mc.fc.getSelectedFile().toString());
    }

    private static void motor(String files) throws DocumentException, IOException {
        System.out.println(files);
        MainGUI main = new MainGUI();
        main.menu();
        System.out.println("Listo");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == bSeleccionarArchivo){

        }
    }
}
