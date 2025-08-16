# Spring Boot Employee API

Bu proje, Spring Boot kullanarak geliştirilmiş basit bir çalışan (employee) yönetim REST API'sidir.

## Proje Hakkında

- Çalışanlar (employee) üzerinde **CRUD** (Create, Read, Update, Delete) işlemleri yapılabilmektedir.
- Gerçek bir veritabanı bağlantısı yoktur; bunun yerine, konfigürasyon sınıfında bir `List<Employee>` ile yapay (in-memory) veri kaynağı oluşturulmuştur.
- Controller, Service ve Repository katmanları birbirine bağlı şekilde yapılandırılmıştır.
- **Lombok** kütüphanesi kullanılarak getter, setter ve constructor metodları otomatik olarak üretilmiştir.
- Temel Spring Boot mimarisi ve katmanlı yapı uygulanmıştır.

## Kullanılan Teknolojiler

- **Java 17**  
- **Spring Boot** (Web)  
- **Lombok**  
- **Maven**

## Özellikler

- Yapay veri kaynağı ile çalışan yönetimi  
- Katmanlı mimari (Controller, Service, Repository)  
- Lombok ile kodun sadeleştirilmesi  
- Basit ve anlaşılır REST API yapısı  
- **CRUD İşlemleri:**
  - **GET /employees** → Tüm çalışanları listeler  
  - **GET /employees/{id}** → ID’ye göre çalışan getirir  
  - **POST /employees** → Yeni çalışan ekler  
  - **PUT /employees/{id}** → ID’ye göre çalışan bilgilerini günceller (isim, soyisim vb.)  
  - **DELETE /employees/{id}** → ID’ye göre çalışanı siler  

## Kurulum ve Çalıştırma

1. Projeyi bilgisayarınıza klonlayın veya indirin.  
2. IDE’de açın (IntelliJ IDEA, VS Code vb.).  
3. Maven bağımlılıklarını yükleyin.  
4. Terminalden proje klasörüne gidin.  
5. Aşağıdaki komutla uygulamayı başlatın:  

```bash
mvn spring-boot:run
