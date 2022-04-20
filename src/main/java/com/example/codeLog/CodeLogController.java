package com.example.codeLog;

import org.aspectj.apache.bcel.classfile.Code;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.lang.Integer.parseInt;

@RestController
@CrossOrigin
public class CodeLogController {

    @Autowired
    CodeLogRepository repository;

    @GetMapping("/codeLogAll")
    public ResponseEntity<List<CodeLog>> getCodeLogs(){
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
    }
    @GetMapping("/codeLog/{id}")
    public ResponseEntity<CodeLog>getCodeLogByID(@PathVariable String id){
        for(CodeLog codeLog: repository.findAll()) {
            if (codeLog.getId() == parseInt(id)) {
                return ResponseEntity.status(HttpStatus.OK).body(codeLog);
            }
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }
    @PostMapping("/codeLog")
    public ResponseEntity<String> createLog(@RequestBody CodeLog codeLog) {
        repository.save(codeLog);
        return ResponseEntity.status(HttpStatus.CREATED).body("new entry added");
    }
    @DeleteMapping("/codeLog/{id}")
    public ResponseEntity<String> deleteLog(@PathVariable String id) {
        try{
            repository.deleteById(parseInt(id));
            return ResponseEntity.status(HttpStatus.ACCEPTED).body("The log with the id " + id + "was deleted");
        }
        catch (EmptyResultDataAccessException exception){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Sorry I could not find a log with that id");
        }

    }
}
