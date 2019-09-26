package com.web.controller;

import com.web.service.BoardService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/board")
public class BoardController {

    @Autowired
    BoardService boardService;

    @GetMapping({"/list", "", "/"})
    public String list(@PageableDefault Pageable pageable, Model model){
        model.addAttribute("boardList", boardService.findBoardList(pageable));
        return "board/list";
    }

    @GetMapping("/form")
    public String board(@RequestParam(value = "idx", defaultValue = "0") Long idx, Model model){
        model.addAttribute("board", boardService.findBoardByIdx(idx));
        return "board/form";
    }


}

