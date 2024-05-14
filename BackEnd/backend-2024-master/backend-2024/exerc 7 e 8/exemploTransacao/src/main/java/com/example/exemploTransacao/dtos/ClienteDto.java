import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Min;

public record ClienteDto (
        @NotBlank(message = "O nome não pode estar em branco")
        String nome,
        @NotNull(message = "O saldo não pode ser nulo")
        @Positive(message = "O saldo deve ser positivo")
        Double saldo,
        @NotBlank(message = "A senha não pode estar em branco")
        String senha
){
}
