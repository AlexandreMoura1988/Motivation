package com.example.motivation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_splah.*


// splashActivity é o primeiro screen que o utilizador ira ver, trocar no manifests
class SplahActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splah)

        //retirar a actionBar
        if(supportActionBar != null) {
            supportActionBar!!.hide()
        }

       buttonSave.setOnClickListener(this)

    }

    override fun onClick(v: View?) {

        val id = v?.id
        if(id == R.id.buttonSave) {
            handleSave()
        }
    }

    private fun handleSave() {

        val name = editName.text.toString()
        if(name != "") {
            //Navegaçao entre activities
            startActivity(Intent(this, MainActivity::class.java))

        } else {
            Toast.makeText(this, "Name cannot be empty", Toast.LENGTH_SHORT)
        }
    }
}