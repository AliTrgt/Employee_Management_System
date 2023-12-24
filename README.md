# Employee Management System

Bu proje, Java Spring Boot kullanılarak geliştirilmiş bir Employee Management System uygulamasıdır. Proje Temel Crud İşlemlerini Gerçekleştirmektedir CREATE,READ,UPDATE,DELETE gibi endpointler oluşturulmuştur.Bu endpointlerden gerekli işlemler yapılmaktadır.Projenin arka tarafı spring-boot,hibernate,mysql gibi teknolojilerle yazılmıştır önyüzde thyemeleaf ve bootstrap kullanılmıştır.Temel Bir Uygulama Olduğu İçin Dockerize Edilmemiştir ve Dto katmanı kullanılmamıştır.

<img src="images/Ekran Resmi 2023-12-24 15.40.44.png" alt="Proje Örneği" width="1000"/>
<img src="images/Ekran Resmi 2023-12-24 15.40.52.png" alt="Proje Örneği" width="1000"/> 
<img src="images/Ekran Resmi 2023-12-24 15.41.12.png" alt="Proje Örneği" width="1000"/>

## Özellikler

- Employee ekleme, güncelleme, silme ve listeleme
- Veritabanında employee bilgilerini saklama (MySQL)
- Thymeleaf kullanarak dinamik sayfalar oluşturma
- JPA-Hibernate ile veritabanı işlemlerini yönetme
- Bootstrap ile basit ve kullanıcı dostu bir arayüz tasarımı

## Kullanılan Teknolojiler

- Java Spring Boot
- Maven
- MySQL
- JPA-Hibernate
- Thymeleaf
- Bootstrap
  

## Projeyi Çalıştırma

1. Proje dosyalarını bilgisayarınıza kopyalayın.
2. MySQL veritabanınızı oluşturun ve `application.properties` dosyasında gerekli bağlantı bilgilerini güncelleyin.
3. Proje dizininde terminal veya komut istemcisini açın ve aşağıdaki komutu çalıştırarak uygulamayı başlatın:

   ```bash
   mvn spring-boot:run
