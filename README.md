# Algorytmy i struktury danych  


## Metody dokładne
### 1. Metoda „brutalnej siły”  

Polega na mechanicznym przeglądaniu wszystkich stanów należących do przestrzeni stanów. Dobra metoda „brutalnej siły” musi zagwarantować, aby każdy stan był sprawdzany dokładnie jeden raz. Oznacza to, że nie może być pominięty żaden ze stanów, gdyż w ten sposób podczas poszukiwań mógłby być pominięty poszukiwany stan końcowy. Oprócz tego żaden ze stanów nie powinien być sprawdzany wielokrotnie, gdyż tak sytuacja mogłaby znacznie spowolnić przeszukiwanie przestrzeni stanów. Zastosowanie tej metody wymaga więc ustalenia pewnego porządku zgodnie z którym będą przeglądane stany. Porządek przeglądania stanów zwykle jest ustalany zupełnie bez uwzględnienia ewentualnych reguł przechodzenia pomiędzy stanami.

Przykłady: [2.1.4](https://github.com/piotranon/Algorytmy_i_struktury_danych#214)

### 2. Metoda „generowania i testowania”  

Polega na generowaniu kolejnych stanów według określonych zasad i badanie ich własności, w celu wychwycenia stanów końcowych. Zasady generowania obiektów nazywane są operatorami przekształcającymi lub regułami produkcyjnymi. Rozwiązanie tak postawionego problemu sprowadza się więc do określenia ciągu operatorów przekształcających stan początkowy w stan końcowy. Dla pojedynczego stanu jest zazwyczaj możliwe (choć nie zawsze) zastosowanie kilku operatorów. Aby jednak móc stosować operatory, trzeba je najpierw zdeﬁniować. W tym celu trzeba wiedzieć pomiędzy jakimi stanami jest możliwe łagodne przejście oraz pomiędzy którymi stanami jest to niemożliwe. Wiedza ta wynika z opisu problemu i jest nierozerwalnie związana ze środowiskiem problemu. 

Przykłady: [2.2.5](https://github.com/piotranon/Algorytmy_i_struktury_danych#225)

### 3. Metoda „dziel i zwyciężaj”  

Ogólnie, mówiąc stosowanie tej metody polega na tym, że zamiast rozwiązywać wejściowy problem, który może być problemem trudnym, próbuje się wskazać jeden lub więcej innych problemów, które są łatwiejsze do rozwiązania, a ich rozwiązanie pozwala na skonstruowanie rozwiązania problemu wejściowego. Jedno z praktycznych podejść do rozwiązywania problemów metodą „dziel i zwyciężaj” jest takie, że wejściowy problem jest dzielony na kilka mniejszych podproblemów podobnych do początkowego problemu, ale mających mniejsze rozmiary. Następnie podproblemy te są rozwiązywane. Na koniec rozwiązania wszystkich podproblemów są łączone w celu utworzenia rozwiązania problemu wejściowego.

Przykłady: [2.3.2](https://github.com/piotranon/Algorytmy_i_struktury_danych#232)

### 4. Programowanie dynamiczne  

Podobnie jak w metodzie „dziel i zwyciężaj”, konstruuje się na podstawie rozwiązań jego podproblemów. Jednakże w metodzieprogramowaniadynamicznegowynikirozwiązańpodproblemówzapamiętywanesąwtablicy. Pozwala to wyeliminować problem wielokrotnego rozwiązywania tych samych podproblemów, charakterystyczny dla metody „dziel i zwyciężaj”. W metodzie „programowania dynamicznego” każdy podproblem rozwiązuje się tylko raz.

Przykłady: [2.4.1](https://github.com/piotranon/Algorytmy_i_struktury_danych#241) , [Newton](https://github.com/piotranon/Algorytmy_i_struktury_danych/blob/master/src/Newton_dynamic.java)

### 5. Programowanie liniowe  

Programowanie matematyczne jest działem matematyki poświęconym teorii i praktycznym algorytmom wyznaczania ekstremum funkcji wielu zmiennych przy ograniczeniach na obszar ich zmienności. W odróżnieniu od analitycznej teorii badania ekstremów funkcji, programowanie matematyczne zajmuje się tymi zadaniami, w których ograniczenia aktywnie wpływają na poszukiwane ekstrema. W praktycznych zastosowaniach, najczęściej pojawiającą się sytuacją jest przypadek, gdy funkcja ekstremalizowana oraz warunki ograniczające podawane są w postaci liniowej. Wtedy mówimy o odmianie programowania matematycznego, które jest nazywane programowaniem liniowym. 

## Metody aproksymacyjne

### 1. Metoda wspinaczkowa

Działanie jej polega na tym, że na danym etapie przeszukiwania, do dalszej ekspansji wybierany jest ten spośród stanów możliwych do wygenerowania ze stanu bieżącego, który wydaje się najbardziej obiecujący z punktu widzenia dotarcia w czasie przeszukiwania do stanu końcowego. Postępowanie podejmowane w startegii zachłannej jest podobne do akcji turysty atakującej szczyt wzniesienia. Chcąc jak najszybciej osiągnąć sukces, wybiera on aktualnie najlepszy kierunek, chociaż w trakcie dalszej wspinaczki decyzja ta może okazać się błędna i kierunek w danej chwili gorszy, może być w perspektywie całej wspinaczki lepszy. Ze względu na powyższą analogię, omawianą w tym podrozdziale strategię nazywamy strategią wspinaczkową lub strategią wspinaczki górskiej (ang. hill-climbing). Dla poprawnego działania strategii wspinaczkowej konieczna jest funkcja heurystyczna, które pozwala na skuteczną ocenę jakości poszczególnych stanów, z punktu widzenia naprowadzenia procesu przeszukiwania na stan końcowy.

### 2. Algorytmy zachłanne

Algorytmy zachłanne cechują się tym, że zawsze wykonują takie działania, które w danej chwili wydają się najkorzystniejsze. Okazuje się, że podczas swej codziennej działalności, ludzie często postępują podobnie. Objawia się to tym, że rozwiązując jakieś zadanie zadawalamy się jego szybkim i w miarę poprawnym rozwiązaniem, choć niekoniecznie optymalnym. Algorytmy zachłanne nie zawsze prowadzą bowiem do optymalnych rozwiązań, choć dla wielu problemów rozwiązania jakie dostarczają algorytmy zachłanne są zupełnie wystarczające. Tak więc, algorytmy zachłanne stosujemy wtedy, gdy na podstawie pewnych danych wejściowych, należy szybko skonstruować rozwiązanie danego problemu. Bowiem algorytm zachłanny zawsze stara się jak najszybciej skonstruować rozwiązanie problemu, używając tych fragmentów danych wejściowych, które na danym etapie konstrukcji rozwiązania wydają się najbardziej użyteczne, tzn. w danym momencie najbardziej przybliżają do skonstruowania ostatecznego rozwiązania.

Przykłady: [3.2.3](https://github.com/piotranon/Algorytmy_i_struktury_danych/blob/master/src/Zad_3_2_3.java) 

### 3. Metody stochastyczne

Ogólnie mówiąc metody te polegają na tym, że zamiast systematycznie przeszukiwać całą przestrzeń stanów w celu znalezienia stanu końcowego, przegląda się tylko pewną liczbę stanów wybraną w większym lub mniejszym stopniu losowo, mając nadzieje, że pośród nich znajdzie się stan końcowy, będący rozwiązaniem optymalnym badanego problemu lub chociaż stan końcowy, będący zadawalającym nas rozwiązaniem prawie optymalnym. Tak więc, każde rozwiązanie stochastyczne ma w sobie pewien element losowy, wyrażający się w niedeterministycznym wyborze kolejnych stanów, które są badane w czasie przeszukiwania przestrzeni stanów. Ze względu na sposób wybierania badanych stanów wyróżnia się dwa typy metod stochastycznych. Są to tzw. metody globalne oraz metody lokalne.

  * #### 3.1 Metody globalne

Metody globalne nie wyróżniają podczas przeszukiwania żadnych konkretnych stanów. Jedną z najprostszych tego typu metod jest tzw. metoda Monte Carlo. Działa ona w ten sposób, że najpierw losowana jest pewna liczba stanów, po czym spośród nich wybierany jest taki stan, który najbardziej jest zbliżony do wymagań stawianych optymalnemu stanowi końcowemu. Ten właśnie stan zwracany jest jako rozwiązanie analizowanego problemu. Aby z odpowiednio wysokim prawdopodobieństwem uzyskać zadawalające rozwiązanie analizowanego problemu, należy przebadać odpowiednio wybraną próbkę stanów należących do badanej przestrzeni stanów. Próbka ta musi być reprezentatywna oraz mieć odpowiednią wielkość.

   * #### 3.1 Metody lokalne

Przeszukiwanie przestrzeni stanów rozpoczynają od jednego lub czasem kilku losowo wybranych stanów. Następnie sprawdzany jest stan (wybrany w większym lub mniejszym stopniu losowo), który w jakimś sensie jest stanem sąsiednim do analizowanego wcześnie stanu (np. jest bardzo bliski w sensie deﬁniowanej wcześniej odległości pomiędzy stanami). Klasycznym przykładem tego typu metody jest strategia o nazwie błądzenie losowe, która opiera się właśnie na mocno intuicyjnym przypuszczeniu, że poruszając się od stanu do stanu, bez żadnej konkretnej strategii (czyli na sposób „losowy”), natraﬁ się kiedyś na stan końcowy. Strategia ta działa w ten sposób, że kolejny stan wybierany jest losowo spośród tych stanów, które możliwe są do osiągnięcia ze stanu bieżącego. Zatem strategia ta wykorzystuje operatory przejścia od stanu do stanu, przy czym przy przejściu od stanu do stanu, wybierany jest losowo jeden operator spośród tych, które są możliwe do zastosowania w danym stanie.


## Zadania

### 2.1.4
Metodą [„brutalnej siły”](https://github.com/piotranon/Algorytmy_i_struktury_danych#1-metoda-brutalnej-si%C5%82y) rozwiązać problem doboru załogi statku kosmicznego (patrz podrozdział [A.4](https://github.com/piotranon/Algorytmy_i_struktury_danych#a4-problem-doboru-za%C5%82ogi-statku-kosmicznego)).

Rozwiązania: [2.1.4](https://github.com/piotranon/Algorytmy_i_struktury_danych/blob/master/src/Zad_2_1_4.java)

### 2.2.5
Metodą [przeszukiwania z powracaniem](https://github.com/piotranon/Algorytmy_i_struktury_danych#2-metoda-generowania-i-testowania) rozwiązać problem wyprodukowania lodów wszystkich smaków (patrz podrozdział [A.5](https://github.com/piotranon/Algorytmy_i_struktury_danych#a5-problem-wyprodukowania-lod%C3%B3w-wszystkich-smak%C3%B3w)).

Rozwiązania: [2.2.5](https://github.com/piotranon/Algorytmy_i_struktury_danych/blob/master/src/Zad_2_2_5.java) 

### 2.3.2 
Jak za pomocą metody [„dziel i zwyciężaj”](https://github.com/piotranon/Algorytmy_i_struktury_danych#3-metoda-dziel-i-zwyci%C4%99%C5%BCaj) rozwiązać problem odgadywania liczby (patrz podrozdział [A.6](https://github.com/piotranon/Algorytmy_i_struktury_danych#a6-problem-odgadywania-liczby)).

Rozwiązania: [2.3.2v1](https://github.com/piotranon/Algorytmy_i_struktury_danych/blob/master/src/Zad_2_3_2.java) , [2.3.2v2](https://github.com/piotranon/Algorytmy_i_struktury_danych/blob/master/src/Zad_2_3_2_2.java) , [2.3.2v3](https://github.com/piotranon/Algorytmy_i_struktury_danych/blob/master/src/Zad_2_3_2_3.java)

### 2.4.1
Użyj metody [programowania dynamicznego](https://github.com/piotranon/Algorytmy_i_struktury_danych#4-programowanie-dynamiczne) do rozwiązania decyzyjnego problemu plecakowego (patrz podrozdział [A.1](https://github.com/piotranon/Algorytmy_i_struktury_danych#a1-decyzyjny-problem-plecakowy)).

Rozwiązania: [2.4.1](https://github.com/piotranon/Algorytmy_i_struktury_danych/blob/master/src/Zad_2_4_1.java)

### 3.2.3
Skonstruuj [algorytm zachłanny]() rozwiązujący problem doboru załogi statku kosmicznego [A.4]().

Rozwiązania: [3.2.3](https://github.com/piotranon/Algorytmy_i_struktury_danych/blob/master/src/Zad_3_2_3.java) 

## Problemy
### A.1. Decyzyjny problem plecakowy  
Zadania:  [2.4.1](https://github.com/piotranon/Algorytmy_i_struktury_danych#241)

Rozwiązania: [2.4.1](https://github.com/piotranon/Algorytmy_i_struktury_danych/blob/master/src/Zad_2_4_1.java)

Dany jest plecak o objętości v = 10 oraz 6 przedmiotów ponumerowanych od 0 do 5. Każdy przedmiot ma określoną wartość Wi i objętość Vi. Należy zapakować plecak spośród przedmiotów ponumerowanych od 0 do 5 w taki sposób, aby wartość przedmiotów w nim zgromadzonych była największa. Wartości i objętości przedmiotów określone są w poniższej tabeli:  

| i | 0 | 1 | 2 | 3 | 4 | 5 |
| - | - | - | - | - | - | - |
| Vi | 6 | 2 | 3 | 2 | 3 | 1 |
| Wi | 6 | 4 | 5 | 7 | 10 | 2 |    

Odp: W plecaku o maksymalnej wartości znajdą się przedmioty 1,2,3,4 o wartości 26.

### A.2. Ogólny problem plecakowy

Dany jest plecak o objętości v = 23 oraz nieograniczona liczba egzemplarzy 6 różnych przedmiotów ponumerowanych od 0 do 5. Każdy przedmiot ma określoną wartość Wi i objętość Vi. Należy zapakować plecak spośród przedmiotów ponumerowanych od 0 do 5 w taki sposób, aby wartość przedmiotów w nim zgromadzonych była największa. Wartości i objętości przedmiotów określone są w poniższej tabeli:

| i | 0 | 1 | 2 | 3 | 4 | 5 |
| - | - | - | - | - | - | - |
| Vi | 6 | 2 | 3 | 2 | 3 | 1 |
| Wi | 6 | 4 | 5 | 7 | 10 | 2 |

**Odp:** W plecaku o maksymalnej wartości znajdzie się dziesięć przedmiotów z numerem 3 i jeden przedmiot z numerem 4. Łączna wartość przedmiotów w plecaku wyniesie 80.

### A.3. Problem liczb pitagorejskich

Liczby pitagorejskie - to trzy liczby naturalne x, y, z, które spełniają warunek x^2 +y^2 = z^2. Znaleźć wszystkie takie trójki liczb, przy założeniu, że każda z tych liczb ma należy do zbioru {1,...,30}.

### A.4. Problem doboru załogi statku kosmicznego 

Zadania:  [2.1.4](https://github.com/piotranon/Algorytmy_i_struktury_danych#214)

Rozwiązania: [2.1.4](https://github.com/piotranon/Algorytmy_i_struktury_danych/blob/master/src/Zad_2_1_4.java)

Organizowana jest załogowa ekspedycja kosmiczna na Marsa. W ramach kompletowania załogi statku kosmicznego główny organizator ekspedycji ma rozwiązać następujący problem. Do jego dyspozycji jest pięciu kosmonautów (k1, k2, k3, k4, k5), którzy przeszli pozytywnie kwaliﬁkację wstępną do udziału w ekspedycji. Na pokładzie specjalnego statku kosmicznego spośród nich będzie potrzebny przynajmniej jeden specjalista w każdej z dziedzin: A, B, C i D. Wiadomym jest, że w dziedzinie A specjalizują się kosmonauci k1 i k4, w dziedzinie B specjalizują się kosmonauci k2, k3 i k4, w dziedzinie C specjalizują się kosmonauci k3 i k5 oraz w dziedzinie D specjalizują się kosmonauci k1, k2 i k5. Ze względu na szczupłość miejsca na pokładzie statku kosmicznego, z powyższej piątki trzeba wybrać jak najmniejszą grupkę kosmonautów, tak aby znajdował się w niej przynajmniej jeden specjalista w każdej z dziedzin A, B, C, D.

**Odp:** Na Marsa mogą polecieć np. kosmonauci k4 i k5.

### A.5. Problem wyprodukowania lodów wszystkich smaków 

Zadania:  [2.2.5](https://github.com/piotranon/Algorytmy_i_struktury_danych#225)

Rozwiązania: [2.2.5](https://github.com/piotranon/Algorytmy_i_struktury_danych/blob/master/src/Zad_2_2_5.java)

Fabryka lodów każdego dnia produkuje na tej samej maszynie lody o sześciu różnych smakach. Zmiana produkcji ze smaku i na smak j wymaga przestrojenia maszyny, czyli przygotowania (w tym umycia) do nowej produkcji, które trwa określony czas. Podana niżej tablica zawiera informację o czasach przestrojenia maszyny.

| i \ j | 1 | 2 | 3 | 4 | 5 | 6 |
| - | - | - | - | - | - | - |
| 1 | 0 | 7 | 20 | 21 | 12 | 23 |
| 2 | 27 | 0 | 13 | 16 | 46 | 5 |
| 3 | 53 | 15 | 0 | 25 | 27 | 6 |
| 4 | 16 | 2 | 35 | 0 | 47 | 10 |
| 5 | 31 | 29 | 5 | 18 | 0 | 4 |
| 6 | 28 | 24 | 1 | 17 | 5 | 0 |

Znaleźć kolejność produkcji, przy której całkowity czas przestrojenia maszyny jest minimalny.Przyjąć,żenakoniecdniamaszynamabyćprzygotowanadoprodukcjiwnastępnymdniu.

**Odp:** Minimalny całkowity czas przestrojenia maszyny wynosi 63. Oto przykładowa kolejność produkcji lodów, dla której całkowity czas przestrojenia maszyny jest minimalny: 1, 2, 6, 5, 3, 4, 1.

### A.6. Problem odgadywania liczby
Zadania:  [2.3.2](https://github.com/piotranon/Algorytmy_i_struktury_danych#232)

Rozwiązania: [2.3.2v1](https://github.com/piotranon/Algorytmy_i_struktury_danych/blob/master/src/Zad_2_3_2.java) , [2.3.2v2](https://github.com/piotranon/Algorytmy_i_struktury_danych/blob/master/src/Zad_2_3_2_2.java) , [2.3.2v3](https://github.com/piotranon/Algorytmy_i_struktury_danych/blob/master/src/Zad_2_3_2_3.java)

Jak odgadnąć liczbę pomyślaną przez rozmówcę z zakresu od 0 do 1000, zadając jak najmniejszą liczbę pytań rozmówcy? Przy czym, pytania zadawane rozmówcy muszą być jedynie typu: „Czy to jest liczba 546?”, na które rozmówca może odpowiadać na jeden z następujących sposobów: „TAK”, „ZA MAŁA” lub „ZA DUŻA”.

### A.7. Problem planowania produkcji mebli 

Wytwórca mebli produkuje stoły, krzesła, biurka i szafy biblioteczne. Do produkcji wykorzy-stuje dwa typy desek. W magazynie wytwórca posiada 1500 m pierwszego typu desek i 1000 m drugiego. Dysponuje kapitałem 860 godzin roboczych na wykonanie całej pracy. Przewidywane zapotrzebowanie plus potwierdzone zamówienia wymagają wykonania co najmniej 40 stołów, 130 krzeseł, 30 biurek i nie więcej niż 10 szaf bibliotecznych. Każdy stół, krzesło, biurko i szafa biblioteczna wymaga odpowiednio 5, 1, 9 i 12 m desek pierwszego typu i 2, 3, 4 i 1 m desek drugiego typu. Na wykonanie stołu potrzebne są 3 godziny pracy, krzesła 2 godziny, biurka 5 godzin i szafy bibliotecznej 10 godzin. Przy sprzedaży jednego stołu, krzesła, biurka i szafy bibliotecznej wytwórca osiąga zysk odpowiednio 48 złotych, 20 złotych, 60 złotych i 40 złotych. Zaplanować produkcję mebli w ten sposób, aby wytwórca wywiązał się z przyjętych zamówień i osiągnął maksymalny zysk.

**Odp:** Wytwórca otrzyma maksymalny zysk 11600 złotych, jeżeli wyprodukuje 150 stołów, 130 krzeseł i 30 biurek.

### A.8. Problem planowania diety dziecka

Matka chce, aby jej dzieci otrzymały pewne ilości czynników odżywczych w porannej owsiance. Dzieci mogą wybrać płatki owsiane firmy A lub firmy B albo mieszaninę tych dwóch. Ich śniadanie powinno zawierać co najmniej 1 mg witaminy B1, 5 mg witaminy P P i 400 kalorii. Wiadomo, że 30 g płatków firmy A zawiera 0.1 mg witaminy B1, 1 mg witaminy P P i 110 kalorii. Natomiast 30 g płatków firmy B zawiera 0.25 mg witaminy B1, 0.25 mg witaminy P P i 120 kalorii. Cena 30 g płatków firmy A i płatków firmy B wynosi odpowiednio 16 i 18 groszy. W jaki sposób należy przyrządzić poranna owsiankę, aby spełnione były warunki zdrowotne, a cena produktów była możliwie najniższa.

**Odp:** Minimalny koszt 116 groszy uzyskamy, jeśli przyrządzimy śniadanie z 5 porcji płatków firmy A i 2 porcji płatków firmy B.

### A.9. Problem planowania zawartości zestawu paszowego 

W zestaw paszowy bydła w okresie zimowym wchodzą trzy składniki: siano, kiszonka i pasza treściwa, które zawierają trzy rodzaje podstawowych składników odżywczych, takich jak: białko, wapno i witaminy. Ich zawartość w kilogramie paszy, ceny (w złotówkach za kilogram) oraz minimalne normy dzienne (w kilogramach) niezbędne do prawidłowego odżywiania bydła podaje poniższa tabelka.

| Rodzaje paszy | białko | wapno | witaminy | Ceny |
| --- | --- | --- | -- | -- |
| Siano | 50 | 6 | 2 | 3 |
| Kiszonka | 20 | 4 | 1 | 2 |
| Pasza treściwa | 180 | 3 | 1 | 5 |
| Mineralne normy dzienne | 2 000 | 120 | 40 | - |

Ustalić dzienny zestaw paszowy o minimalnych kosztach przy dodatkowym założeniu, że w normie dziennej ilość siana nie przekroczy 10 kilogramów.

**Odp:** Minimalny koszt 91 złotych uzyskamy dla zestawu paszowego: 10 kg siana, 13 kg kiszonki, 7 kg paszy treściwej.

### A.10. Problem czterech hetmanów 

Jak umieścić 4 hetmanów na szachownicy 4x4 tak, aby nie biły się wzajemnie, tzn. żadnych dwóch hetmanów nie było umieszczonych w tym samym wierszu, kolumnie lub na przekątnej szachownicy.

**Odp:** Oto przykładowy rozkład hetmanów na szachownicy:

| &nbsp; | **X** | &nbsp; | &nbsp; |
| --- | --- | --- | --- |
| &nbsp; | &nbsp; | &nbsp; | **X** |
| **X** | &nbsp; | &nbsp; | &nbsp; |
| &nbsp; | &nbsp; | **X** | &nbsp; |

### A.11. Problem planowania liczebności klas 

Zaplanować liczbę uczniów w klasach Ia, Ib, Ic, Id przy założeniu, że do szkoły przyjęto 68 dziewcząt i 54 chłopców. Maksymalna liczba uczniów w poszczególnych klasach może wynosić:

| Ia | 32 |
| - | - |
| Ib | 28 |
| Ic | 34 |
| Id | 36 |

Dodatkowo wymaga się, aby w poszczególnych klasach liczba dziewcząt była większa lub równa liczbie chłopców.

**Odp:** W poniższej tabeli podany jest przykładowy rozkład uczniów w klasach:

| &nbsp; | ch | dz |
| - | - | - |
| Ia | 5 | 19 |
| Ib | 14 | 14 |
| Ic | 17 | 17 |
| Id | 18 | 18 |

### A.12. Problem wysyłania pociągów 

Z miejscowości wypoczynkowej można w końcu sezonu wysłać najwyżej 12 pociągów dziennie. Są to pociągi spalinowe (tzn. z lokomotywami o napędzie spalinowym) albo elektryczne (tzn. z lokomotywami o napędzie elektrycznym). Wszystkie miejsca w tych pociągach są numerowane (czyli są to tzw. „miejscówki”). w skład każdego pociągu spalinowego wchodzi 2 wagony 80-osobowe i 4 wagony 48-osobowe. Natomiast w skład każdego pociągu elektrycznego wchodzi 5 wagonów 80-osobowych i 2 wagony 48-osobowe. Stacja może wysłać dziennie najwyżej 42 wagony 80-osobowe i najwyżej 40 wagonów 48 osobowych. Ile i jakich pociągów należy wysłać dziennie, aby liczba przewiezionych pasażerów była możliwie największa? Przyjąć, że liczba lokomotyw każdego rodzaju nie jest ograniczona.

**Odp:** Liczba przewiezionych pasażerów będzie największa i wyniesie 5088 osób, jeżeli będziemy codziennie wysyłać 6 pociągów spalinowych i 6 pociągów elektrycznych.

### A.13. Problem przydziału maszyn 

Fabryka produkuje dwa modele: A i B. Każdy model musi kolejno przejść przez dwie maszyny I i II. Dla wykonania każdego egzemplarza A maszyna I musi pracować jedna godzinę, a maszyna II - 2.5 godziny. Dla wykonania modelu B maszyny I i II muszą pracować odpowiednio 4 godziny i 2 godziny. Maszyna I może być w ruchu najwyżej 8 godzin dziennie, a maszyna II - 12 godzin. Każdy model A przynosi 120 złotych zysku, natomiast każdy model B przynosi 160 złotych zysku. Ilu sztuk każdego modelu powinna produkować dziennie fabryka, aby zysk ze sprzedaży był możliwie największy?

**Odp:** Zysk ze sprzedaży będzie największy i wyniesie 640 złotych, jeżeli fabryka wyprodukuje dziennie 4 sztuki modelu A i 1 sztukę modelu B.

### A.14. Problem transportu węgla 

Kopalnie A i B dostarczają węgiel do miast C, D i E. Kopalnia A dostarcza dziennie 500 ton, natomiast kopalnia B dostarcza dziennie 800 ton węgla. Miasta C, D i E zużywają odpowiednio 500, 400 i 400 ton węgla dziennie. Koszt transportu, w dziesiątkach złotych, jednej tony węgla do poszczególnych miast podaje następująca tabelka:

| z \ do | C | D | E |
| - | - | - | - |
| A | 0 | 100 | 400 |
| B | 500 | 300 | 0 |

### A.15. Problem transportu produktów 

Pewne przedsiębiorstwo ma centrale zbytu swojego produktu w miastach Warszawa, Gdańsk i Wrocław. Centrale te posiadają odpowiednio 40, 20 i 40 jednostek produktu. Punkty sprzedaży zamówiły następujące ilości jednostek: Szczecin 25, Poznań 10, Olsztyn 20, Katowice 30, Rzeszów 15. Koszt transportu (w dziesiątkach złotych) między każdą centralą i punktem sprzedaży podaje następująca tablica:

| z \ do | Szczecin | Poznań | Olsztyn | Katowice | Rzeszów |
| - | - | - | - | - | - |
| Warszawa | 52 | 30 | 23 | 31 | 33 |
| Wrocław | 37 | 17 | 45 | 18 | 42 |
| Gdańsk | 38 | 31 | 18 | 53 | 65 |

Jak rozesłać zamówione produkty z central do punktów sprzedaży, aby koszty transportu były możliwie najmniejsze?

**Odp:** Aby uzyskać minimalny koszt transportu produktów wynoszący 2675 dziesiątek złotych, należy z central Warszawa, Wrocław i Gdańsk rozesłać do punktów sprzedaży Szczecin, Poznań, Olsztyn, Katowice i Rzeszów produkty w następujących proporcjach:

| z \ do | Szczecin | Poznań | Olsztyn | Katowice | Rzeszów |
| - | - | - | - | - | - |
| Warszawa | 0 | 0 | 20 | 5 | 15 |
| Wrocław | 5 | 10 | 0 | 25 | 0 |
| Gdańsk | 20 | 0 | 0 | 0 | 0 |

### A.16. Problem produkcji samochodów 

Fabryka samochodów produkuje samochody osobowe i ciężarowe. Fabryka składa się z czterech oddziałów: 1-budowa nadwozi, 2-budowa silników, 3-montaż samochodów osobowych, 4-montaż samochodów ciężarowych. Miesięcznie zdolności produkcyjne tych oddziałów są następujące. Pierwszy oddział może wyprodukować maksymalnie 1000 nadwozi do samochodów osobowych oraz 2000 nadwozi do samochodów ciężarowych. Drugi oddział może wyprodukować maksymalnie 1200 silników do samochodów osobowych oraz 1440 silników do samochodów ciężarowych. Trzeci oddział może zmontować maksymalnie 1100 samochodów osobowych. Natomiast czwarty oddział może zmontować maksymalnie 1200 samochodów ciężarowych. Zysk przy produkcji samochodu osobowego wynosi 3200 złotych, a przy produkcji samochodu ciężarowego 2200 złotych. Ile fabryka powinna produkować miesięcznie samochodów osobowych a ile ciężarowych, aby zysk z produkcji był największy?

**Odp:** Maksymalny zysk 5840000 złotych uzyskamy, jeżeli fabryka wyprodukuje co miesiąc 1000 samochodów osobowych i 1200 samochodów ciężarowych.

### A.17. Problem transportu koni 

Pewna firma jest właścicielem pięciu stadnin koni: A, B, C, D i E. Po inwentaryzacji stwier-dzono, że w stadninie A jest o 8, a w stadninie B o 6 koni za dużo. Konie te postanowiono rozdzielić między pozostałe gospodarstwa następująco: 5 koni posłać do gospodarstwa C, 5 do D oraz 4 do E. Koszty transportu koni pomiędzy stadninami w dziesiątkach złotych podaje następująca tabela.

| z \ do | C | D | E |
| - | - | - | - |
| A | 16 | 10 | 15 |
| B | 10 | 12 | 10 |

Jak rozesłać konie z gospodarstw A i B, aby koszt transportu był najmniejszy?

**Odp:** Aby uzyskać minimalny koszt transportu koni wynoszący 155 dziesiątek złotych, należy ze stadnin A i B przetransportować do stadnin C, D i E konie w następujących ilościach:

| z \ do | C | D | E |
| - | - | - | - |
| A | 0 | 5 | 3 |
| B | 5 | 0 | 1 |

### A.18. Problem cięcia bel materiałów tekstylnych

Producent materiałów tekstylnych dostarcza swoje wyroby klientom cięte w belach, przy czym posiada on dwie maszyny tnące A i B. Maszyna A może ciąć standardową belę o szerokości 250 cm, a maszyna B może ciąć standardową belę o szerokości 200 cm. Bele są sprzedawane w kilku szerokościach proponowanych przez klientów. Zamówienia określają więc żądane szero-kości oraz wymieniają ilość bel jaka ma być dostarczona z każdej szerokości. Przy dopasowaniu listy zamówień do dostępnych bel standardowych i maszyn tnących, zwykle zdarza się, że na skutek obcinania zbywających kawałków końcowych straty są nieuniknione. Problem polega więc na dopasowaniu zamówień do bel i maszyn w taki sposób, aby obniżyć straty do absolutnego minimum. Zgodnie z ostatnimi zamówieniami, należy pociąć standardowe bele w taki sposób, aby otrzymać: 862 bele o szerokości 112 cm, 341 bel o szerokości 90 cm, 87 bel o szerokości 77 cm i 216 bel o szerokości 35 cm. Zakładamy, że jest dostępne tyle standardowych bel, ile jest konieczne i że wszystkie cięcia wykonywane są celem uzyskania tylko bel o zamówionych szerokościach.

### A.19. Problem najkrótszej drogi 

Wyznaczyć najkrótszą drogę z Warszawy do Sofii, korzystając z sieci połączeń przedstawionej w poniższej tabeli, gdzie w przypadku istniejącego połączenia pomiędzy miastami, podane są odległości (w kilometrach). Natomiast jeśli pomiędzy dwoma miastami nie ma bezpośredniego połączenia - zamiast odległości umieszczono słowo: brak.

| Miasta | Warszawa | Katowice | Zakopane | Lwów | Wiedeń | Budapeszt | Bukareszt | Zagrzeb | Sofia |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| Warszawa | 0 | 300 | 402 | 356 | brak | brak | brak | brak | brak |
| Katowice | 300 | 0 | brak | brak | 440 | 474 | brak | brak | brak |
| Zakopane | 402 | brak | 0 | brak | brak | 330 | brak | brak | brak |
| Lwów | 356 | brak | brak | 0 | brak | brak | 823 | brak | brak |
| Wiedeń | brak | 440 | brak | brak | 0 | brak | brak | 430 | brak |
| Budapeszt | brak | 474 | 330 | brak | brak | 0 | 813 | 365 | 774 |
| Bukareszt | brak | brak | brak | 823 | brak | 813 | 0 | brak | 403 |
| Zagrzeb | brak | brak | brak | brak | 430 | 365 | brak | 0 | 768 |
| Sofia | brak | brak | brak | brak | brak | 774 | 403 | 768 | 0 |

**Odp:** Najkrótsza droga z Warszawy do Sofii ma długość 1506 km i prowadzi przez Zakopane oraz Budapeszt.

### A.20. Problem przewidywania liczebności populacji królików

W roku 1202 Leonardo Fibonacci sformułował następujący, obecnie bardzo popularny w infor-matyce problem, dotyczący rozmnażania się królików. Na początku mamy parę nowonarodzonych królików i o każdej parze królików zakładamy, że:

-	nowa para staje się płodna po miesiącu życia,
-	każda płodna para rodzi jedną parę nowych królików w miesiącu,
-	króliki nigdy nie umierają.

W oparciu o powyższe warunki, Fibonacci sformułował następujące pytanie: ile będzie par kró-lików po upływie roku, które można uogólnić pytając o to: ile będzie par królików po upływie n miesięcy? Liczbę tę zwykle oznacza się przez Fn, jest ona nazywana liczbą Fibonacciego. Prze-prowadzić symulację mająca na celu stwierdzenie: po ilu miesiącach populacja królików osiągnie: 100, 1000, 10000, 100000 oraz 1 milion par.

### A.21. Problem przewidywania wzrostu PKB 

W roku 1998 produkt krajowy brutto (w skrócie PKB) Polski wyniósł 6000 dolarów, a przyrost PKB utrzymywał się na poziomie 6 procent w skali roku. Załóżmy, że przyrost PKB Polski w następnych latach utrzyma się na takim samym poziomie. Ile lat musi upłynąć, aby PKB Polski podwoił się? W roku 1998 PKB Niemiec wyniósł 12000 dolarów, a przyrost PKB utrzymywał się na poziomie 1.2 procenta w skali roku. Załóżmy, że przyrost PKB Niemiec w następnych latach utrzyma się na takim samym poziomie. Czy jest szansa, aby w ciągu następnych 20 lat PKB Polski dorównał PKB Niemiec?

**Odp:**
- PKB Polski podwoi się po 12 latach.
- PKB Polski dorówna PKB Niemiec po 15 latach.


### A.22. Problem przewidywania oprocentowania od lokaty 

Dysponujesz kwotą x złotych. Zaoferowano Ci umieszczenie tej kwoty na lokacie terminowej oprocentowanej p procent w skali roku z kapitalizacją odsetek co 6 miesięcy. Jakiej kwoty możesz się spodziewać na swoim koncie po trzech miesiącach, dziewięciu miesiącach, po roku, po dwóch latach oraz po trzech latach?

Wskazówka:

Jeśli x oznacza wkład początkowy a p oprocentowanie w skali roku na lokacie terminowej z kapitalizacją odsetek co 6 miesięcy, to po pół roku na koncie będzie kwota x1 = x + 0.5*p*x a po roku kwota x2 = x1 + 0.5*p*x1.

### A.23. Problem przewidywania przebiegu epidemii 

W pewnej zamkniętej społeczności liczącej 100000 osób pojawiło się 10 osób chorych na katar, co spowodowało „epidemię kataru”. Wiedząc, że spośród 10 osób chorych na katar każda zaraża codziennie jeszcze dwie osoby, podać przewidywany przebieg epidemii. W szczególności odpowiedzieć na pytania: kiedy będzie najwięcej chorych i kiedy epidemia wygaśnie z powodu braku osób podatnych na zachorowanie? Założyć przy tym, że katar trwa 7 dni od dnia zarażenia i przez ten okres chorzy mogą zarażać inne osoby. Oprócz tego osoby, które wyzdrowiały nie mogą już zachorować. Jak zmieni się przebieg epidemii jeśli dopuścimy, że po 2 tygodniach po wyzdrowieniu, znowu można zachorować na katar?

### A.24. Problem rozmnażania bakterii

Rozważmy proces rozmnażania bakterii. Zakładamy, że bakterie znajdują się w środowisku o stałych parametrach, w związku z czym szybkość i sposób ich rozmnażania jest stały. Wiadomo, że bakterie rozmnażają się przez podział, w którego wyniku z jednej bakterii powstaje 2 nowe. Podział ten następuje co 2 minuty. Przyjąć, że wszystkie bakterie dzielą się w tych samych chwilach. Po jakim czasie liczba bakterii zwiększy się 1000 razy, 10000 razy, 100000 razy oraz 1 mln razy.

### A.25. Problem łososi i rekinów

Pewna rodzina łososi rozwija się zgodnie z prawem Malthusa, co można wyrazić w ten sposób, że jeśli wielkość populacji w chwili t wynosi p(t), to w wyniku naturalnego rozrodu populacji w chwili t + 1 jej wielkość wynosi:

p(t + 1) = p(t) ¢ e^0.003

gdzie t jest czasem mierzonym w minutach. Rekiny, które zagnieździły się na wodach zasiedlonych przez łososie, zjadają 2 promile populacji łososi na minutę. Poza tym, ze względu na niekorzystne warunki 2 promile łososi z całej populacji na minutę odpływa z tych wód. Wiedząc, że w chwili początkowej było milion łososi, odpowiedzieć na pytanie jak będzie zmieniać się liczebność po-pulacji łososi tzn. jeśli liczebność będzie się zmniejszać, to kiedy osiągnie jakieś istotne progi (np. 1/2, 1/3, 1/10, 1/100 początkowej liczebności) oraz czy i kiedy populacja łososi na omawia-nym obszarze wymrze. Za moment wymarcia populacji łososi uważamy sytuację, kiedy liczebność łososi spadnie poniżej 100 sztuk.

### A.26. Problem utylizacji odpadów

Zakład utylizacji odpadów posiada pewną liczbę jednolitrowych butelek, które oryginalnie zawierały roztwór toksycznego związku chemicznego X o stężeniu 0.5 (50 procent związku X + 50 procent wody). Butelki są zgodnie z normą puste, ale w każdej z pozostaje 1 mililitr roztworu. Każda butelka przechodzi następujący proces płukania: dodaj V mililitrów wody, wymieszaj i wylej roztwór do cysterny. Przyjmujemy, że po wylaniu roztworu w butelce pozostaje go 1 mililitr. Proces jest powtarzany tak długo, aż stężenie X w pozostającym roztworze będzie niższe od 0.00000001. Z każdym krokiem płukania wiąże się koszt wykonanej pracy równy 0.25 grosza, podobnie pewien koszt jest związany z wylaniem roztworu do cysterny (1.5 grosza na litr wylanego roztworu). Zadanie polega na znalezieniu optymalnej zawartości V ze względu na koszty przy uwzględnieniu stężenia początkowego i wymaganego.

### A.27. Problem przelewania wody

Dane są dwa naczynia, które mogą pomieścić odpowiednio 3 litry i 4 litry wody. Naczynia nie mają miarki. Można je napełniać przy użyciu pompy lub przelewając wodę z jednego w drugie. W jaki sposób można otrzymać dokładnie 2 litry wody w naczyniu czterolitrowym?

**Odp:** Niech para (a,b), gdzie: a – ilość wody w naczyniu 3 litrowym, b – ilość wody w naczyniu 4 litrowym, reprezentuje stan ze środowiska problemu. Oto przykładowa i najkrótsza droga od stanu początkowego do stanu końcowego: (0,0) (3,0) (0,3) (3,3) (2,4) (2,0) (0,2).


### A.28. Problem wydawania reszty

Jak wydawać resztę za pomocą możliwie najmniejszej liczby monet o nominałach 1gr, 2gr, 5gr, 10gr, 20gr, 50gr, 1zł, 2zł i 5zł. Skonstruuj algorytm, do którego na wejście podajemy pewną sumę pieniędzy, czyli resztę, jaką trzeba wydawać; natomiast na wyjściu wypisywane są monety za pomocą których należy tę sumę wydać.

### A.29. Problem przeprawy przez rzekę misjonarzy i ludożerców

Pewnego dnia, trzech misjonarzy i trzech ludożerców znalazło się na jednym brzegu rzeki z zamiarem przeprawy na jej drugą stronę. Misjonarze nie byli jednak pewni czy przypadkiem ludożercy oprócz samej przeprawy przez rzekę nie mają jeszcze innych planów. Wiedzieli bowiem, że ludożercy są bardzo głodni. Dlatego misjonarze wymyślili, że przeprawa przez rzekę musi tak się odbywać, aby w dowolnym jej momencie liczba misjonarzy po obydwu stronach rzeki była zawsze nie mniejsza od liczby ludożerców po tej samej stronie rzeki. Wtedy bowiem misjonarze mieli czuć się bezpieczniej uważając, że w takiej sytuacji zjedzenie kogoś z nich przez ludożerców jest mało prawdopodobne. Jednak łódka służąca do przeprawy mogła pomieścić tylko dwie osoby. Jak więc powinna odbyć się przeprawa misjonarzy i ludożerców, aby ryzyko zjedzenia misjonarzy przez ludożerców było jak najmniejsze?

**Odp:** Oto przykładowa i najkrótsza droga od stanu początkowego do stanu końcowego:

| m | l | łódka | m | l |
| --- | --- | :---: | --- | --- |
| 3 | 3 | → | 0 | 0 |
| 3 | 1 | ← | 0 | 2 |
| 3 | 2 | → | 0 | 1 |
| 3 | 0 | ← | 0 | 3 |
| 3 | 1 | → | 0 | 2 |
| 1 | 1 | ← | 2 | 2 |
| 2 | 2 | → | 1 | 1 |
| 0 | 2 | ← | 3 | 1 |
| 0 | 3 | → | 3 | 0 |
| 0 | 1 | ← | 3 | 2 |
| 1 | 1 | → | 2 | 2 |
| 0 | 0 | ← | 3 | 3 |

### A.30. Problem przeprawy przez rzekę wilka, kozy i kapusty  

W jaki sposób można przewieźć przez rzekę wilka, kozę i kapustę bez żadnego dla nich uszczerbku łódką, która ma tylko dwa miejsca, tzn. jedno miejsce dla przewoźnika i drugie miejsce dla jednej z przewożonych rzeczy? Wiadomo jednak, że jeśli na jednym brzegu rzeki pozostanie bez opieki przewoźnika wilk i koza, to wilk zje kozę; natomiast jeśli na jednym brzegu rzeki pozostanie bez opieki przewoźnika koza i kapusta, to koza zje kapustę.

**Odp:** Niech trójka (a,b,c) – gdzie: jeśli a ma wartość 0, to wilk znajduje się na lewym brzegu rzeki, jeśli b ma wartość 0, to koza znajduje się na lewym brzegu rzeki, jeśli c ma wartość 0, to kapusta znajduje się na lewym brzegu rzeki, jeśli zmienne a,b,c mają wartość 1, to odpowiadające im obiekty ze środowiska problemu znajdują się na prawym brzegu rzeki – reprezentuje stan ze środowiska problemu. Oto przykładowa i najkrótsza droga od stanu początkowego do stanu końcowego: (0,0,0) (0,1,0) (0,1,1) (0,0,1) (1,0,1) (1,1,1).


### A.31. Problem syntezy związku chemicznego

Podczas procesu technologicznego prowadzona jest synteza pewnego związku chemicznego T z substratu S. Jednak związek T nie może być otrzymywany bezpośrednio ze związku S, gdyż potrzebne są pewne pośrednie reakcje chemiczne podczas których udział biorą także inne związki chemiczne: A, B, C, D, E i F. Wszystkie możliwe reakcje chemiczne dotyczące opisywanego procesu technologicznego wraz z ich oczekiwanymi wydajnościami zestawione są w następującej tabeli. 

| Reakcja chemiczna | Współczynnik wydajności reakcji |
| --- | --- |
| S ⇒ A | 0.40 (40%) |
| S ⇒ D | 0.70 (70%) |
| A ⇒ B | 0.65 (65%) |
| A ⇒ D | 0.80 (80%) |
| C ⇒ B | 0.70 (70%) |
| D ⇒ E | 0.45 (45%) |
| B ⇒ E | 0.85 (85%) |
| E ⇒ F | 0.66 (66%) |
| E ⇒ T | 0.66 (66%) |

Za pomocą jakiego ciągu reakcji chemicznych należy otrzymywać związek T ze związku S, aby otrzymać maksymalny współczynnik wydajności przeprowadzonych reakcji chemicznych? Przyjąć, że współczynnik wydajności dwóch następujących po sobie reakcji chemicznych jest równy iloczynowi współczynników wydajności tych reakcji.
