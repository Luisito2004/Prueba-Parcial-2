case class Libro(titulo: String, autor: String, paginas: Int, anio: Int)
val catalogo: List[Libro] = List(
  Libro("Programación en Scala", "Ana Ruiz", 150, 2010),
  Libro("Fundamentos de FP", "Juan Pérez", 165, 2011),
  Libro("Algoritmos Modernos", "Carlos León", 180, 2012),
  Libro("Estructuras de Datos", "María Gómez", 195, 2013),
  Libro("Introducción a la Programación", "Luis Andrade", 210, 2014),
  Libro("Técnicas de Depuración", "Ana Ruiz", 225, 2015),
  Libro("Diseño de Sistemas", "Juan Pérez", 240, 2016),
  Libro("Patrones de Diseño", "Carlos León", 255, 2017),
  Libro("Aplicaciones Web", "María Gómez", 270, 2018),
  Libro("Cómputo en la Nube", "Luis Andrade", 285, 2019),
  Libro("Arquitectura de Software", "Ana Ruiz", 300, 2015),
  Libro("Bases de Datos", "Juan Pérez", 315, 2016),
  Libro("Microservicios", "Carlos León", 330, 2017),
  Libro("Concurrencia en Java", "María Gómez", 345, 2018),
  Libro("Pruebas Automatizadas", "Luis Andrade", 360, 2019),
  Libro("Seguridad Aplicada", "Ana Ruiz", 375, 2016),
  Libro("DevOps Práctico", "Juan Pérez", 390, 2017),
  Libro("Análisis de Datos", "Carlos León", 405, 2018),
  Libro("Machine Learning Básico", "María Gómez", 420, 2019),
  Libro("Redes de Computadores", "Luis Andrade", 435, 2019)
)


//Se pide implementar un método que, a partir de la lista de Libro, devuelva un valor de tipo AutorInfo que represente al autor más productivo bajo
// los criterios indicados (mínimo de páginas y año mínimo).

//En lugar de usar funciones avanzadas como groupBy, el método debe aplicar un algoritmo manual, que se puede describir así de manera general:

//Primero, tomar solo los libros que cumplen las condiciones (páginas y año).
//A partir de esos libros filtrados, obtener la lista de autores sin repetir.
//Para cada autor de esa lista, recorrer la colección de libros filtrados y calcular cuántas páginas suma y cuántos libros tiene.
//Construir un objeto AutorInfo para cada autor con esos datos.
//Finalmente, recorrer la colección de AutorInfo y quedarse con aquel cuyo campo totalPaginas sea el mayor.
//Si no hubiera libros que cumplan las condiciones, el método debe indicar que no existe resultado.


case class AutorInfo(autor: String, totalPaginas: Int, cantidadLibros: Int)



//val productividad = (lista: List[Libro]) => catalogo.map(n => n.paginas.toDouble / n.anio)

def productividad(lista: List[Libro]): Double = catalogo.map(n => n.paginas.toDouble / n.anio).sum / catalogo.length
productividad(catalogo)

val autores = (lista: List[Libro]) => catalogo.map(n => n.paginas.toDouble / n.anio)
def autoresProductivos(lista: List[Double]): List[Double] = autores.filter()

















