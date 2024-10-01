**Implementación de la Lista de Gastos**

1. [x] Implementa una lista de gastos utilizando una colección de Java adecuada (por ejemplo, ArrayList)   

**Gestión de Gastos en la Clase User**

2. [x] En la clase User, agrega una propiedad expenses de tipo List<Expense>.

3. [x] Inicializa la lista en el constructor de User.

**Interfaces para Gestión de Gastos**

4. [ ] Genera una interfaz funcional y otra con métodos, que definan métodos para validar gastos, calcular gastos, etc. 

**Uso de Genéricos en Colecciones**

5. [ ] Utiliza genéricos para manejar distintos tipos de datos en las colecciones.

6. [ ] Asegúrate de que las listas y otros tipos de colecciones utilicen genéricos para especificar el tipo de objetos que contendrán.

**Programación Funcional con Streams**

7. [ ] Aplica programación funcional para realizar operaciones sobre las colecciones, como filtrado y mapeo de gastos.

8. [ ] Utiliza streams para filtrar gastos por categoría o por rango de fechas.


**Ejemplo**

`List<Expense> filteredExpenses = expenses.stream().filter(expense -> expense.getCategory().equals("Food")).collect(Collectors.toList());
`

**Tips**

Revisa la documentación de las colecciones de Java para seleccionar la más adecuada para tu necesidad.

Explora las funciones lambda y streams de Java para simplificar operaciones sobre colecciones.

Asegúrate de que tus métodos sean robustos y manejen correctamente las excepciones.