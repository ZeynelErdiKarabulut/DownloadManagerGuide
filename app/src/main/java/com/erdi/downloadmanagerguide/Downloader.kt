package com.erdi.downloadmanagerguide

interface Downloader {
    fun downloadFile(url: String): Long
}