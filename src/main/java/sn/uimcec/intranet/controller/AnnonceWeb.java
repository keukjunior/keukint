package sn.uimcec.intranet.controller;

import io.swagger.v3.oas.annotations.responses.ApiResponse;

import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import sn.uimcec.intranet.dto.AnnonceDto;
import sn.uimcec.intranet.service.AnnonceService;

import java.util.List;
@Controller
//@RequestMapping("/Intranet-UIMCEC")
public class AnnonceWeb {
    @Autowired
    private AnnonceService annonceService;

    public AnnonceWeb(AnnonceService annonceService){
        this.annonceService=annonceService;
    }
    @GetMapping(path = "/login")
    // @ApiOperation(value = "Renvoi la liste des articles", notes = "Cette methode permet de chercher et renvoyer la liste des articles qui existent "
    //      + "dans la BDD", responseContainer = "List<ArticleDto>")
    //@ApiResponses(value = {
    //      @ApiResponse(code = 200, message = "La liste des article / Une liste vide")
    // })
    public  String  findAllAnnonce(){
        //List<AnnonceDto> annonceDtoList=annonceService.findAll();
        //model.addAttribute("listeannonce",annonceDtoList);
        // model.
        //attribut(annonceDtoList,"listeannonce");
        //return "listeannonce";
        return "login";
        //return "accueil";
    };


   @GetMapping("/")
   //  @ApiOperation(value = "Renvoi la liste des articles", notes = "Cette methode permet de chercher et renvoyer la liste des articles qui existent "
     //  + "dans la BDD", responseContainer = "List<ArticleDto>")
   // @ApiResponses(value = {
       //  @ApiResponse(code = 200, message = "La liste des article / Une liste vide")
   //s })
    public  String  home( Model model){
        List<AnnonceDto> annonceDtoList=annonceService.findAll();
        model.addAttribute("listeannonce",annonceDtoList);
        // model.attribut(annonceDtoList,"listeannonce");
        return "index";

        // à revoir
        //return "/index";
    };


    //public String annonce(){

      //  List<AnnonceDto> annonceDtoList= annonceService.findAll();
        //return annonceDtoList.toString();
   // }
}
