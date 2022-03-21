package com.example.EssaiSpringBoot1;

@Component
public class ApplicationStartupRunner implements CommandLineRunner {
    protected final Log logger = LogFactory.getLog(getClass());

    @Override
    public void run(String... args) throws Exception {
        logger.info("AppStartupRunner run method Started !!");
    }
}