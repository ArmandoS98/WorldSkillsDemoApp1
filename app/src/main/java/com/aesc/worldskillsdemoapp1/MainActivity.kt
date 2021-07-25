package com.aesc.worldskillsdemoapp1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import kotlinx.android.synthetic.main.fragment_primer.*

class MainActivity : AppCompatActivity()/*, View.OnClickListener*/ {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fcv_main) as NavHostFragment
        val navController = navHostFragment.navController
/*        btnTest.setOnClickListener(this)
        btnTest2.setOnClickListener(this)*/

    }

    /*override fun onClick(v: View?) {
        val idButton = v?.id

        //switch
        when (idButton) {
            (R.id.btnTest) -> {
                val cajaDeTexto = etIngresarTexto.text.toString()
                tv_name.text = "from button 1 $cajaDeTexto"
            }
            R.id.btnTest2 -> {
                val cajaDeTexto = etIngresarTexto.text.toString()
                tv_name.text = "from button 2 $cajaDeTexto"
            }
        }
    }*/
}