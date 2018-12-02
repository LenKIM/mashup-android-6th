package com.mashup.mashup_android_6th.models

data class Movie(
    val id: Int,
    val url: String,
    val imdb_code: String,
    val title: String,
    val title_english: String,
    val title_long: String,
    val slug: String,
    val year: Int,
    val rating: Long,
    val runtime: Int,
    val genres: List<String>,
    val summary: String,
    val description_full: String,
    val synopis: String,
    val yt_trailer_code: String,
    val language: String,
    val mpa_rating: String,
    val background_imgae: String,
    val background_imgae_original: String,
    val small_cover_imgae: String,
    val meium_cover_imgae: String,
    val large_cover_imgae: String,
    val state:String,
    val torrents:List<Torrent>,
    val date_uploaded: String,
    val date_uploaded_unix: Long
)