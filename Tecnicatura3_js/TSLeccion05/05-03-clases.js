let persona3 = new Persona('Carla','Ponce');


class Persona{//clase padre

    static contadorPersonas = 0; //Atributo estatico
    //email = 'Valor default email'; //Atributo no estatico

    static get MAX_OBJ(){ //simula una constante
        return 5;
    }

    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
        if(Persona.contadorPersonas < Persona.MAX_OBJ){
            this.idPersona = ++Persona.contadorPersonas;
        }
        else{
            console.log('Se ha superado el maximo de objetos permitidos');
        }
        //console.log('Se incrementa el contador: '+Persona.contadorObjetosPersona);
    }//Guion bajo: distincion para atributo y variable de get y set

    //Metodos Get (obtener valor) y Set (modificar valor)
    get nombre(){
        return this._nombre;
    }

    set nombre(nombre){
        this._nombre = nombre;
    }

    get apellido(){
        return this._apellido;
    }

    set apellido(apellido){
        this._apellido = apellido;
    }

    nombreCompleto(){
        return this.idPersona+' '+this._nombre+' '+this._apellido;
    }
    //Sobreescribiendo el metodo de la clase padre (Object)
    toString(){ //Regresa un String
        return this.nombreCompleto();
    }

    static saludar(){
        console.log('Saludos desde ese método static');
    }

    static saludar2(persona){
        console.log(persona.nombre+' '+persona.apellido);
    }
}

class Empleado extends Persona{//Clase hija
    constructor(nombre, apellido, departamento){
        super(nombre, apellido);
        this._departamento = departamento;
    }
    get departamento(){
        return this._departamento;
    }

    set departamento(departamento){
        this._departamento = departamento;
    }

}

let persona1 = new Persona('Martin', 'Perez');
console.log(persona1.nombre);
persona1.nombre = 'Juan Carlos';
console.log(persona1.nombre);
console.log(persona1.apellido);
persona1.apellido = 'Manuel';
console.log(persona1.apellido);

//console.log(persona1);
let persona2 = new Persona('Carlos', 'Lara');
console.log(persona2.nombre);
persona2.nombre = 'Maria Laura';
console.log(persona2.nombre);
console.log(persona2.apellido);
persona2.nombre = 'Gomez';
console.log(persona2.apellido);
//console.log(persona2);

let empleado1 = new Empleado('Maria', 'Gimenez', 'Sistemas');
console.log(empleado1);
console.log(empleado1.nombreCompleto());

console.log(empleado1.toString());
console.log(persona1.toString());

persona1.saludar(); //no se utiliza desde el objeto, el metodo static es exclusivo de la clase
Persona.saludar();
Persona.saludar2(persona1);

Empleado.saludar();
Empleado.saludar2(empleado1);

//console.log(persona1.contadorObjetosPersona);
console.log(Persona.contadorObjetosPersona);
console.log(Empleado.contadorObjetosPersona);

console.log(persona1.email);
console.log(empleado1.email);
//console.log(Persona.email);//No se puede acceder a un atributo No estatico por clase
console.log(persona1.toString());
console.log(persona2.toString());
console.log(empleado1.toString());
console.log(Persona.contadorPersonas);
let persona3 = new Persona('Carla', 'Pertosi');
console.log(persona3.toString());
console.log(Persona.contadorPersonas);

console.log(Persona.MAX_OBJ);
//Persona.MAX_OBJ = 10; no se puede modificar
console.log(Persona.MAX_OBJ);

let persona4 = new Persona('Franco', 'Diaz');
console.log(persona4.toString());
let persona5 = new Persona('Liliana', 'Paz');
console.log(persona5.toString());


