package com.uas.inte.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.uas.common.controller.BaseController;
import com.uas.common.utils.PageUtils;
import com.uas.common.utils.Query;
import com.uas.common.utils.R;
import com.uas.system.domain.UserDO;
import com.uas.system.service.UserService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.uas.inte.domain.NotifyDO;
import com.uas.inte.service.NotifyService;



/**
 * @author kl
 * @email kl@163.com
 * @date 2018-11-22 14:33:53
 */

@Controller
@RequestMapping("inte/notify")
public class NotifyController extends BaseController {
    @Autowired
    private NotifyService notifyService;
    @Autowired
    private UserService userService;

    @GetMapping()
    @RequiresPermissions("inte:notify:notify")
    String Notify() {
        return "inte/notify/notify";
    }

    @ResponseBody
    @GetMapping("/list")
    @RequiresPermissions("inte:notify:notify")
    public PageUtils list(@RequestParam Map<String, Object> params) {
        //查询列表数据
        Query query = new Query(params);
        List<NotifyDO> notifyList = notifyService.list(query);
        for (NotifyDO notifyDO : notifyList){
            notifyDO.setNotifyCreatorName(userService.get(notifyDO.getNotifyCreator()).getUserName());
        }
        int total = notifyService.count(query);
        PageUtils pageUtils = new PageUtils(notifyList, total);
        return pageUtils;
    }

    @GetMapping("/add")
    @RequiresPermissions("inte:notify:add")
    String add() {
        return "inte/notify/add";
    }

    @GetMapping("/edit/{notifyId}")
    @RequiresPermissions("inte:notify:edit")
    String edit(@PathVariable("notifyId") Long notifyId, Model model) {
        NotifyDO notify = notifyService.get(notifyId);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String startDateStr = simpleDateFormat.format(notify.getStartDate());
        String endDateStr = simpleDateFormat.format(notify.getEndDate());
        String reminderDateStr = simpleDateFormat.format(notify.getReminderDate());
        notify.setStartDateStr(startDateStr);
        notify.setEndDateStr(endDateStr);
        notify.setReminderDateStr(reminderDateStr);
        model.addAttribute("notify", notify);
        return "inte/notify/edit";
    }

    /**
     * 保存
     */
    @ResponseBody
    @PostMapping("/save")
    @RequiresPermissions("inte:notify:add")
    public R save(NotifyDO notify) {
        notify.setNotifyCreator(getUserId());
        notify.setCreatDate(new Date());
        if (notifyService.save(notify) > 0) {
            return R.ok();
        }
        return R.error();
    }

    /**
     * 修改
     */
    @ResponseBody
    @RequestMapping("/update")
    @RequiresPermissions("inte:notify:edit")
    public R update(NotifyDO notify) {
        notifyService.update(notify);
        return R.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/remove")
    @ResponseBody
    @RequiresPermissions("inte:notify:remove")
    public R remove(Long notifyId) {
        if (notifyService.remove(notifyId) > 0) {
            return R.ok();
        }
        return R.error();
    }

    /**
     * 删除
     */
    @PostMapping("/batchRemove")
    @ResponseBody
    @RequiresPermissions("inte:notify:batchRemove")
    public R remove(@RequestParam("ids[]") Long[] notifyIds) {
        notifyService.batchRemove(notifyIds);
        return R.ok();
    }

}
