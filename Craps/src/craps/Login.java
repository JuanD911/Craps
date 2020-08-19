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

public class Login extends javax.swing.JFrame {

    private Partida nuevaPartida = null;
    private Datos gestorDatos = null;
    private final File archivoTexto = new File("archivoTexto.txt");
    private Dado dado1 = null;
    private Dado dado2 = null;
//---------COSTRUCTOR---------------------
    public Login(Partida nuevaPartida, Datos datos, Dado dado1, Dado dado2) {
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

        ElegirLoginSignup = new javax.swing.JPanel();
        titulo_inicio = new javax.swing.JLabel();
        imagen_dados = new javax.swing.JLabel();
        registrar = new javax.swing.JButton();
        ingresar = new javax.swing.JButton();
        LoginUsuarios = new javax.swing.JPanel();
        NombreJugador_Login = new javax.swing.JTextField();
        registrar_Login = new javax.swing.JButton();
        ingresar_login = new javax.swing.JButton();
        regresar_Login = new javax.swing.JButton();
        Contrase�aJugador_Login = new javax.swing.JPasswordField();
        RegistroUsuarios = new javax.swing.JPanel();
        NombreJugador_Signup = new javax.swing.JTextField();
        registrar_Signup = new javax.swing.JButton();
        ingresar_Signup = new javax.swing.JButton();
        regresar_Signup = new javax.swing.JButton();
        Contrase�aJugador_Signup = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Craps");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(750,400);
        setMaximumSize(null);
        setName("Contenedor"); // NOI18N
        setSize(new java.awt.Dimension(220, 270));

        ElegirLoginSignup.setMaximumSize(new java.awt.Dimension(220, 270));
        ElegirLoginSignup.setMinimumSize(new java.awt.Dimension(220, 270));
        ElegirLoginSignup.setPreferredSize(new java.awt.Dimension(220, 270));
        ElegirLoginSignup.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo_inicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_inicio.setText("CRAPS");
        titulo_inicio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ElegirLoginSignup.add(titulo_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 80, 20));

