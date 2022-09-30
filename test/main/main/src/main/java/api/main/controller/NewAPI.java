package api.main.controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;

import api.main.dto.NewDTO;
@CrossOrigin
@RestController
@RequestMapping("/newAPI")
public class NewAPI {
    //get
    @GetMapping(value = "{id}")
    public Integer getNew (@PathVariable Integer id){
        return id;
    }
    //post
    @PostMapping(value = "/new")
    public NewDTO createNew (@RequestBody NewDTO model){
        return model;
    }
    //put
    @PutMapping(value = "/new")
    public NewDTO updateNew (@RequestBody NewDTO model){
        return model;
    }
    @DeleteMapping(value = "/new")
    public void deleteNew(@RequestBody long[] ids){
      
    }
    ///.... nói chung là còn 1 cái delete nữa.
}
//http:/localhost:3030/api/new
//method

