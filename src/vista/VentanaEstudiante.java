/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import modelo.Estudiante;

public class VentanaEstudiante extends JFrame{


private JLabel lblNombre;
private JLabel lblExamen;
private JLabel lblTaller;
private JLabel lblQuiz;
private JLabel lblFinal;
private JTextField txtNombre;
private JTextField txtExamen;
private JTextField txtTaller;
private JTextField txtQuiz;
private JTextField txtFinal;
private JButton btnCalcular;
private JButton btnLimpiar;
private Container contenedorPpal;

public VentanaEstudiante(){
    iniciarComponentes();   
    setSize(350,200);
    setVisible(true);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Calcular Nota Final");
}

private void iniciarComponentes(){
    lblNombre = new JLabel("Nombre : ");
    lblExamen = new JLabel("Examen : ");
    lblTaller = new JLabel("Taller : ");
    lblQuiz = new JLabel("Quiz : ");
    lblFinal = new JLabel("Nota Final : ");
    
    txtNombre = new JTextField(15);
    txtNombre.setHorizontalAlignment(JTextField.LEFT);
    
    txtExamen  = new JTextField(15);
    txtExamen.setHorizontalAlignment(JTextField.LEFT);
    
    txtTaller  = new JTextField(15);
    txtTaller.setHorizontalAlignment(JTextField.LEFT);
    
    txtQuiz  = new JTextField(15);
    txtQuiz.setHorizontalAlignment(JTextField.LEFT);
    
    txtFinal  = new JTextField(15);
    txtFinal.setEnabled(false);
    txtFinal.setBackground(Color.YELLOW);
    txtFinal.setDisabledTextColor(Color.red);
    txtFinal.setHorizontalAlignment(JTextField.CENTER);
    
    btnCalcular = new JButton("Calcular");
    btnLimpiar = new JButton("Limpiar");
    
    contenedorPpal = getContentPane();
    
    contenedorPpal.setLayout(new GridLayout(6,2));
    
    contenedorPpal.add(lblNombre);
    contenedorPpal.add(txtNombre);
    
    contenedorPpal.add(lblExamen);
    contenedorPpal.add(txtExamen);
    
    contenedorPpal.add(lblTaller);
    contenedorPpal.add(txtTaller);
    
    contenedorPpal.add(lblQuiz);
    contenedorPpal.add(txtQuiz);
    
    contenedorPpal.add(lblFinal);
    contenedorPpal.add(txtFinal);
    
    contenedorPpal.add(btnCalcular);
    contenedorPpal.add(btnLimpiar);
    
    
    btnCalcular.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nombre = txtNombre.getText();
            float examen = Float.parseFloat(txtExamen.getText());
            float taller = Float.parseFloat(txtTaller.getText());
            float quiz = Float.parseFloat(txtQuiz.getText());
            
            Estudiante estudiante = new Estudiante(nombre, examen, taller, quiz);
            estudiante.calcularNotaFinal();
            
            txtFinal.setText(Float.toString(estudiante.getFinalGrade()));
        }
    });
    
    btnLimpiar.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
             txtNombre.setText("");
             txtExamen.setText("");
             txtTaller.setText("");
             txtQuiz.setText("");
             txtFinal.setText("");
        }
    });
           
}
}