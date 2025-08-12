# Spring Boot Employee API

Bu proje, Spring Boot kullanarak geliştirilmiş basit bir çalışan (user) listeleme REST API'sidir.

## Proje Hakkında

- Kullanıcıları listeleme özelliği bulunmaktadır.
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

- Yapay veri kaynağı ile kullanıcıları listeleme  
- Katmanlı mimari (Controller, Service, Repository)  
- Lombok ile kodun sadeleştirilmesi  
- Basit ve anlaşılır REST API yapısı  

## Kurulum ve Çalıştırma

1. Projeyi bilgisayarınıza klonlayın veya indirin.  
2. IDE'de açın (IntelliJ IDEA, VS Code vb.).  
3. Maven bağımlılıklarını yükleyin.  
4. Terminalden proje klasörüne gidin.  
5. Aşağıdaki komutla uygulamayı başlatın:

```bash
mvn spring-boot:run
