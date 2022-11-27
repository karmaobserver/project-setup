package com.aleksejmakaji.filefinder.presentation.screen

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.aleksejmakaji.filefinder.R
import com.aleksejmakaji.filefinder.databinding.FragmentSplashBinding
import com.aleksejmakaji.filefinder.presentation.common.BaseFragment

class SplashFragment : BaseFragment<FragmentSplashBinding>(FragmentSplashBinding::inflate) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navigateToSplashFragment()
    }

    private fun navigateToSplashFragment() {
        findNavController().navigate(R.id.action_splashFragment_to_homeFragment)
    }
}
