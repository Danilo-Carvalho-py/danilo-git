//var pacientes = document.querySelectorAll(".paciente");

var tabela = document.querySelector("table");

tabela.addEventListener("dblclick", function(event){
	var alvoEvneto = event.target // acessa o TD cliclado
	var paiDoAlvo = alvoEvneto.parentNode // acessa o TR do evento clicado
	event.target.parentNode.classList.add("fadeOut");
	setTimeout(function(){
		paiDoAlvo.remove();
	}, 500);
	
	//onsole.log(event.target); // como irei acessar toda tebela o event.targert vai informar em qual lugar cliquei
});

/*pacientes.forEach(function(paciente){
	paciente.addEventListener("dblclick", function(){
		this.remove(); // this, está atrelando o quem foi cliclado no paciente
	}); // verificar o duplo click para cada linha
});*/
