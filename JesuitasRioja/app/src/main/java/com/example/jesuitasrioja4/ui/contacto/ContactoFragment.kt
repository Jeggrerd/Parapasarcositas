package com.example.jesuitasrioja4.ui.contacto

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.jesuitasrioja4.R
import com.example.jesuitasrioja4.databinding.FragmentContactoBinding


class ContactoFragment : Fragment() {


    private var _binding: FragmentContactoBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        _binding = FragmentContactoBinding.inflate(inflater, container, false)
        val root: View = binding.root
        //Creamos el Intent de correo
        val correo: ImageView= binding.iconoCorreo

        correo.setOnClickListener(){
            var intentoCorreo: Intent=Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:${getString(R.string.correo)}?subject=Petición de Información"))
            startActivity(intentoCorreo)
        }

        //Creamos el Intent de Telefono
        val llamar: ImageView= binding.iconotelefono
        llamar.setOnClickListener(){
            var intentollamada: Intent= Intent(Intent.ACTION_DIAL, Uri.parse("tel:${getString(R.string.telefono)}"))
            startActivity(intentollamada)

        //Creamos el Intent de Mapa
        val mapear: ImageView=binding.iconomapa
        mapear.setOnClickListener(){
            var intentomapear: Intent=Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=${getString(R.string.direccion)}"))
            startActivity(intentomapear)
        }
        }


        return root
    }









    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}