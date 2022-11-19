# Parola-guvenlik-orani-kutuphane
#### Hozan BAYDU

## Özellikler


- Kütüphaneyi kullanarak girilen editTextin güvenlik oranı hesaplanır.
- Sadece iki satır kodla kütüphane kullanılabilir.

Not:Yazının okunma süresi 3 dakikadır.

### Kütüphaneyi oluşturma

![giriş sayfası](https://miro.medium.com/max/786/1*P93uc5vGSEm66Y5ig64VDQ.webp)

Yukarıdaki kod yazılan şifrenin rakam içerip içermediğini kotrol etmektedir.Bu bilgiyi sonraki süreçte güvenlik miktarını belirlemekte kullanacağız.

![giriş sayfası](https://miro.medium.com/max/786/1*0OlpGIMgmDQ_pqEs_QVDXw.webp)

Yukarıdaki kod parçası ise girilen şifrenin uzunluğu ve rakam içeriğine göre bir güvenlik seviyesi belirtmek için yazılmıştır.

### Kütüphaneyi kullanma

Güncel bir şekilde ilk adımı yapma yolu settings.gradle dosyasına

```sh
 maven { url 'https://www.jitpack.io' }
```

kodunu yapıştırmaktır.Dosyanın son hali aşağıdaki gibi görünmelidir.

```sh
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url 'https://www.jitpack.io' }
    }
}
```

İkinci adım ise kütüphanenin kullanılacağı projenin build.gradle dosyasına aşağıdaki kodu eklemektir.

```sh
implementation 'com.github.hozanBaydu:Parola-guvenlik-orani-kutuphane:1.1.0'
```

Yukarıdaki iki adımı tamamladıktan sonra artık kütüphaneyi projemizde kullanmaya hazırız.

```sh
  var check=Securitycheck()
        check.checkPassword(editText = editTextTextPersonName, textView = textView2)
```


![giriş sayfası](https://miro.medium.com/max/540/1*Q-P8DfFss2MqxTa9wESFhQ.gif)

Gördüğünüz üzere kütüphanemiz sayesinde,sadece 2 satır kodla yukarıdaki projeyi hazırladık.


  

Uygulamayı yazan:Hozan BAYDU

Tasarım:Adobexd,Canva

Tarih:20.08.2022

iletişim:hozan.baydu3447@gmail.com
