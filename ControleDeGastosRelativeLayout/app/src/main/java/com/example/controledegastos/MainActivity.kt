package com.example.controledegastos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.controledegastos.databinding.ActivityMainBinding
import android.view.View;
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root);

        binding.botaoCalcula.setOnClickListener(this);
    }

    override fun onClick(view: View) {
        if (view.id == R.id.botao_calcula) {
            buttonCalcula()
        }
    }

    fun buttonCalcula(){
        try{
            val distancia = binding.editDistancia.text.toString().toFloat();
            val preco = binding.editPreco.text.toString().toFloat();
            val autonomia = binding.editAutonomia.text.toString().toFloat();

            val gasto = distancia / autonomia * preco;

            binding.gasto.text = String.format("R$%.2f", gasto);
        }catch(e:Exception){
            Toast.makeText(this, "Favor informar todos os valores",Toast.LENGTH_SHORT).show()
        }


    }

}