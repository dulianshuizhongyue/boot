package make.controller;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
@Api("swaggerDemo 相关的api")
public class SwaggerDemo {

    /*
    * @ApiImplicitParams 输入的参数列表, 其属性对应字段的属性要求
    * @ApiResponses 在Api文档中显示响应的code和对应的信息
    * path 相关为URL请求路径相关
    * query为URL? 后面请求的参数
    * */

    @ApiOperation(value="根据ID查询信息", notes="查询数据库中某条记录")
    @ApiImplicitParams({
            @ApiImplicitParam(name="id", value="字段ID", paramType = "path", required = true, dataType = "Integer"),
            @ApiImplicitParam(name="name", value = "名称", paramType = "query", required = true, dataType = "String")
    })
    @ApiResponses({
            @ApiResponse(code= 200, message = "操作成功!"),
            @ApiResponse(code=500, message = "服务器内部错误"),
            @ApiResponse(code=403, message = "权限不足")
    })
    @RequestMapping(value="/{id}", method = RequestMethod.GET)
    public Integer getInfo(@PathVariable int id, String name) {

        //FIXME
        System.out.println("传递姓名： " + name);
        System.out.println("传递的ID： " + id);
        return id;
    }


}
