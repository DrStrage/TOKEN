package com.ca.control.web;

import com.ca.control.domain.Ips;
import com.ca.control.service.IpsService;
import com.ca.control.service.TokService;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

//
//@RestController
//@RequestMapping("/index2")
@Controller
public class caController {

    @Autowired
    TokService tokS;

    @Autowired
    IpsService ipsS;

    /* @GetMapping("/{argumento}")
    public String Formulario(Model model) {

        var comboProvincia = ps.listaProvincia();
        var comboCiudad = cs.listaOrdenada();
        var comboEmpresa = es.listaOrdenada();
        model.addAttribute("AFILIADO", new Afiliado());
        model.addAttribute("PROVINCIA", comboProvincia);
        model.addAttribute("CIUDAD", comboCiudad);
        model.addAttribute("EMPRESA", comboEmpresa);
       return "index2";
   return "redirect:https://es.research.net/r/77LR28C?ToK=1";
    }
     */
    @GetMapping(path = "/{argumento}")
    public String Formulario(@PathVariable(value = "argumento") String argumento) {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes())
                .getRequest();
        String ip = request.getRemoteAddr();
        var tokens = tokS.ObtenerToken(argumento);
        String dir = null;
      
        if (tokens.size() > 0) {
            double idtok = 0;
            for (int i = 0; i < tokens.size(); i++) {
                var tok = tokens.get(i);
                dir = tok.getToken();
                idtok = tok.getId();
            }

            var ipp = new Ips();
            ipp.setIp(ip);
            ipp.setIdtok(idtok);
            ipp.setFecha(LocalDateTime.now().toString());
            ipp.setDia(LocalDateTime.now().getDayOfMonth());
            ipp.setHora(LocalDateTime.now().getHour());
            ipp.setMes(LocalDateTime.now().getMonthValue());
            ipp.setMinuto(LocalDateTime.now().getMinute());
    ;
            
            

            tokS.sumarClic(argumento);
            ipsS.agregarIps(ipp);
        } else {
            dir = "https://www.expertcomargentina.com.ar";
        }
        return "redirect:" + dir;
    }
}
