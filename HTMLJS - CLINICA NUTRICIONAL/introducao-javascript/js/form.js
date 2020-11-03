// como padrão o que esta dentro do <FORM>  carrega a pagina e o que esta dentro 
// é deletado e atualizado. para isso não ocorrer teremos que fazer as seguintes instruções
// abaixo.
var botaoAdicionar = document.querySelector("#adicionar-paciente");
// event tem a função de carregdar a pagina e o evento de clicar
botaoAdicionar.addEventListener("click", function(event){
	event.preventDefault(); // essa função faz é previnir o comportamento padrão que exsite dentro do <form>
	var form = document.querySelector("#form-adiciona");

	// extraindo as informaçãoes do paciente do form.
	var paciente = obtemPacienteDoFormulario(form);

	var erros = validaPaciente(paciente);
	console.log(erros);

	if (erros.length > 0){
		exibeMensagensDeErro(erros);
		return;
	}

	adicionaPacienteNaTabela(paciente);

	form.reset();
	var mensagensErro = document.querySelector("#mensagens-erro");
	mensagensErro.innerHTML = "";

});

function adicionaPacienteNaTabela(paciente){
	// criar TR e TD do paciente
	var pacienteTr = montaTr(paciente);
	// adicinando o paciente na tabela
	var tabela = document.querySelector("#tabela-pacientes");
	tabela.appendChild(pacienteTr);
}

function exibeMensagensDeErro(erros){
	var ul = document.querySelector("#mensagens-erro");
	ul.innerHTML = "";
	erros.forEach(function(erro){
		var li = document.createElement("li");
		li.textContent = erro;
		ul.appendChild(li);
	});
}

function obtemPacienteDoFormulario(form){
	var paciente = { 
		nome : form.nome.value,
		peso : form.peso.value,
		altura : form.altura.value,
		gordura : form.gordura.value,
		imc : calculaImc(form.peso.value, form.altura.value)
	}
	return paciente;
}

function montaTr(paciente){
	var pacienteTr = document.createElement("tr");
	pacienteTr.classList.add("paciente");


	pacienteTr.appendChild(montaTd(paciente.nome, "info-nome"));
	pacienteTr.appendChild(montaTd(paciente.peso, "info-peso"));
	pacienteTr.appendChild(montaTd(paciente.altura, "info-altura"));
	pacienteTr.appendChild(montaTd(paciente.gordura, "info-gordura"));
	pacienteTr.appendChild(montaTd(paciente.imc, "info-imc"));

	return pacienteTr;

}

function montaTd(dado, classe){
	var td = document.createElement("td");
	td.textContent = dado;
	td.classList.add(classe);

	return td
}

function validaPaciente(paciente){

	var erros = [];

	if (paciente.nome.length == 0){
		erros.push("O nome não pode ser em branco");
	}

	if (!validaPeso(paciente.peso)){
		erros.push("O peso é invalido");
	}

	if(!validaAltura(paciente.altura)){
		erros.push("Altura é invalida");
	}

	if (paciente.gordura.length == 0){
		erros.push("Gordura não pode ser em branco");
	}

	if (paciente.peso.length == 0){
		erros.push("Peso não pode ser em branco");
	}

	if (paciente.altura.length == 0){
		erros.push("Altura não pode ser em branco")
	}

	return erros;
}