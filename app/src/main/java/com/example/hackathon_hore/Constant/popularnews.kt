package com.example.hackathon_hore.Constant

import com.example.hackathon_hore.Model.PopularNews
import com.example.hackathon_hore.R

object popularnews {
    fun getAllPopularNews():ArrayList<PopularNews>{
        val items = ArrayList<PopularNews>()
        items.apply {
            add(PopularNews(R.drawable.ex_popularnews, "Apakah benar sebagai salah satu sumber vitamin c terbaik saat ini?", "Sumatera Barat", "Lorem ipsum dolor sit amet consectetur adipisicing elit. Explicabo distinctio in possimus delectus quos labore quisquam, ducimus assumenda! Obcaecati blanditiis totam, quae enim dolorem a labore animi possimus nobis dicta magnam eaque ab, soluta doloribus. Magni mollitia earum facilis distinctio illum eveniet at excepturi id quaerat. Reiciendis, quidem sint inventore, porro accusamus temporibus sapiente incidunt doloremque, voluptatum in tempora ea mollitia veritatis aliquam provident quae illum iusto aliquid! Molestiae, amet voluptatibus tempore officia sapiente fugit ea, aliquid facere ex laudantium cupiditate dolore doloremque tenetur suscipit earum. Nisi deserunt dolores dolor architecto consequatur inventore quis maxime nobis, fuga, molestiae aliquam illum.\n"))
            add(PopularNews(R.drawable.jagung, "Pemerintah Minta Produktivitas Jagung Ditingkatkan", "Jawa Barat", " Pemerintah terus mendorong peningkatan produktivitas komoditas jagung sebagai upaya untuk menjaga ketahanan pangan nasional.\n"))
            add(PopularNews(R.drawable.petani, "Dukung Ketahanan Pangan Nasional dengan Perkuat UMKM Sektor Pertanian", " DKI Jakarta", " Asosiasi Pedagang Pasar Seluruh Indonesia (APPSI) memberikan apresiasi kepada Presiden Joko Widodo (Jokowi) karena telah mau mendengar aspirasi dan masukan dari para pedagang pasar terkait ketahanan dan cadangan pangan nasional serta skema subsidi untuk rakyat berupa Bantuan Langsung Tunai (BLT).\n"))
        }
        return items
    }
}