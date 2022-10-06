package com.leandrohc.codelabskotlin.user_interface.material_componentes

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.leandrohc.codelabskotlin.R
import com.leandrohc.codelabskotlin.databinding.FragmentMaterialComponentsBinding
import com.leandrohc.codelabskotlin.databinding.FragmentProductGridBinding
import com.leandrohc.codelabskotlin.util.navTo

class MaterialComponentsFragment : Fragment(R.layout.fragment_material_components) {

    private lateinit var binding: FragmentMaterialComponentsBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentMaterialComponentsBinding.bind(view)

        binding.nextButton.setOnClickListener {
            if (!isPasswordValid(binding.passwordEditText.text.toString())) {
                binding.passwordTextInput.error = getString(R.string.shr_error_password)
            } else {
                binding.passwordTextInput.error = null
                navTo(R.id.productGridFragment)

            }
        }
        binding.passwordEditText.setOnKeyListener { _, _, _ ->
            if (isPasswordValid(binding.passwordEditText.text.toString())){
                binding.passwordTextInput.error = null
            }
            false
        }

        binding.cancelButton.setOnClickListener {
            binding.passwordEditText.setText("")
            binding.username.setText("")
        }
    }
    private fun isPasswordValid(text: String): Boolean = text.length >= 8
}


