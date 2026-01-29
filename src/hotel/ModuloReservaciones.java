package hotel.vistahermosa;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.*;

public class ModuloReservaciones extends javax.swing.JFrame {

    public ModuloReservaciones() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jToggleButton3 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nombre cliente:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("ID Habitación:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Fecha entrada (YYYY-MM-DD):");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Fecha salida (YYYY-MM-DD):");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Incluye desayuno:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jToggleButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jToggleButton1.setText("GUARDAR");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jToggleButton2.setText("SALIR");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Tarjeta (16 dígitos)");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Vencimiento (formato MM/AA)");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("cvv (3 dígitos)  ");

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("RESERVACIONES");

        jToggleButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jToggleButton3.setText("VER REGISTROS");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3)
                            .addComponent(jTextField4)
                            .addComponent(jTextField5)
                            .addComponent(jTextField6)
                            .addComponent(jTextField7)
                            .addComponent(jTextField8)
                            .addComponent(jTextField9)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToggleButton1)
                        .addGap(47, 47, 47)
                        .addComponent(jToggleButton3)
                        .addGap(48, 48, 48)
                        .addComponent(jToggleButton2)))
                .addContainerGap(110, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(275, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(263, 263, 263))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton2)
                    .addComponent(jToggleButton1)
                    .addComponent(jToggleButton3))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        guardarReservacion();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        new MenuPrincipal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        verRegistros();
    }//GEN-LAST:event_jToggleButton3ActionPerformed

