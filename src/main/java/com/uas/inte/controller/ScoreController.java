package com.uas.inte.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.uas.common.utils.PageUtils;
import com.uas.common.utils.Query;
import com.uas.common.utils.R;
import com.uas.inte.domain.StudentDO;
import com.uas.inte.service.StudentService;
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

import com.uas.inte.domain.ScoreDO;
import com.uas.inte.service.ScoreService;

/**
 * @author kl
 * @email kl@163.com
 * @date 2018-11-22 14:43:00
 */

@Controller
@RequestMapping("inte/score")
public class ScoreController {
    @Autowired
    private ScoreService scoreService;
    @Autowired
    private StudentService studentService;

    @GetMapping()
    @RequiresPermissions("inte:score:score")
    String Score() {
        return "inte/score/score";
    }

    @ResponseBody
    @GetMapping("/list")
    @RequiresPermissions("inte:score:score")
    public PageUtils list(@RequestParam Map<String, Object> params) {
        //查询列表数据
        Query query = new Query(params);
        Object schId = query.get("schId");
        List<ScoreDO> scoreList = scoreService.list(query);
        int total = scoreService.count(query);
        PageUtils pageUtils = new PageUtils(scoreList, total);
        return pageUtils;
    }

    @GetMapping("/add")
    @RequiresPermissions("inte:score:add")
    String add() {
        return "inte/score/add";
    }

    @ResponseBody
    @GetMapping("/getStuNameList")
    List<StudentDO> getStuNameList(){
        List<StudentDO> stuNameList = studentService.stuNameList();
        return stuNameList;
    }

    @GetMapping("/edit/{scoreId}")
    @RequiresPermissions("inte:score:edit")
    String edit(@PathVariable("scoreId") Long scoreId, Model model) {
        ScoreDO score = scoreService.get(scoreId);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String scoreDate = simpleDateFormat.format(score.getScoreDate());
        score.setScoreDateStr(scoreDate);
        model.addAttribute("score", score);
        return "inte/score/edit";
    }

    /**
     * 保存
     */
    @ResponseBody
    @PostMapping("/save")
    @RequiresPermissions("inte:score:add")
    public R save(ScoreDO score) {
        if (scoreService.save(score) > 0) {
            return R.ok();
        }
        return R.error();
    }

    /**
     * 修改
     */
    @ResponseBody
    @RequestMapping("/update")
    @RequiresPermissions("inte:score:edit")
    public R update(ScoreDO score){
        String scoreDateStr = score.getScoreDateStr();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date scoreDate = null;
        try {
            scoreDate = simpleDateFormat.parse(scoreDateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        score.setScoreDate(scoreDate);
        scoreService.update(score);
        return R.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/remove")
    @ResponseBody
    @RequiresPermissions("inte:score:remove")
    public R remove(Long scoreId) {
        if (scoreService.remove(scoreId) > 0) {
            return R.ok();
        }
        return R.error();
    }

    /**
     * 删除
     */
    @PostMapping("/batchRemove")
    @ResponseBody
    @RequiresPermissions("inte:score:batchRemove")
    public R remove(@RequestParam("ids[]") Long[] scoreIds) {
        scoreService.batchRemove(scoreIds);
        return R.ok();
    }

}
