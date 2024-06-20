## EXPLICACIÓN DE LOS METODOS EN LAS CLASES 
CLASE ControlarAspiradora
-realizarAccion: Lo que hace es verificar que la aspiradora pueda moverse a la nueva posición, actualiza la posición de la aspiradora y limpia la casilla si es necesario, descarga la batería y gestiona la capacidad de basura y por último si la batería se agota entonces entra en modo de recarga.

-limpiarCasilla: Limpia la casilla actual de la aspiradora si tiene suciedad y actualiza la cantidaz de limpieza realizada por la aspiradora.

CLASE ControladorGato
-mover: Calcula una nueva posición para el gato y verifica si el movimiento es válido y también realiza la acción de ensucair la casilla en la nueva posición.
-realizarAcción: Actualiza la posición del gato y ensucia la casilla si es válida
-ensuciarCasilla: Ensucia la casilla actual del gato con un nivel aleatorio de suciedad.

CLASE ControladorHabitacion
-ControladorHabitacion: inicializa la habitación con las dimensiones dadas, crea una instancia de Gato en la posición inicial (0.0) y crea una instancia de Aspiradora con una bateria y capacidad de basura especificada.
-start: Crea instancias de ControladorAspiradora y ControladorGato, ejecuta un ciclo de simulación en el cual la aspiradora y el gato se mueven e interactuan con la habitación e imprime el estado de la habitacion despues de cada iteracion.

RAZONES DETRÁS DEL DISEÑO
-Encapsulacion: Los atributos de la clase estan encapsulador, asegurando que el nivel de suciedad solo pueda ser modificado a través de los métodos definidos
-Validacion: La clase inlcuye validación para asegurar que el nivel de suciedad siemrpre esté dentro de los límites razonables (0 a 100).

Esta estructura permite una fácil manipulación y control del estado de cada azulejo en la habitación, facilitando la interacción con otras clases como Aspiradora y Gato.

CLASE Bateria
-Descargar: Disminuye el nivel de bateria en una unidad si el nivel actual es mayor a cero.
-recargar: recarga la bateria al máximo
-estaDescargada: Retorna true si la bateria está descargada y false en caso contrario

CLASE CapacidadBasura
Constructor: Inicializa la bolsa de basura con una capacidad máxima especificada
-incrementar: Incrementa el nivel de basura en una unidad si no ha alcanzado su capacidad máxima
-vaciar: vacia la bolsa de basura
-estaLlena: Retorna true si la bolsa de basura está llena, false en caso contrario.

CLASE Dimension
-Constructor: Inicializa las dimensiones de la habitación, verificando que sean positivas.

CLASE Gato
-Constructor: Inicializa la posicion del gato.
-mover: Mueve al gato a una nueva posicion.

CLASE Habitacion
-Constructor: Inicializa la habitación con sus dimensiones, crea la matriz de azulejos y muebles, y genera aleatoriamente la suciedad en los azulejos y la disposición de los muebles.
-getMuebles: Retorna la matriz booleana que indica la presencia de muebles en la habitación.
-generarMuebles: Genera aleatoriamente la disposición de los muebles en la habitación.
-generarSuperficie: Genera la superficie de la habitación, inicializa los azulejos y asigna un nivel de suciedad aleatorio a algunos de ellos.

CLASE DE LA VISTA:
Las clases de la vista (Consola, Utils, y VistaAspiradra, VistaGato, VistaHabitacion) son responsables de la interacción con el usuario y la presentación visual de los datos.

CLASE Utils:
-obtenerEnteroValido: Valida y obtiene un número entero de la entrada del usuario, repitiendo la solicitud si el usuario no introduce un número válido.

CLASE VistaHabitacion:
-imprimir: Imprime la representación visual de la habitación, mostrando la posición de la aspiradora, el gato, los muebles y el nivel de suciedad de los azulejos.

RAZONES PARA LA IMPLEMENTACION
-Estructura Modular: Separar la lógica de la vista en diferentes clases (Consola, Utils, VistaAspiradora, VisraGato, VistaHabitacion) facilita la organización y el mantenimiento del código.
Validación de Entrada: El método obtenerEnteroValido en Utils asegura que se obtenga una entrada válida del usuario, mejorando la robustez del programa.
-Enumeraciones: Usar enumeraciones (Elementos) para representar diferentes elementos de la habitación mejora la legibilidad y facilita la gestión de los símbolos y valores asociados a cada tipo de elemento.
-Interactividad: La clase Consola permite una interacción sencilla con el usuario para configurar la habitación y la aspiradora.
-Visualización: La clase VistaHabitacion proporciona una manera clara y organizada de visualizar el estado actual de la habitación, mejorando la experiencia del usuario.
-Reusabilidad: Los métodos estáticos permiten ser llamados desde cualquier parte del código sin necesidad de instanciar objetos de estas clases, promoviendo la reusabilidad y reduciendo la cantidad de instanciaciones innecesarias.
