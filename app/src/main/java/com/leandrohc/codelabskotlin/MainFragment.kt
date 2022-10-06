package com.leandrohc.codelabskotlin

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.leandrohc.codelabskotlin.databinding.FragmentMainBinding
import com.leandrohc.codelabskotlin.util.navTo

class MainFragment : Fragment(R.layout.fragment_main){

    private lateinit var binding: FragmentMainBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentMainBinding.bind(view)
        binding.codelabToastSnake.setOnClickListener { navTo(R.id.toastSnakeFragment) }
        binding.codelabNotification.setOnClickListener { navTo(R.id.notificationFragment) }
        binding.codelabWorkManager.setOnClickListener { navTo(R.id.selectImageFragment) }
        binding.codelabMaterialComponents.setOnClickListener { navTo(R.id.materialComponentsFragment) }
        binding.codelabInteractiveUi.setOnClickListener { navTo(R.id.interativeUiFragment) }
        binding.codelabActivitiesIntents.setOnClickListener { navTo(R.id.sendFragment) }
    }
}