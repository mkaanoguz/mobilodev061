package com.example.mobilodev061;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.io.Serializable;

public class Bilgiler implements Serializable
{
    private String adiSoyadi;
    private String telefonNo;
    private String eMail;
    public Bilgiler(String adiSoyadi, String telefonNo, String eMail){
        this.adiSoyadi = adiSoyadi;
        this.eMail = eMail;
        this.telefonNo = telefonNo;
        }
    public String getAdiSoyadi(){
        return adiSoyadi;
    }
    public String getTelefonNo() {
        return telefonNo;
    }
    public String geteMail(){
        return eMail;
    }


    @Override
    String adiSoyadi = binding.editTextTextAdiSoyadi.getText().toString();
    String eMail= binding.editTextTextEmail.getText().toString();
    String telefonNo= binding.editTextTelefon.getText().toString();
    Bilgiler bilgilerSerializable = new Bilgiler(adiSoyadi,eMail,telefonNo);
    Intent intent = new Intent(this.getApplicationContext(),Activity2.class);
        intent.putExtra("bilgiler",bilgilerSerializable);
    startActivity(intent);
}
}