package com.example.tugasandroiddesychu

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class kpopidol(
    val imgkpopidol: Int,
    val namekpopidol: String,
    val descriptionkpopidol: String
) : Parcelable {
    companion object {
        val size: Int = 0
    }
}
