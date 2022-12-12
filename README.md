# praktikum7--Dwi-Agus-Haryanto-312110033-

Langkah - langkah "tugas parktikum 7" tentang Relasi Kelas 
note : (dilampirkan dalam bentuk ScreenShoot nya Program)

RELASI KELAS
adalah Class tersebut saling berelasi untuk mendefinisikan bagaimana objek -objek akan berinteraksi satu dengan lainnya.
Program atau Source Code :
- Komputer.java
![image](https://user-images.githubusercontent.com/31887335/206940342-0d33c315-8a0d-4bca-91a8-813d15cccbfe.png)
- Laptop.java
![image](https://user-images.githubusercontent.com/31887335/206940390-bac16e32-d6fc-4000-aca7-b15a58701e00.png)
Source Code ini tidak bisa di Run & Compile karena ini membutuhkan kelas antara lainnya, dependensi, association, agregation, composition.
Di gabungkan dalam file2 tersebut lalu di run & compile.

A. Dependensi
1. Dependency merupakan relasi antar kelas dimana satu kelas membutuhkan atau tergantung kepada kelas lainnya. Tapi ketergantungan tersebut tidak timbal balik.
2. Relasi dependency ini digambarkan dengan panah yang dari satu kelas ke kelas lainnya.
3. Arah panah dari diagram class menunjukkan kelas yang dibutuhkan.
Programnya (dari Relasi Kelas + Source Code dibawah) :
- MainProgram.java
![image](https://user-images.githubusercontent.com/31887335/207023614-873b5d72-a592-4758-988e-8840dd906182.png)
- Manusia.java
![image](https://user-images.githubusercontent.com/31887335/207023675-d2d1cbc9-2e7e-44d5-87b3-36e269b83108.png)
Hasil Compile & Run Programnya :
![image](https://user-images.githubusercontent.com/31887335/207023091-6bd55b95-f617-481e-9fb9-6e7c09281aa2.png)
Gambar Diagram Class-nya :
![image](https://user-images.githubusercontent.com/31887335/207023761-c5c2586b-8d31-4e35-8247-5761982c8096.png)

B. Association
1. Asosiasi didefinisikan sebagai hubungan yang terstruktur, yang secara konsep memiliki arti bahwa dua komponen saling terhubung satu sama lain.
2. Asosiasi biasa disebut menggunakan (uses).
3. hubungan “use-a” yang menyatakan bahwa sebuah kelas menggunakan kelas lainnya.
Programnya (dari Relasi Kelas + Source Code dibawah ini) :
- MainProgram
- ![image](https://user-images.githubusercontent.com/31887335/207025151-5dc48471-6d9c-4a7e-8b38-8acd36bfe04b.png)
- Manusia.java
- ![image](https://user-images.githubusercontent.com/31887335/207025199-dfe97f79-a4a6-4575-9993-07a4363e698a.png)
Hasil Compile & Run Programnya :
![image](https://user-images.githubusercontent.com/31887335/207025657-dbfdda60-09fb-4a0f-bcee-71ad4461adf4.png)
Gambar Diagramn Class-nya : 
![image](https://user-images.githubusercontent.com/31887335/207025738-32fa3b5a-6761-42c2-add5-c9ab9df500d4.png)

C. Agregation
1. Hubungan agregasi serupa dengan asosiasi, yaitu memiliki sebuah atribut dengan tipe dari class lain.
2. Namun hubungan diperkuat dengan adanya dependensi pada konstruktornya.
3. hubungan “has-a” yang menyatakan bahwa sebuah kelas memiliki hubungan dengan kelas lainnya.'
Programnya (dari Relasi Kelas+ Source Code dibawah ini) :
- MainProgram.java
![image](https://user-images.githubusercontent.com/31887335/207021626-95374d6f-76ee-4a8a-92a7-e175195fdf5a.png)
- Manusia.java
![image](https://user-images.githubusercontent.com/31887335/207021767-1011fc37-7c26-4cf6-8788-2a6821a72193.png)
Hasil Run & Compile Programnya :
![image](https://user-images.githubusercontent.com/31887335/207021962-0fbbacd6-8e0a-4a23-8e54-4f990adeabd0.png)
Gambar Diagram Class-nya :
![image](https://user-images.githubusercontent.com/31887335/207023841-6812d737-105d-4401-a62d-8a38a1354471.png)

D. Composition
1. Composition merupakan relasi yang lebih spesifik dari relasi aggregation.
2. Pada relasi ini suatu kelas tidak hanya dimiliki oleh kelas lainnya, tapi juga siklus hidup kelas tersebut juga ditentukan oleh kelas yang memilikinya.
3. Pada relasi ini biasanya objek dari kelas yang dimiliki diciptakan di dalam kelas yang memilikinya.
4. Komposisi biasa disebut pasti memiliki (own)
Programnya (dari Relasi Kelas + Source Code dibawah ini) :
- MainProgram :
![image](https://user-images.githubusercontent.com/31887335/207026655-95f77fe2-daa5-4278-8215-e153e956e9fe.png)
- Manusia.java :
![image](https://user-images.githubusercontent.com/31887335/207026837-96bf7464-322f-49fe-93df-d2a9319f24d8.png)
Hasil Run & Compile Programnya :
![image](https://user-images.githubusercontent.com/31887335/207027285-3020fbc4-5aac-40bd-ae26-0a3fe123eab0.png)
Gambar Diagram Class-nya :
![image](https://user-images.githubusercontent.com/31887335/207027689-3b5bd314-8173-4083-9710-8ff70b05512e.png)
