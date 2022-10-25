package com.example.hackathon_hore.Model

import com.google.gson.annotations.SerializedName

data class Response(

	@field:SerializedName("updated_at")
	val updatedAt: String? = null,

	@field:SerializedName("national_commodity_price")
	val nationalCommodityPrice: NationalCommodityPrice? = null
)

data class BawangMerahItem(

	@field:SerializedName("display")
	val display: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("value")
	val value: String? = null
)

data class CabaiRawitItem(

	@field:SerializedName("display")
	val display: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("value")
	val value: String? = null
)

data class DagingSapiItem(

	@field:SerializedName("display")
	val display: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("value")
	val value: String? = null
)

data class NationalCommodityPrice(

	@field:SerializedName("Beras")
	val beras: List<BerasItem?>? = null,

	@field:SerializedName("Bawang Putih")
	val bawangPutih: List<BawangPutihItem?>? = null,

	@field:SerializedName("Cabai Rawit")
	val cabaiRawit: List<CabaiRawitItem?>? = null,

	@field:SerializedName("Bawang Merah")
	val bawangMerah: List<BawangMerahItem?>? = null,

	@field:SerializedName("Cabai Merah")
	val cabaiMerah: List<CabaiMerahItem?>? = null,

	@field:SerializedName("Daging Ayam")
	val dagingAyam: List<DagingAyamItem?>? = null,

	@field:SerializedName("Telur Ayam")
	val telurAyam: List<TelurAyamItem?>? = null,

	@field:SerializedName("Daging Sapi")
	val dagingSapi: List<DagingSapiItem?>? = null,

	@field:SerializedName("Minyak Goreng")
	val minyakGoreng: List<MinyakGorengItem?>? = null,

	@field:SerializedName("Gula Pasir")
	val gulaPasir: List<GulaPasirItem?>? = null
)

data class MinyakGorengItem(

	@field:SerializedName("display")
	val display: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("value")
	val value: String? = null
)

data class DagingAyamItem(

	@field:SerializedName("display")
	val display: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("value")
	val value: String? = null
)

data class TelurAyamItem(

	@field:SerializedName("display")
	val display: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("value")
	val value: String? = null
)

data class BawangPutihItem(

	@field:SerializedName("display")
	val display: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("value")
	val value: String? = null
)

data class CabaiMerahItem(

	@field:SerializedName("display")
	val display: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("value")
	val value: String? = null
)

data class GulaPasirItem(

	@field:SerializedName("display")
	val display: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("value")
	val value: String? = null
)

data class BerasItem(

	@field:SerializedName("display")
	val display: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("value")
	val value: String? = null
)
