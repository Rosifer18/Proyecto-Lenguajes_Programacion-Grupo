let nombres = prompt("Ingresa apellido y nombre");
let horaslaboradas= parseFloat(prompt("Ingresa horas laboradas"));
let preciohora= parseFloat(prompt(" Ingresa precio laboradas"));

let sueldobruto,
descuento,
sueldoneto;

// calculos

sueldobruto= horaslaboradas*preciohora;

descuento= sueldobruto* 0.125;


// sueldo neto

sueldoneto= sueldobruto- descuento


// salida

console.log("Apellido y nombre" + nombres);

console.log("horas laboradas" + horaslaboradas);

console.log("precio por hora laboral" + preciohora );

console.log("sueldo bruto" + sueldobruto);

console.log("descuento" + descuento);

console.log("sueldo neto a pagar" + sueldoneto);