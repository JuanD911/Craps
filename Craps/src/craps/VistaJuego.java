package craps;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VistaJuego extends javax.swing.JFrame {

    private Partida nuevaPartida = null;
    private int posicionUsuario = 0;
    private VistaRegistro vistaRegistro = null;
    private Dado dado1 = null;
    private Dado dado2 = null;
    private Datos gestorDatos = new Datos();
//----------------------------CONSTRUNTOR----------------------------------
    public VistaJuego(Partida nuevaPartida, int i, VistaRegistro vistaRegistro, Dado dado1, Dado dado2) {
        this.nuevaPartida = nuevaPartida;
        this.posicionUsuario = i;
        this.vistaRegistro = vistaRegistro;
        this.dado1 = dado1;
        this.dado2 = dado2;
        initComponents();
        CustomInitComponents();
    }

    @SuppressWarnings("unchecked")
//---------------------------------------INTERFAZ----------------------
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelApuesta = new javax.swing.JPanel();
        botonBet = new javax.swing.JButton();
        botonLogOut = new javax.swing.JButton();
        labelNombreJugador = new javax.swing.JLabel();
        labelApuesta = new javax.swing.JLabel();
        textFieldApuesta = new javax.swing.JTextField();
        labelSaldoJugador = new javax.swing.JLabel();
        labelEtapaRonda = new javax.swing.JLabel();
        labelSumaDados = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(null);
        setPreferredSize(null);
        setSize(new java.awt.Dimension(315, 320));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelApuesta.setPreferredSize(new java.awt.Dimension(300, 290));
        panelApuesta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonBet.setText("Apostar");
        botonBet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBetActionPerformed(evt);
            }
        });
        panelApuesta.add(botonBet, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        botonLogOut.setText("Salir");
        botonLogOut.setToolTipText("");
        botonLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLogOutActionPerformed(evt);
            }
        });
        panelApuesta.add(botonLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, -1, -1));

        labelNombreJugador.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        labelNombreJugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNombreJugador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelApuesta.add(labelNombreJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 260, 40));

        labelApuesta.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        labelApuesta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelApuesta.setText("Apuesta:");
        labelApuesta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelApuesta.add(labelApuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 90, 50));

        textFieldApuesta.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        textFieldApuesta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelApuesta.add(textFieldApuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 160, 50));

        labelSaldoJugador.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        labelSaldoJugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSaldoJugador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelApuesta.add(labelSaldoJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 260, 40));

        labelEtapaRonda.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        labelEtapaRonda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEtapaRonda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelApuesta.add(labelEtapaRonda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 260, 40));

        labelSumaDados.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        labelSumaDados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelSumaDados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelApuesta.add(labelSumaDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 120, 30));

        getContentPane().add(panelApuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CustomInitComponents() {

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

        labelNombreJugador.setText("Jugador: " + this.nuevaPartida.getLstUsuarios().get(posicionUsuario).getNombre());
        labelSaldoJugador.setText("Saldo: " + this.nuevaPartida.getLstUsuarios().get(posicionUsuario).getSaldo());
        labelEtapaRonda.setText("Etapa actual de la ronda: 1");

        this.setTitle("Craps game");

    }
//--------------------------BOTON APOSTAR------------------------------------
    private void botonBetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBetActionPerformed

        try {
            int sumaDados;
            int apuestaHecha = Integer.parseInt(textFieldApuesta.getText());
            textFieldApuesta.setText(null);
            nuevaPartida.VerificarSaldo(apuestaHecha, posicionUsuario);
            sumaDados=nuevaPartida.VerifTiroDadosRonda1(dado1, dado2, posicionUsuario, apuestaHecha);
            labelSumaDados.setText("Punto: "+sumaDados);//mostramos la suma de los dados 
            labelSaldoJugador.setText("Saldo: " + String.valueOf(nuevaPartida.getLstUsuarios().get(posicionUsuario).getSaldo()));//mostramos el saldo 
            gestorDatos.actualizarArchivoTxt(nuevaPartida);//actualizamos los datos del archivo 

            if (sumaDados != 2
                    && sumaDados != 3
                    && sumaDados != 12
                    && sumaDados != 7
                    && sumaDados != 11) {

                labelEtapaRonda.setText("Etapa actual de la ronda: 2");

                boolean verificador = false;//verificamos la ronda 2

                while (verificador == false) {

                    verificador = nuevaPartida.VerifTiroDadosRonda2(dado1, dado2, posicionUsuario, apuestaHecha, sumaDados, verificador); //llamamos el metodo de la clase partida
                    labelSaldoJugador.setText("Saldo: " + String.valueOf(nuevaPartida.getLstUsuarios().get(posicionUsuario).getSaldo())); //mostramos el saldo del jugador 
                    gestorDatos.actualizarArchivoTxt(nuevaPartida);//actualizamos el arhivo 

                }

                labelEtapaRonda.setText("Etapa actual de la ronda: 1");
                labelSumaDados.setText(null);

            } else {

                labelSumaDados.setText(null);

            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Solo numeros", "Estado apuesta", JOptionPane.WARNING_MESSAGE);//mensaje de error
            textFieldApuesta.setText(null);

        } catch (SaldoCero ex) {

            JOptionPane.showMessageDialog(null, "Saldo nulo -> NO JUEGA", "Estado apuesta", JOptionPane.WARNING_MESSAGE);//mensaje de error
            this.nuevaPartida = null;
            this.setVisible(false);
            vistaRegistro.setVisible(true);
            vistaRegistro.getPanel_ElegirLoginSignup().setVisible(true);

        } catch (SaldoInsuficiente ex) {

            JOptionPane.showMessageDialog(null, "Saldo insuficiente", "Estado apuesta", JOptionPane.WARNING_MESSAGE);//mensaje de error
            
        }

    }//GEN-LAST:event_botonBetActionPerformed
//-----------------------------BOTON SALIR-------------------------
    private void botonLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLogOutActionPerformed // metodo para volver al login 

        this.nuevaPartida = null;  
        this.setVisible(false);
        vistaRegistro.setVisible(true);
        vistaRegistro.getPanel_ElegirLoginSignup().setVisible(true);

    }//GEN-LAST:event_botonLogOutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBet;
    private javax.swing.JButton botonLogOut;
    private javax.swing.JLabel labelApuesta;
    private javax.swing.JLabel labelEtapaRonda;
    private javax.swing.JLabel labelNombreJugador;
    private javax.swing.JLabel labelSaldoJugador;
    private javax.swing.JLabel labelSumaDados;
    private javax.swing.JPanel panelApuesta;
    private javax.swing.JTextField textFieldApuesta;
    // End of variables declaration//GEN-END:variables
}
