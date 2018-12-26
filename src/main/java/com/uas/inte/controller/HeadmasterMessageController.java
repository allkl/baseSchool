package com.uas.inte.controller;

import com.uas.common.controller.BaseController;
import com.uas.common.utils.PageUtils;
import com.uas.common.utils.Query;
import com.uas.inte.domain.MessageDO;
import com.uas.inte.domain.NotifyDO;
import com.uas.inte.service.MessageService;
import com.uas.inte.service.NotifyService;
import com.uas.system.service.UserService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @ClassName headmasterMessageController
 * @Description TODO
 * @Author jinxing.chen
 * @Date 2018/12/6 10:10
 * @Version 1.o
 */
@Controller
@RequestMapping("inte/headmasterMessage")
public class HeadmasterMessageController extends BaseController {

    @Autowired
    private NotifyService notifyService;
    @Autowired
    private UserService userService;
    @Autowired
    private MessageService messageService;

    @GetMapping()
    @RequiresPermissions("inte:headmasterMessage:headmasterMessage")
    String headmasterMessage() {
        return "inte/headmasterMessage/headmasterMessage";
    }

    @ResponseBody
    @GetMapping("/list")
    @RequiresPermissions("inte:headmasterMessage:headmasterMessage")
    public PageUtils headmasterMessageList(@RequestParam Map<String, Object> params) {
        //查询列表数据
        Query query = new Query(params);
        List<NotifyDO> notifyList = notifyService.headmasterMessageList(query);
        for (NotifyDO notifyDO : notifyList){
            notifyDO.setNotifyCreatorName(userService.get(notifyDO.getNotifyCreator()).getUserName());
        }
        int total = notifyService.count(query);
        PageUtils pageUtils = new PageUtils(notifyList, total);
        return pageUtils;
    }

    @GetMapping("/replyMessage/{notifyId}")
    @RequiresPermissions("inte:headmasterMessage:replyMessage")
    String replyMessage(@PathVariable("notifyId") Long notifyId,Model model){
        model.addAttribute("notifyId", notifyId);
        return "inte/headmasterMessage/replyMessage";
    }

    @GetMapping("/details/{notifyId}")
    @RequiresPermissions("inte:headmasterMessage:replyMessage")
    String details(@PathVariable("notifyId") Long notifyId,Model model){
        model.addAttribute("notifyId", notifyId);
        return "inte/headmasterMessage/replyMessage";
    }
}
