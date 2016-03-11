
$(document).ready(function () {

    $("#img01").elevateZoom({
        gallery: 'galeria01',
        galleryActiveClass: 'active',
        imageCrossfade: true,
    });

    $("#img01").bind("click", function (e) {
        var ez = $('#img01').data('elevateZoom');
        $.fancybox(ez.getGalleryList());
        return false;
    });
    
    $("#img02").elevateZoom({
        gallery: 'galeria02',
        galleryActiveClass: 'active',
        imageCrossfade: true,
    });

    $("#img02").bind("click", function (e) {
        var ez = $('#img02').data('elevateZoom');
        $.fancybox(ez.getGalleryList());
        return false;
    });
    
    $("#img03").elevateZoom({
        gallery: 'galeria03',
        galleryActiveClass: 'active',
        imageCrossfade: true,
    });

    $("#img03").bind("click", function (e) {
        var ez = $('#img03').data('elevateZoom');
        $.fancybox(ez.getGalleryList());
        return false;
    });
    
    $("#img04").elevateZoom({
        gallery: 'galeria04',
        galleryActiveClass: 'active',
        imageCrossfade: true,
    });

    $("#img04").bind("click", function (e) {
        var ez = $('#img04').data('elevateZoom');
        $.fancybox(ez.getGalleryList());
        return false;
    });

});

$("#carrinho").mouseenter(function () {
    //mostra div
    $("#finalizar").modal({
        show: true

    });
    document.getElementById('frete').style.display = "none";
    document.getElementById('total').style.display = "none";
    document.getElementById('sair').style.display = "none";
    document.getElementById('finalizarcompra').style.height = "100%";
    event.preventDefault();
});



function mostrar_abas(obj) {

    document.getElementById('boleto').style.display = "none";
    document.getElementById('cartao').style.display = "none";
    switch (obj.id) {
        case 'mostra_aba1':
            document.getElementById('boleto').style.display = "block";
            break
        case 'mostra_aba2':
            document.getElementById('cartao').style.display = "block";
            break
    }
}
;
$(document).ready(function () {
    $("#mostra_aba1").click(function (mostrar_abas) {
        $("#boleto").toggle();
    });
    $("#mostra_aba2").click(function (mostrar_abas) {
        $("#cartao").toggle();
    });
});
function mostrar_abas2(obj) {


    document.getElementById('pj').style.display = "none";
    switch (obj.id) {
        case 'mostra_pf':
            document.getElementById('pf').style.display = "block";
            break
        case 'mostra_pj':
            document.getElementById('pj').style.display = "block";
            break
    }
}
;
$(document).ready(function () {
    $("#mostra_pf").click(function (mostrar_abas2) {
        $("#pj").hide();
        $("#pf").toggle();
    });
    $("#mostra_pj").click(function (mostrar_abas2) {
        $("#pf").hide();
        $("#pj").toggle();
    });
});
$(document).ready(function () {
    $().hide();
    $().click(function () {
        $(this).toggleClass(active).next().slideToggle("slow");
        return false;
    });
});
jQuery(function ($) {
    $("#nascimento").mask("99/99/9999", {placeholder: "dd/mm/aaaa"});
    $("#matricula").mask("999999", {placeholder: "______"});
    $("#rg").mask("99.999.999-9", {placeholder: "__.___.___-_"});
    $("#cpf").mask("999.999.999-99", {placeholder: "___.___.___-__"});
    $("#cnpj").mask("99.999.999/9999-99", {placeholder: "__.___.___/___-__"});
    $("#cep").mask("99999-999", {placeholder: "_____-___"});
    $("#cepfrete").mask("99999-999", {placeholder: "_____-___"});
    $("#tel").mask("(99) 9999.9999", {placeholder: "(   )___________"});
    $("#tel1").mask("(99) 9999.9999", {placeholder: "(   )___________"});
    $("#tel2").mask("(99) 9999.9999", {placeholder: "(   )___________"});
    $("#celular").mask("(99) 99999.9999", {placeholder: "(   )____________"});
    $("#numcartao").mask("9999.9999.9999.9999", {placeholder: "________________"});
});
function validarCampos(form) {
    senha = document.cadastro.senha.value
    rep_senha = document.cadastro.rep_senha.value
    if (senha != rep_senha) {
        alert("Repita a senha corretamente");
        document.cadastro.rep_senha.focus();
        return false;
    }
}

function maiuscula() {
    document.cadastro.nome.value = document.cadastro.nome.value.toUpperCase();
}

function minuscula() {
    document.cadastro.sobre_nome.value = document.cadastro.sobre_nome.value.toLowerCase();
}

function autenticado() {
    alert("Logado com sucesso!");
    setTimeout("window.location='principal.php' ", 500);
}

function naoautenticado() {
    alert("Usuario ou senha incorreto");
    setTimeout("window.location='index.php' ", 500);
}
