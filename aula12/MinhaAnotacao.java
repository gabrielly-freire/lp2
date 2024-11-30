package aula12;
@interface MinhaAnotacao {
    String nome();
    String cpf() default "000.000.000-00";
    String email() default "";
}