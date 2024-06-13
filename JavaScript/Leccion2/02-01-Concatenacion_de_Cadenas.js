//const $body = document.body;
//$body.style.background = "#222";

var nombre = "Pepito";
var apellido = "Pescador";
var nombreCompleto = nombre + " " + apellido; //1era concatenación.
console.log(nombreCompleto);

var nombreCompleto2 = "Martín" + " " + "Pescador";
console.log(nombreCompleto2);

var juntos = nombre + 13;
console.log(juntos);

juntos = nombre + 333 + 555;
console.log(juntos);

nombre += apellido; //Operador simplificado.
console.log(nombre);

let nombre2 = "Pedro";
//Una constante no puede ser modificada.
const apellido2 = "Picapiedra";
console.log(nombre2, apellido2);

//Se pueden crear varias variables dentro de una misma linea
let x, y;
(x = 17), (y = 21); //Se puede hacer asignación de varias variables dentro de la misma línea

let z = x + y;
console.log(z);

let _1num = 31; //No utilziar números para inicialziar el nombre de una variable.
let romper = "break"; //No utilizar palabras reservadas.
