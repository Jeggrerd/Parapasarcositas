package com.example.jesuitasrioja4.ui.enlaces

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.example.jesuitasrioja4.R
import com.example.jesuitasrioja4.databinding.FragmentEnlaceBinding

class EnlaceFragment: Fragment() {


    private var _binding: FragmentEnlaceBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        _binding = FragmentEnlaceBinding.inflate(inflater, container, false)
        val root: View = binding.root
        //Creamos el Intent de Jesuitas
        val jesuitas: ImageView = binding.imagenjesuitas

        jesuitas.setOnClickListener(){
            var intentojesuitas: Intent =
                Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.enlacejesuitas)))
            startActivity(intentojesuitas)

        }

        //Creamos el Intent de Moodle
        val moodle: ImageView = binding.imagenmodle
        moodle.setOnClickListener(){
            var intentomoodle: Intent =
                Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.enlacemoodle)))
            startActivity(intentomoodle)
        }


        //Creamos el Intent de Racima
        val racima: ImageView =binding.imagenracima
        racima.setOnClickListener(){
            var intentoracima: Intent =
                Intent(Intent.ACTION_VIEW, Uri.parse(getString(R.string.enlaceracima)))
            startActivity(intentoracima)
        }



    return root
}









override fun onDestroyView() {
    super.onDestroyView()
    _binding = null
}
}

