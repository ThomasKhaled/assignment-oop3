import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends javax.swing.JFrame {

    
    public MainFrame() {
        initComponents();
        setName("Company");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Company Name");

        jLabel2.setText("Employees Count");

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        jButton1.setText("Add Employee");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Department", "Salary", "Kind Of Employee"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2)
                            .addComponent(jTextField1))))
                .addGap(217, 217, 217))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(240, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
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

        jButton1.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                if(addedEmployees == 0)
                {
                    companyName = jTextField1.getText();
                    employeesCount = Integer.parseInt(jTextField2.getText());
                    company = new Company(companyName);
                }
                if(addedEmployees > employeesCount)
                {
                    /*TO DO: 
                        1-create add employee form and fetch data from it
                        2-update the table
                        3-increment addedEmployees

                    */

                }
                
            }
        });





        
    }















    private static Company company;
    private static String companyName;
    private static int employeesCount;
    private static int addedEmployees = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton jButton1;
    private static javax.swing.JLabel jLabel1;
    private static javax.swing.JLabel jLabel2;
    private static javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable1;
    private static javax.swing.JTextField jTextField1;
    private static javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}


class Company{
    private String m_name;
    private Employee[] m_Employees;
    
    public Company(String name){
        m_name = name;
    }
    public void insertEmployees(Employee [] employees){
       //employees[m_Employees.getEmployeeInfo().m_id] = m_Employees.getEmployeeInfo();
       m_Employees = employees;
    }
    

}

abstract class Employee{
    
    protected final int m_id;
    protected String m_name;
    protected String m_department;
    protected int m_salary;
    
    public Employee(int m_id, String m_name, String m_department, int m_salary) {
        this.m_id = m_id;
        this.m_name = m_name;
        this.m_department = m_department;
        this.m_salary = m_salary;
    }
    
    public abstract Employee getEmployeeInfo();
  
}

class PartTimeEmployee extends Employee{
    private int m_workHours;

    public PartTimeEmployee(int workHours,int id, String name, String department, int salary) {
        super(id, name, department, salary);
        this.m_workHours = workHours;
    }

    @Override
    public Employee getEmployeeInfo() {
        return this;
    }
    
    
}

class FullTimeEmployee extends Employee{
    private int m_insuranceNumber;

    public FullTimeEmployee(int insuranceNumber,int id, String name, String department, int salary) {
        super(id, name, department, salary);
        this.m_insuranceNumber = insuranceNumber;
    }

    @Override
    public Employee getEmployeeInfo() {
        return this;
    }
    
    
}