package com.appsunlimited.githubuserapi.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    val login: String,
    val avatarUrl: String,
    val htmlUrl: String,
    val followersUrl: String,
    val followers: String,
    val followingUrl: String,
    val following: String,
    val reposUrl: String,
    val repos: String
) : Parcelable