package com.aesc.worldskillsdemoapp1.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.aesc.worldskillsdemoapp1.R
import kotlinx.android.synthetic.main.fragment_primer.*


class PrimerFragment : Fragment(), View.OnClickListener {

    private var mNavController: NavController? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_primer, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mNavController = Navigation.findNavController(view);
        btnSegundaActivity.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        mNavController!!.navigate(R.id.segundoFragment)
    }

}