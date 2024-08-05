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


        if (!StringUtils.hasLength(String.valueOf(pointServiceDto.getAgence()))) {
            errors.add("Veuillez renseigner l'agence'");
        }
        if (!StringUtils.hasLength(String.valueOf(pointServiceDto.getEntite()))) {
            errors.add("Veuillez renseigner la Caisse");
        }

        return errors;

    }





}
