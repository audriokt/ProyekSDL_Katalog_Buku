
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
// methods with JRootPane 
import javax.swing.*;
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KatalogBuku katalogBuku = new KatalogBuku();
        // Java Program to Implement setContentPane and setJMenuBar 
 

	SwingUtilities.invokeLater(() -> { 
            // Create a JFrame 
            JFrame frame = new JFrame("JRootPane Example"); 
            JRootPane rootPane = frame.getRootPane(); 

            // Step 1: Create a content pane and set it 
            JPanel contentPane = new JPanel(); 
            JLabel label = new JLabel("Selamat Datang di Perpustakaan USD"); 
            contentPane.add(label); 
            rootPane.setContentPane(contentPane); 

            // Step 2: Create a menu bar and set it 
            JMenuBar menuBar = new JMenuBar(); 
            JMenu fileMenu = new JMenu("Menu"); 
            JMenuItem openItem = new JMenuItem("Tambah Buku"); 
            JMenuItem openItem1 = new JMenuItem("Hapus Buku");
            JMenuItem openItem2 = new JMenuItem("Cari Buku");
            JMenuItem openItem3 = new JMenuItem("Cetak Katalog");
            JMenuItem exitItem = new JMenuItem("Exit"); 
            fileMenu.add(openItem);
            fileMenu.add(openItem1);
            fileMenu.add(openItem2);
            fileMenu.add(openItem3);
            fileMenu.add(exitItem); 
            menuBar.add(fileMenu); 
            rootPane.setJMenuBar(menuBar); 

            // Add action listener to the "Tambah Buku" menu item
            openItem.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                   String userInput = JOptionPane.showInputDialog(Main1.class, "Enter something:");
                if (userInput != null) {
                    // Open a new tab or perform any other action here
                    System.out.println("User input: " + userInput);
             
                }
                }
            });
            
            // Add action listener to the "Hapus Buku" menu item
            openItem1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    System.out.print("Masukkan judul buku yang ingin dihapus: ");
                    String judulHapus = scanner.nextLine();
                    katalogBuku.hapusBuku(judulHapus);
                    System.out.println("Buku dengan judul " + judulHapus);
                }
            });
            
            // Add action listener to the "Cari buku" menu item
            openItem2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    System.out.print("Masukkan judul buku yang ingin dicari: ");
                    String judulCari = scanner.nextLine();
                    Buku bukuCari = katalogBuku.cariBuku(judulCari);
                
                    if (bukuCari != null) {
                        System.out.println("Buku ditemukan:");
                        System.out.println(bukuCari);
                    } else {
                        System.out.println("Buku dengan judul " + judulCari + " tidak ditemukan.");
                    }
                }
            });
            
            exitItem.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    System.exit(0);
                }
            });
            
            openItem3.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    System.out.println("Daftar Katalog Buku:");
                    katalogBuku.cetakKatalog();
                }
            });
            
            // Make the frame visible and configure it 
            frame.setSize(400, 400); 
            frame.setDefaultCloseOperation( 
                    JFrame.EXIT_ON_CLOSE); 
            frame.setVisible(true); 
        }); 
	
    }
    
}
