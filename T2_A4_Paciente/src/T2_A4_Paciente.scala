/*Resolver el ejercicio que se presenta a continuación:

Crear una clase llamada Paciente con los siguientes atributos:

    nombre
    primer apellido
    segundo apellido
    edad
    
    fecha []
    hora de registro []
    nivel de bienestar []   (nivel 1 - nivel 5)
    temperatura[]
    humedad[]
Agregar los siguientes métodos:    
    obtener promedios nivel de bienestar
    obtener temperatura mayor (junto con nivel de bienestar, fecha, etc.)
    obtener temperatura menor (junto con nivel de bienestar, fecha, etc.)
 */
 //creamos la clase Paciente
class paciente(private var nombre:String,
               private var pApellido:String,
               private var sApellido:String,
               private var edad:Int,
               private var fecha:Array[String],
               private var hora:Array[Int],
               private var nivel:Array[Byte],
               private var temperatura:Array[Int],
               private var humedad:Array[Int]
){
  def this( nombre:String, pApellido:String,sApellido:String,edad:Int){
    this(nombre, pApellido,sApellido,edad,null,null,null,null,null)
  }
  
 
//metodos
   def promediosNivelBienestar(cantidad: Double): Unit = {
    
  }
   def obtenerTemperaturaMayor(cantidad: Double): Unit = {
    
  }
   def obtenerTemperaturaMenor(cantidad: Double): Unit = {
    
  }
    override def toString : String = " === DATOS DE LOS PACIENTES === " +
                                    "\n NOMBRE: " + nombre +
                                    "\n PRIMER APELLIDO: " + pApellido +
                                    "\n SEGUNDO APELLIDO: " + sApellido +
                                    "\n EDAD: " + edad
}

object T2_A4_Paciente {
  def main(args: Array[String]): Unit = {
    println("Pacientes")
    var obj1 = new paciente("Maria","Perez","Perez",67)
    println(obj1)
  }
  
  
}