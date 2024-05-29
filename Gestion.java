// Inicio uml
@startuml
  
// Clase profesor
class Professor {
    - nom: String
    - departament: String
    - cursos: List<Curs> // Se coge el curso de la siguiente clase
}

// Clase curso
class Curso{
    - nom: String
    - codi: int
    - Professor: String
    - Estudiants: List<Estudiant> // Se coge el estudiante de la siguiente clase
}

// Clase estudiante
class Estudiant {
    - nom: String
    - matricula: String
}

// Relaciones
Professor "1" o-- "0..*" Curs : imparteix
Curs "0..*" --> "1" Professor : és impartit per
Curs "0..*" o-- "0..*" Estudiant : inscriu

  
@enduml
// Final uml
