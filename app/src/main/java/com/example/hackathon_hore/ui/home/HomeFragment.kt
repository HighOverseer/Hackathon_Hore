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
import com.example.hackathon_hore.Adapter.KategoriClickedAdapter
import com.example.hackathon_hore.Constant.hasilPencarian
import com.example.hackathon_hore.databinding.FragmentHomeBinding
import com.example.hackathon_hore.Constant.kategori
import com.example.hackathon_hore.Constant.terbaru

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
        imageList.add(SlideModel("https://p4.wallpaperbetter.com/wallpaper/382/296/41/nature-food-wallpaper-preview.jpg"))
        imageList.add(SlideModel("https://ricola-cdn-ep.azureedge.net/cmsstorage/ricola/media/content/-common/need-states/refreshment/garlic/garlic_headervisual.jpg"))
        imageList.add(SlideModel("https://asset.kompas.com/crops/rKfTweJn9-rLF87y5F2T9HXRQQs=/84x0:928x563/750x500/data/photo/2020/07/28/5f1f9b3689654.jpg"))
        binding.imageSlider.setImageList(imageList, ScaleTypes.FIT)

        val adapter = KategoriAdapter(kategori.getCategories())
        binding.rvKategori.adapter = adapter
        binding.rvKategori.layoutManager = GridLayoutManager(requireContext(), 2, GridLayoutManager.HORIZONTAL, false)
        binding.rvKategori.setHasFixedSize(true)

        val adapter2 = KategoriClickedAdapter(terbaru.getCategories())
        binding.rvTerbaru.adapter = adapter2
        binding.rvTerbaru.layoutManager = GridLayoutManager(requireContext(), 2, GridLayoutManager.VERTICAL, false)
        binding.rvTerbaru.setHasFixedSize(true)

    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}