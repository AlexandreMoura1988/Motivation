package com.example.motivation.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.motivation.R
import com.example.motivation.infra.MotivationConstante
import com.example.motivation.infra.SecurityPreferences
import kotlinx.android.synthetic.main.activity_splah.*


// splashActivity é o primeiro screen que o utilizador ira ver, trocar no manifests
class SplahActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var mSecurityPreferences: SecurityPreferences

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splah)

        mSecurityPreferences = SecurityPreferences(this)

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

            mSecurityPreferences.storeString(MotivationConstante.KEY.PERSON_NAME, name)
            //Navegaçao entre activities
            startActivity(Intent(this, MainActivity::class.java))

        } else {
            Toast.makeText(this, "Name cannot be empty", Toast.LENGTH_SHORT)
        }
    }
}