package com.aesc.worldskillsdemoapp1

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private var iden: String? = ""
    private var clear: Boolean? = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*val navHostFragment = supportFragmentManager.findFragmentById(R.id.fcv_main) as NavHostFragment
        val navController = navHostFragment.navController*/
/*        btnTest.setOnClickListener(this)
        btnTest2.setOnClickListener(this)*/

//        Funcionalidad de los botones
        initCalculadora()

    }

    private fun initCalculadora() {
        initButtons()
    }

    private fun initButtons() {
        btnNo1.setOnClickListener(this)
        btnNo2.setOnClickListener(this)
        btnNo3.setOnClickListener(this)
        btnNo4.setOnClickListener(this)
        btnNo5.setOnClickListener(this)
        btnNo6.setOnClickListener(this)
        btnNo7.setOnClickListener(this)
        btnNo8.setOnClickListener(this)
        btnNo9.setOnClickListener(this)
        btnNo0.setOnClickListener(this)
        btnEq.setOnClickListener(this)
        btnSuma.setOnClickListener(this)
        btnResta.setOnClickListener(this)
        btnMultplicacion.setOnClickListener(this)
        btnDivicion.setOnClickListener(this)
        btnEliminarUno.setOnClickListener(this)
    }

    private fun printScreen(value: String) {
        val screenValue = etPantalla.text.toString()
        if (screenValue == "0.00") {
            etPantalla.setText(value)
        } else {
            val screen = screenValue + value
            etPantalla.setText(screen)
        }
    }

    override fun onClick(v: View?) {
        val idButton = v?.id

        if (clear!!) {
            etPantalla.setText("")
            clear = false
        }
        //switch
        when (idButton) {
            R.id.btnNo0 -> {
                printScreen("0")
            }
            R.id.btnNo1 -> {
                printScreen("1")
            }
            R.id.btnNo2 -> {
                printScreen("2")
            }
            R.id.btnNo3 -> {
                printScreen("3")
            }
            R.id.btnNo4 -> {
                printScreen("4")
            }
            R.id.btnNo5 -> {
                printScreen("5")
            }
            R.id.btnNo6 -> {
                printScreen("6")
            }
            R.id.btnNo7 -> {
                printScreen("7")
            }
            R.id.btnNo8 -> {
                printScreen("8")
            }
            R.id.btnNo9 -> {
                printScreen("9")
            }
            R.id.btnEq -> {
                val screen = etPantalla.text.toString()
                operar(screen)
            }
            R.id.btnSuma -> {
                iden = "S"
                printScreen("+")
            }
            R.id.btnResta -> {
                iden = "R"
                printScreen("-")
            }
            R.id.btnMultplicacion -> {
                iden = "M"
                printScreen("*")
            }
            R.id.btnDivicion -> {
                iden = "D"
                printScreen("/")
            }
            R.id.btnEliminarUno -> {
                val pantalla = etPantalla.text.toString()
                val longitud = pantalla.length
                if (longitud > 0) {
                    val nuevaCadena = pantalla.substring(0, (longitud - 1))
                    etPantalla.setText("")
                    printScreen(nuevaCadena)
                }
            }
        }
    }

    private fun operar(screen: String) {
        val pattern = Regex("""\s*[-\+*]\s*""")
        val founds = screen.split(pattern)
        etPantalla.setText("0.00")
        when (iden) {
            "S" -> {
                val result = (founds[0].toInt() + founds[1].toInt())
                printScreen(result.toString())
            }
            "R" -> {
                val result = (founds[0].toInt() - founds[1].toInt())
                printScreen(result.toString())
            }
            "M" -> {
                val result = (founds[0].toInt() * founds[1].toInt())
                printScreen(result.toString())
            }
            "D" -> {
                val result = (founds[0].toInt() / founds[1].toInt())
                printScreen(result.toString())
            }
        }
        clear = true
    }
}