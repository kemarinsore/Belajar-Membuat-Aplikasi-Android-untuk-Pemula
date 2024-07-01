package com.dicoding.submissionakhiraplikasiandroidsederhana

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Mobil(
    val name: String,
    val description: String,
    val photo: Int
) : Parcelable
