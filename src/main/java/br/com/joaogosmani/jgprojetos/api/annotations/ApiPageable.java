package br.com.joaogosmani.jgprojetos.api.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;

@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@ApiImplicitParams({
    @ApiImplicitParam(name = "pagina", dataType = "int", paramType = "query", defaultValue = "1", value = "Número da página que deseja recuperar (1..N)"),
    @ApiImplicitParam(name = "tamanho", dataType = "int", paramType = "query", defaultValue = "20", value = "Número de elementos por página."),
    @ApiImplicitParam(name = "ordenacao", dataType = "string", allowMultiple = true, paramType = "query", value = "Critério de ordenação no formato: propriedade(,asc|desc).")
})
public @interface ApiPageable {

}
