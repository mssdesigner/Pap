jQuery(function($){
   $("#nascimento").mask("99/99/9999", {placeholder:"dd/mm/aaaa"});
   $("#matricula").mask("999999", {placeholder:"______"});
   $("#rg").mask("99.999.999-9", {placeholder:"__.___.___-_"});
   $("#cpf").mask("999.999.999-99", {placeholder:"___.___.___-__"});
   $("#cep").mask("99999-999", {placeholder:"_____-___"});
   $("#telefone").mask("(99) 9999.9999", {placeholder:"(   )___________"});
   $("#celular").mask("(99) 99999.9999", {placeholder:"(   )____________"});
});


$(function() {
    // valida o formulário
    $('#form').validate({
        // define regras para os campos
        rules: {
            nome: {
                required: true,
                minlength: 5
            },
            cpf: {
                required: true,
                
            },
            telefone: {
                required: true
            },
            matricula: {
            	required: true,
            	number: true

            },
            login: {
            	required: true,
            	number: true
            },
            codigo: {
            	required: true,
            	number: true
            }

        },
        // define messages para cada campo
        messages: {
            nome: "Preencha o seu nome",
            cpf: "Preencha seu cpf",
            matricula: "Informe a matrícula",
            login: "Informe o login",
            codigo: "Informe o código",
            telefone: "Informe o telefone"
        }
    });
});


function validarCampos(form){ 
	senha = document.cadastro.senha.value
	rep_senha = document.cadastro.rep_senha.value
	if (senha != rep_senha){
		alert("Repita a senha corretamente");
		document.cadastro.rep_senha.focus();	
		return false;
	}
}


function Maiuscula() {
	document.cadastro.nome.value = document.cadastro.nome.value.toUpperCase();
	  
	}
	
function Minuscula() {
	document.cadastro.sobre_nome.value = document.cadastro.sobre_nome.value.toLowerCase();
	
	}	

function autenticado(){
    alert("Logado com sucesso!");
    setTimeout("window.location='principal.php' ", 500);
    }

function naoautenticado(){
    alert("Usuario ou senha incorreto");
    setTimeout("window.location='index.php' ", 500);
    }	