private void guardarReservacion() {
    
    String id = jTextField1.getText().trim();
    String nombre = jTextField2.getText().trim();
    String idHab = jTextField3.getText().trim();
    String entrada = jTextField4.getText().trim();
    String salida = jTextField5.getText().trim();
    String incluyeDesayuno = jTextField6.getText().trim();
    String tarjeta = jTextField8.getText().trim();   
    String vencimiento = jTextField7.getText().trim();  
    String cvv = jTextField9.getText().trim(); 

    
    if (id.isEmpty() || nombre.isEmpty() || idHab.isEmpty() || 
        entrada.isEmpty() || salida.isEmpty() || incluyeDesayuno.isEmpty() ||
        tarjeta.isEmpty() || vencimiento.isEmpty() || cvv.isEmpty()) {
        JOptionPane.showMessageDialog(this, 
            "Todos los campos son obligatorios.", 
            "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (nombre.length() > 50) {
        JOptionPane.showMessageDialog(this, 
            "El nombre del cliente debe tener máximo 50 caracteres.", 
            "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        Integer.parseInt(idHab);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, 
            "El ID de habitación debe ser un número entero.", 
            "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (!entrada.matches("\\d{4}-\\d{2}-\\d{2}")) {
        JOptionPane.showMessageDialog(this, 
            "Fecha de entrada debe estar en formato YYYY-MM-DD.", 
            "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (!salida.matches("\\d{4}-\\d{2}-\\d{2}")) {
        JOptionPane.showMessageDialog(this, 
            "Fecha de salida debe estar en formato YYYY-MM-DD.", 
            "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        String[] partsEntrada = entrada.split("-");
        String[] partsSalida = salida.split("-");
        
        int añoEntrada = Integer.parseInt(partsEntrada[0]);
        int mesEntrada = Integer.parseInt(partsEntrada[1]);
        int diaEntrada = Integer.parseInt(partsEntrada[2]);
        
        int añoSalida = Integer.parseInt(partsSalida[0]);
        int mesSalida = Integer.parseInt(partsSalida[1]);
        int diaSalida = Integer.parseInt(partsSalida[2]);

        if (añoSalida < añoEntrada || 
            (añoSalida == añoEntrada && mesSalida < mesEntrada) ||
            (añoSalida == añoEntrada && mesSalida == mesEntrada && diaSalida <= diaEntrada)) {
            JOptionPane.showMessageDialog(this, 
                "La fecha de salida debe ser posterior a la fecha de entrada.", 
                "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, 
            "Formato de fecha inválido. Use YYYY-MM-DD con fechas válidas.", 
            "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (!incluyeDesayuno.equalsIgnoreCase("SI") && 
        !incluyeDesayuno.equalsIgnoreCase("NO") &&
        !incluyeDesayuno.equalsIgnoreCase("true") && 
        !incluyeDesayuno.equalsIgnoreCase("false")) {
        JOptionPane.showMessageDialog(this, 
            "El campo 'Incluye desayuno' debe ser SI, NO, true o false.", 
            "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (!tarjeta.matches("\\d{16}")) {
        JOptionPane.showMessageDialog(this, 
            "La tarjeta debe tener exactamente 16 dígitos (sin espacios ni guiones).", 
            "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (!vencimiento.matches("(0[1-9]|1[0-2])/\\d{2}")) {
        JOptionPane.showMessageDialog(this, 
            "El vencimiento debe estar en formato MM/AA (ejemplo: 12/25).", 
            "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (!cvv.matches("\\d{3}")) {
        JOptionPane.showMessageDialog(this, 
            "El CVV debe tener exactamente 3 dígitos.", 
            "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    String registro = String.join(";", 
        id, nombre, idHab, entrada, salida, incluyeDesayuno, tarjeta, vencimiento, cvv);

    try (PrintWriter out = new PrintWriter(new FileWriter("reservaciones.txt", true))) {
        out.println(registro);
        JOptionPane.showMessageDialog(this, 
            "Reservación guardada correctamente.");
        limpiarCampos();
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(this, 
            "Error al guardar: " + ex.getMessage(), 
            "Error", JOptionPane.ERROR_MESSAGE);
    }
}

private void verRegistros() {
        java.io.File archivo = new java.io.File("reservaciones.txt");
        
        if (!archivo.exists()) {
            JOptionPane.showMessageDialog(
                this,
                "No hay reservaciones guardadas aún.\nEl archivo 'reservaciones.txt' no existe.",
                "Sin Reservaciones",
                JOptionPane.INFORMATION_MESSAGE
            );
            return;
        }
        
        try (FileReader fr = new FileReader(archivo);
             BufferedReader br = new BufferedReader(fr)) {
            
            StringBuilder texto = new StringBuilder();
            texto.append("╔═══════════════════════════════════════════════════════════════════╗\n");
            texto.append("               REGISTROS DE RESERVACIONES - HOTEL            \n");
            texto.append("╚═══════════════════════════════════════════════════════════════════╝\n\n");
            
            String linea;
            int contador = 0;
            
            while ((linea = br.readLine()) != null) {
                contador++;
                String[] datos = linea.split(";");
                
                if (datos.length >= 9) {
                    texto.append("  RESERVACIÓN #").append(String.format("%-50s", contador)).append("\n");
                    texto.append("  INFORMACIÓN GENERAL                                           \n");
                    texto.append("  ─────────────────────────                                        \n");
                    texto.append("  ID Reservación:        ").append(String.format("%-40s", datos[0])).append("\n");
                    texto.append("  Nombre Cliente:        ").append(String.format("%-40s", datos[1])).append("\n");
                    texto.append("  ID Habitación:         ").append(String.format("%-40s", datos[2])).append("\n");
                    texto.append("                                                                   \n");
                    texto.append("  FECHAS DE ESTADÍA                                             \n");
                    texto.append("  ─────────────────────                                            \n");
                    texto.append("  Fecha Entrada:         ").append(String.format("%-40s", datos[3])).append("\n");
                    texto.append("  Fecha Salida:          ").append(String.format("%-40s", datos[4])).append("\n");
                    texto.append("  Incluye Desayuno:      ").append(String.format("%-40s", datos[5])).append("\n");
                    texto.append("                                                                   \n");
                    texto.append("  INFORMACIÓN DE PAGO                                           \n");
                    texto.append("  ───────────────────────                                          \n");
                    
                    String tarjetaVisible = datos[6];        // muestra número completo
                    texto.append("  Tarjeta:               ").append(String.format("%-40s", tarjetaVisible)).append("\n");
                    texto.append("  Vencimiento:           ").append(String.format("%-40s", datos[7])).append("\n");
                    texto.append("  CVV:                   ").append(String.format("%-40s", datos[8])).append("\n");
                    texto.append("                                                                   \n");
                    texto.append("───────────────────────────────────────────────────────────────────\n\n");
                }
            }
            
            if (contador == 0) {
                texto.append("\n          No hay reservaciones registradas.\n\n");
            } else {
                texto.append("╔═══════════════════════════════════════════════════════════════════╗\n");
                texto.append("║  Total de reservaciones: ").append(String.format("%-42s", contador)).append("\n");
                texto.append("╚═══════════════════════════════════════════════════════════════════╝");
            }
            
            JTextArea textArea = new JTextArea(texto.toString());
            textArea.setEditable(false);
            textArea.setFont(new java.awt.Font("Monospaced", java.awt.Font.PLAIN, 11));
            textArea.setCaretPosition(0);
            
            JScrollPane scrollPane = new JScrollPane(textArea);
            scrollPane.setPreferredSize(new java.awt.Dimension(750, 500));
            
            JOptionPane.showMessageDialog(
                this,
                scrollPane,
                "Registros de Reservaciones - Total: " + contador,
                JOptionPane.INFORMATION_MESSAGE
            );
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(
                this,
                "Error al leer el archivo: " + ex.getMessage(),
                "Error de Lectura",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }

private void limpiarCampos() {
    jTextField1.setText("");
    jTextField2.setText("");
    jTextField3.setText("");
    jTextField4.setText("");
    jTextField5.setText("");
    jTextField6.setText("");
    jTextField7.setText(""); 
    jTextField8.setText("");  
    jTextField9.setText("");  
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    // End of variables declaration//GEN-END:variables
}
