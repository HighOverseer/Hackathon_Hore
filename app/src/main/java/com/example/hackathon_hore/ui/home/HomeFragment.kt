package com.example.hackathon_hore.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import com.example.hackathon_hore.Adapter.KategoriAdapter
import com.example.hackathon_hore.databinding.FragmentHomeBinding
import com.example.hackathon_hore.Constant.kategori

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel("https://img.freepik.com/free-photo/beautiful-scenery-phragmites-plants-by-sea-with-swimming-pelican-sunset_181624-37787.jpg"))
        imageList.add(SlideModel("https://cdn1-digiphoto.techbang.com/system/excerpt_images/9937/front/76a1e304510a404caffe302b7397fc4d.jpg?1555479694"))
        binding.imageSlider.setImageList(imageList, ScaleTypes.FIT)

        val adapter = KategoriAdapter(kategori.getCategories())
        binding.rvKategori.adapter = adapter
        binding.rvKategori.layoutManager = GridLayoutManager(requireContext(), 2, GridLayoutManager.HORIZONTAL, false)
        binding.rvKategori.setHasFixedSize(true)




    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}