        imagen_dados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagen_dados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ElegirLoginSignup.add(imagen_dados, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 180, 100));

        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSignup_ElegirLSActionPerformed(evt);
            }
        });
        ElegirLoginSignup.add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 80, -1));

        ingresar.setText("Ingresar");
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLogin_ElegirLSActionPerformed(evt);
            }
        });
        ElegirLoginSignup.add(ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 80, -1));

        LoginUsuarios.setMaximumSize(new java.awt.Dimension(220, 270));
        LoginUsuarios.setMinimumSize(new java.awt.Dimension(220, 270));
        LoginUsuarios.setPreferredSize(new java.awt.Dimension(220, 270));
        LoginUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NombreJugador_Login.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        NombreJugador_Login.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NombreJugador_Login.setText("Nombre");
        NombreJugador_Login.setToolTipText("Maximo 10 caracteres");
        NombreJugador_Login.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldNombreJugador_LoginFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldNombreJugador_LoginFocusLost(evt);
            }
        });
        NombreJugador_Login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldNombreJugador_LoginKeyTyped(evt);
            }
        });
        LoginUsuarios.add(NombreJugador_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 180, 50));

        registrar_Login.setText("Ingresar");
        registrar_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLogin_LoginActionPerformed(evt);
            }
        });
        LoginUsuarios.add(registrar_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 80, -1));

        ingresar_login.setText("Registrar");
        ingresar_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSignup_LoginActionPerformed(evt);
            }
        });
        LoginUsuarios.add(ingresar_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 80, -1));

        regresar_Login.setText("Regresar");
        regresar_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGoBack_LoginActionPerformed(evt);
            }
        });
        LoginUsuarios.add(regresar_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 220, -1, -1));

        Contrase�aJugador_Login.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        Contrase�aJugador_Login.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Contrase�aJugador_Login.setText("Contrase�a");
        Contrase�aJugador_Login.setToolTipText("Maximo 10 caracteres");
        Contrase�aJugador_Login.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldContrase�aJugador_LoginFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldContrase�aJugador_LoginFocusLost(evt);
            }
        });
        Contrase�aJugador_Login.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldContrase�aJugador_LoginKeyTyped(evt);
            }
        });
        LoginUsuarios.add(Contrase�aJugador_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 180, 50));

        RegistroUsuarios.setMaximumSize(new java.awt.Dimension(220, 270));
        RegistroUsuarios.setMinimumSize(new java.awt.Dimension(220, 270));
        RegistroUsuarios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NombreJugador_Signup.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        NombreJugador_Signup.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NombreJugador_Signup.setText("Nombre");
        NombreJugador_Signup.setToolTipText("Maximo 10 caracteres");
        NombreJugador_Signup.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldNombreJugador_SignupFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldNombreJugador_SignupFocusLost(evt);
            }
        });
        NombreJugador_Signup.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldNombreJugador_SignupKeyTyped(evt);
            }
        });
        RegistroUsuarios.add(NombreJugador_Signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 180, 50));

        registrar_Signup.setText("Registar");
        registrar_Signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSignup_SignupActionPerformed(evt);
            }
        });
        RegistroUsuarios.add(registrar_Signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 80, -1));

        ingresar_Signup.setText("Ingresar");
        ingresar_Signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLogin_SignupActionPerformed(evt);
            }
        });
        RegistroUsuarios.add(ingresar_Signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 80, -1));

        regresar_Signup.setText("Regresar");
        regresar_Signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGoBack_SignupActionPerformed(evt);
            }
        });
        RegistroUsuarios.add(regresar_Signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 220, -1, -1));

        Contrase�aJugador_Signup.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        Contrase�aJugador_Signup.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Contrase�aJugador_Signup.setText("Contrase�a");
        Contrase�aJugador_Signup.setToolTipText("Maximo 10 caracteres");
        Contrase�aJugador_Signup.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textFieldContrase�aJugador_SignupFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFieldContrase�aJugador_SignupFocusLost(evt);
            }
        });
        Contrase�aJugador_Signup.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldContrase�aJugador_SignupKeyTyped(evt);
            }
        });
        RegistroUsuarios.add(Contrase�aJugador_Signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 180, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ElegirLoginSignup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(LoginUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(RegistroUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ElegirLoginSignup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(LoginUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(RegistroUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CustomInitComponents() {

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);

        ImageIcon imagenExterna = new ImageIcon(getClass().getResource("Dados.jpg"));
        Image Img = imagenExterna.getImage();
        Image nuevaimagen = Img.getScaledInstance(imagen_dados.getWidth(), imagen_dados.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(nuevaimagen);
        imagen_dados.setIcon(image);

        ElegirLoginSignup.setVisible(true);
        LoginUsuarios.setVisible(false);
        RegistroUsuarios.setVisible(false);

        this.setTitle("Inicio/Registro: Craps");

    }

    public JPanel getPanel_ElegirLoginSignup() {
        return ElegirLoginSignup;
    }
//------------------------------BOTON INGRESAR----------------
    private void botonLogin_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLogin_LoginActionPerformed

        try {
            char[] contrase�aIngresada = Contrase�aJugador_Login.getPassword();//guardamos la contrase�a en el arreglo 

            boolean verif;//creamos un boolean

            String contrase�aString = "";

            for (int i = 0; i < contrase�aIngresada.length; i++) {//ciclo para guardar  la contrase�a ingresada en otra variable
                contrase�aString += contrase�aIngresada[i];
            }

            verif = gestorDatos.Leer(NombreJugador_Login.getText(), contrase�aString);//llamamos el metodo de  la lase datos

            if (verif) {
            	//abrimos la clase vista juego 
                this.nuevaPartida.VerificarSaldo(gestorDatos.posicionUsuarioRegistrado(NombreJugador_Login.getText(), contrase�aString));
                JOptionPane.showMessageDialog(null, "Bienvenido", "Login", JOptionPane.INFORMATION_MESSAGE);
                Juego nuevaVistaJuego = new Juego(nuevaPartida, gestorDatos.posicionUsuarioRegistrado(NombreJugador_Login.getText(), contrase�aString), this, dado1, dado2);
                NombreJugador_Login.setText("Nombre");
                Contrase�aJugador_Login.setText("Contrase�a");
                RegistroUsuarios.setVisible(false);
                LoginUsuarios.setVisible(false);
                ElegirLoginSignup.setVisible(false);
                this.setVisible(false);

                nuevaVistaJuego.setVisible(true);

            } else {

                JOptionPane.showMessageDialog(null, "Usuaro o contrase�a incorrecta", "Login", JOptionPane.ERROR_MESSAGE);
                NombreJugador_Login.setText("Nombre");
                Contrase�aJugador_Login.setText("Contraseña");

            }

        } catch (SaldoCero e) {

            JOptionPane.showMessageDialog(null, "SALDO CERO", "Login", JOptionPane.WARNING_MESSAGE);
            NombreJugador_Login.setText("Nombre");
            Contrase�aJugador_Login.setText("Contraseña");

        }

    }//GEN-LAST:event_botonLogin_LoginActionPerformed

    private void botonSignup_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSignup_LoginActionPerformed

        LoginUsuarios.setVisible(false);
        ElegirLoginSignup.setVisible(false);
        RegistroUsuarios.setVisible(true);

    }//GEN-LAST:event_botonSignup_LoginActionPerformed

    private void botonGoBack_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGoBack_LoginActionPerformed

        LoginUsuarios.setVisible(false);
        RegistroUsuarios.setVisible(false);
        ElegirLoginSignup.setVisible(true);

    }//GEN-LAST:event_botonGoBack_LoginActionPerformed

    private void botonLogin_ElegirLSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLogin_ElegirLSActionPerformed

        ElegirLoginSignup.setVisible(false);
        RegistroUsuarios.setVisible(false);
        LoginUsuarios.setVisible(true);

    }//GEN-LAST:event_botonLogin_ElegirLSActionPerformed

    private void botonSignup_ElegirLSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSignup_ElegirLSActionPerformed

        ElegirLoginSignup.setVisible(false);
        LoginUsuarios.setVisible(false);
        RegistroUsuarios.setVisible(true);

    }//GEN-LAST:event_botonSignup_ElegirLSActionPerformed
