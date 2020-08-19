package craps;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class VistaRegistro extends javax.swing.JFrame {

    private Partida nuevaPartida = null;
    private Datos gestorDatos = null;
    private final File archivoTexto = new File("archivoTexto.txt");
    private Dado dado1 = null;
    private Dado dado2 = null;
//---------COSTRUCTOR---------------------
    public VistaRegistro(Partida nuevaPartida, Datos datos, Dado dado1, Dado dado2) {
        this.nuevaPartida = nuevaPartida;
        this.gestorDatos = datos;
        this.dado1 = dado1;
        this.dado2 = dado2;
        initComponents();
        CustomInitComponents();
        this.setVisible(true);
        gestorDatos.verificarInicioDatosLista(nuevaPartida);
    }
//---------------------INTERFAZ--------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_ElegirLoginSignup = new javax.swing.JPanel();
        labelTitulo_ElegirLS = new javax.swing.JLabel();
        labelImagen_ElegirLS = new javax.swing.JLabel();
        botonSignup_ElegirLS = new javax.swing.JButton();
        botonLogin_ElegirLS = new javax.swing.JButton();
        botonClear_ElegirLS = new javax.swing.JButton();
        panel_LoginUsuarios = new javax.swing.JPanel();
        textFieldNombreJugador_Login = new javax.swing.JTextField();
        botonLogin_Login = new javax.swing.JButton();
        botonSignup_Login = new javax.swing.JButton();
        botonGoBack_Login = new javax.swing.JButton();
        textFieldContrase�aJugador_Login = new javax.swing.JPasswordField();
        panel_RegistroUsuarios = new javax.swing.JPanel();
        textFieldNombreJugador_Signup = new javax.swing.JTextField();
        botonSignup_Signup = new javax.swing.JButton();
        botonLogin_Signup = new javax.swing.JButton();
        botonGoBack_Signup = new javax.swing.JButton();
        textFieldContrase�aJugador_Signup = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Craps");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(750,400);
        setMaximumSize(null);
        setName("Contenedor"); // NOI18N
        setSize(new java.awt.Dimension(220, 270));

        panel_ElegirLoginSignup.setMaximumSize(new java.awt.Dimension(220, 270));
        panel_ElegirLoginSignup.setMinimumSize(new java.awt.Dimension(220, 270));
        panel_ElegirLoginSignup.setPreferredSize(new java.awt.Dimension(220, 270));
        panel_ElegirLoginSignup.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitulo_ElegirLS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo_ElegirLS.setText("CRAPS");
        labelTitulo_ElegirLS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panel_ElegirLoginSignup.add(labelTitulo_ElegirLS, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 80, 20));

        labelImagen_ElegirLS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImagen_ElegirLS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panel_ElegirLoginSignup.add(labelImagen_ElegirLS, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 180, 100));

        botonSignup_ElegirLS.setText("Registrar");
        botonSignup_ElegirLS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSignup_ElegirLSActionPerformed(evt);
            }
        });
        panel_ElegirLoginSignup.add(botonSignup_ElegirLS, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 80, -1));

        botonLogin_ElegirLS.setText("Ingresar");
        botonLogin_ElegirLS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLogin_ElegirLSActionPerformed(evt);
            }
        });
        panel_ElegirLoginSignup.add(botonLogin_ElegirLS, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 80, -1));

        botonClear_ElegirLS.setText("X");
        botonClear_ElegirLS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonClear_ElegirLSActionPerformed(evt);
            }
        });
        panel_ElegirLoginSignup.add(botonClear_ElegirLS, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 50, -1));

        panel_LoginUsuarios.setMaximumSize(new java.awt.Dimension(220, 270));
        panel_LoginUsuarios.setMinimumSize(new java.awt.Dimension(220, 270));
        panel_LoginUsuarios.setPreferredSize(new java.awt.Dimension(220, 270));
        panel_LoginUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textFieldNombreJugador_Login.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        textFieldNombreJugador_Login.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldNombreJugador_Login.setText("Nombre");
        textFieldNombreJugador_Login.setToolTipText("Maximo 10 caracteres");
        textFieldNombreJugador_Login.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldNombreJugador_LoginFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldNombreJugador_LoginFocusLost(evt);
            }
        });
        textFieldNombreJugador_Login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldNombreJugador_LoginKeyTyped(evt);
            }
        });
        panel_LoginUsuarios.add(textFieldNombreJugador_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 180, 50));

        botonLogin_Login.setText("Ingresar");
        botonLogin_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLogin_LoginActionPerformed(evt);
            }
        });
        panel_LoginUsuarios.add(botonLogin_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 80, -1));

        botonSignup_Login.setText("Registrar");
        botonSignup_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSignup_LoginActionPerformed(evt);
            }
        });
        panel_LoginUsuarios.add(botonSignup_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 80, -1));

        botonGoBack_Login.setText("Regresar");
        botonGoBack_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGoBack_LoginActionPerformed(evt);
            }
        });
        panel_LoginUsuarios.add(botonGoBack_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 220, -1, -1));

        textFieldContrase�aJugador_Login.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        textFieldContrase�aJugador_Login.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldContrase�aJugador_Login.setText("Contrase�a");
        textFieldContrase�aJugador_Login.setToolTipText("Maximo 10 caracteres");
        textFieldContrase�aJugador_Login.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldContrase�aJugador_LoginFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldContrase�aJugador_LoginFocusLost(evt);
            }
        });
        textFieldContrase�aJugador_Login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldContrase�aJugador_LoginKeyTyped(evt);
            }
        });
        panel_LoginUsuarios.add(textFieldContrase�aJugador_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 180, 50));

        panel_RegistroUsuarios.setMaximumSize(new java.awt.Dimension(220, 270));
        panel_RegistroUsuarios.setMinimumSize(new java.awt.Dimension(220, 270));
        panel_RegistroUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textFieldNombreJugador_Signup.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        textFieldNombreJugador_Signup.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldNombreJugador_Signup.setText("Nombre");
        textFieldNombreJugador_Signup.setToolTipText("Maximo 10 caracteres");
        textFieldNombreJugador_Signup.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldNombreJugador_SignupFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldNombreJugador_SignupFocusLost(evt);
            }
        });
        textFieldNombreJugador_Signup.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldNombreJugador_SignupKeyTyped(evt);
            }
        });
        panel_RegistroUsuarios.add(textFieldNombreJugador_Signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 180, 50));

        botonSignup_Signup.setText("Registar");
        botonSignup_Signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSignup_SignupActionPerformed(evt);
            }
        });
        panel_RegistroUsuarios.add(botonSignup_Signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 80, -1));

        botonLogin_Signup.setText("Ingresar");
        botonLogin_Signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLogin_SignupActionPerformed(evt);
            }
        });
        panel_RegistroUsuarios.add(botonLogin_Signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 80, -1));

        botonGoBack_Signup.setText("Regresar");
        botonGoBack_Signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGoBack_SignupActionPerformed(evt);
            }
        });
        panel_RegistroUsuarios.add(botonGoBack_Signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 220, -1, -1));

        textFieldContrase�aJugador_Signup.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        textFieldContrase�aJugador_Signup.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldContrase�aJugador_Signup.setText("Contrase�a");
        textFieldContrase�aJugador_Signup.setToolTipText("Maximo 10 caracteres");
        textFieldContrase�aJugador_Signup.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldContrase�aJugador_SignupFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldContrase�aJugador_SignupFocusLost(evt);
            }
        });
        textFieldContrase�aJugador_Signup.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldContrase�aJugador_SignupKeyTyped(evt);
            }
        });
        panel_RegistroUsuarios.add(textFieldContrase�aJugador_Signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 180, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_ElegirLoginSignup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panel_LoginUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panel_RegistroUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_ElegirLoginSignup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panel_LoginUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panel_RegistroUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CustomInitComponents() {

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

        ImageIcon imagenExterna = new ImageIcon(getClass().getResource("Dados.jpg"));
        Image Img = imagenExterna.getImage();
        Image nuevaimagen = Img.getScaledInstance(labelImagen_ElegirLS.getWidth(), labelImagen_ElegirLS.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(nuevaimagen);
        labelImagen_ElegirLS.setIcon(image);

        panel_ElegirLoginSignup.setVisible(true);
        panel_LoginUsuarios.setVisible(false);
        panel_RegistroUsuarios.setVisible(false);

        this.setTitle("Inicio/Registro: Craps");

    }

    public JPanel getPanel_ElegirLoginSignup() {
        return panel_ElegirLoginSignup;
    }
//------------------------------BOTON INGRESAR----------------
    private void botonLogin_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLogin_LoginActionPerformed

        try {
            char[] contrase�aIngresada = textFieldContrase�aJugador_Login.getPassword();//guardamos la contrase�a en el arreglo 

            boolean verif;//creamos un boolean

            String contrase�aString = "";

            for (int i = 0; i < contrase�aIngresada.length; i++) {//ciclo para guardar  la contrase�a ingresada en otra variable
                contrase�aString += contrase�aIngresada[i];
            }

            verif = gestorDatos.Leer(textFieldNombreJugador_Login.getText(), contrase�aString);//llamamos el metodo de  la lase datos

            if (verif) {
            	//abrimos la clase vista juego 
                this.nuevaPartida.VerificarSaldo(gestorDatos.posicionUsuarioRegistrado(textFieldNombreJugador_Login.getText(), contrase�aString));
                JOptionPane.showMessageDialog(null, "Bienvenido", "Login", JOptionPane.INFORMATION_MESSAGE);
                VistaJuego nuevaVistaJuego = new VistaJuego(nuevaPartida, gestorDatos.posicionUsuarioRegistrado(textFieldNombreJugador_Login.getText(), contrase�aString), this, dado1, dado2);
                textFieldNombreJugador_Login.setText("Nombre");
                textFieldContrase�aJugador_Login.setText("Contrase�a");
                panel_RegistroUsuarios.setVisible(false);
                panel_LoginUsuarios.setVisible(false);
                panel_ElegirLoginSignup.setVisible(false);
                this.setVisible(false);

                nuevaVistaJuego.setVisible(true);

            } else {

                JOptionPane.showMessageDialog(null, "Usuaro o contrase�a incorrecta", "Login", JOptionPane.ERROR_MESSAGE);
                textFieldNombreJugador_Login.setText("Nombre");
                textFieldContrase�aJugador_Login.setText("Contraseña");

            }

        } catch (SaldoCero e) {

            JOptionPane.showMessageDialog(null, "SALDO CERO", "Login", JOptionPane.WARNING_MESSAGE);
            textFieldNombreJugador_Login.setText("Nombre");
            textFieldContrase�aJugador_Login.setText("Contraseña");

        }

    }//GEN-LAST:event_botonLogin_LoginActionPerformed

    private void botonSignup_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSignup_LoginActionPerformed

        panel_LoginUsuarios.setVisible(false);
        panel_ElegirLoginSignup.setVisible(false);
        panel_RegistroUsuarios.setVisible(true);

    }//GEN-LAST:event_botonSignup_LoginActionPerformed

    private void botonGoBack_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGoBack_LoginActionPerformed

        panel_LoginUsuarios.setVisible(false);
        panel_RegistroUsuarios.setVisible(false);
        panel_ElegirLoginSignup.setVisible(true);

    }//GEN-LAST:event_botonGoBack_LoginActionPerformed

    private void botonLogin_ElegirLSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLogin_ElegirLSActionPerformed

        panel_ElegirLoginSignup.setVisible(false);
        panel_RegistroUsuarios.setVisible(false);
        panel_LoginUsuarios.setVisible(true);

    }//GEN-LAST:event_botonLogin_ElegirLSActionPerformed

    private void botonSignup_ElegirLSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSignup_ElegirLSActionPerformed

        panel_ElegirLoginSignup.setVisible(false);
        panel_LoginUsuarios.setVisible(false);
        panel_RegistroUsuarios.setVisible(true);

    }//GEN-LAST:event_botonSignup_ElegirLSActionPerformed
