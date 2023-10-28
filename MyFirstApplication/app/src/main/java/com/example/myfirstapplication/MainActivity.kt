package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import com.example.myfirstapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root);
        binding.submitArea.setOnClickListener(this);

        binding.textMessage.text = "Text changed!"
    }

    override fun onClick(view: View) {
        if (view.id == R.id.submit_area){
            submitButton()

        }
    }

    fun submitButton(){
        var sum: Int

        sum = binding.editPhone.text.toString().toInt();
        sum += binding.editNumber.text.toString().toInt()
        Toast.makeText(this, "SHOW TEXT", Toast.LENGTH_SHORT)
    }
}

