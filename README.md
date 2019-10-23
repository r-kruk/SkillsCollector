# Egzamin do modułu 2. z bloku "Programowanie 1 - poziom podstawowy"

Zapoznaj się z sekcją "**Przygotowanie repozytorium**" oraz ze wstępem do sekcji "**Zadania**". Od momentu rozpoczęcia
pierwszego zadania masz 1 godzinę i 30 minut (1,5h) na zakończenie egzaminu. Pamiętaj, aby potem wykonać `pull-request`.

Do dzieła!

---

## Przygotowanie repozytorium

1. Upewnij się, że został Ci nadany dostęp do repozytorium i masz prawo utworzenia `fork` i wykonania `pull-request`.
1. Utwórz `fork` repezytorium na swoim koncie github ([*fork*](https://guides.github.com/activities/forking/)).
1. Sklonuj swój `fork` na dysk. Najlepiej w jakimś folderze zbiorczym, np. `repositories` albo `workspace`
   - wykorzystaj do tego polecenie `git clone`,
   - upewnij się, że repozytorium zostało poprawnie utworzone przy pomocy `git status`.
   
   > **Pamiętaj, aby utworzyć klon Twojego `fork-a`, a nie repozytorium głównego**
1. Po każdym rozwiązanym zadaniu dodaj je (`git add`) i zakomituj (`git commit`).
1. Jeżeli rozwiązanie wymaga uzupełnienia w komentarzu _o co chodziło_, to wstaw komentarz wieloliniowy jako pierwszą linię pliku `.java`.
1. Na koniec wypchnij wszystkie zmiany do swojego `fork-a` (polecenie: `git push`) oraz utworzyć `pull-request` ([*pull request*](https://help.github.com/articles/creating-a-pull-request)) do repozytorium głównego. 
1. Baw się dobrze przy rozwiązywaniu zadań ;)

---

## Wprowadzenie

Do zrealizowania masz 6 zadań. Każde kolejne zadadanie jest rozwinięciem poprzedniego. Zadanie realizujesz w pliku źródłówym [`exam/Statistics.java`](src/exam/Statistics.java) w miejscach wskazanych przez komentarze. Nie wydzielaj kodu zadań do osobnych metod: utrudni Ci to tylko zadanie ;)

Zadania weryfikują umiejętności posługiwania się instrukcjami sterującymi oraz wykorzystania tablic do modelowania i przetwarzania danych. W zadaniach pracujemy na przykładowych danych wskazanych w treści zadania. Pamiętaj jednak, że kod musisz pisać tak, jakby dane były dowolne. Zasada ta przeważnie będzie oznaczała, że nie powinienneś/powinnaś nigdzie używać bezpośrednich odwołań do indeksów (np. `System.out.println(countries[0])`) 

> Wyjątkiem od powyższej zasady mogą być przypisania do tablic wartości (chociaż lepiej wykorzystać wyrażenia inicjalizujące tablice).

Czas start! :watch: 1h 30m

---

## Zadania

### Zadanie 1 - Państwa (2 pkt)

1. W klasie [`exam/Statistics.java`](src/exam/Statistics.java) zadeklaruj tablicę do przechowywania nazw państw.
1. Tablica powinna być statyczna (`static`) oraz wypełniona wartościami: `"Polska"`, `"Niemcy"`, `"Czechy"`.
1. We wskazanym miejscu w metodzie `main` napisz fragment kodu, który wyświetli w pierwszej linii nagłowek: `--- Państwa ---`, a w kolejnych nazwy państw tak,
jak niżej zostało to przedstawione:

   ```text
   --- Państwa ---
   Polska
   Niemcy
   Czechy
    ```

---

### Zadanie 2 - Miasta (3 pkt)

1. W klasie [`exam/Statistics.java`](src/exam/Statistics.java) zadeklaruj tablicę do przechowywania nazw miast dla każdego z państw.
1. Tablica powinna być statyczna (`static`) oraz wypełniona wartościami:
   - `"Warszawa", "Kraków", "Wrocław"` dla Polski,
   - `"Hamburg", "Berlin", "Monachium"` dla Niemiec,
   - `"Brno", "Ostrawa", "Praga"` dla Czech.
1. We wskazanym miejscu w metodzie `main` napisz fragment kodu, który wyświetli w pierwszej linii nagłówek: `--- Miasta ---`, a w kolejnych listę miast w państwach tak, jak niżej zostało to przedstawione:

   ```text
   --- Miasta ---
   Polska: 
       Warszawa, Kraków, Wrocław
   Niemcy: 
       Hamburg, Berlin, Monachium
   Czechy: 
       Brno, Ostrava, Praga
   ```
   
1. Zadbaj o to, aby po ostatnim mieście w linii (dla każdego państwa) nie było znaku `,`.

---

### Zadanie 3 - Stolice (4 pkt)

1. W klasie [`exam/Statistics.java`](src/exam/Statistics.java) zadeklaruj tablicę do przechowywania nazw stolic dla każdego z państw.
1. Tablica powinna być statyczna (`static`) oraz wypełniona wartościami: `"Warszawa", "Berlin", "Praga"`.
1. We wskazanym miejscu w metodzie `main` napisz fragment kodu, który wyświetli w pierwszej linii nagłówek: `--- Miasta (stolice oznaczono *) ---`, a w kolejnych listę miast w państwach i gwiazdkę przy mieście które jest stolicą tak, jak poniżej:

   ```text
   --- Miasta (stolice oznaczono *) ---
   Polska: 
       Warszawa*, Kraków, Wrocław
   Niemcy: 
       Hamburg, Berlin*, Monachium
   Czechy: 
       Brno, Ostrawa, Praga*
   ```

   > Pamiętaj, aby nie używać indeksowania z wykorzystaniem bezpośrednich wartości. Odnajdź stolicę używając porównania wartości z tablicy `cities` (z poprzedniego zadania) i tablicy `capitals` (z tego zadania).

---

### Zadanie 4 - Populacja (4 pkt)

1. W klasie [`exam/Statistics.java`](src/exam/Statistics.java) zadeklaruj tablicę do przechowywania populacji każdego państwa oraz drugą tablicę do przechowywania populacji każdego z głównych miast.
1. Tablice powinny być statyczne (`static`) oraz wypełnione wartościami, odpowiednio:
   - 38_476_269 dla Polski,
   - 80_594_017 dla Niemiec,
   - 10_674_723 dla Czech,

   oraz

   - 1_753_977 dla Warszawy, 765_320 dla Krakowa, 696_503 dla Wrocławia,
   - 3_520_031 dla Berlina, 1_787_408 dla Hamburga, 1_450_381 dla Monachium,
   - 1_313_508 dla Pragi, 377_440 dla Brna, 294_200 dla Ostrawy,
   
1. We wskazanym miejscu w metodzie `main` napisz fragment kodu, który wyświetli w pierwszej linii nagłówek: `--- Populacje ---`, a w kolejnych liniach listę państw i miast z ich populacjami tak, jak poniżej:

   ```text
   Polska (38476269): 
       Warszawa (1753977)*, Kraków (765320), Wrocław (696503)
   Niemcy (80594017): 
       Hamburg (1787408), Berlin (3520031)*, Monachium (1450381)
   Czechy (10674723): 
       Brno (377440), Ostrawa (294200), Praga (1313508)*
   ```
   
   > Zwróć uwagę, że gwiazdka `*` oznaczająca stolicę dalej jest wyświetlana.

---

### Zadanie 5 - Populacja pozostałych miast (6 pkt)

1. We wskazanym miejscu w klasie [`exam/Statistics.java`](src/exam/Statistics.java) w metodzie `main` napisz fragment kodu, który wyświetli w pierwszej linii nagłówek: `--- Populacje (z podziałem na najważniejsze miasta i pozostałe) ---`, a w kolejnych liniach listę państwa i miast z ich populacjami oraz dodatkową informacje o populacji w pozostałych miastach danego państwa tak, jak niżej:

   ```text
   --- Populacje (z podziałem na najważniejsze miasta i pozostałe) ---
   Polska (38476269): 
       Warszawa (1753977)*, Kraków (765320), Wrocław (696503), _Pozostałe (35260469)
   Niemcy (80594017): 
       Hamburg (1787408), Berlin (3520031)*, Monachium (1450381), _Pozostałe (73836197)
   Czechy (10674723): 
       Brno (377440), Ostrawa (294200), Praga (1313508)*, _Pozostałe (8689575)
   ```

   > Populację dla `_Pozostałe` oblicz jako różnicę populacji całego państwa i populacji podanych miast. Nie twórz nowej tablicy do przechowywania tej informacji.
   
---

### Zadanie 6 - Nowe państwo (6 pkt)

1. Wybierz dowolne państwo inne niż _Polska_, _Czechy_ i _Niemcy_.
1. W klasie [`exam/Statistics.java`](src/exam/Statistics.java) uzupełnij każdą z tabel o informacje dotyczące wybranego przez Ciebie państwa. Pamiętaj, że Twoje państwo powinno mieć stolicę oraz **4** (**tak, 4 a nie 3**) najważniejsze miasta. Uzupełniona musi być również informacja o populacji tego państwa i populacji wszystkich miast.
1. Po uzupełnieniu danych uruchom program bez żadnych innych modyfikacji. Program powiniene działać.

> Twój program powinien wymagać tylko i wyłącznie modyfikacji linii kodu odpowiedzialnych za zadeklarowanie i wypełnienie wartościami tablicy. Jeżeli konieczne było zmodyfikowanie fragmentów kodu odpowiedzialnych za wyświetlanie, to zadanie uważa się za niepoprawne.

---

## Gratulacje!

Zakończyłeś/aś egzamin, gratuluję! Upewnij się, że Twoje rozwiązania zostały dodane (`git add .`), zakomitowane (`git commit -m "Rozwiązania egzaminu"`) oraz wypchnięte (`git push`). Na koniec pamiętaj, aby wykonać `pull-request` ze swojego forka do repozytorium głównego.


[Good job!](https://www.youtube.com/watch?v=S0UvJZmGTsk)