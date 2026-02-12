# Horse Breeds API (Spring Boot + Gradle)

Prosta encyklopedia ras koni -- w Java Spring Boot.

------------------------------------------------------------------------

## Endpointy

-   GET / -- status API
-   GET /breeds -- lista ras koni (JSON)

------------------------------------------------------------------------

## Uruchomienie lokalne

**Wymagania:** Java 17+

Uruchom testy:

./gradlew test

Uruchom aplikację:

./gradlew bootRun

Aplikacja działa domyślnie na:

http://localhost:8080/ 

http://localhost:8080/breeds

------------------------------------------------------------------------

## CI (Continuous Integration)

Po utworzeniu Pull Request do gałęzi `main`: - automatycznie uruchamia
się GitHub Actions - wykonywany jest build projektu - uruchamiane są
testy jednostkowe

------------------------------------------------------------------------

## CD (Continuous Deployment)

Po merge / push do gałęzi `main`: - GitHub Actions buduje plik JAR -
aplikacja jest automatycznie wdrażana do Azure App Service

------------------------------------------------------------------------

## Production (Azure App Service)

Production URL:

https://horse-breeds-g2gdfd5hnbvefaj.italynorth-01.azurewebsites.net/

Przykłady:

https://horse-breeds-g2gdfd5hnbvefaj.italynorth-01.azurewebsites.net/

https://horse-breeds-g2gdfd5hnbvefaj.italynorth-01.azurewebsites.net/breeds

------------------------------------------------------------------------

## Technologie

-   Java 17
-   Spring Boot
-   Gradle
-   GitHub Actions (CI/CD)
-   Azure App Service
