package com.example.geeksfit.ui.dashboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.res.ColorStateListInflaterCompat.inflate
import androidx.navigation.fragment.findNavController
import com.example.geeksfit.R
import com.example.geeksfit.databinding.ActivityMainBinding.inflate
import com.example.geeksfit.databinding.FragmentForgotPasswordBinding
import com.example.geeksfit.databinding.FragmentLoginBinding

@Suppress("UNREACHABLE_CODE")
class ForgotPasswordFragment : Fragment() {

    private lateinit var binding: FragmentForgotPasswordBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentForgotPasswordBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        onClick()
    }
    private fun onClick(){
        binding.fgTextview5.setOnClickListener {
            findNavController().navigate(R.id.verificationFragment)
        }
        binding.RgTextView4.setOnClickListener{
            findNavController().navigate(R.id.loginFragment)
        }
    }
}