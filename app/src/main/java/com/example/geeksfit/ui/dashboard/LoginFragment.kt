package com.example.geeksfit.ui.dashboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.geeksfit.R
import com.example.geeksfit.databinding.FragmentLoginBinding
class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.lgbutton1.setOnClickListener {
            findNavController().navigate(R.id.loginFragment)


        }
        binding.LgTextView5.setOnClickListener {
            findNavController().navigate(R.id.registerFragment)
        }

        binding.lgtextView2.setOnClickListener {
            findNavController().navigate(R.id.forgotPasswordFragment)
        }
        binding.LgTextView5.setOnClickListener {
            findNavController().navigate(R.id.registerFragment)
        }

}
}