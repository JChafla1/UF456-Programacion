// Inicio uml
@startuml
  
// Clase profesor
class Professor {
    - nom: String
    - departament: String
    - cursos: List<Curs> // Se coge el curso de la siguiente clase
}
  
@enduml
// Final uml
