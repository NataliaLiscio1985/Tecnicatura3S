miFuncion(8,2); //Esto se lo conoce como hosting

function miFuncion(a, b){
    console.log('Sumamos: '+(a+b)); 
}


//Llamado la funcion
miFuncion(5,4);
let resultado = miFuncion(6,7);
console.log(resultado);

//Declaramos una funcion de tipo expresion o anonima
let x = function(a, b){return a+ b}; //necesita cierre con punto y coma
resultado = x(5,6); //al llamarla se pone la variable y parentesis
console.log(resultado);



//Funciones de tipo self e invoking
(function(a, b){
    console.log('Éjecutando la funcion: '+ (a+b));
})(9,6);


console.log(typeof miFuncion);
function miFuncionDos(a,b){
    console.log(arguments.length);
}

miFuncionDos(5,7,3,6);

//toString
var miFuncionTexto = miFuncionDos.toString();
console.log(miFuncionTexto);

//Funciones flecha
const sumarFuncionFlecha = (a, b) => a+b; //no es necesario la palabra function ni las llaves ni return, se usa el simbolo flecha(=>)
resultado = sumarFuncionFlecha(3,7);
console.log(resultado);


//Funcion de tipo expresion
let sumar = function(a=4,b=8){
    console.log(arguments[0]); //muestra el parametro de a
    console.log(arguments[1]); //muestra el parametro de b
    return a + b +arguments[2];
}
resultado = sumar(3, 2, 9);
console.log(resultado);

//Sumar todos los argumentos
//concepto Hoisting: El concepto de hoisting de JavaScript determina que el valor de una variable declarada con var
//puede subir al principio del scope de la función dentro de la que está declarada.
let respuesta = sumarTodo(5,4,13,10,9); 
console.log(respuesta);
function sumarTodo(){
    let suma = 0;
    for(let i = 0; i<arguments.length; i++){
        suma += arguments[i]; //arguments es para arrays
    }
    return suma;
}

//Tipos primitivos
let k = 10;
function cambiarValor(a){ //paso por valor, la variable no cambia, solo se manda una copia del valor 
    a = 20;
}

cambiarValor(k);
console.log(k);


//Paso por referencia: pasamos la posicion de almacenamiento de la variable y se modifica su valor(puntero)
const persona = {
    nombre: 'Juan',
    apellido: 'Lepez'
}
console.log(persona);
function cambiarValorOjeto(p1){
    p1.nombre = 'Ignacio';
    p1.apellido = 'Perez';
}

cambiarValor(persona);
console.log(persona);