//----------------------------------------BOTON REGISTRAR-----------------
    private void botonSignup_SignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSignup_SignupActionPerformed

        char[] contrase�aIngresada = Contrase�aJugador_Signup.getPassword();//guardamos la contrase�a en el arreglo 

        String contrase�aString = "";

        for (int i = 0; i < contrase�aIngresada.length; i++) {//ciclo para guardar  la contrase�a ingresada en otra variable
            contrase�aString += contrase�aIngresada[i];
        }

        try {

            if (archivoTexto.exists()) { //validamos si el archivo existe 

                boolean verif = gestorDatos.leerNombreRepetido(NombreJugador_Signup.getText());//llamamos al metodo de la clase datos 
                if (verif) {

                    JOptionPane.showMessageDialog(null, "Nombre de usuario ya registrado", "Registro", JOptionPane.ERROR_MESSAGE);

                } else {
                	//agregamos un nuevo usuario 
                    gestorDatos.Escribir(NombreJugador_Signup.getText() + "<>" + contrase�aString + "<>" + "100" + "<>");
                    nuevaPartida.addUsuario(NombreJugador_Signup.getText(), contrase�aString);
                    JOptionPane.showMessageDialog(null, "Usuario registrado", "Registro", JOptionPane.INFORMATION_MESSAGE);
                    Contrase�aJugador_Signup.setText("Contraseña");
                    NombreJugador_Signup.setText("Nombre");
                    RegistroUsuarios.setVisible(false);
                    LoginUsuarios.setVisible(false);
                    ElegirLoginSignup.setVisible(true);

                }
            } else {
            	//agregamos un nuevo usuario
                gestorDatos.Escribir(NombreJugador_Signup.getText() + "<>" + contrase�aString + "<>" + "100" + "<>");
                nuevaPartida.addUsuario(NombreJugador_Signup.getText(), contrase�aString);
                JOptionPane.showMessageDialog(null, "Usuario registrado", "Registro", JOptionPane.INFORMATION_MESSAGE);
                Contrase�aJugador_Signup.setText("Contraseña");
                NombreJugador_Signup.setText("Nombre");
                RegistroUsuarios.setVisible(false);
                LoginUsuarios.setVisible(false);
                ElegirLoginSignup.setVisible(true);

            }

        } catch (IOException e) {

            JOptionPane.showMessageDialog(null, "Error", "ERROR", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_botonSignup_SignupActionPerformed
    
//---------------------INTERFAZ---------------------
    private void botonLogin_SignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLogin_SignupActionPerformed

        ElegirLoginSignup.setVisible(false);
        RegistroUsuarios.setVisible(false);
        LoginUsuarios.setVisible(true);

    }//GEN-LAST:event_botonLogin_SignupActionPerformed

    private void botonGoBack_SignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGoBack_SignupActionPerformed

        LoginUsuarios.setVisible(false);
        RegistroUsuarios.setVisible(false);
        ElegirLoginSignup.setVisible(true);

    }//GEN-LAST:event_botonGoBack_SignupActionPerformed

    private void textFieldNombreJugador_LoginKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldNombreJugador_LoginKeyTyped

        if (NombreJugador_Login.getText().length() >= 10) {

            evt.consume();

        }

    }//GEN-LAST:event_textFieldNombreJugador_LoginKeyTyped

    private void textFieldNombreJugador_SignupKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldNombreJugador_SignupKeyTyped

        if (NombreJugador_Signup.getText().length() >= 10) {

            evt.consume();

        }

    }//GEN-LAST:event_textFieldNombreJugador_SignupKeyTyped

    private void textFieldNombreJugador_LoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldNombreJugador_LoginFocusGained

        if (NombreJugador_Login.getText().equals("Nombre")) {

            NombreJugador_Login.setText(null);

        }

        NombreJugador_Login.setBackground(Color.LIGHT_GRAY);

    }//GEN-LAST:event_textFieldNombreJugador_LoginFocusGained

    private void textFieldNombreJugador_LoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldNombreJugador_LoginFocusLost

        if (NombreJugador_Login.getText().equals("")) {

            NombreJugador_Login.setText("Nombre");

        }

        NombreJugador_Login.setBackground(Color.WHITE);

    }//GEN-LAST:event_textFieldNombreJugador_LoginFocusLost

    private void textFieldNombreJugador_SignupFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldNombreJugador_SignupFocusGained

        if (NombreJugador_Signup.getText().equals("Nombre")) {

            NombreJugador_Signup.setText(null);

        }

        NombreJugador_Signup.setBackground(Color.LIGHT_GRAY);

    }//GEN-LAST:event_textFieldNombreJugador_SignupFocusGained

    private void textFieldNombreJugador_SignupFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldNombreJugador_SignupFocusLost

        if (NombreJugador_Signup.getText().equals("")) {

            NombreJugador_Signup.setText("Nombre");

        }

        NombreJugador_Signup.setBackground(Color.WHITE);

    }//GEN-LAST:event_textFieldNombreJugador_SignupFocusLost
    
 //----------VALIDAMOS LAS EXPCIOMES EN TIEMPO DE EJECUCION----------------------
    private void textFieldContrase�aJugador_SignupKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldContraseñaJugador_SignupKeyTyped

        char[] contra = Contrase�aJugador_Signup.getPassword();

        if (contra.length >= 10) {

            evt.consume();

        }

    }//GEN-LAST:event_textFieldContraseñaJugador_SignupKeyTyped

    private void textFieldContrase�aJugador_SignupFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldContraseñaJugador_SignupFocusGained

        char[] contra = Contrase�aJugador_Signup.getPassword();
        char[] asd = {'C', 'o', 'n', 't', 'r', 'a', 's', 'e', '�', 'a'};

        if (Arrays.equals(contra, asd)) {

            Contrase�aJugador_Signup.setText(null);

        }

        Contrase�aJugador_Signup.setBackground(Color.LIGHT_GRAY);

    }//GEN-LAST:event_textFieldContraseñaJugador_SignupFocusGained

    private void textFieldContrase�aJugador_SignupFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldContraseñaJugador_SignupFocusLost

        char[] contra = Contrase�aJugador_Signup.getPassword();

        if (contra.length == 0) {

            Contrase�aJugador_Signup.setText("Contrase�a");

        }

        Contrase�aJugador_Signup.setBackground(Color.WHITE);

    }//GEN-LAST:event_textFieldContraseñaJugador_SignupFocusLost

    private void textFieldContrase�aJugador_LoginKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldContraseñaJugador_LoginKeyTyped

        char[] contra = Contrase�aJugador_Login.getPassword();

        if (contra.length >= 10) {

            evt.consume();

        }

    }//GEN-LAST:event_textFieldContraseñaJugador_LoginKeyTyped

    private void textFieldContrase�aJugador_LoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldContraseñaJugador_LoginFocusGained

        char[] contra = Contrase�aJugador_Login.getPassword();
        char[] asd = {'C', 'o', 'n', 't', 'r', 'a', 's', 'e', '�', 'a'};

        if (Arrays.equals(contra, asd)) {

            Contrase�aJugador_Login.setText(null);

        }

        Contrase�aJugador_Login.setBackground(Color.LIGHT_GRAY);

    }//GEN-LAST:event_textFieldContraseñaJugador_LoginFocusGained

    private void textFieldContrase�aJugador_LoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFieldContraseñaJugador_LoginFocusLost

        char[] contra = Contrase�aJugador_Login.getPassword();

        if (contra.length == 0) {

            Contrase�aJugador_Login.setText("Contrase�a");

        }

        Contrase�aJugador_Login.setBackground(Color.WHITE);

    }//GEN-LAST:event_textFieldContraseñaJugador_LoginFocusLost

    private void botonClear_ElegirLSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonClear_ElegirLSActionPerformed
    }//GEN-LAST:event_botonClear_ElegirLSActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton regresar_Login;
    private javax.swing.JButton regresar_Signup;
    private javax.swing.JButton ingresar;
    private javax.swing.JButton registrar_Login;
    private javax.swing.JButton ingresar_Signup;
    private javax.swing.JButton registrar;
    private javax.swing.JButton ingresar_login;
    private javax.swing.JButton registrar_Signup;
    private javax.swing.JLabel imagen_dados;
    private javax.swing.JLabel titulo_inicio;
    private javax.swing.JPanel ElegirLoginSignup;
    private javax.swing.JPanel LoginUsuarios;
    private javax.swing.JPanel RegistroUsuarios;
    private javax.swing.JPasswordField Contrase�aJugador_Login;
    private javax.swing.JPasswordField Contrase�aJugador_Signup;
    private javax.swing.JTextField NombreJugador_Login;
    private javax.swing.JTextField NombreJugador_Signup;
    // End of variables declaration//GEN-END:variables
}
