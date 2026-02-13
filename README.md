# Horse Breeds API
Spring Boot REST API – Encyklopedia ras koni

Projekt aplikacji webowej zbudowanej w Java 17 + Spring Boot,
wdrażanej automatycznie do Azure App Service przy użyciu GitHub Actions (CI/CD).

---

## Opis projektu

Aplikacja udostępnia prostą encyklopedię ras koni poprzez REST API.
Projekt demonstruje:

- tworzenie endpointów REST
- testy jednostkowe
- Continuous Integration (CI)
- Continuous Deployment (CD)
- wdrożenie do Azure App Service
- użycie zmiennych środowiskowych (GitHub Secrets)
- monitoring i logi w Azure

---

## Endpointy

### GET /
Zwraca status aplikacji oraz informację czy zmienna środowiskowa API_TOKEN jest ustawiona.

Przykład odpowiedzi:
Horse Breeds API - running | API_TOKEN set: true

### GET /breeds
Zwraca listę ras koni w formacie JSON.

Przykład:
```json
[
  {
    "id": "arabian",
    "name": "Arabian",
    "origin": "Middle East"
  }
]
```

---

## Uruchomienie lokalne

### Wymagania
- Java 17+
- Gradle (wrapper w projekcie)

### Uruchom testy
```
./gradlew test
```

### Uruchom aplikację
```
./gradlew bootRun
```

Aplikacja działa domyślnie na:

http://localhost:8080/  
http://localhost:8080/breeds

### Test zmiennej środowiskowej lokalnie (Windows PowerShell)
```
$env:API_TOKEN="test123"
./gradlew bootRun
```

---

## CI – Continuous Integration

Workflow: `.github/workflows/ci.yml`

CI uruchamia się automatycznie przy Pull Request do gałęzi `main`.

Proces:
1. Checkout repozytorium
2. Instalacja Java 17
3. Build projektu
4. Uruchomienie testów jednostkowych

---

## CD – Continuous Deployment

Workflow: `.github/workflows/cd.yml`

CD uruchamia się przy:
- push do `main`
- merge Pull Request

Proces:
1. Build pliku JAR
2. Logowanie do Azure (Service Principal)
3. Automatyczne wdrożenie do Azure App Service

---

## Production – Azure App Service

Aplikacja jest wdrożona na:

https://horse-breeds-g2gqfdf5hnbvefaj.italynorth-01.azurewebsites.net/

Endpointy produkcyjne:

https://horse-breeds-g2gqfdf5hnbvefaj.italynorth-01.azurewebsites.net/
https://horse-breeds-g2gqfdf5hnbvefaj.italynorth-01.azurewebsites.net/breeds

---

## Sekrety i bezpieczeństwo

Projekt wykorzystuje:
- GitHub Secrets
- zmienne środowiskowe w Azure App Service

Sekret `API_TOKEN`:
- przechowywany w GitHub Secrets
- przekazywany jako zmienna środowiskowa
- odczytywany w aplikacji przez Spring `@Value`

---

## Monitoring i logi

W Azure App Service włączono:
- Application Logging (Filesystem)
- Log Stream

Logi można obserwować w czasie rzeczywistym w Azure Portal.

---

## Technologie

- Java 17
- Spring Boot
- Gradle
- Git
- GitHub Actions (CI/CD)
- Azure App Service
- Azure Monitoring

---

