Дано двумерное поле из клеток, некоторые клетки пустые, некоторые - стена (на данные клетки нельзя поставить фигуру). В какой-то пустой клетке находится шахматная фигура конь. Найти все клетки, до которых можно добраться этой фигурой за N (или менее) ходов.
Задача обязательно должна быть решена рекурсивно (т.к. возможно решение и без рекурсии).

//в файле file.txt - стандартное шахматное поле 8 на 8, при необходимости размеры поля можно менять. Пустая клетка - 0, стена - 1, левый нижний угол - клетка с координатой (1,1). 
