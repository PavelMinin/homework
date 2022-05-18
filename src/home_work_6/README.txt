
Задание 2

class TxtFileReader - считывает в строку файл Война и мир. Строка хранится в финальном поле объекта. Забирается геттером.
class StringAnalizer - анализирует строку, разбивает по словам. Помещает в лист уникальных объектов, считает повторения,
                        сортирует и выдает настраиваемый ТОП.
class StringAnalizerRunner - раннер для анализатора строки.

Задание 3

interface ISearchEngine - объявляет метод long search(String text, String word);

Задание 4

class EasySearch - реализация ISearchEngine используя метод indexOf класса String.
class RegExSearch - реализация ISearchEngine используя решулярные выражения.
class SearchEnginePunctuationNormalizer - декоратор, использующий для поиска слова в предварительно подготовленной
                        строке реализацию ISearchEngine.
class SearchEngineCaseInsensitive - декоратор, который использует реализацию ISearchEngine для поиска слова в строке,
                        предварительно обе строки переводятся в нижний регистр, поиск выполняется без учета регистра.

Задание 5

class ISearchEngineWarAndPeaceTest - тестирует и сравнивает между собой все варианты реализации ISearchEngine на книге
                        "Война и мир" и словах "война", "и", "мир".

Задание 6

class ISearchEngineTest - тестирует все варианты реализации ISearchEngine на фрагмете из текста и на кейсе различных
                        смоделированных ситуаций.

Задание 7

class HistoryLogger - логгирует историю поиска в файле result.txt. Для поиска используется реализация ISearchEngine.
class SearchInFilesRunner - раннер для поиска слов в тестовых файлах и логгирования в файле result.txt.