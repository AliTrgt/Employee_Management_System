# Employee Management System

Bu proje, Java Spring Boot kullanılarak geliştirilmiş bir Employee Management System uygulamasıdır. Projede Thymeleaf, JPA-Hibernate, MySQL ve Bootstrap kullanılmıştır. Ayrıca, geliştirme sürecini kolaylaştırmak için Spring Boot DevTools de projeye eklenmiştir.

## Özellikler

- Employee ekleme, güncelleme, silme ve listeleme
- Veritabanında employee bilgilerini saklama (MySQL)
- Thymeleaf kullanarak dinamik sayfalar oluşturma
- JPA-Hibernate ile veritabanı işlemlerini yönetme
- Bootstrap ile basit ve kullanıcı dostu bir arayüz tasarımı

## Gereksinimler

- Java 8 veya üstü
- Maven
- MySQL
- Spring Boot

## Projeyi Çalıştırma

1. Proje dosyalarını bilgisayarınıza kopyalayın.
2. MySQL veritabanınızı oluşturun ve `application.properties` dosyasında gerekli bağlantı bilgilerini güncelleyin.
3. Proje dizininde terminal veya komut istemcisini açın ve aşağıdaki komutu çalıştırarak uygulamayı başlatın:

   ```bash
   mvn spring-boot:run
