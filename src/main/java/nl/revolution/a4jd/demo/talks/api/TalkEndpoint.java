package nl.revolution.a4jd.demo.talks.api;

import nl.revolution.a4jd.demo.talks.service.TalkService;
import nl.revolution.a4jd.demo.talks.model.Talk;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/speaker")
public class TalkEndpoint {

    private TalkService talkService;

    public TalkEndpoint(TalkService talkService) {
        this.talkService = talkService;
    }

    @GetMapping("/talks")
    @CrossOrigin
    public List<Talk> getTalks() {
        return talkService.getTalks();
    }
}
