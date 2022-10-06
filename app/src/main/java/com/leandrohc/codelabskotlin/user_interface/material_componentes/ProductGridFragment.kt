package com.leandrohc.codelabskotlin.user_interface.material_componentes

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.leandrohc.codelabskotlin.R
import com.leandrohc.codelabskotlin.databinding.FragmentProductGridBinding

class ProductGridFragment : Fragment(R.layout.fragment_product_grid) {

    private lateinit var binding: FragmentProductGridBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentProductGridBinding.bind(view)
    }

}