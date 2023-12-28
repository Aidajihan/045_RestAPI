package com.example.consumeapi.repositori

import com.example.consumeapi.model.Kontak
import com.example.consumeapi.service_API.KontakService

interface KontakRepository {
    suspend fun getKontak(): List<Kontak>
}

class NetworkKontakRepository(
    private val kontakApiService: KontakService
) : KontakRepository {
    override suspend fun getKontak(): List<Kontak> = kontakApiService.getKontak()
}