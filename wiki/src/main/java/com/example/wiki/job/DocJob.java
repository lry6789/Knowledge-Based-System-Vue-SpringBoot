package com.example.wiki.job;

import com.example.wiki.service.DocService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class DocJob {
    @Resource
    private DocService docService;
    private static final Logger LOG = LoggerFactory.getLogger(DocJob.class);

    /**
     * 每30s更新电子书信息
     */
    @Scheduled(cron = "5/30 * * * * ?")
    public void cron() {
        docService.updateEbookInfo();
    }

}
