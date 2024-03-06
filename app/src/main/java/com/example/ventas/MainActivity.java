package com.example.ventas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }// Fin onCreate

    public void Clientes (View view){
        Intent intClientes = new Intent(this,ClientesActivity.class);
        startActivity(intClientes);
    }//Fin metodo Clientes

    public void Vehiculos(View view){
        Intent intVehiculos=new Intent(this,VehiculosActivity.class);
        startActivity(intVehiculos);
    }//Fin metodo Vehiculos

    public void Facturas(View view){
        Intent intfacturas=new Intent(this,FacturasActivity.class);
        startActivity(intfacturas);
    }//Fin metodo Facturas

}
