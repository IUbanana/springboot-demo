package com.example.springbootdemo.controller;

import com.example.springbootdemo.bean.Girl;
import com.example.springbootdemo.bean.Result;
import com.example.springbootdemo.enums.ResultEnum;
import com.example.springbootdemo.repository.GirlRepository;
import com.example.springbootdemo.service.GirlService;
import com.example.springbootdemo.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class GirlController {

  @Autowired
  private GirlRepository girlRepository;

  @Autowired
  private GirlService girlService;

  /**
   * 查询所有女生列表
   * @return
   */
  @GetMapping(value = "/girls")
  public List<Girl> girlList(){
    //JPA的findALL()
    return girlRepository.findAll();
  }

  /**
   * 添加对象
   * @return
   */
  @PostMapping(value = "/girls")
//  public Girl girlAdd(@RequestParam("name") String name,
//                        @RequestParam("height") Integer height){
  public Result<Girl> girlAdd( @Valid Girl girl, BindingResult bindingResult) {
    if (bindingResult.hasErrors()){
      return ResultUtil.fail(ResultEnum.UNKNOWN_ERROR);
    }

    girl.setName(girl.getName());
    girl.setHeight(girl.getHeight());

    //save() 添加对象
    return ResultUtil.success(girlRepository.save(girl));
  }

  /**
   * 查询一个对象
   * @param id
   * @return
   */
  @GetMapping(value = "/girls/{id}")
  public Girl findOneById( @PathVariable("id") Integer id){
    return girlRepository.findOne(id);
  }

  /** 通过身高查询 */
  @GetMapping("/girls/height/{h}")
  public List<Girl> girlsByHeight(@PathVariable("h") Integer height){
    return girlRepository.findByHeight(height);
  }

  /**
   * 更新
   */
  @PutMapping(value = "girls/{id}")
  public Girl girlUpd(@PathVariable("id") Integer id,
                              @RequestParam("name") String name,
                              @RequestParam("height") Integer height){
    Girl girl = new Girl();
    girl.setId(id);
    girl.setName(name);
    girl.setHeight(height);

    return girlRepository.save(girl);
  }

  /**
   * 删除
   */
  @DeleteMapping(value = "girls/{id}")
  public void delOneById(@PathVariable("id") Integer id){
    girlRepository.delete(id);
  }

  /** 查看身高类别 */
  @GetMapping(value = "/girls/getHeight/{id}")
  public void findHeight(@PathVariable("id") Integer id) throws Exception{
    girlService.findHeight(id);
  }

}
