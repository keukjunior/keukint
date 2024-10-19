package sn.uimcec.intranet.dto;

import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import sn.uimcec.intranet.security.entities.AppRole;

@Builder
@Data
public class AppRoleDto {
    
    private String rolesdto;

   public static AppRoleDto fromRole(AppRole appRole){
      if (appRole == null)
        return null;
       return AppRoleDto.builder()
            .rolesdto(appRole.getRole())
            .build();
   }
   public static AppRole toRole(AppRoleDto appRoleDto){
       if(appRoleDto== null)
           return null;

       AppRole appRole = new AppRole();
       appRole.setRole(appRoleDto.getRolesdto());
       return appRole;
   }
}
