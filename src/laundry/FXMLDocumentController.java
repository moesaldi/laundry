/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.event.ActionEvent;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


/**
 *
 * @author karepwes
 */

public class FXMLDocumentController {

    @FXML
    private TextField nama;

    @FXML
    private TextField alamat;

    @FXML
    private TextField berat;

    @FXML
    private Button submit;

    @FXML
    private TextArea hasil;

    @FXML
    private TextField nomor;

    @FXML
    private TextField ambil;

    @FXML
    private RadioButton cucikering;

    @FXML
    private RadioButton setrika;

    @FXML
    private RadioButton cucikeringsetrika;

    @FXML
    private Button hapus;

    @FXML
    void hapus(ActionEvent event) {
        hasil.setText(" ");
    }

    @FXML
    void submit(ActionEvent event) {
        String paket;
        int harga=0;
        if(cucikering.isSelected()){
            paket="Cuci Kering";
            harga=5000;
        }
        else if(setrika.isSelected()){
            paket="Setrika";
            harga=4000;
        }
        else if(cucikeringsetrika.isSelected()){
            paket="Cuci Kering Setrika";
            harga=8000;
            
        }
        else{
            paket=" ";
            harga=0;
        }
        
        
        String Nama = nama.getText();
        String Alamat = alamat.getText();
        String Berat = berat.getText();
        String Nomor = nomor.getText();
        
        String Ambil = ambil.getText();

        hasil.setText("Nama : "+Nama+"\n"+"\n"+"Alamat : "+Alamat+"\n"+"Berat cucian : "+Berat+"\n"+"Nomor Telepon : "+Nomor+"\n"+"Paket Cucian : "+paket+"\n"+"Tanggal Pengambilan : "+Ambil+"\n"+"Harga : Rp "+harga);
    }

}
