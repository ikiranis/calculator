/*
 *  File: MainFrame.java
 * 
 * The MIT License
 *
 * Copyright 2022 Yiannis Kyranis <yiannis.kiranis at gmail.com>.
 * https://apps4net.eu
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * 
 *  Date: Jan 23, 2022
 *  Time: 6:42:41 PM
 * 
 * Main form
 *
 */
package calculator;

/**
 *
 * @author Yiannis Kyranis <yiannis.kiranis at gmail.com>
 */
public class MainFrame extends javax.swing.JFrame {

    
    private int op = -1;
    private static double A, B = 0;
    
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        clearBtn = new javax.swing.JButton();
        sevenBtn = new javax.swing.JButton();
        eightBtn = new javax.swing.JButton();
        nineBtn = new javax.swing.JButton();
        divisionBtn = new javax.swing.JButton();
        multiplyBtn = new javax.swing.JButton();
        oneBtn = new javax.swing.JButton();
        fourBtn = new javax.swing.JButton();
        fiveBtn = new javax.swing.JButton();
        sixBtn = new javax.swing.JButton();
        twoBtn = new javax.swing.JButton();
        threeBtn = new javax.swing.JButton();
        subtractionBtn = new javax.swing.JButton();
        zeroBtn = new javax.swing.JButton();
        dotBtn = new javax.swing.JButton();
        tempResult = new javax.swing.JLabel();
        equalBtn = new javax.swing.JButton();
        plusBtn = new javax.swing.JButton();
        number = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setFont(new java.awt.Font("Akaash", 0, 18)); // NOI18N
        setLocation(new java.awt.Point(10, 10));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clearBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        clearBtn.setText("AC");
        clearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearBtnMouseClicked(evt);
            }
        });
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        getContentPane().add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 6, 64, 64));

        sevenBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        sevenBtn.setText("7");
        sevenBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sevenBtnMouseClicked(evt);
            }
        });
        sevenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenBtnActionPerformed(evt);
            }
        });
        getContentPane().add(sevenBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 76, 64, 64));

        eightBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        eightBtn.setText("8");
        eightBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eightBtnMouseClicked(evt);
            }
        });
        eightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightBtnActionPerformed(evt);
            }
        });
        getContentPane().add(eightBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 76, 64, 64));

        nineBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        nineBtn.setText("9");
        nineBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nineBtnMouseClicked(evt);
            }
        });
        nineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineBtnActionPerformed(evt);
            }
        });
        getContentPane().add(nineBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 76, 64, 64));

        divisionBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        divisionBtn.setText("/");
        divisionBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                divisionBtnMouseClicked(evt);
            }
        });
        divisionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionBtnActionPerformed(evt);
            }
        });
        getContentPane().add(divisionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 76, 64, 64));

        multiplyBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        multiplyBtn.setText("Χ");
        multiplyBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                multiplyBtnMouseClicked(evt);
            }
        });
        multiplyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyBtnActionPerformed(evt);
            }
        });
        getContentPane().add(multiplyBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 146, 64, 64));

        oneBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        oneBtn.setText("1");
        oneBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oneBtnMouseClicked(evt);
            }
        });
        oneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneBtnActionPerformed(evt);
            }
        });
        getContentPane().add(oneBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 216, 64, 64));

        fourBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        fourBtn.setText("4");
        fourBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fourBtnMouseClicked(evt);
            }
        });
        fourBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourBtnActionPerformed(evt);
            }
        });
        getContentPane().add(fourBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 146, 64, 64));

        fiveBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        fiveBtn.setText("5");
        fiveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fiveBtnMouseClicked(evt);
            }
        });
        fiveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveBtnActionPerformed(evt);
            }
        });
        getContentPane().add(fiveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 146, 64, 64));

        sixBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        sixBtn.setText("6");
        sixBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sixBtnMouseClicked(evt);
            }
        });
        sixBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixBtnActionPerformed(evt);
            }
        });
        getContentPane().add(sixBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 146, 64, 64));

        twoBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        twoBtn.setText("2");
        twoBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twoBtnMouseClicked(evt);
            }
        });
        twoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(twoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 216, 64, 64));

        threeBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        threeBtn.setText("3");
        threeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                threeBtnMouseClicked(evt);
            }
        });
        threeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(threeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 216, 64, 64));

        subtractionBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        subtractionBtn.setText("-");
        subtractionBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                subtractionBtnMouseClicked(evt);
            }
        });
        subtractionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractionBtnActionPerformed(evt);
            }
        });
        getContentPane().add(subtractionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 216, 64, 64));

        zeroBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        zeroBtn.setText("0");
        zeroBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zeroBtnMouseClicked(evt);
            }
        });
        zeroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroBtnActionPerformed(evt);
            }
        });
        getContentPane().add(zeroBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 286, 64, 64));

        dotBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        dotBtn.setText(".");
        dotBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dotBtnMouseClicked(evt);
            }
        });
        dotBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotBtnActionPerformed(evt);
            }
        });
        getContentPane().add(dotBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 286, 64, 64));

        tempResult.setFont(new java.awt.Font("Dialog", 1, 9)); // NOI18N
        tempResult.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tempResult.setText("0");
        getContentPane().add(tempResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 180, -1));
        tempResult.getAccessibleContext().setAccessibleParent(number);

        equalBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        equalBtn.setText("=");
        equalBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                equalBtnMouseClicked(evt);
            }
        });
        equalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalBtnActionPerformed(evt);
            }
        });
        getContentPane().add(equalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 286, 64, 64));

        plusBtn.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        plusBtn.setText("+");
        plusBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plusBtnMouseClicked(evt);
            }
        });
        plusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusBtnActionPerformed(evt);
            }
        });
        getContentPane().add(plusBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 286, 64, 64));

        number.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        number.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        number.setText("0");
        number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberActionPerformed(evt);
            }
        });
        getContentPane().add(number, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 200, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Add string to number text field
    private void addToNumber(String Number) {
        if (Number.equals(".")) {
            if (number.getText().contains(".")) {
                return; 
            }
        }
        
        if (number.getText().equals("0")) {
            number.setText("");
        }
        
        number.setText(number.getText() + Number);
    }
    
    private void compute(int op) {
        Operation operation = null;
        
        if (this.op >= 0) {
            B = Double.parseDouble(number.getText());
            
            switch (this.op) {
                case 0:
                    operation = new Sum(A, B);
                    break;
                case 1:
                    operation = new Sub(A, B);
                    break;
                case 2:
                    operation = new Multiply(A, B);
                    break;
                case 3:
                    operation = new Division(A, B); break;
            }
            
            A = operation.compute();
            B = 0;
            
            if(op == -1) {
                number.setText(String.format("%.0f", A));
            } else {
                number.setText("");
                tempResult.setText(String.format("%.0f", A));
            }
        } else {
            A = number.getText().equals("") ? A : Double.parseDouble(number.getText());
            
            number.setText("");
        }
        
        this.op = op;
        
        System.out.printf("A: %f B: %f Op: %d\n", A, B, this.op);
    }
    
    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearBtnActionPerformed

    private void sevenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sevenBtnActionPerformed

    private void eightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eightBtnActionPerformed

    private void nineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nineBtnActionPerformed

    private void divisionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_divisionBtnActionPerformed

    private void multiplyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_multiplyBtnActionPerformed

    private void oneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oneBtnActionPerformed

    private void fourBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fourBtnActionPerformed

    private void fiveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fiveBtnActionPerformed

    private void sixBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sixBtnActionPerformed

    private void twoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_twoBtnActionPerformed

    private void threeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_threeBtnActionPerformed

    private void subtractionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractionBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subtractionBtnActionPerformed

    private void zeroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zeroBtnActionPerformed

    private void dotBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dotBtnActionPerformed

    private void equalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_equalBtnActionPerformed

    private void plusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plusBtnActionPerformed

    private void numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberActionPerformed

    private void sevenBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sevenBtnMouseClicked
        addToNumber("7");
    }//GEN-LAST:event_sevenBtnMouseClicked

    private void eightBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eightBtnMouseClicked
        addToNumber("8");
    }//GEN-LAST:event_eightBtnMouseClicked

    private void nineBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nineBtnMouseClicked
        addToNumber("9");
    }//GEN-LAST:event_nineBtnMouseClicked

    private void fourBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fourBtnMouseClicked
        addToNumber("4");
    }//GEN-LAST:event_fourBtnMouseClicked

    private void fiveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fiveBtnMouseClicked
        addToNumber("5");
    }//GEN-LAST:event_fiveBtnMouseClicked

    private void sixBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sixBtnMouseClicked
        addToNumber("6");
    }//GEN-LAST:event_sixBtnMouseClicked

    private void oneBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oneBtnMouseClicked
        addToNumber("1");
    }//GEN-LAST:event_oneBtnMouseClicked

    private void twoBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twoBtnMouseClicked
        addToNumber("2");
    }//GEN-LAST:event_twoBtnMouseClicked

    private void threeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_threeBtnMouseClicked
        addToNumber("3");
    }//GEN-LAST:event_threeBtnMouseClicked

    private void zeroBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zeroBtnMouseClicked
        addToNumber("0");
    }//GEN-LAST:event_zeroBtnMouseClicked

    private void dotBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dotBtnMouseClicked
        addToNumber(".");
    }//GEN-LAST:event_dotBtnMouseClicked

    private void equalBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_equalBtnMouseClicked
        compute(-1);
    }//GEN-LAST:event_equalBtnMouseClicked

    private void plusBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plusBtnMouseClicked
        compute(0);
    }//GEN-LAST:event_plusBtnMouseClicked

    private void subtractionBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subtractionBtnMouseClicked
        compute(1);
    }//GEN-LAST:event_subtractionBtnMouseClicked

    private void multiplyBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiplyBtnMouseClicked
        compute(2);
    }//GEN-LAST:event_multiplyBtnMouseClicked

    private void divisionBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_divisionBtnMouseClicked
        compute(3);
    }//GEN-LAST:event_divisionBtnMouseClicked

    private void clearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearBtnMouseClicked
        number.setText("0");
        tempResult.setText("0");
        A = 0; B = 0; op = -1; 
    }//GEN-LAST:event_clearBtnMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton divisionBtn;
    private javax.swing.JButton dotBtn;
    private javax.swing.JButton eightBtn;
    private javax.swing.JButton equalBtn;
    private javax.swing.JButton fiveBtn;
    private javax.swing.JButton fourBtn;
    private javax.swing.JButton multiplyBtn;
    private javax.swing.JButton nineBtn;
    private javax.swing.JTextField number;
    private javax.swing.JButton oneBtn;
    private javax.swing.JButton plusBtn;
    private javax.swing.JButton sevenBtn;
    private javax.swing.JButton sixBtn;
    private javax.swing.JButton subtractionBtn;
    private javax.swing.JLabel tempResult;
    private javax.swing.JButton threeBtn;
    private javax.swing.JButton twoBtn;
    private javax.swing.JButton zeroBtn;
    // End of variables declaration//GEN-END:variables
}
