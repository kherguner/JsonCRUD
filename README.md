# CRUD-JSON


<b>Java JSON Create, Read, Update and Delete</b>
***
Bu projede bir json projesi üzerinde yeni bir json dosyası oluşturma, json uzantılı dosyayı nasıl okuyabiliriz, json objelerini nasıl güncelleyebiliriz ve nasıl json üzerinde silme işlemi yapıp yeniden dosyaya yazabiliriz.

<b><u>Prerequisites</u></b>
***
1. Java 1.8
2. Maven 4.0
3. Junit 3.8.1
4. Org.Json 20160810
5. Common.io 2.4

<b> Getting the Project </b>
***
- [x] Project link: https://github.com/kherguner/CRUD-JSON
- [x] Create executable jar: mvn package -Dmaven.skip.test=true
- [x] Command to start the project: mvn exec:java -Dexec.mainClass="com.kherguner.crud.App"

<b>Maven Dependencies</b>
***
<b>Junit</b>
```
		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>3.8.1</version>
			<scope>test</scope>
		</dependency>
```
<b>OrgJson lib</b>
```
		<dependency>
			<groupId>org.json</groupId>
			<artifactId>json</artifactId>
			<version>20160810</version>
		</dependency>
```
<b>Common io </b>
```
		<dependency>
			<groupId>commons-io</groupId>
			<artifactId>commons-io</artifactId>
			<version>2.4</version>
		</dependency>
```
<b>Project Structure</b>
***
* App.java
  - Projenin main sınıfı 
* Create.java
  - * .json uzantılı dosyanın oluşturmak için kullanılır.
* Delete.java
  - Öncelikle * .json uzantılı dosyayı okuyup sonra silinmesini istediğimiz objenin adını parametre olarak geçiyoruz.
* FileOperations.java
  - Sürekli her class altında dosyaya yazma işlemi yapmaktansa bir kere sınıf olarak tanımlayıp onun referansını kullanıyoruz
* Read.java
  - .json uzantılı dosyayı okumak ve ekrana başmak için kullanıyoruz
* Update.java
  - Bu sınıfta json array nesnesini güncellemek için kullanıyoruz
