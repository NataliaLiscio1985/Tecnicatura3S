class Cliente extends Persona{

    static contadorClientes = 0;

    constructor(nombre, apellido, edad, fecharegistro){
        super(nombre,apellido,edad);
        this._idcliente = ++Cliente.contadorClientes;
        this._fecharegistro = fecharegistro;
    }

    get _idCliente(){
        return this._idCliente;
    }

    get echaregistro(){
        return this._echaregistro;
    }

    set fecharegistro(fecharegistro){
        this._fecharegistro = fecharegistro;
    }

    toString(){
        return `
        ${super.toString()} 
        ${this._idCliente} 
        ${this._fecharegistro}`;
    }
}