//----------------------------------------BOTON REGISTRAR-----------------
    private void botonSignup_SignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSignup_SignupActionPerformed

        char[] contrase�aIngresada = textFieldContrase�aJugador_Signup.getPassword();//guardamos la contrase�a en el arreglo 

        String contrase�aString = "";

        for (int i = 0; i < contrase�aIngresada.length; i++) {//ciclo para guardar  la contrase�a ingresada en otra variable
            contrase�aString += contrase�aIngresada[i];
        }

        try {

            if (archivoTexto.exists()) { //validamos si el archivo existe 

                boolean verif = gestorDatos.leerNombreRepetido(textFieldNombreJugador_Signup.getText());//llamamos al metodo de la clase datos 
                if (verif) {

                    JOptionPane.showMessageDialog(null, "Nombre de usuario ya registrado", "Registro", JOptionPane.ERROR_MESSAGE);

                } else {
                	//agregamos un nuevo usuario 
                    gestorDatos.Escribir(textFieldNombreJugador_Signup.getText() + "<>" + contrase�aString + "<>" + "100" + "<>");
                    nuevaPartida.addUsuario(textFieldNombreJugador_Signup.getText(), contrase�aString);
                    JOptionPane.showMessageDialog(null, "Usuario registrado", "Registro", JOptionPane.INFORMATION_MESSAGE);
                    textFieldContrase�aJugador_Signup.setText("Contraseña");
                    textFieldNombreJugador_Signup.setText("Nombre");
                    panel_RegistroUsuarios.setVisible(false);
                    panel_LoginUsuarios.setVisible(false);
                    panel_ElegirLoginSignup.setVisible(true);

                }
            } else {
            	//agregamos un nuevo usuario
                gestorDatos.Escribir(textFieldNombreJugador_Signup.getText() + "<>" + contrase�aString + "<>" + "100" + "<>");
                nuevaPartida.addUsuario(textFieldNombreJugador_Signup.getText(), contrase�aString);
                JOptionPane.showMessageDialog(null, "Usuario registrado", "Registro", JOptionPane.INFORMATION_MESSAGE);
                textFieldContrase�aJugador_Signup.setText("Contraseña");
                textFieldNombreJugador_Signup.setText("Nombre");
                panel_RegistroUsuarios.setVisible(false);
                panel_LoginUsuarios.setVisible(false);
                panel_ElegirLoginSignup.setVisible(true);

            }

        } catch (IOException e) {

            JOptionPane.showMessageDialog(null, "Error", "ERROR", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_botonSignup_SignupActionPerformed
    
//---------------------INTERFAZ---------------------
    private void botonLogin_SignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLogin_SignupActionPerformed

        panel_ElegirLoginSignup.setVisible(false);
        panel_RegistroUsuarios.setVisible(false);
        panel_LoginUsuarios.setVisible(true);

    }//GEN-LAST:event_botonLogin_SignupActionPerformed

    private void botonGoBack_SignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGoBack_SignupActionPerformed

        panel_LoginUsuarios.setVisible(false);
        panel_RegistroUsuarios.setVisible(false);
        panel_ElegirLoginSignup.setVisible(true);

    }//GEN-LAST:event_botonGoBack_SignupActionPerformed

    private void textFieldNombreJugador_LoginKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldNombreJugador_LoginKeyTyped

        if (textFieldNombreJugador_Login.getText().length() >= 10) {

            evt.consume();

        }

    }//GEN-LAST:event_textFieldNombreJugador_LoginKeyTyped

    private void textFieldNombreJugador_SignupKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldNombreJugador_SignupKeyTyped

        if (textFieldNombreJugador_Signup.getText().length() >= 10) {

            evt.consume();

        }

    }//GEN-LAST:event_textFieldNombreJugador_SignupKeyTyped

    private void textFieldNombreJugador_LoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldNombreJugador_LoginFocusGained

        if (textFieldNombreJugador_Login.getText().equals("Nombre")) {

            textFieldNombreJugador_Login.setText(null);

        }

        textFieldNombreJugador_Login.setBackground(Color.LIGHT_GRAY);

    }//GEN-LAST:event_textFieldNombreJugador_LoginFocusGained

    private void textFieldNombreJugador_LoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldNombreJugador_LoginFocusLost

        if (textFieldNombreJugador_Login.getText().equals("")) {

            textFieldNombreJugador_Login.setText("Nombre");

        }

        textFieldNombreJugador_Login.setBackground(Color.WHITE);

    }//GEN-LAST:event_textFieldNombreJugador_LoginFocusLost

    private void textFieldNombreJugador_SignupFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldNombreJugador_SignupFocusGained

        if (textFieldNombreJugador_Signup.getText().equals("Nombre")) {

            textFieldNombreJugador_Signup.setText(null);

        }

        textFieldNombreJugador_Signup.setBackground(Color.LIGHT_GRAY);

    }//GEN-LAST:event_textFieldNombreJugador_SignupFocusGained

    private void textFieldNombreJugador_SignupFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldNombreJugador_SignupFocusLost

        if (textFieldNombreJugador_Signup.getText().equals("")) {

            textFieldNombreJugador_Signup.setText("Nombre");

        }

        textFieldNombreJugador_Signup.setBackground(Color.WHITE);

    }//GEN-LAST:event_textFieldNombreJugador_SignupFocusLost
    
 //----------VALIDAMOS LAS EXPCIOMES EN TIEMPO DE EJECUCION----------------------
    private void textFieldContrase�aJugador_SignupKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldContraseñaJugador_SignupKeyTyped

        char[] contra = textFieldContrase�aJugador_Signup.getPassword();

        if (contra.length >= 10) {

            evt.consume();

        }

    }//GEN-LAST:event_textFieldContraseñaJugador_SignupKeyTyped

    private void textFieldContrase�aJugador_SignupFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldContraseñaJugador_SignupFocusGained

        char[] contra = textFieldContrase�aJugador_Signup.getPassword();
        char[] asd = {'C', 'o', 'n', 't', 'r', 'a', 's', 'e', '�', 'a'};

        if (Arrays.equals(contra, asd)) {

            textFieldContrase�aJugador_Signup.setText(null);

        }

        textFieldContrase�aJugador_Signup.setBackground(Color.LIGHT_GRAY);

    }//GEN-LAST:event_textFieldContraseñaJugador_SignupFocusGained

    private void textFieldContrase�aJugador_SignupFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldContraseñaJugador_SignupFocusLost

        char[] contra = textFieldContrase�aJugador_Signup.getPassword();

        if (contra.length == 0) {

            textFieldContrase�aJugador_Signup.setText("Contrase�a");

        }

        textFieldContrase�aJugador_Signup.setBackground(Color.WHITE);

    }//GEN-LAST:event_textFieldContraseñaJugador_SignupFocusLost

    private void textFieldContrase�aJugador_LoginKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldContraseñaJugador_LoginKeyTyped

        char[] contra = textFieldContrase�aJugador_Login.getPassword();

        if (contra.length >= 10) {

            evt.consume();

        }

    }//GEN-LAST:event_textFieldContraseñaJugador_LoginKeyTyped

    private void textFieldContrase�aJugador_LoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldContraseñaJugador_LoginFocusGained

        char[] contra = textFieldContrase�aJugador_Login.getPassword();
        char[] asd = {'C', 'o', 'n', 't', 'r', 'a', 's', 'e', '�', 'a'};

        if (Arrays.equals(contra, asd)) {

            textFieldContrase�aJugador_Login.setText(null);

        }

        textFieldContrase�aJugador_Login.setBackground(Color.LIGHT_GRAY);

    }//GEN-LAST:event_textFieldContraseñaJugador_LoginFocusGained

    private void textFieldContrase�aJugador_LoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldContraseñaJugador_LoginFocusLost

        char[] contra = textFieldContrase�aJugador_Login.getPassword();

        if (contra.length == 0) {

            textFieldContrase�aJugador_Login.setText("Contrase�a");

        }

        textFieldContrase�aJugador_Login.setBackground(Color.WHITE);

    }//GEN-LAST:event_textFieldContraseñaJugador_LoginFocusLost

    private void botonClear_ElegirLSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonClear_ElegirLSActionPerformed
    }//GEN-LAST:event_botonClear_ElegirLSActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonClear_ElegirLS;
    private javax.swing.JButton botonGoBack_Login;
    private javax.swing.JButton botonGoBack_Signup;
    private javax.swing.JButton botonLogin_ElegirLS;
    private javax.swing.JButton botonLogin_Login;
    private javax.swing.JButton botonLogin_Signup;
    private javax.swing.JButton botonSignup_ElegirLS;
    private javax.swing.JButton botonSignup_Login;
    private javax.swing.JButton botonSignup_Signup;
    private javax.swing.JLabel labelImagen_ElegirLS;
    private javax.swing.JLabel labelTitulo_ElegirLS;
    private javax.swing.JPanel panel_ElegirLoginSignup;
    private javax.swing.JPanel panel_LoginUsuarios;
    private javax.swing.JPanel panel_RegistroUsuarios;
    private javax.swing.JPasswordField textFieldContrase�aJugador_Login;
    private javax.swing.JPasswordField textFieldContrase�aJugador_Signup;
    private javax.swing.JTextField textFieldNombreJugador_Login;
    private javax.swing.JTextField textFieldNombreJugador_Signup;
    // End of variables declaration//GEN-END:variables
}
