var titulo = document.querySelector(".titulo");
titulo.textContent = "Aparecida Nutricionista";

var pacientes = document.querySelectorAll(".paciente"); // acesso a tudo que está dentro do TR
//console.log(pacientes.length)

for(var i = 0; i < pacientes.length; i++){
	var paciente = pacientes[i];

	var tdPeso = paciente.querySelector(".info-peso"); // acessar o TD peso dentro da TR
	//console.log(tdPeso);
	//console.log(tdPeso.textContent); // acessar o valor dentro da TD-INFO-PESO
	var peso = tdPeso.textContent;

	var tdAltura = paciente.querySelector(".info-altura");
	//console.log(tdAltura);
	//console.log(tdAltura.textContent);
	var altura = tdAltura.textContent;

	var tdImc = paciente.querySelector(".info-imc");

	var pesoEhValido = validaPeso(peso);
	var alturaEhValido = validaAltura(altura);
	//var cor = "orange";

	if (!pesoEhValido){
		//console.log("Peso invalido");
		tdImc.textContent = "Peso invalido";
		pesoEhValido = false;
		//paciente.style.color = "red";
		//paciente.style.backgroundColor = cor;
		paciente.classList.add("paciente-invalido"); // criado um classe no css
	}

	if (!alturaEhValido){
		//console.log("Altura invalido");
		tdImc.textContent = "Altura invalido";
		alturaEhValido = false;
		//paciente.style.color = "red";
		//paciente.style.backgroundColor = cor;
		paciente.classList.add("paciente-invalido"); // criado um classe no css
	}

	if (pesoEhValido && alturaEhValido){
		var imc = peso/(altura*altura);
		tdImc.textContent = imc.toFixed(2);
	}
}

function validaPeso(peso){
	if (peso >= 0 && peso < 1000){
		return true;
	} else{
		return false;
	}
}

function validaAltura(altura){
	if (altura >= 0 && altura <=3.0){
		return true;
	} else{
		return false;
	}
}


function calculaImc(peso, altura){
	var imc = 0;
	imc = peso / (altura*altura);
	return imc.toFixed(2);
}