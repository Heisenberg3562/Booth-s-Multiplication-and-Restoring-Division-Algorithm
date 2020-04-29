/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booth;

import java.awt.Color;
import java.util.Scanner;

/**
 *
 * @author Omkar
 */
public class BoothUI extends javax.swing.JFrame {

    /**
     * Creates new form BoothUI
     */
    public BoothUI() {
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

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(69, 90, 100));
        jPanel1.setMaximumSize(new java.awt.Dimension(500, 200));
        jPanel1.setMinimumSize(new java.awt.Dimension(500, 200));

        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("VALUE OF A:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("VALUE OF B:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Booth's Algorithm", "Restoring Division Algorithm" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("CHOOSE ALGORITHM:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("CHOOSE MODE:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Simple", "Debug" }));
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton1.setText("COMPUTE");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(217, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Booth's Algorithm and Restoring Division Algorithm Simulation");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boothButton(){
        // variables
        int q=0,i,j, a, b, temp;
        int[] A={0,0,0,0,0,0,0,0},C={0,0,0,0,0,0,0,1},C1={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};
        int s=0,z=0;
        int[] Q=new int[8]; 
        int[] M=new int[8];
        int[] temp1=new int [8];
        int[] ans=new int[16];
        int y,x=0, c=0, v, w;
        
        jTextArea1.setForeground(Color.black);
        jTextArea1.setText("");
        
        if(jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty()) {
            
            jTextArea1.setForeground(Color.red);
            jTextArea1.append("\nError! Please enter the multiplicant and the multiplier!");
        }
        else {
        a = Integer.parseInt(this.jTextField1.getText());
        b = Integer.parseInt(this.jTextField2.getText());
        if(Booth.verify(a).compareTo("true") != 0 || Booth.verify(b).compareTo("true") != 0) {
            jTextArea1.setForeground(Color.red);
            if(Booth.verify(a).compareTo("true") != 0)
            jTextArea1.append(Booth.verify(a));
            else
            jTextArea1.append(Booth.verify(b));
        }
        else {

        Booth.binary(a,M);
        Booth.binary(b,Q);
       
        jTextArea1.append("\nTHE BINARY EQUIVALENT OF "+a+" IS : ");
        for(i=0;i< 8;i++)
            jTextArea1.append(Integer.toString(M[i]));
        
        jTextArea1.append("\nTHE BINARY EQUIVALENT OF "+b+" IS : ");
        for(i=0;i< 8;i++)
            jTextArea1.append(Integer.toString(Q[i]));
        
        if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
            jTextArea1.append("\n\n---------------------------------------------------\n");
        
        
        
        if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
            jTextArea1.append(" OPERATION\t\t A\t Q\t Q'\t M");  // begining computation
        
        if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
            jTextArea1.append("\n\n INITIAL\t\t");
        for(i=0;i< 8;i++)
            if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
            jTextArea1.append(Integer.toString(A[i]));
        
        if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
            jTextArea1.append("\t");
        
        for(i=0;i< 8;i++)
            if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
            jTextArea1.append(Integer.toString(Q[i])); 
        
        if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) { // debug mode
        jTextArea1.append("\t");
        jTextArea1.append(q+"\t");
        }
        
        for(i=0;i< 8;i++)
            if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
            jTextArea1.append(Integer.toString(M[i]));
        
        for(j=0;j< 8;j++) { // compute
            
            if((Q[7]==0)&&(q==1)) {
                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                    jTextArea1.append("\n A=A+M \t\t");
                Booth.add(A,M);
                
                for(i=0;i< 8;i++)
                    if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                        jTextArea1.append(Integer.toString(A[i]));
                
                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                    jTextArea1.append("\t");
                
                for(i=0;i< 8;i++)
                    if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                        jTextArea1.append(Integer.toString(Q[i]));

                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                    jTextArea1.append("\t"+q+"\t");

                for(i=0;i< 8;i++)
                    if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                        jTextArea1.append(Integer.toString(M[i]));
            }

            if((Q[7]==1)&&(q==0)) { // second condition
                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                    jTextArea1.append("\n A=A-M \t\t");

                for(i=0;i< 8;i++)
                    temp1[i] = 1-M[i];

                Booth.add(temp1,C);
                Booth.add(A,temp1);

                for(i=0;i< 8;i++)
                    if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                        jTextArea1.append(Integer.toString(A[i]));

                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                    jTextArea1.append("\t");
                
                for(i=0;i< 8;i++)
                    if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                        jTextArea1.append(Integer.toString(Q[i]));
                
                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                    jTextArea1.append("\t"+q+"\t");
                
                for(i=0;i< 8;i++)
                    if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                        jTextArea1.append(Integer.toString(M[i]));
            }

            if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                jTextArea1.append("\n Shift \t\t");

            y = A[7];
            q = Q[7];

            Booth.rshift(A[0],A);
            Booth.rshift(y,Q);

            for(i=0;i< 8;i++)
                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                    jTextArea1.append(Integer.toString(A[i]));

            if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                jTextArea1.append("\t");

            for(i=0;i< 8;i++)
                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
                    jTextArea1.append(Integer.toString(Q[i]));

           if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) { // debug mode
           jTextArea1.append("\t");
           jTextArea1.append(q+"\t");
           }
           
           for(i=0;i< 8;i++)
               if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0) // debug mode
               jTextArea1.append(Integer.toString(M[i]));

        }
        
        jTextArea1.append("\n\n---------------------------------------------------\n");
        jTextArea1.append("\nTHE ANSWER IN BINARY IS : ");
        
        for(i=0;i< 8;i++)
            ans[i]=A[i];
        
        for(i=0;i< 8;i++)
            ans[i+8]=Q[i];
        
        if(((a< 0)&&(b>0))||((a>0)&&(b< 0))) {
            
            for(i=0;i< 16;i++)
                ans[i]=1-ans[i];
            
            for(i=15;i>=0;i--) {
                x = ans[i];
                ans[i]=c^x^C1[i];
                
                if(((c==1)&&(x==1))||((x==1)&&(C1[i]==1))||((C1[i]==1)&&(c==1)))
                    c=1;
                
                else
                    c=0;
            }

        }
        
        for(i=0;i< 16;i++)
            jTextArea1.append(Integer.toString(ans[i]));
        
        for(i=15;i>=0;i--) { //  conversion to decimal
            s = s + ((int)Math.pow(2,z) * ans[i]);
            z = z+1;
        }

        if(((a< 0)&&(b>0))||((a>0)&&(b< 0)))
            jTextArea1.append("\nTHE ANSWER IN DECIMAL IS :- "+s+"\n");
        else
            jTextArea1.append("\nTHE ANSWER IN DECIMAL IS : "+s+"\n");
        
        }
        }
        
        
    }
    
    private void restoringButton(){
        Scanner src=new Scanner(System.in);
        int B,Q,Z,M,c,c1,i,j,x,y,ch,in,S,G,P;
        int[] a=new int[24];
        int[] b=new int[12];
        int[] b1=new int[12];
        int[] q=new int[12];
        int carry=0,count=0,option;
        long num;
        
        jTextArea1.setForeground(Color.black);
        jTextArea1.setText("");
        
        if(jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty()) {
            jTextArea1.setForeground(Color.red);
            jTextArea1.append("\nError! Please enter the Dividend and the Divisor!");
        }
        else if(Integer.parseInt(jTextField1.getText()) < 0 || Integer.parseInt(jTextField2.getText()) < 0){
            jTextArea1.setForeground(Color.red);
            jTextArea1.append("\nError! Dividend or Divisor should not be Negative!");
        }
        else if(Integer.parseInt(jTextField1.getText()) < Integer.parseInt(jTextField2.getText())){
            jTextArea1.setForeground(Color.red);
            jTextArea1.append("\nError! Dividend should be greater than Divisor!");
        }
        else if(Integer.parseInt(jTextField1.getText()) >= 512 || Integer.parseInt(jTextField2.getText()) >= 512){
            jTextArea1.setForeground(Color.red);
            jTextArea1.append("\nError! Dividend and Divisor should be less than 512!");
        }
        else if(Integer.parseInt(jTextField2.getText()) == 0){
            jTextArea1.setForeground(Color.red);
            jTextArea1.append("\nError! Cannot Divide By Zero!");
        }
        else {
            Q = Integer.parseInt(this.jTextField1.getText());
            M = Integer.parseInt(this.jTextField2.getText());
            y = ResDiv.getsize(Q);
            x = ResDiv.getsize(M);
            Z = ResDiv.max(x,y);
            if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0){
                jTextArea1.append("\n\tTOTAL BITS CONSIDERED FOR RESULT => "+(2*Z+1));
                jTextArea1.append("\n\tINITIALLY A IS RESET TO ZERO : ");
            }
            for(i=0;i<=Z;i++)
                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0)
                    jTextArea1.append(String.valueOf(a[i]=0));
            for(i=Z;i>=0;i--){
                b1[i] = b[i] = M%2;
                M = M/2;
                b1[i] = 1-b1[i];
            }
            carry = 1;
            for(i=Z;i>=0;i--){
                c1 = b1[i]^carry;
                carry = b1[i]&carry;
                b1[i]=c1;
            }
            for(i=2*Z;i>Z;i--){
                a[i] = Q%2;
                Q = Q/2;
            }
            if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0)
                jTextArea1.append("\n\n\tDivisor\t(M)\t: ");
            for(i=0;i<=Z;i++)
                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0)
                    jTextArea1.append(b[i]+" ");
            if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0)
                jTextArea1.append("\n\t2'C Divisor\t(M')\t: ");
            for(i=0;i<=Z;i++)
                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0)
                    jTextArea1.append(b1[i]+" ");
            if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0)
                jTextArea1.append("\n\tDividend\t(Q)\t: ");
            for(i=Z+1;i<=2*Z;i++)
                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0)
                    jTextArea1.append(a[i]+" ");
            if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0){
                jTextArea1.append("\n\nBITS CONSIDERED:\t[ A ] \t[ Q ]");
                jTextArea1.append("\n\t\t");
            }
            for(i=0;i<=Z;i++)
                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0)
                    jTextArea1.append(a[i]+" ");
            if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0)
                jTextArea1.append("\t");
            for(i=Z+1;i<=2*Z;i++)
                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0)
                    jTextArea1.append(a[i]+" ");
            count = Z;
            do{
                for(i=0;i<2*Z;i++)
                    a[i] = a[i+1];
                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0)
                    jTextArea1.append("\n\nLeft Shift\t\t");
                for(i=0;i<=Z;i++)
                    if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0)
                        jTextArea1.append(a[i]+" ");
                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0)
                    jTextArea1.append("\t");
                for(i=Z+1;i<2*Z;i++)
                    if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0)
                        jTextArea1.append(a[i]+" ");
                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0)
                    jTextArea1.append(" _");
                carry=0;
                for(i=Z;i>=0;i--){
                    S=a[i]^(b1[i]^carry);  
                    G=a[i]&b1[i];
                    P=a[i]^b1[i];
                    carry=G|(P&carry);
                    a[i]=S ;
                }
                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0)
                    jTextArea1.append("\nA< A-M \t\t");
                for(i=0;i<=Z;i++)
                    if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0)
                        jTextArea1.append(a[i]+" ");
                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0)
                    jTextArea1.append("\t");
                for(i=Z+1;i<2*Z;i++)
                    if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0)
                        jTextArea1.append(a[i]+" ");
                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0)
                    jTextArea1.append(" _");
                ch=a[0];
                if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0)
                    jTextArea1.append("\nBIT Q:"+ch);
                switch (ch){
                    case 0: a[2*Z]=1;
                        if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0)
                            jTextArea1.append(" Q0< -1\t\t");
                        for(i=0;i<=Z;i++)
                            if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0)
                                jTextArea1.append(a[i]+" ");
                        if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0)
                            jTextArea1.append("\t");
                        for(i=Z+1;i<=2*Z;i++)
                            if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0)
                                jTextArea1.append(a[i]+" ");
                        break;

                    case 1: a[2*Z]=0;
                        if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0)
                            jTextArea1.append(" Q0< 0\t\t");
                        for(i=0;i<=Z;i++)
                            if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0)
                                jTextArea1.append(a[i]+" ");
                        if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0)
                            jTextArea1.append("\t");
                        for(i=Z+1;i<2*Z;i++)
                            if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0)
                                jTextArea1.append(a[i]+" ");
                        if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0)
                            jTextArea1.append(" _");
                        carry=0;
                        for(i=Z;i>=0;i--){
                            S=a[i]^(b[i]^carry);
                            G=a[i]&b[i];
                            P=a[i]^b[i];
                            carry=G|(P&carry);
                            a[i]=S ;
                        }
                        if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0){
                            jTextArea1.append("\nA< -A+M");
                            jTextArea1.append("\t\t");
                        }
                        for(i=0;i<=Z;i++)
                            if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0)
                                jTextArea1.append(a[i]+" ");
                        if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0)
                            jTextArea1.append("\t");
                        for(i=Z+1;i<=2*Z;i++)
                            if(jComboBox2.getSelectedItem().toString().compareTo("Simple") != 0)
                                jTextArea1.append(a[i]+" ");
                        break;
                }
                count--;
            }while(count!=0);
            num=0;
            jTextArea1.append("\n\n\t\t< < QUOTIENT IN BITS>> :");
            for(i=Z+1;i<=2*Z;i++){
                jTextArea1.append(a[i]+" ");
                num=num+(int)Math.pow(2,2*Z-i)*a[i];
            }
            jTextArea1.append("\n\t\tQUOTIENT IN DECIMAL :"+num);
            num=0;
            jTextArea1.append("\n\t\t< < REMAINDER IN BITS>>:");
            for(i=0;i<=Z;i++){
                jTextArea1.append(a[i]+" ");
                num=num+(int)Math.pow(2,Z-i)*a[i];
            }
            jTextArea1.append("\n\t\tREMAINDER IN DECIMAL :"+num);
        }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if(jComboBox1.getSelectedItem().toString().compareTo("Booth's Algorithm") == 0)
            boothButton();
        else
            restoringButton();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(BoothUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BoothUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BoothUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BoothUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BoothUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
