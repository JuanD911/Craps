package craps;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Juego extends javax.swing.JFrame {

    private Partida nuevaPartida = null;
    private int posicionUsuario = 0;
    private Login login = null;
    private Dado dado1 = null;
    private Dado dado2 = null;
    private Datos gestorDatos = new Datos();
//----------------------------CONSTRUNTOR----------------------------------
    public Juego(Partida nuevaPartida, int i, Login login, Dado dado1, Dado dado2) {
        this.nuevaPartida = nuevaPartida;
        this.posicionUsuario = i;
        this.login = login;
        this.dado1 = dado1;
        this.dado2 = dado2;
        initComponents();
        CustomInitComponents();
    }

    @SuppressWarnings("unchecked")
//---------------------------------------INTERFAZ----------------------
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Apuesta = new javax.swing.JPanel();
        apostar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        NombreJugador = new javax.swing.JLabel();
        Apuesta = new javax.swing.JLabel();
        zona_Apuesta = new javax.swing.JTextField();
        SaldoJugador = new javax.swing.JLabel();
        EtapaRonda = new javax.swing.JLabel();
        SumaDados = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(null);
        setPreferredSize(null);
        setSize(new java.awt.Dimension(315, 320));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_Apuesta.setPreferredSize(new java.awt.Dimension(300, 290));
        panel_Apuesta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        apostar.setText("Apostar");
        apostar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBetActionPerformed(evt);
            }
        });
        panel_Apuesta.add(apostar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        salir.setText("Salir");
        salir.setToolTipText("");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLogOutActionPerformed(evt);
            }
        });
        panel_Apuesta.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, -1, -1));

        NombreJugador.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        NombreJugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NombreJugador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panel_Apuesta.add(NombreJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 260, 40));

        Apuesta.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        Apuesta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Apuesta.setText("Apuesta:");
        Apuesta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panel_Apuesta.add(Apuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 90, 50));

        zona_Apuesta.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        zona_Apuesta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panel_Apuesta.add(zona_Apuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 160, 50));

        SaldoJugador.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        SaldoJugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SaldoJugador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panel_Apuesta.add(SaldoJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 260, 40));

        EtapaRonda.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        EtapaRonda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtapaRonda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panel_Apuesta.add(EtapaRonda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 260, 40));

        SumaDados.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        SumaDados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SumaDados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panel_Apuesta.add(SumaDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 120, 30));

        getContentPane().add(panel_Apuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CustomInitComponents() {

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

        NombreJugador.setText("Jugador: " + this.nuevaPartida.getLstUsuarios().get(posicionUsuario).getNombre());
        SaldoJugador.setText("Saldo: " + this.nuevaPartida.getLstUsuarios().get(posicionUsuario).getSaldo());
        EtapaRonda.setText("Etapa actual de la ronda: 1");

        this.setTitle("Craps game");

    }
//--------------------------BOTON APOSTAR------------------------------------
    private void botonBetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBetActionPerformed

        try {
            int sumaDados;
            int apuestaHecha = Integer.parseInt(zona_Apuesta.getText());
            zona_Apuesta.setText(null);
            nuevaPartida.VerificarSaldo(apuestaHecha, posicionUsuario);
            sumaDados=nuevaPartida.VerifTiroDadosRonda1(dado1, dado2, posicionUsuario, apuestaHecha);
            SumaDados.setText("Punto: "+sumaDados);//mostramos la suma de los dados 
            SaldoJugador.setText("Saldo: " + String.valueOf(nuevaPartida.getLstUsuarios().get(posicionUsuario).getSaldo()));//mostramos el saldo 
            gestorDatos.actualizarArchivoTxt(nuevaPartida);//actualizamos los datos del archivo 

            if (sumaDados != 2
                    && sumaDados != 3
                    && sumaDados != 12
                    && sumaDados != 7
                    && sumaDados != 11) {

                EtapaRonda.setText("Etapa actual de la ronda: 2");

                boolean verificador = false;//verificamos la ronda 2

                while (verificador == false) {

                    verificador = nuevaPartida.VerifTiroDadosRonda2(dado1, dado2, posicionUsuario, apuestaHecha, sumaDados, verificador); //llamamos el metodo de la clase partida
                    SaldoJugador.setText("Saldo: " + String.valueOf(nuevaPartida.getLstUsuarios().get(posicionUsuario).getSaldo())); //mostramos el saldo del jugador 
                    gestorDatos.actualizarArchivoTxt(nuevaPartida);//actualizamos el arhivo 

                }

                EtapaRonda.setText("Etapa actual de la ronda: 1");
                SumaDados.setText(null);

            } else {

                SumaDados.setText(null);

            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Solo numeros", "Estado apuesta", JOptionPane.WARNING_MESSAGE);//mensaje de error
            zona_Apuesta.setText(null);

        } catch (SaldoCero ex) {

            JOptionPane.showMessageDialog(null, "Saldo nulo -> NO JUEGA", "Estado apuesta", JOptionPane.WARNING_MESSAGE);//mensaje de error
            this.nuevaPartida = null;
            this.setVisible(false);
            login.setVisible(true);
            login.getPanel_ElegirLoginSignup().setVisible(true);

        } catch (SaldoInsuficiente ex) {

            JOptionPane.showMessageDialog(null, "Saldo insuficiente", "Estado apuesta", JOptionPane.WARNING_MESSAGE);//mensaje de error
            
        }

    }//GEN-LAST:event_botonBetActionPerformed
//-----------------------------BOTON SALIR-------------------------
    private void botonLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLogOutActionPerformed // metodo para volver al login 

        this.nuevaPartida = null;  
        this.setVisible(false);
        login.setVisible(true);
        login.getPanel_ElegirLoginSignup().setVisible(true);

    }//GEN-LAST:event_botonLogOutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apostar;
    private javax.swing.JButton salir;
    private javax.swing.JLabel Apuesta;
    private javax.swing.JLabel EtapaRonda;
    private javax.swing.JLabel NombreJugador;
    private javax.swing.JLabel SaldoJugador;
    private javax.swing.JLabel SumaDados;
    private javax.swing.JPanel panel_Apuesta;
    private javax.swing.JTextField zona_Apuesta;
    // End of variables declaration//GEN-END:variables
}
