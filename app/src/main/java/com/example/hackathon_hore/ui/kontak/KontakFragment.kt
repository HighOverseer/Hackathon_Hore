package com.example.hackathon_hore.ui.kontak

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.hackathon_hore.databinding.FragmentKontakBinding


class KontakFragment : Fragment() {
    private var _binding: FragmentKontakBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val kontakViewModel =
            ViewModelProvider(this).get(KontakViewModel::class.java)

        _binding = FragmentKontakBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.tvEmail
        val textView1: TextView = binding.tvFB
        val textView2: TextView = binding.tvIg
        val textView3: TextView = binding.tvEmail
        val textView4: TextView = binding.tvLine
        val textView5: TextView = binding.tvTelegram
        val textView6: TextView = binding.tvTwitter
        val textView7: TextView = binding.tvWa
        kontakViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
            textView1.text = it
            textView2.text = it
            textView3.text = it
            textView4.text = it
            textView5.text = it
            textView6.text = it
            textView7.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}