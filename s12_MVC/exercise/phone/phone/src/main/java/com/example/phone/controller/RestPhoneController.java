package com.example.phone.controller;

import com.example.phone.model.Phone;
import com.example.phone.service.IPhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
public class RestPhoneController {
    @Autowired
    private IPhoneService iPhoneService;

    @GetMapping("/list")
    public ResponseEntity<Page<Phone>> getList(Pageable pageable){
        Page<Phone> page = this.iPhoneService.findAll(pageable);
        if (!page.hasContent()){
             return  new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else {
            return new ResponseEntity<>(page,HttpStatus.OK);
        }
    }
    @PostMapping("/create")
    public ResponseEntity<Void> create (@RequestBody Phone phone){
         this.iPhoneService.save(phone);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/delete")
    public ResponseEntity<Void> delete(@RequestParam Integer id){
        this.iPhoneService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/update")
    public ResponseEntity<Phone> showupdate(@RequestParam Integer idUpdate){
        Phone phone1 = this.iPhoneService.findById(idUpdate);
        return new ResponseEntity<>(phone1,HttpStatus.OK);
    }
    @PatchMapping("/update")
    public ResponseEntity<Void>  update (@RequestBody Phone phone){
        this.iPhoneService.save(phone);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
