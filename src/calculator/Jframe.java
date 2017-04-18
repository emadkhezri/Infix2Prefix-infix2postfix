
package calculator;
import javax.swing.JOptionPane;



public class Jframe extends javax.swing.JFrame {

    private String AboutString="This is a Calculator application which gets"+
                    " a infix expression\n"+
                    "and calculates prefix and postfix expressions"+
                    " also calculating\n the result\n\n"+"The Math operators are:\n"
            +"Sin\nCos\ntan\ncot\nsqr (square)\n% (reminder)\n* (multiply)\n / (divide)\n"+
            "+ (sum)\n- (sub)\n\n"+"                    Programmer:\n"
            + "                         Emad Khezri\n"
            + "                         e.khezri@outlook.com\n";
                    
    public Jframe() {
        
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Infix_textbox = new javax.swing.JTextField();
        in2pos_button = new javax.swing.JButton();
        postfix_textbox = new javax.swing.JTextField();
        prefix_textbox = new javax.swing.JTextField();
        answer_textbox = new javax.swing.JTextField();
        in2pre_button = new javax.swing.JButton();
        Calculate_button = new javax.swing.JButton();
        infix_label = new javax.swing.JLabel();
        postfix_label = new javax.swing.JLabel();
        prefix_label = new javax.swing.JLabel();
        answer_label = new javax.swing.JLabel();
        calculator_label = new javax.swing.JLabel();
        about_button = new javax.swing.JButton();
        exit_button = new javax.swing.JButton();
        label1 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(300, 600));
        setName("Calculator_form");
        setResizable(false);

        in2pos_button.setText("infix to postfix");
        in2pos_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in2pos_buttonActionPerformed(evt);
            }
        });

        postfix_textbox.setBackground(new java.awt.Color(204, 204, 204));
        postfix_textbox.setEditable(false);

        prefix_textbox.setBackground(new java.awt.Color(204, 204, 204));
        prefix_textbox.setEditable(false);
        prefix_textbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prefix_textboxActionPerformed(evt);
            }
        });

        answer_textbox.setBackground(new java.awt.Color(204, 204, 204));
        answer_textbox.setEditable(false);
        answer_textbox.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N

        in2pre_button.setText("infix to prefix");
        in2pre_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                in2pre_buttonActionPerformed(evt);
            }
        });

        Calculate_button.setText("Calculate");
        Calculate_button.setEnabled(false);
        Calculate_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calculate_buttonActionPerformed(evt);
            }
        });

        infix_label.setText("infix expression:");
        infix_label.setToolTipText("");

        postfix_label.setText("postfix expression:");
        postfix_label.setToolTipText("");

        prefix_label.setText("prefix expression:");
        prefix_label.setToolTipText("");

        answer_label.setText("answer:");
        answer_label.setToolTipText("");

        calculator_label.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36)); // NOI18N
        calculator_label.setForeground(new java.awt.Color(0, 51, 153));
        calculator_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        calculator_label.setText("Calculator");
        calculator_label.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        about_button.setBackground(new java.awt.Color(204, 255, 102));
        about_button.setText("About");
        about_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                about_buttonActionPerformed(evt);
            }
        });

        exit_button.setBackground(new java.awt.Color(255, 102, 102));
        exit_button.setText("Exit");
        exit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_buttonActionPerformed(evt);
            }
        });

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        label1.setName("");
        label1.setText("infix to postfix & infix to prefix");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(postfix_label)
                            .addComponent(infix_label)
                            .addComponent(answer_label)
                            .addComponent(prefix_label))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(answer_textbox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prefix_textbox)
                            .addComponent(postfix_textbox, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Infix_textbox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(in2pos_button)
                                .addGap(30, 30, 30)
                                .addComponent(in2pre_button))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(label1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(calculator_label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Calculate_button, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(about_button)
                            .addComponent(exit_button, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(infix_label)
                    .addComponent(Infix_textbox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(postfix_textbox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(postfix_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prefix_textbox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prefix_label))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answer_label)
                    .addComponent(answer_textbox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(in2pos_button)
                    .addComponent(in2pre_button)
                    .addComponent(Calculate_button))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(about_button)
                        .addGap(18, 18, 18)
                        .addComponent(exit_button))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calculator_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prefix_textboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prefix_textboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prefix_textboxActionPerformed

    private void exit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_buttonActionPerformed
        // TODO add your handling code here:
        setVisible(false);//Hide the window
        dispose();//Release all the resourse
        System.exit(0);//exit the program
    }//GEN-LAST:event_exit_buttonActionPerformed

    private void about_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_about_buttonActionPerformed
            JOptionPane.showMessageDialog(null,AboutString,"About",1);
    }//GEN-LAST:event_about_buttonActionPerformed

    private void in2pos_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in2pos_buttonActionPerformed
                    Expression Exp = new Expression(); //declare expression class
                    int Length=Infix_textbox.getText().toString().length();//Length of infix TextBox
                    String InfixExp = Infix_textbox.getText().toString();//Infix TextBox text
                    Exp.setInfix(InfixExp,Length);
                    Exp.setPostfix(Exp.convert(Exp.getInfix()));
                    postfix_textbox.setText(Exp.getPostfix());
                    if(postfix_textbox.getText().isEmpty())
                        Calculate_button.setEnabled(false);
                    else
                        Calculate_button.setEnabled(true);
    }//GEN-LAST:event_in2pos_buttonActionPerformed

    private void in2pre_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_in2pre_buttonActionPerformed
                    Expression Exp = new Expression(); //declare expression class
                    int Length=Infix_textbox.getText().toString().length();//Length of infix TextBox
                    String InfixExp = Infix_textbox.getText().toString();//Infix TextBox text
                    Exp.setInfix(InfixExp,Length);
                    String reveresedPrefix=Exp.convert(Exp.ReverseExpression(Exp.getInfix()));
                    Exp.setPrefix(Exp.ReverseExpression(reveresedPrefix));
                    prefix_textbox.setText(Exp.getPrefix());
                    if(postfix_textbox.getText().isEmpty())
                        Calculate_button.setEnabled(false);
                    else
                        Calculate_button.setEnabled(true);
    }//GEN-LAST:event_in2pre_buttonActionPerformed

    private void Calculate_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calculate_buttonActionPerformed
        Expression Exp=new Expression();
        double result=Exp.CalculatePostfix(postfix_textbox.getText().toString());
        answer_textbox.setText(String.valueOf(result));
    }//GEN-LAST:event_Calculate_buttonActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Jframe().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calculate_button;
    private javax.swing.JTextField Infix_textbox;
    private javax.swing.JButton about_button;
    private javax.swing.JLabel answer_label;
    private javax.swing.JTextField answer_textbox;
    private javax.swing.JLabel calculator_label;
    private javax.swing.JButton exit_button;
    private javax.swing.JButton in2pos_button;
    private javax.swing.JButton in2pre_button;
    private javax.swing.JLabel infix_label;
    private java.awt.Label label1;
    private javax.swing.JLabel postfix_label;
    private javax.swing.JTextField postfix_textbox;
    private javax.swing.JLabel prefix_label;
    private javax.swing.JTextField prefix_textbox;
    // End of variables declaration//GEN-END:variables
}
