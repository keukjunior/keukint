package sn.uimcec.intranet.validator;

import org.springframework.util.StringUtils;
import sn.uimcec.intranet.dto.PointServiceDto;

import java.util.ArrayList;
import java.util.List;

public class PointServiceValidator {

    public static List<String> validate(PointServiceDto pointServiceDto){

        List<String> errors = new ArrayList<>();

        if (pointServiceDto == null) {
            errors.add("Veuillez renseigner le guichet'");
            errors.add("Veuillez renseigner l'agence");
            errors.add("Veuillez renseigner la caisse'");

            return errors;
        }


        if (!StringUtils.hasLength(pointServiceDto.getNom())) {
            errors.add("Veuillez renseigner du guichet'");
        }
        if ( pointServiceDto.getAgence() == null ||  pointServiceDto.getAgence().getId() == null) {
            errors.add("Veuillez selectionner une agence");
        }

        if ( pointServiceDto.getEntite() == null ||  pointServiceDto.getEntite().getId() == null) {
            errors.add("Veuillez selectionner une entité");
        }

        return errors;

    }





}
