package com.example.hackathon_hore.Model

import android.os.Parcel
import android.os.Parcelable
import androidx.versionedparcelable.VersionedParcelize

data class PopularNews(val imageId:Int, val title:String, val provinsi:String, val deskripsi:String):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
    ) {
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(dest: Parcel?, flags: Int) {
        dest?.apply {
            writeInt(imageId)
            writeString(title)
            writeString(provinsi)
            writeString(deskripsi)
        }
    }

    companion object CREATOR : Parcelable.Creator<PopularNews> {
        override fun createFromParcel(parcel: Parcel): PopularNews {
            return PopularNews(parcel)
        }

        override fun newArray(size: Int): Array<PopularNews?> {
            return arrayOfNulls(size)
        }
    }
}