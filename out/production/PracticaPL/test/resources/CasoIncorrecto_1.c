#define FECHA 2023
#define CODIGO 10
integer n_alumnos;
float __valor_real;
string nombre = "alumno1";
integer hola;

struct{ 
    integer patata;
    string hola_1;
    float calculator = 3;
    // Funcion que codifica la cadena
    string codificar_cadena(string cadena, integer desplazamiento){
       string cadena2;
       cadena2 = (cadena + desplazamiento) * random(desplazamiento);
       return(cadena2);
    }
} hello;

// Declaracion de funciones
string codificar_cadena(string cadena, integer desplazamiento);
void save(string nombre);

// Funcion que codifica la cadena
string codificar_cadena(string cadena, integer desplazamiento){
    string cadena2;
    cadena2 = (cadena + desplazamiento) * random(desplazamiento);
    return(cadena2);
}
// Funcion save que guarda el fichero
void save(string nombre){
    fopen("file.txt", "w");
    printf(nombre);
}

// Funcion main principal
void Main (){
    string codificado;
    codificado = codificar_cadena(nombre, FECHA);
    save(codificado);
    n_alumnos = n_alumnos + 1;
    
    if (n_alumnos > 10){
        printf("%s", "El numero de alumnos es mayor de 10");
    }
    else { 
        printf("%s", "El numero de alumnos es menor de 10");
    }
    codificado = codificar_cadena(nombre, (CODIGO DIV codificado));
}