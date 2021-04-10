# Назначение программы
Данная программа предназначена для сортировки массива по выбранному пользователем алгоритму. Пользователь может создать новый массив и отсортировать его с помощью 3-х предложенных алгоритмов:
* Пузырьковая
* Выбором
* Вставками
# Область применения программы
* Стратегия позволяет варьировать поведение объекта во время выполнения программы, подставляя в него различные объекты-поведения (например, отличающиеся балансом скорости и потребления ресурсов).
* Стратегия позволяет вынести отличающееся поведение в отдельную иерархию классов, а затем свести первоначальные классы к одному, сделав поведение этого класса настраиваемым.
* Стратегия позволяет изолировать код, данные и зависимости алгоритмов от других объектов, скрыв эти детали внутри классов-стратегий.
* Стратегия помещает каждую лапу такого оператора в отдельный класс-стратегию. Затем контекст получает определённый объект-стратегию от клиента и делегирует ему работу. Если вдруг понадобится сменить алгоритм, в контекст можно подать другую стратегию.
# Описание проекта
Проект представляет собой оконное приложение. Изначальный вид проекта - AnchorPane с расположенными на ней Button для создания нового массива, два TextField для вывода нового и отсортированного массива, три Button для выбора алгоритма отсортировки. Ко всем элементам прилагаются label-подписи.
# Паттерн
Стратегия — это поведенческий паттерн проектирования, который определяет семейство схожих алгоритмов и помещает каждый из них в собственный класс, после чего алгоритмы можно взаимозаменять прямо во время исполнения программы.
# Реализация проекта
Проект построен согласно диаграмме классов.
