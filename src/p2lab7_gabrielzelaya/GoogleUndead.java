package p2lab7_gabrielzelaya;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import modelos.AdministrarJBar;
import modelos.Archivo;
import modelos.Carpeta;
import persistenciaDeDatos.ManejoArchivos;
import persistenciaDeDatos.ManejoBinarios;

/**
 *
 * @author gabri
 */
public class GoogleUndead extends javax.swing.JFrame {

    public GoogleUndead() throws Exception {
        initComponents();
        bg_mostrarDescargas.setVisible(false);
        agregarBinarioALista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pp_archivos = new javax.swing.JPopupMenu();
        archivos_descargar = new javax.swing.JMenuItem();
        archivos_mover = new javax.swing.JMenuItem();
        archivos_eliminar = new javax.swing.JMenuItem();
        pp_carpetas = new javax.swing.JPopupMenu();
        carpetas_crear = new javax.swing.JMenuItem();
        carpetas_mover = new javax.swing.JMenuItem();
        carpetas_eliminar = new javax.swing.JMenuItem();
        pp_papelera = new javax.swing.JPopupMenu();
        restaurar = new javax.swing.JMenuItem();
        eliminar_papelera = new javax.swing.JMenuItem();
        mostrar_descargas = new javax.swing.JDialog();
        bg_mostrarLista_descargas = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_descargas = new javax.swing.JTable();
        bg_mostrarDescargas = new javax.swing.JPanel();
        salir_descargas = new javax.swing.JLabel();
        txt_mostrarDescargas = new javax.swing.JLabel();
        barra_izquierda = new javax.swing.JPanel();
        btn_destacados = new javax.swing.JPanel();
        txt_destacados = new javax.swing.JLabel();
        btn_miUnidad = new javax.swing.JPanel();
        txt_miUnidad = new javax.swing.JLabel();
        btn_papelera = new javax.swing.JPanel();
        txt_papelera = new javax.swing.JLabel();
        img_logo = new javax.swing.JLabel();
        btn_new = new javax.swing.JButton();
        bg_miUnidad = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        miUnidad_tree = new javax.swing.JTree();
        bg_destacados = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        destacados_tree = new javax.swing.JTree();
        bg_papelera = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        papelera_tree = new javax.swing.JTree();
        bg_descarga = new javax.swing.JPanel();
        pbar_descarga = new javax.swing.JProgressBar();
        link_descarga = new javax.swing.JLabel();

        archivos_descargar.setText("Descargar");
        archivos_descargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivos_descargarActionPerformed(evt);
            }
        });
        pp_archivos.add(archivos_descargar);

        archivos_mover.setText("Mover");
        archivos_mover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivos_moverActionPerformed(evt);
            }
        });
        pp_archivos.add(archivos_mover);

        archivos_eliminar.setText("Eliminar");
        archivos_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivos_eliminarActionPerformed(evt);
            }
        });
        pp_archivos.add(archivos_eliminar);

        carpetas_crear.setText("Crear");
        carpetas_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carpetas_crearActionPerformed(evt);
            }
        });
        pp_carpetas.add(carpetas_crear);

        carpetas_mover.setText("Mover");
        carpetas_mover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carpetas_moverActionPerformed(evt);
            }
        });
        pp_carpetas.add(carpetas_mover);

        carpetas_eliminar.setText("Eliminar");
        carpetas_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carpetas_eliminarActionPerformed(evt);
            }
        });
        pp_carpetas.add(carpetas_eliminar);

        restaurar.setText("Restaurar");
        restaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaurarActionPerformed(evt);
            }
        });
        pp_papelera.add(restaurar);

        eliminar_papelera.setText("Eliminar");
        eliminar_papelera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_papeleraActionPerformed(evt);
            }
        });
        pp_papelera.add(eliminar_papelera);

        mostrar_descargas.setMinimumSize(new java.awt.Dimension(600, 500));
        mostrar_descargas.setPreferredSize(new java.awt.Dimension(600, 500));
        mostrar_descargas.setResizable(false);

        bg_mostrarLista_descargas.setBackground(new java.awt.Color(255, 255, 255));
        bg_mostrarLista_descargas.setMinimumSize(new java.awt.Dimension(400, 500));

        table_descargas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Link", "Tama??o"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(table_descargas);
        if (table_descargas.getColumnModel().getColumnCount() > 0) {
            table_descargas.getColumnModel().getColumn(0).setResizable(false);
            table_descargas.getColumnModel().getColumn(1).setResizable(false);
            table_descargas.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout bg_mostrarLista_descargasLayout = new javax.swing.GroupLayout(bg_mostrarLista_descargas);
        bg_mostrarLista_descargas.setLayout(bg_mostrarLista_descargasLayout);
        bg_mostrarLista_descargasLayout.setHorizontalGroup(
            bg_mostrarLista_descargasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_mostrarLista_descargasLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        bg_mostrarLista_descargasLayout.setVerticalGroup(
            bg_mostrarLista_descargasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_mostrarLista_descargasLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout mostrar_descargasLayout = new javax.swing.GroupLayout(mostrar_descargas.getContentPane());
        mostrar_descargas.getContentPane().setLayout(mostrar_descargasLayout);
        mostrar_descargasLayout.setHorizontalGroup(
            mostrar_descargasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_mostrarLista_descargas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        mostrar_descargasLayout.setVerticalGroup(
            mostrar_descargasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_mostrarLista_descargas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("googleUndead");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg_mostrarDescargas.setBackground(new java.awt.Color(232, 240, 254));

        salir_descargas.setText("X");
        salir_descargas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir_descargas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salir_descargasMouseClicked(evt);
            }
        });

        txt_mostrarDescargas.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txt_mostrarDescargas.setText("Mostrar descargas");
        txt_mostrarDescargas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_mostrarDescargas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_mostrarDescargasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bg_mostrarDescargasLayout = new javax.swing.GroupLayout(bg_mostrarDescargas);
        bg_mostrarDescargas.setLayout(bg_mostrarDescargasLayout);
        bg_mostrarDescargasLayout.setHorizontalGroup(
            bg_mostrarDescargasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_mostrarDescargasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_mostrarDescargas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 653, Short.MAX_VALUE)
                .addComponent(salir_descargas)
                .addGap(16, 16, 16))
        );
        bg_mostrarDescargasLayout.setVerticalGroup(
            bg_mostrarDescargasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_mostrarDescargasLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(bg_mostrarDescargasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salir_descargas)
                    .addComponent(txt_mostrarDescargas))
                .addGap(16, 16, 16))
        );

        getContentPane().add(bg_mostrarDescargas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 800, 50));

        barra_izquierda.setBackground(new java.awt.Color(255, 255, 255));
        barra_izquierda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_destacados.setBackground(new java.awt.Color(255, 255, 255));
        btn_destacados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_destacadosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_destacadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_destacadosMouseExited(evt);
            }
        });

        txt_destacados.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        txt_destacados.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt_destacados.setText("        Destacados");

        javax.swing.GroupLayout btn_destacadosLayout = new javax.swing.GroupLayout(btn_destacados);
        btn_destacados.setLayout(btn_destacadosLayout);
        btn_destacadosLayout.setHorizontalGroup(
            btn_destacadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_destacados, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        btn_destacadosLayout.setVerticalGroup(
            btn_destacadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_destacados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        barra_izquierda.add(btn_destacados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 220, 50));

        btn_miUnidad.setBackground(new java.awt.Color(255, 255, 255));
        btn_miUnidad.setPreferredSize(new java.awt.Dimension(181, 55));
        btn_miUnidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_miUnidadMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_miUnidadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_miUnidadMouseExited(evt);
            }
        });

        txt_miUnidad.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        txt_miUnidad.setText("        Mi Unidad");

        javax.swing.GroupLayout btn_miUnidadLayout = new javax.swing.GroupLayout(btn_miUnidad);
        btn_miUnidad.setLayout(btn_miUnidadLayout);
        btn_miUnidadLayout.setHorizontalGroup(
            btn_miUnidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_miUnidad, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        btn_miUnidadLayout.setVerticalGroup(
            btn_miUnidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_miUnidad, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        barra_izquierda.add(btn_miUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 220, 50));

        btn_papelera.setBackground(new java.awt.Color(255, 255, 255));
        btn_papelera.setPreferredSize(new java.awt.Dimension(181, 55));
        btn_papelera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_papeleraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_papeleraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_papeleraMouseExited(evt);
            }
        });

        txt_papelera.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        txt_papelera.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt_papelera.setText("        Papelera");

        javax.swing.GroupLayout btn_papeleraLayout = new javax.swing.GroupLayout(btn_papelera);
        btn_papelera.setLayout(btn_papeleraLayout);
        btn_papeleraLayout.setHorizontalGroup(
            btn_papeleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_papelera, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        btn_papeleraLayout.setVerticalGroup(
            btn_papeleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_papelera, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        barra_izquierda.add(btn_papelera, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 220, 50));

        img_logo.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        img_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/drive_logo.png"))); // NOI18N
        img_logo.setText("Undead");
        barra_izquierda.add(img_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 190, 40));

        btn_new.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        btn_new.setText("Nuevo");
        btn_new.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_newMouseClicked(evt);
            }
        });
        barra_izquierda.add(btn_new, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 110, 30));

        getContentPane().add(barra_izquierda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 545));

        bg_miUnidad.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Mi Unidad");
        miUnidad_tree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        miUnidad_tree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miUnidad_treeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(miUnidad_tree);

        javax.swing.GroupLayout bg_miUnidadLayout = new javax.swing.GroupLayout(bg_miUnidad);
        bg_miUnidad.setLayout(bg_miUnidadLayout);
        bg_miUnidadLayout.setHorizontalGroup(
            bg_miUnidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_miUnidadLayout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        bg_miUnidadLayout.setVerticalGroup(
            bg_miUnidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_miUnidadLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        getContentPane().add(bg_miUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 580, 470));

        bg_destacados.setBackground(new java.awt.Color(255, 255, 255));

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Destacados");
        destacados_tree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        destacados_tree.setPreferredSize(new java.awt.Dimension(84, 20));
        destacados_tree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                destacados_treeMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(destacados_tree);

        javax.swing.GroupLayout bg_destacadosLayout = new javax.swing.GroupLayout(bg_destacados);
        bg_destacados.setLayout(bg_destacadosLayout);
        bg_destacadosLayout.setHorizontalGroup(
            bg_destacadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_destacadosLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        bg_destacadosLayout.setVerticalGroup(
            bg_destacadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_destacadosLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        getContentPane().add(bg_destacados, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 580, 470));

        bg_papelera.setBackground(new java.awt.Color(255, 255, 255));

        treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Papelera");
        papelera_tree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        papelera_tree.setPreferredSize(new java.awt.Dimension(84, 20));
        papelera_tree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                papelera_treeMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(papelera_tree);

        javax.swing.GroupLayout bg_papeleraLayout = new javax.swing.GroupLayout(bg_papelera);
        bg_papelera.setLayout(bg_papeleraLayout);
        bg_papeleraLayout.setHorizontalGroup(
            bg_papeleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_papeleraLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        bg_papeleraLayout.setVerticalGroup(
            bg_papeleraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_papeleraLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        getContentPane().add(bg_papelera, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 580, 470));

        bg_descarga.setBackground(new java.awt.Color(255, 255, 255));

        link_descarga.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        link_descarga.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout bg_descargaLayout = new javax.swing.GroupLayout(bg_descarga);
        bg_descarga.setLayout(bg_descargaLayout);
        bg_descargaLayout.setHorizontalGroup(
            bg_descargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bg_descargaLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(link_descarga, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(bg_descargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bg_descargaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pbar_descarga, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        bg_descargaLayout.setVerticalGroup(
            bg_descargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_descargaLayout.createSequentialGroup()
                .addComponent(link_descarga, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 67, Short.MAX_VALUE))
            .addGroup(bg_descargaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bg_descargaLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pbar_descarga, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(bg_descarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 580, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_newMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_newMouseClicked
        DefaultTreeModel modelo;
        if (bg_miUnidad.isVisible()) {
            modelo = (DefaultTreeModel) miUnidad_tree.getModel();
        } else {
            modelo = (DefaultTreeModel) destacados_tree.getModel();
        }
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modelo.getRoot();

        int option = JOptionPane.showConfirmDialog(
                this, "??Desea crear una carpeta?", "Crear", JOptionPane.YES_NO_OPTION);
        String nombre;
        String link;
        if (option == JOptionPane.YES_OPTION) {
            nombre = JOptionPane.showInputDialog(this, "Ingrese el nombre:");
            link = cadenaAleatoria(5);
            Carpeta carpeta = new Carpeta(
                    nombre,
                    "dive.google.com/" + link
            );
            carpetas.add(carpeta);
            carpetasBin.escribirBinario(carpeta);

            DefaultMutableTreeNode c = new DefaultMutableTreeNode(carpeta);
            raiz.add(c);
        } else {
            nombre = JOptionPane.showInputDialog(this, "Ingrese el nombre:");
            link = cadenaAleatoria(10);
            Archivo archivo = new Archivo(
                    nombre,
                    "dive.google.com/" + link,
                    JOptionPane.showInputDialog(this, "Ingrese la extensi??n:"),
                    Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese el tama??o:"))
            );
            archivos.add(archivo);
            archivosBin.escribirBinario(archivo);

            DefaultMutableTreeNode a = new DefaultMutableTreeNode(archivo);
            raiz.add(a);
        }
        modelo.reload();
    }//GEN-LAST:event_btn_newMouseClicked

    private void miUnidad_treeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miUnidad_treeMouseClicked
        try {
            if (evt.isMetaDown()) {
                Object v1
                        = miUnidad_tree.getSelectionPath().
                                getLastPathComponent();
                DefaultMutableTreeNode nodo_seleccionado = (DefaultMutableTreeNode) v1;

                if (nodo_seleccionado.getUserObject() instanceof Carpeta) {
                    pp_carpetas.show(miUnidad_tree, evt.getX(), evt.getY());
                } else if (nodo_seleccionado.getUserObject() instanceof Archivo) {
                    pp_archivos.show(miUnidad_tree, evt.getX(), evt.getY());
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_miUnidad_treeMouseClicked

    private void carpetas_moverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carpetas_moverActionPerformed
        try {
            if (bg_miUnidad.isVisible()) {
                mover(miUnidad_tree);
            } else {
                mover(destacados_tree);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_carpetas_moverActionPerformed

    private void archivos_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivos_eliminarActionPerformed
        if (bg_miUnidad.isVisible()) {
            eliminarNodo(miUnidad_tree);
        } else {
            eliminarNodo(destacados_tree);
        }
    }//GEN-LAST:event_archivos_eliminarActionPerformed

    private void carpetas_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carpetas_eliminarActionPerformed
        if (bg_miUnidad.isVisible()) {
            eliminarNodo(miUnidad_tree);
        } else {
            eliminarNodo(destacados_tree);
        }
    }//GEN-LAST:event_carpetas_eliminarActionPerformed

    private void archivos_moverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivos_moverActionPerformed
        try {
            if (bg_miUnidad.isVisible()) {
                mover(miUnidad_tree);
            } else {
                mover(destacados_tree);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_archivos_moverActionPerformed

    private void btn_destacadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_destacadosMouseEntered
        btn_destacados.setBackground(new Color(232, 240, 254));
    }//GEN-LAST:event_btn_destacadosMouseEntered

    private void btn_destacadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_destacadosMouseClicked
        btn_miUnidad.setBackground(new Color(255, 255, 255));
        btn_papelera.setBackground(new Color(255, 255, 255));
        btn_destacados.setBackground(new Color(232, 240, 254));

        bg_destacados.setVisible(true);
        bg_miUnidad.setVisible(false);
        bg_papelera.setVisible(false);
    }//GEN-LAST:event_btn_destacadosMouseClicked

    private void btn_miUnidadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_miUnidadMouseEntered
        btn_miUnidad.setBackground(new Color(232, 240, 254));
    }//GEN-LAST:event_btn_miUnidadMouseEntered

    private void btn_miUnidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_miUnidadMouseClicked
        btn_miUnidad.setBackground(new Color(232, 240, 254));
        btn_papelera.setBackground(new Color(255, 255, 255));
        btn_destacados.setBackground(new Color(255, 255, 255));

        bg_destacados.setVisible(false);
        bg_miUnidad.setVisible(true);
        bg_papelera.setVisible(false);
    }//GEN-LAST:event_btn_miUnidadMouseClicked

    private void btn_papeleraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_papeleraMouseEntered
        btn_papelera.setBackground(new Color(232, 240, 254));
    }//GEN-LAST:event_btn_papeleraMouseEntered

    private void btn_papeleraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_papeleraMouseClicked
        btn_miUnidad.setBackground(new Color(255, 255, 255));
        btn_papelera.setBackground(new Color(232, 240, 254));
        btn_destacados.setBackground(new Color(255, 255, 255));

        bg_destacados.setVisible(false);
        bg_miUnidad.setVisible(false);
        bg_papelera.setVisible(true);
    }//GEN-LAST:event_btn_papeleraMouseClicked

    private void btn_destacadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_destacadosMouseExited
        btn_destacados.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_destacadosMouseExited

    private void btn_miUnidadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_miUnidadMouseExited
        btn_miUnidad.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_miUnidadMouseExited

    private void btn_papeleraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_papeleraMouseExited
        btn_papelera.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_papeleraMouseExited

    private void carpetas_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carpetas_crearActionPerformed
        DefaultTreeModel modelo;
        if (bg_miUnidad.isVisible()) {
            modelo = (DefaultTreeModel) miUnidad_tree.getModel();
        } else {
            modelo = (DefaultTreeModel) destacados_tree.getModel();
        }
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modelo.getRoot();
        Object v1
                = miUnidad_tree.getSelectionPath().
                        getLastPathComponent();
        DefaultMutableTreeNode nodo_seleccionado = (DefaultMutableTreeNode) v1;
        int option = JOptionPane.showConfirmDialog(
                this, "??Desea crear una carpeta?", "Crear", JOptionPane.YES_NO_OPTION);
        String nombre;
        String path = "";
        String link;

        for (Carpeta carpeta : carpetas) {
            //revisa si la carpeta es igual al objeto seleccionado del arbol
            if (carpeta.equals((Carpeta) nodo_seleccionado.getUserObject())) {
                path = carpeta.getLink();
            }
        }
        if (option == JOptionPane.YES_OPTION) {
            nombre = JOptionPane.showInputDialog(this, "Ingrese el nombre:");
            link = cadenaAleatoria(5);
            Carpeta carpeta = new Carpeta(
                    nombre,
                    path.concat(link)
            );
            ((Carpeta)nodo_seleccionado.getUserObject()).getCarpetas().add(carpeta);
            carpetas.add(carpeta);
            carpetasBin.escribirBinario(carpeta);

            DefaultMutableTreeNode c = new DefaultMutableTreeNode(carpeta);
            for (int i = 0; i < raiz.getChildCount(); i++) {
                if (raiz.getChildAt(i).equals(nodo_seleccionado)) {
                    ((DefaultMutableTreeNode) raiz.getChildAt(i)).add(c);
                }
            }
        } else {
            nombre = JOptionPane.showInputDialog(this, "Ingrese el nombre:");
            link = cadenaAleatoria(10);
            Archivo archivo = new Archivo(
                    nombre,
                    path + link,
                    JOptionPane.showInputDialog(this, "Ingrese la extensi??n:"),
                    Integer.parseInt(JOptionPane.showInputDialog(this, "Ingrese el tama??o:"))
            );
            ((Carpeta)nodo_seleccionado.getUserObject()).getArchivos().add(archivo);
            archivos.add(archivo);
            archivosBin.escribirBinario(archivo);

            DefaultMutableTreeNode a = new DefaultMutableTreeNode(archivo);
            for (int i = 0; i < raiz.getChildCount(); i++) {
                if (raiz.getChildAt(i).equals(nodo_seleccionado)) {
                    ((DefaultMutableTreeNode) raiz.getChildAt(i)).add(a);
                }
            }
        }
        modelo.reload();
    }//GEN-LAST:event_carpetas_crearActionPerformed

    private void destacados_treeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_destacados_treeMouseClicked
        try {
            if (evt.isMetaDown()) {
                Object v1
                        = destacados_tree.getSelectionPath().
                                getLastPathComponent();
                DefaultMutableTreeNode nodo_seleccionado = (DefaultMutableTreeNode) v1;

                if (nodo_seleccionado.getUserObject() instanceof Carpeta) {
                    pp_carpetas.show(destacados_tree, evt.getX(), evt.getY());
                } else if (nodo_seleccionado.getUserObject() instanceof Archivo) {
                    pp_archivos.show(destacados_tree, evt.getX(), evt.getY());
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_destacados_treeMouseClicked

    private void papelera_treeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_papelera_treeMouseClicked
        try {
            if (evt.isMetaDown()) {
                pp_papelera.show(papelera_tree, evt.getX(), evt.getY());
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_papelera_treeMouseClicked

    private void restaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaurarActionPerformed
        mover(papelera_tree);
    }//GEN-LAST:event_restaurarActionPerformed

    private void eliminar_papeleraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_papeleraActionPerformed
        Object v1
                = papelera_tree.getSelectionPath().
                        getLastPathComponent();
        DefaultMutableTreeNode nodo_seleccionado = (DefaultMutableTreeNode) v1;

        //elimina del arbol
        DefaultTreeModel modeloArbol = (DefaultTreeModel) papelera_tree.getModel();
        DefaultMutableTreeNode raizArbol = (DefaultMutableTreeNode) modeloArbol.getRoot();
        raizArbol.remove(nodo_seleccionado);
        modeloArbol.reload();

        //elimina del binario
        if (nodo_seleccionado.getUserObject() instanceof Carpeta) {
            try {
                carpetasBin.eliminarDato(nodo_seleccionado.getUserObject());
            } catch (Exception ex) {
            }
        } else {
            try {
                archivosBin.eliminarDato(nodo_seleccionado.getUserObject());
            } catch (Exception ex) {
            }
        }
    }//GEN-LAST:event_eliminar_papeleraActionPerformed

    private void archivos_descargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivos_descargarActionPerformed
        bg_mostrarDescargas.setVisible(true);
        descargar();
    }//GEN-LAST:event_archivos_descargarActionPerformed

    private void salir_descargasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salir_descargasMouseClicked
        bg_mostrarDescargas.setVisible(false);
    }//GEN-LAST:event_salir_descargasMouseClicked

    private void txt_mostrarDescargasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_mostrarDescargasMouseClicked
        mostrar_descargas.setSize(400, 500);
        mostrar_descargas.setLocationRelativeTo(this);
        mostrar_descargas.setVisible(true);

        Object v1;
        if (bg_miUnidad.isVisible()) {
            v1
                    = miUnidad_tree.getSelectionPath().
                            getLastPathComponent();
        } else {
            v1
                    = destacados_tree.getSelectionPath().
                            getLastPathComponent();
        }
        DefaultMutableTreeNode nodo_seleccionado = (DefaultMutableTreeNode) v1;
        descargas.add((Archivo) nodo_seleccionado.getUserObject());

        DefaultTableModel modelo = (DefaultTableModel) table_descargas.getModel();
        Object[] row;
        for (Archivo descarga : descargas) {
            row = new Object[]{descarga.getNombre().concat(descarga.getExtension()), descarga.getLink(), descarga.getTama??o()};
            modelo.addRow(row);
        }
        table_descargas.setModel(modelo);
    }//GEN-LAST:event_txt_mostrarDescargasMouseClicked

    private void descargar() {
        Object v1;
        DefaultMutableTreeNode nodo_seleccionado;
        if (bg_miUnidad.isVisible()) {
            v1 = miUnidad_tree.getSelectionPath().
                    getLastPathComponent();
            nodo_seleccionado = (DefaultMutableTreeNode) v1;
            for (Archivo archivo : archivos) {
                if (archivo.equals((Archivo) nodo_seleccionado.getUserObject())) {
                    link_descarga.setText(archivo.getLink());
                    AdministrarJBar barra = new AdministrarJBar(pbar_descarga, archivo.getTama??o());
                    barra.start();
                }
                bitacora.escribirArchivo(archivo.getNombre().concat(archivo.getExtension()) + "|" + new Date().toString());
            }
        } else {
            v1 = destacados_tree.getSelectionPath().
                    getLastPathComponent();
            nodo_seleccionado = (DefaultMutableTreeNode) v1;
            for (Archivo archivo : archivos) {
                if (archivo.equals((Archivo) nodo_seleccionado.getUserObject())) {
                    link_descarga.setText(archivo.getLink());
                    AdministrarJBar barra = new AdministrarJBar(pbar_descarga, archivo.getTama??o());
                    barra.start();
                }
            }
        }
    }

    private void eliminarNodo(JTree arbol) {
        Object v1
                = arbol.getSelectionPath().
                        getLastPathComponent();
        DefaultMutableTreeNode nodo_seleccionado = (DefaultMutableTreeNode) v1;

        //elimina del arbol
        DefaultTreeModel modeloArbol = (DefaultTreeModel) arbol.getModel();
        DefaultMutableTreeNode raizArbol = (DefaultMutableTreeNode) modeloArbol.getRoot();
        raizArbol.remove(nodo_seleccionado);
        modeloArbol.reload();
        //agrega a la papelera
        DefaultTreeModel modelo = (DefaultTreeModel) papelera_tree.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modelo.getRoot();
        raiz.add((DefaultMutableTreeNode) nodo_seleccionado);
        modelo.reload();
    }

    private void agregarBinarioALista(){
        try {
            carpetasBin.obtenerDatos();
        } catch (Exception ex) {
        }
        try{
            archivosBin.obtenerDatos();
        }catch(Exception e){
        }
        carpetas = carpetasBin.getDatos();
        archivos = archivosBin.getDatos();
        
        DefaultTreeModel modelo = (DefaultTreeModel)miUnidad_tree.getModel();
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode)modelo.getRoot();
        for (Carpeta carpeta : carpetas) {
            DefaultMutableTreeNode nodo = new DefaultMutableTreeNode(carpeta);
            raiz.add(nodo);
            if(carpeta.getCarpetas()!=null || carpeta.getArchivos() != null){
                DefaultMutableTreeNode child;
                for (Archivo a : carpeta.getArchivos()) {
                    child = new DefaultMutableTreeNode(a);
                    nodo.add(child);
                }
                for (Carpeta c : carpeta.getCarpetas()) {
                    System.out.println("hola");
                    child = new DefaultMutableTreeNode(c);
                    nodo.add(child);
                }
                
            }
        }
        for (Archivo archivo : archivos) {
            raiz.add(new DefaultMutableTreeNode(archivo));
        }
        modelo.reload();
    }
    
    private void mover(JTree arbol) {
        Object v1
                = arbol.getSelectionPath().
                        getLastPathComponent();
        DefaultMutableTreeNode nodo_seleccionado = (DefaultMutableTreeNode) v1;
        //elimina del arbol
        DefaultTreeModel modeloArbol = (DefaultTreeModel) arbol.getModel();
        DefaultMutableTreeNode raizArbol = (DefaultMutableTreeNode) modeloArbol.getRoot();
        raizArbol.remove(nodo_seleccionado);
        modeloArbol.reload();

        DefaultTreeModel modelo;
        if (arbol.equals(miUnidad_tree)) {
            //agrega a miUnidad
            modelo = (DefaultTreeModel) destacados_tree.getModel();
        } else if (arbol.equals(papelera_tree)) {
            modelo = (DefaultTreeModel) miUnidad_tree.getModel();
        } else {
            modelo = (DefaultTreeModel) miUnidad_tree.getModel();
        }
        DefaultMutableTreeNode raiz = (DefaultMutableTreeNode) modelo.getRoot();
        raiz.add((DefaultMutableTreeNode) nodo_seleccionado);
        modelo.reload();
    }

    private String cadenaAleatoria(int longitud) {
        String banco = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

        String cadena = "";
        for (int x = 0; x < longitud; x++) {
            int indiceAleatorio = numeroAleatorioEnRango(0, banco.length() - 1);
            char caracterAleatorio = banco.charAt(indiceAleatorio);
            cadena += caracterAleatorio;
        }
        return cadena;
    }

    private int numeroAleatorioEnRango(int minimo, int maximo) {
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            try {
                new GoogleUndead().setVisible(true);
            } catch (Exception ex) {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem archivos_descargar;
    private javax.swing.JMenuItem archivos_eliminar;
    private javax.swing.JMenuItem archivos_mover;
    private javax.swing.JPanel barra_izquierda;
    private javax.swing.JPanel bg_descarga;
    private javax.swing.JPanel bg_destacados;
    private javax.swing.JPanel bg_miUnidad;
    private javax.swing.JPanel bg_mostrarDescargas;
    private javax.swing.JPanel bg_mostrarLista_descargas;
    private javax.swing.JPanel bg_papelera;
    private javax.swing.JPanel btn_destacados;
    private javax.swing.JPanel btn_miUnidad;
    private javax.swing.JButton btn_new;
    private javax.swing.JPanel btn_papelera;
    private javax.swing.JMenuItem carpetas_crear;
    private javax.swing.JMenuItem carpetas_eliminar;
    private javax.swing.JMenuItem carpetas_mover;
    private javax.swing.JTree destacados_tree;
    private javax.swing.JMenuItem eliminar_papelera;
    private javax.swing.JLabel img_logo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel link_descarga;
    private javax.swing.JTree miUnidad_tree;
    private javax.swing.JDialog mostrar_descargas;
    private javax.swing.JTree papelera_tree;
    private javax.swing.JProgressBar pbar_descarga;
    private javax.swing.JPopupMenu pp_archivos;
    private javax.swing.JPopupMenu pp_carpetas;
    private javax.swing.JPopupMenu pp_papelera;
    private javax.swing.JMenuItem restaurar;
    private javax.swing.JLabel salir_descargas;
    private javax.swing.JTable table_descargas;
    private javax.swing.JLabel txt_destacados;
    private javax.swing.JLabel txt_miUnidad;
    private javax.swing.JLabel txt_mostrarDescargas;
    private javax.swing.JLabel txt_papelera;
    // End of variables declaration//GEN-END:variables

    private ArrayList<Carpeta> carpetas = new ArrayList<>();
    private ArrayList<Archivo> archivos = new ArrayList<>();
    private ArrayList<Archivo> descargas = new ArrayList<>();

    ManejoBinarios carpetasBin = new ManejoBinarios("Carpetas.lab7");
    ManejoBinarios archivosBin = new ManejoBinarios("Archivos.lab7");
    ManejoArchivos bitacora = new ManejoArchivos("Bitacora.txt");
}
