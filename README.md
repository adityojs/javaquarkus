# javaquarkus
1. Buatkan secara lengkap layanan yang membaca data dari API eksternal dan menyimpan hasilnya ke dalam database secara asynchronous.

Entity ExternalData: Digunakan untuk menyimpan data ke database
Repository ExternalDataRepository: Mengelola operasi basis data
REST Client ExternalApiClient: Menghubungkan aplikasi dengan API eksternal menggunakan MicroProfile Rest Client
Service ExternalDataService: Mengambil data dari API eksternal dan menyimpannya ke database menggunakan pendekatan asynchronous
Application Entry Point: Menginisiasi proses pengambilan dan penyimpanan data saat aplikasi mulai

Jalankan aplikasi dengan perintah:
mvn quarkus:dev

Akses endpoint untuk memulai proses (postman):
[GET] http://localhost:8080/sync-data

Setelah proses selesai, data akan disimpan di database H2. Anda dapat memverifikasi dengan menggunakan konsol H2 di http://localhost:8080/h2.
