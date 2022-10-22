package com.example.hackathon_hore.Model

import android.os.Parcel
import android.os.Parcelable

data class HasilPencarian (
    val imageId:Int, val pangan:String, val provinsi : String, val rentangHarga : String, val alamat:String, val deskripsi:String)
    : Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!
    ) {
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.writeInt(imageId)
        dest?.writeString(pangan)
        dest?.writeString(provinsi)
        dest?.writeString(rentangHarga)
        dest?.writeString(alamat)
        dest?.writeString(deskripsi)
    }

    companion object CREATOR : Parcelable.Creator<HasilPencarian> {
        override fun createFromParcel(parcel: Parcel): HasilPencarian {
            return HasilPencarian(parcel)
        }

        override fun newArray(size: Int): Array<HasilPencarian?> {
            return arrayOfNulls(size)
        }
    }
}