package sn.uimcec.intranet.validator;

import org.springframework.util.StringUtils;
import sn.uimcec.intranet.dto.AnnonceDto;
import sn.uimcec.intranet.dto.UserDto;

import java.util.ArrayList;
import java.util.List;

public class UserValidator {

    public static List<String> validate(UserDto dto) {
        List<String> errors = new ArrayList<>();

        if (dto == null) {
            errors.add("Veuillez renseigner le nom ");
            errors.add("Veuillez renseigner le prenom ");
            errors.add("Veuillez renseigner le passeword ");
            errors.add("Veuillez renseigner le login ");

            errors.add("Veuillez renseigner la fonction ");
            errors.add("Veuillez renseigner s'il est actif ");
            errors.add("Veuillez renseigner le point de service ");

            errors.add("Veuillez renseigner l'agence ");
            errors.add("Veuillez renseigner l'entité");





            return errors;
        }

        if (!StringUtils.hasLength(dto.getNom())) {
            errors.add("Veuillez renseigner le nom ");
        }
        if (!StringUtils.hasLength(dto.getPrenom())) {
            errors.add("Veuillez renseigner le prenom ");
        }
        if (!StringUtils.hasLength(dto.getLogin())) {
            errors.add("Veuillez renseigner le login");
        }
        if (!StringUtils.hasLength(dto.getPassword())) {
            errors.add("Veuillez renseigner le passeword");
        }
        if (!StringUtils.hasLength(dto.getLogin())) {
            errors.add("Veuillez renseigner la fonction");
        }
        if (dto.isEnable()) {
            errors.add("Veuillez renseigner si ce champs est rensegné");
        }
        if ( dto.getAgenceDto() == null ||  dto.getAgenceDto().getId() == null) {
            errors.add("Veuillez selectionner une agence");
        }

        if ( dto.getEntiteDto() == null ||  dto.getEntiteDto().getId() == null) {
            errors.add("Veuillez selectionner une entité");
        }




        return errors;
    }
}
