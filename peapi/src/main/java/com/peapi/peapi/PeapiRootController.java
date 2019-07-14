package com.peapi.peapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeapiRootController {

    //root (/)
    @GetMapping("/")
    public String rootGet(){

        return "rootGet";

    }
    
    @PostMapping("/")
    public String rootPost(){

        return "rootPost";

    }
    
    //rbac1
    @GetMapping("/rbac1")
    public String rbac1Get(){

        return "rbac1Get";
    
    }
    
    @PostMapping("/rbac1")
    public String rbac1Post(){

        return "rbac1Post";
    
    }
    

    //rbac2
    @GetMapping("/rbac2")
    public String rbac2Get(){

        return "rbac2Get";
    
    }
    
    @PostMapping("/rbac1")
    public String rbac2Post(){

        return "rbac2Post";
    
    }

    //node
    @GetMapping("/node")
    public String nodeGet(){

        return "nodeGet";
    
    }

    @PostMapping("/rbac1")
    public String nodePost(){

        return "nodePost";
    
    }

    //orch
    @GetMapping("/orch")
    public String orchGet(){

        return "orchGet";

    }
    
    @PostMapping("/orch")
    public String orchPost(){

        return "orchPost";

    }
 

    //code
    @GetMapping("/code")
    public String codeGet(){

        return "codeGet";

    }
    
    @PostMapping("/code")
    public String codePost(){

        return "codePost";

    }
 

    //activity
    //razor
    //admin
    //server
    //server_status
    //http
    //ca
    //db
    //forge




    //@GetMapping("/")
    //public String rootGet(){
    //    return "Generic root page";
    //}
 
}